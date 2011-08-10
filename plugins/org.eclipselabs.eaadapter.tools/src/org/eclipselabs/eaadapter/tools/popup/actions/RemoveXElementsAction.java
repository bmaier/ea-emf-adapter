package org.eclipselabs.eaadapter.tools.popup.actions;

import java.io.File;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipselabs.eaadapter.tools.commands.RemoveStereotypedElements;
import org.eclipselabs.eaadapter.tools.util.EAToolUtil;


/**
 * <div class='userdoc'>
 * Iterates through a subtree of a model and deletes all elements with the stereotype '-X'.
 * </div>
 */
public class RemoveXElementsAction implements IObjectActionDelegate {

	/**
	 * Constructor for Action1.
	 */
	public RemoveXElementsAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * <div class='userdoc'>
	 * This action asks the user for a package, iterates through the entire subtree and checks if it finds any element with the stereotype '-X'.<br>
	 * If so, these elements will be deleted and a log will be saved into a file!
	 * </div>   
	 */
	public void run(IAction action) {

		// get ea model file of selection
		String eaFilePath = EAToolUtil.getSelectedFile();
		if (new File(eaFilePath).exists()) {

			// ask for package
			InputDialog dialog = new InputDialog(new Shell(), "Please enter root package", "Please enter root package.", null, null);
			if (dialog.open() == Dialog.OK) {
				String rootPackage = dialog.getValue();

				// ask for output file
				FileDialog saveDialog = new FileDialog(new Shell(), SWT.SAVE);
				saveDialog.setText("Save log file somewhere or press cancel to abort.");
				saveDialog.setFilterExtensions(new String[]{"*.log"});
				saveDialog.setFilterNames(new String[]{"Log files"});
				String logFile = saveDialog.open();

				if (logFile != null) {
				
					// perform deletions
					try {
						String result = new RemoveStereotypedElements(eaFilePath, rootPackage, "-X", logFile).run();
						MessageDialog.openInformation(new Shell(), "Deletion successful.", 
								"Saved to: " + logFile + "\n\n" + result);
					} catch (Exception e) {
						MessageDialog.openError(new Shell(), "An error occured", "Could not perform operation:\n" + e.getMessage());
					}
				}				
				
			}
			
		} else MessageDialog.openWarning(new Shell(), "File not found", "Cannot find file: " + eaFilePath);
	}


	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
