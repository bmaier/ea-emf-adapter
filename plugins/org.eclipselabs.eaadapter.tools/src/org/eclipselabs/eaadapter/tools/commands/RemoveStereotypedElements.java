package org.eclipselabs.eaadapter.tools.commands;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement;
import org.eclipselabs.eaadapter.model.util.EAUtil;

public class RemoveStereotypedElements {


	private String eaFilePath;
	private String rootPackage;
	private String outputFile;
	private String stereotype;
	
	private List<String> removedElements;

	public RemoveStereotypedElements(String eaFilePath, String packages, String stereotype, String outputFile) {
		this.eaFilePath = eaFilePath;
		this.rootPackage = packages;
		this.outputFile = outputFile;
		this.stereotype = stereotype;
	}
	
	public String run() throws Exception {
		if (!new File(eaFilePath).exists()) 
			throw new FileNotFoundException("Cannot find file: " + eaFilePath);

		// load ea model
		EARepository repository = loadEaModel(eaFilePath);
		repository.setPrefetchingEnabled(false);

		// reset data structures
		removedElements = new ArrayList<String>();

		// ask user for the root package
		EAPackage root = (EAPackage)EAUtil.resolveElement(rootPackage, repository.getModels());

		// perform statistics collection
		removeStereotypedElements(root);

		// show and / or save results
		String result = saveDeletions();
		
		// close repository
//		repository.closeFile();
		
		return result;
	}
	
	
	private EARepository loadEaModel(String eaFilePath) {
		URI uri = URI.createFileURI(eaFilePath);

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource repositoryResource = resourceSet.getResource(uri, true);
		
		return (EARepository) repositoryResource.getContents().get(0);
	}

	private void removeStereotypedElements(EANamedElement element) {
		try {
			// iterate recursively
			for (EReference ref : element.eClass().getEAllContainments()) {
				Object obj = element.eGet(ref);
				if (obj instanceof EList) {
					@SuppressWarnings("unchecked") 
					EList<EANamedElement> list = (EList<EANamedElement>)obj;
					for (EANamedElement o : list) {

						// check stereotype
						if (hasStereotype(o, stereotype)) {
							removedElements.add(EAUtil.getFullName(o));
							list.remove(o);
						} else {
							removeStereotypedElements(o);
						}
					}
				} else if (obj instanceof EANamedElement) {
					if (hasStereotype((EANamedElement)obj, stereotype)) {
						removedElements.add(EAUtil.getFullName((EANamedElement)obj));
						element.eSet(ref, null);
					} else {
						removeStereotypedElements((EANamedElement)obj);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean hasStereotype(EANamedElement element, String stereotype) {
		// search stereotype attribute
		for (EAttribute attr : element.eClass().getEAllAttributes()) {
			if (attr.getName().equals("stereotype")) {
				
				// check attribute
				String eaStereotype = (String)element.eGet(attr);
				if (eaStereotype != null) {
					if (eaStereotype.trim().equals(stereotype)) {
						return true;
					} else {
						String[] fragments = eaStereotype.split(",");
						for (String fragment : fragments) {
							if (fragment.trim().equals(stereotype))
								return true;
						}
					}
				}
				break;
			}
		}
		return false;
	}
	
	private String saveDeletions() throws IOException {
		if (!removedElements.isEmpty()) {

			// store output somewhere?
//			FileDialog dialog = new FileDialog(new Shell());
//			dialog.setText("Save log file somewhere or press cancel to abort.");
//			dialog.setFilterExtensions(new String[]{"*.log"});
//			dialog.setFilterNames(new String[]{"Log files"});
//			String logFile = dialog.open();

			// format and save output
			if (outputFile != null) {
				StringBuffer out = new StringBuffer();
				out.append("Removed elements of: " + eaFilePath + "\n");
				for (String element : removedElements) {
					out.append(element);
				}
				
				// write into file
				DataOutputStream stream = new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(outputFile)));
				
				stream.writeUTF(out.toString());
				stream.close();
			}

			return removedElements.size() + " elements removed!";

		} else {
			
			return "No elements found with stereotype '" + stereotype + "' in " + eaFilePath;
		}
	}

}
