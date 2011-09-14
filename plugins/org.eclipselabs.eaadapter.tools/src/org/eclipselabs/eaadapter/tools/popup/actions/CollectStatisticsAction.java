package org.eclipselabs.eaadapter.tools.popup.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.tools.commands.CollectStatistics;

/**
 * <div class='userdoc'> Iterates through a subtree of a model and counts how
 * many elements are contained. </div>
 */
public class CollectStatisticsAction extends AbstractEAAction {

	@Override
	protected String getTitle() {
		return "Collect statistics";
	}

	/**
	 * <div class='userdoc'> This action asks the user for a package, iterates
	 * through the entire subtree and counts the occurences of each metamodel
	 * type.<br>
	 * Finally, the user will be asked to enter a file in which the statistics
	 * will be saved. </div>
	 */
	@Override
	protected void doAction(EARepository repository, EAPackage pack, final IProgressMonitor monitor)
			throws RuntimeException {
		final String fileName = askForFileToSave();

		// collect statistics
		try {
			final String result = new CollectStatistics(repository, pack, fileName).run(monitor);
			monitor.subTask("Show results");
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					final String message = fileName == null ? "" : "Saved to: " + fileName + "\n\n";
					MessageDialog.openInformation(getShell(),
							"Statistics successfully collected.", 
							message + result);
				}
			});
		} catch (final Exception e) {
			monitor.subTask("Show error");
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					MessageDialog.openError(getShell(), "An error occured",
							"Could not perform operation:\n" + e.getMessage());
				}
			});
		}
	}

	@Override
	protected boolean askForPackage() {
		return true;
	}
	
	@Override
	protected boolean askedPackageOptional() {
		return true;
	}
}
