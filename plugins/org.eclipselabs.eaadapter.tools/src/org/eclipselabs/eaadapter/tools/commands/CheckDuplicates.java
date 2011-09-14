package org.eclipselabs.eaadapter.tools.commands;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement;
import org.eclipselabs.eaadapter.model.util.EAUtil;

public class CheckDuplicates {

	private EARepository repository;
	private EAPackage rootPackage;
	private String outputFile;
	
	private Map<String, List<String>> duplicateMap;

	public CheckDuplicates(EARepository repository, EAPackage pack,
			String outputFile) {
		this.repository = repository;
		this.rootPackage = pack;
		this.outputFile = outputFile;
	}
	
	public String run(IProgressMonitor monitor) throws Exception {
		// load ea model
		repository.setPrefetchingEnabled(false);

		// reset data structures
		duplicateMap = new LinkedHashMap<String, List<String>>();

		// perform duplicate check
		// perform statistics collection
		if (rootPackage == null) {
			for (EAPackage pack : repository.getModels()) {
				monitor.subTask("Processing " + pack.getName() + "...");
				checkDuplicateGuids(pack);
			}
		} else {
			monitor.subTask("Processing " + rootPackage.getName() + "...");
			checkDuplicateGuids(rootPackage);
		}

		// show and / or save results
		final String result = saveDuplicates();
		
		return result;
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
	
	
	private String saveDuplicates() throws IOException {
		if (!duplicateMap.isEmpty()) {

			// format and save output
			final StringBuffer out = new StringBuffer();
			out.append(" duplicates in: " + repository.getFile() + "\n");
			if (rootPackage != null) {
				out.append("Root Package: " + EAUtil.getFullName(rootPackage)
						+ "\n\n");
			} else {
				out.append("\n");
			}

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
			final String result = counter + out.toString();
			if (outputFile != null) {
				final DataOutputStream stream = new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(outputFile)));
				
				stream.writeChars(result);
				stream.close();
			}
			return result;
		} else {
			return "No duplicates found in: " + repository.getFile();
		}
	}

}
