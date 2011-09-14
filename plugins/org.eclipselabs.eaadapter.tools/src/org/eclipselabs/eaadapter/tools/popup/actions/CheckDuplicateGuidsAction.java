package org.eclipselabs.eaadapter.tools.popup.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.tools.commands.CheckDuplicates;

/**
 * <div class='userdoc'> Iterates through a subtree of a model and looks for
 * multiple GUIDs. </div>
 */
public class CheckDuplicateGuidsAction extends AbstractEAAction {

	@Override
	protected String getTitle() {
		return "Check duplicate GUIDs";
	}

	/**
	 * <div class='userdoc'> This action asks the user for a package, iterates
	 * through the entire subtree and checks if it finds any GUID multiple
	 * times.<br>
	 * If so, the user will be asked to enter a file which will contain all
	 * these multiple GUIDs. </div>
	 */
	@Override
	protected void doAction(EARepository repository, EAPackage pack, final IProgressMonitor monitor)
			throws RuntimeException {
		final String fileName = askForFileToSave();

		// collect statistics
		try {
			final String result = new CheckDuplicates(repository, pack, fileName).run(monitor);
			monitor.subTask("Show results");
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					MessageDialog.openInformation(getShell(),
							"Duplicate GUIDs checked.", 
							"Saved to: " + fileName + "\n\n" + result);
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
