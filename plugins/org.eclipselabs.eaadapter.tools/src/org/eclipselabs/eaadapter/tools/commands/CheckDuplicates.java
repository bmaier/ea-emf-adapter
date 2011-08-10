package org.eclipselabs.eaadapter.tools.commands;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement;
import org.eclipselabs.eaadapter.model.util.EAUtil;

public class CheckDuplicates {

	private String eaFilePath;
	private String rootPackage;
	private String outputFile;
	
	private Map<String, List<String>> duplicateMap;

	public CheckDuplicates(String eaFilePath, String packages, String outputFile) {
		this.eaFilePath = eaFilePath;
		this.rootPackage = packages;
		this.outputFile = outputFile;
	}
	
	public String run() throws Exception {
		if (!new File(eaFilePath).exists()) 
			throw new FileNotFoundException("Cannot find file: " + eaFilePath);

		// load ea model
		EARepository repository = loadEaModel(eaFilePath);
		repository.setPrefetchingEnabled(false);

		// reset data structures
		duplicateMap = new LinkedHashMap<String, List<String>>();

		// resolve root package
		EAPackage root = (EAPackage)EAUtil.resolveElement(rootPackage, repository.getModels());

		// perform duplicate check
		checkDuplicateGuids(root);

		// show and / or save results
		String result = showDuplicates();
		
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

	private void checkDuplicateGuids(EANamedElement element) {
		try {
			// check for duplicates
			String guid = element.getGuid();
			List<String> guidElements = duplicateMap.get(guid);
			if (guidElements == null) {
				guidElements = new ArrayList<String>();
				duplicateMap.put(guid, guidElements);
			}
			guidElements.add(element.getClass().getSimpleName() + ": " + EAUtil.getFullName(element));
			
			// iterate recursively
			for (EReference ref : element.eClass().getEAllContainments()) {
				Object obj = element.eGet(ref);
				if (obj instanceof EList) {
					@SuppressWarnings("unchecked") 
					EList<EANamedElement> list = (EList<EANamedElement>)obj;
					for (EANamedElement o : list) {
						checkDuplicateGuids(o);
					}
				} else if (obj instanceof EANamedElement) {
					checkDuplicateGuids((EANamedElement)obj);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private String showDuplicates() throws IOException {
		if (!duplicateMap.isEmpty()) {

			//MessageDialog.openInformation(new Shell(), duplicateMap.size() + " duplicates found!", duplicateMap.size() + " duplicates found!");

			// store output somewhere?
//			FileDialog dialog = new FileDialog(new Shell(), SWT.SAVE);
//			dialog.setText("Save log file somewhere or press cancel to abort.");
//			dialog.setFilterExtensions(new String[]{"*.log"});
//			dialog.setFilterNames(new String[]{"Log files"});
//			String logFile = dialog.open();

			// format and save output
			if (outputFile != null) {
				StringBuffer out = new StringBuffer();
				out.append("Duplicates for: " + eaFilePath + "\n\n");

				int counter = 0;
				for (Entry<String, List<String>> entry : duplicateMap.entrySet()) {
					if (entry.getValue().size() == 1)
						continue;
					counter++;
					out.append("GUID: " + entry.getKey() + "\n");
					for (String element : entry.getValue()) {
						out.append(element + "\n");
					}
					out.append("=============================================================\n\n");
				}
				
				// write into file
				DataOutputStream stream = new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(outputFile)));
				
				stream.writeChars(out.toString());
				stream.close();

				return counter + " duplicate GUIDs found in: " + rootPackage;
			} return "Output file is null. Aborting...";
			
		} else {
			
			return "No duplicates found in " + eaFilePath;
		}
	}

}
