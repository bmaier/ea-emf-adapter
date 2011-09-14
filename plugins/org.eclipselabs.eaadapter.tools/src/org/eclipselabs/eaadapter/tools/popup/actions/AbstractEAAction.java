package org.eclipselabs.eaadapter.tools.popup.actions;

import java.io.File;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.eclipselabs.eaadapter.tools.plugin.EaToolsPlugin;

public abstract class AbstractEAAction implements IObjectActionDelegate {

	private static final String EAMODEL_FILE_EXTENSION = "eamodel";

	private Shell shell;

	private EARepository selectedRepository;

	private IFile selectedFile;

	@Override
	public void run(IAction action) {
		// concentrate on one concrete package?
		String packageOfInterest = null;
		if (askForPackage()) {
			packageOfInterest = askUserForPackage();
			if (packageOfInterest == null && !askedPackageOptional()) {
				MessageDialog.openInformation(shell, "No package entered..",
						"No package entered - nothing to do. Aborting.");
				return;
			}
		}

		if (selectedRepository == null && selectedFile != null) {
			runInJob(packageOfInterest);

		} else if (selectedRepository != null) {
			final EAPackage pack = loadPackage(selectedRepository,
					packageOfInterest);
			if (pack == null && askForPackage() && !askedPackageOptional()) {
				MessageDialog.openError(shell, "Package not found", "Package '"
						+ packageOfInterest
						+ "' not found in EA model. Aboring.");
			} else {
				runInProgressDialog(pack);
			}
		} else {
			MessageDialog.openInformation(shell, "Nothing selected..",
					"No EA model selected.");
		}
	}

	private void runInProgressDialog(final EAPackage pack) {
		final ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
		final Exception[] e = new Exception[1];
		try {
			dialog.run(true, true, new IRunnableWithProgress() {
				public void run(final IProgressMonitor monitor) {
					monitor.beginTask("Running '" + getTitle() + "' on: " + selectedRepository.getFile(), 3);
					monitor.worked(1);

					try {
						shell.getDisplay().syncExec(new Runnable() {
							@Override
							public void run() {
								doAction(selectedRepository, pack, monitor);
							}
						});
					} catch (Exception ex) {
						e[0] = ex;
					} finally {
						monitor.worked(1);
						monitor.done();
					}
				}
			});
		} catch (Exception ex) {
			e[0] = ex;
		}
		if (e[0] != null)
			MessageDialog.openError(shell, "An error occurred",
					"An error occurred while executing " + getTitle() + ": "
							+ e[0].getMessage());
	}

	private void runInJob(final String packageOfInterest) {
		final Job job = new Job(getTitle()) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask(getTitle(), 4);
				monitor.worked(1);
				selectedRepository = loadEaModel(selectedFile);
				try {
					EAPackage pack = null; 
					if (packageOfInterest != null && !packageOfInterest.isEmpty()) {
						pack = loadPackage(selectedRepository, packageOfInterest);
					}
					monitor.worked(1);
					if (pack == null && askForPackage() && !askedPackageOptional()) {
						Display.getDefault().syncExec(new Runnable() {
							@Override
							public void run() {
								MessageDialog.openError(Display.getDefault().getActiveShell(),
											"Package not found", 
											"Package '" + packageOfInterest + "' not found in EA model. Aboring.");
							}
						});

					} else {
						doAction(selectedRepository, pack, monitor);
					}
				} catch (Exception e) {
					return new Status(Status.ERROR, EaToolsPlugin.PLUGIN_ID,
							"An error occurred while executing " + getTitle() + "!", e);
				} finally {
					monitor.worked(1);
					selectedRepository.closeFile();
					monitor.done();
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	protected abstract String getTitle();

	protected abstract void doAction(EARepository repository, EAPackage pack, IProgressMonitor monitor)
			throws RuntimeException;

	protected abstract boolean askForPackage();

	protected abstract boolean askedPackageOptional();

	private String askUserForPackage() {
		final InputDialog dialog = new InputDialog(shell,
				"Please enter root package", "Please enter root package.",
				null, null);
		if (dialog.open() == Dialog.OK) {
			final String value = dialog.getValue();
			return value != null && value.isEmpty() ? null : value;
		}
		return null;
	}

	private EAPackage loadPackage(EARepository rep, String pack) {
		final EObject element = EAUtil.resolveElement(pack, rep.getModels());
		if (element instanceof EAPackage)
			return (EAPackage) element;
		return null;
	}

	/**
	 * Subclasses may call this to ask the user for a file name for saving the
	 * results.
	 */
	protected String askForFileToSave() {
		final String[] file = new String[1];
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				// ask for output file
				final Shell shell = Display.getDefault().getActiveShell();
				final FileDialog saveDialog = new FileDialog(shell, SWT.SAVE);
				saveDialog.setText("Select save file location or press cancel if it should not be saved.");
				saveDialog.setFilterExtensions(new String[] { "*.*" });
				saveDialog.setFilterNames(new String[] { "All files" });
				file[0] = saveDialog.open();
			}
		});
		return file[0];
	}

	protected Shell getShell() {
		return shell;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedFile = null;
		selectedRepository = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection struc = (IStructuredSelection) selection;
			if (!struc.isEmpty()) {
				for (Iterator<?> iter = struc.iterator(); iter.hasNext();) {
					final Object next = iter.next();
					if (next instanceof EARepository) {
						selectedRepository = (EARepository) next;
						selectedFile = null;
						break;
					} else if (next instanceof IFile && selectedFile == null) {
						final String fileExtension = ((IFile) next).getFileExtension();
						if (EAMODEL_FILE_EXTENSION.equals(fileExtension)) {
							final String eaFilePath = ((IFile) next).getLocation().toOSString();
							if (new File(eaFilePath).exists()) {
								selectedFile = (IFile) next;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		if (targetPart != null) {
			shell = targetPart.getSite().getShell();
		}
	}

	private static EARepository loadEaModel(IFile eaModelFile) {
		final URI uri = URI.createPlatformResourceURI(eaModelFile.getFullPath().toString(), true);

		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource repositoryResource = resourceSet.getResource(uri, true);

		// speed up lookup of ids
		// ((ResourceImpl)interpreterConfigurationResource).setIntrinsicIDToEObjectMap(new
		// HashMap<String, EObject>());

		return (EARepository) repositoryResource.getContents().get(0);
	}

}
