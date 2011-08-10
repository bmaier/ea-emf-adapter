package org.eclipselabs.eaadapter.tools.commands;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement;
import org.eclipselabs.eaadapter.model.util.EAUtil;

public class CollectStatistics {


	private String eaFilePath;
	private String rootPackage;
	private String outputFile;
	
	private Map<EClass, Integer> statistics;

	public CollectStatistics(String eaFilePath, String packages, String outputFile) {
		this.eaFilePath = eaFilePath;
		this.rootPackage = packages;
		this.outputFile = outputFile;
	}
	
	public Map<EClass, Integer> getStatistics() {
		return statistics;
	}
	
	public String run() throws Exception {
//		if (!new File(eaFilePath).exists()) 
//			throw new FileNotFoundException("Cannot find file: " + eaFilePath);

		// load ea model
		EARepository repository = loadEaModel(eaFilePath);
		repository.setPrefetchingEnabled(false);

		// reset data structures
		statistics = new LinkedHashMap<EClass,Integer>();

		// ask user for the root package
		EAPackage root = (EAPackage)EAUtil.resolveElement(rootPackage, repository.getModels());

		// perform statistics collection
		collectStatistics(root);

		// show and / or save results
		String result = saveStatistics(root);
		
		// close repository
//		repository.closeFile();
		
		return result;
	}
	
	
	private EARepository loadEaModel(String eaFilePath) {
		URI uri;
		try {
			uri = URI.createFileURI(eaFilePath);
			if (!URIConverter.INSTANCE.exists(uri, null))
				throw new FileNotFoundException(uri.toString());
		} catch (Exception e) {
			try {
				uri = URI.createPlatformResourceURI(eaFilePath, true);
				if (!URIConverter.INSTANCE.exists(uri, null))
					throw new FileNotFoundException(uri.toString());
			} catch (Exception e2) {
				try {
					uri = URI.createURI(eaFilePath);
					if (!URIConverter.INSTANCE.exists(uri, null))
						throw new FileNotFoundException(uri.toString());
				} catch (Exception e3) {
					throw new RuntimeException("Could not locate file: " + eaFilePath, e3);
				}
			}
		}
			

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource repositoryResource = resourceSet.getResource(uri, true);
		
		return (EARepository) repositoryResource.getContents().get(0);
	}

	private void collectStatistics(EANamedElement element) throws Exception {
		try {
			// update statistics
			Integer count = statistics.get(element.eClass());
			if (count == null) {
				statistics.put(element.eClass(), new Integer(1));
			} else {
				statistics.put(element.eClass(), new Integer(count.intValue() + 1));
			}
			
			// iterate recursively
			for (EReference ref : element.eClass().getEAllContainments()) {
				Object obj = element.eGet(ref);
				if (obj instanceof EList) {
					@SuppressWarnings("unchecked") 
					EList<EANamedElement> list = (EList<EANamedElement>)obj;
					for (EANamedElement o : list) {
						collectStatistics(o);
					}
				} else if (obj instanceof EANamedElement) {
					collectStatistics((EANamedElement)obj);
				}
			}
		} catch (Exception e) {
			throw new Exception("An error occured while collecting statistics", e);
		}
	}

	private String saveStatistics(EANamedElement rootElement) throws IOException {
		if (!statistics.isEmpty()) {

			// store output somewhere?
//			FileDialog dialog = new FileDialog(new Shell(), SWT.SAVE);
//			dialog.setText("Save log file somewhere or press cancel to abort.");
//			dialog.setFilterExtensions(new String[]{"*.log"});
//			dialog.setFilterNames(new String[]{"Log files"});
//			String logFile = dialog.open();

			// prepare output
			StringBuffer out = new StringBuffer();
			out.append("Statistics for: " + eaFilePath + "\n");
			out.append("Root Package: " + EAUtil.getFullName(rootElement) + "\n\n");

			for (Entry<EClass, Integer> entry : statistics.entrySet()) {
				out.append(entry.getKey().getName() + " - " + entry.getValue() + "\n");
			}
			
			// format and save output
			if (outputFile != null) {
				
				// write into file
				DataOutputStream stream = new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(outputFile)));
				
				stream.writeChars(out.toString());
				stream.close();
			}
			return out.toString();
		} else {
			return null;
		}
	}

}
