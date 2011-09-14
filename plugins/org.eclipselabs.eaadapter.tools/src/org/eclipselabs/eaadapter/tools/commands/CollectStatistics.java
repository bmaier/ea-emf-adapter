package org.eclipselabs.eaadapter.tools.commands;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement;
import org.eclipselabs.eaadapter.model.util.EAUtil;

public class CollectStatistics {

	private EARepository repository;
	private EAPackage rootPackage;
	private String outputFile;

	private Map<EClass, Integer> statistics;

	public CollectStatistics(EARepository repository, EAPackage pack,
			String outputFile) {
		this.repository = repository;
		this.rootPackage = pack;
		this.outputFile = outputFile;
	}

	public Map<EClass, Integer> getStatistics() {
		return statistics;
	}

	public String run(IProgressMonitor monitor) throws Exception {
		// load ea model
		repository.setPrefetchingEnabled(false);

		// reset data structures
		statistics = new LinkedHashMap<EClass, Integer>();

		// perform statistics collection
		if (rootPackage == null) {
			for (EAPackage pack : repository.getModels()) {
				monitor.subTask("Processing " + pack.getName() + "...");
				collectStatistics(pack);
			}
		} else {
			monitor.subTask("Processing " + rootPackage.getName() + "...");
			collectStatistics(rootPackage);
		}

		// show and / or save results
		final String result = saveStatistics();

		return result;
	}

	private void collectStatistics(EANamedElement element) throws Exception {
		try {
			// update statistics
			Integer count = statistics.get(element.eClass());
			if (count == null) {
				statistics.put(element.eClass(), new Integer(1));
			} else {
				statistics.put(element.eClass(), new Integer(
						count.intValue() + 1));
			}

			// iterate recursively
			for (EReference ref : element.eClass().getEAllContainments()) {
				Object obj = element.eGet(ref);
				if (obj instanceof EList) {
					@SuppressWarnings("unchecked")
					EList<EANamedElement> list = (EList<EANamedElement>) obj;
					for (EANamedElement o : list) {
						collectStatistics(o);
					}
				} else if (obj instanceof EANamedElement) {
					collectStatistics((EANamedElement) obj);
				}
			}
		} catch (Exception e) {
			throw new Exception("An error occured while collecting statistics",
					e);
		}
	}

	private String saveStatistics() throws IOException {
		if (!statistics.isEmpty()) {

			// prepare output
			final StringBuffer out = new StringBuffer();
			out.append("Statistics for: " + repository.getFile() + "\n");
			if (rootPackage != null) {
				out.append("Root Package: " + EAUtil.getFullName(rootPackage)
						+ "\n\n");
			} else {
				out.append("\n");
			}

			for (Entry<EClass, Integer> entry : statistics.entrySet()) {
				out.append(entry.getKey().getName() + " - " + entry.getValue()
						+ "\n");
			}

			// save output
			final String result = out.toString();
			if (outputFile != null) {

				// write into file
				final DataOutputStream stream = new DataOutputStream(
						new BufferedOutputStream(new FileOutputStream(
								outputFile)));

				stream.writeChars(result);
				stream.close();
			}
			return result;
		} else {
			return null;
		}
	}

}
