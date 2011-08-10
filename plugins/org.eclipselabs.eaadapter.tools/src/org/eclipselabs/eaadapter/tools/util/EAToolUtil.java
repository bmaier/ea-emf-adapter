package org.eclipselabs.eaadapter.tools.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.util.EAUtil;

public class EAToolUtil {

	/**
	 * <div class='userdoc'>
	 * If in the current workbench a EA model file is selected, then it will be loaded and returned.
	 * </div>
	 * @return an instance of the selected ea model file.
	 */
	public static EARepository loadEaModel() {
		try {
			IStructuredSelection structuredSelection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
			final IFile file = (IFile) structuredSelection.getFirstElement();
			
			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

			ResourceSet resourceSet = new ResourceSetImpl();
			Resource repositoryResource = resourceSet.getResource(uri, true);
			
			// speed up lookup of ids
			//((ResourceImpl)interpreterConfigurationResource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
			
			return (EARepository) repositoryResource.getContents().get(0);

		} catch (Exception e) {
			MessageDialog.openError(new Shell(), "Error opening EA model", "Error caught while opening EA model: " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}
	
	public static String getSelectedFile() {
		IStructuredSelection structuredSelection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		IFile file = (IFile) structuredSelection.getFirstElement();
		return file.getLocation().toOSString();
	}
	
	/**
	 * <div class='userdoc'>
	 * Open an {@link InputDialog} and ask the user for a root package.
	 * </div>
	 */
	public static EAPackage askForRootPackage(EARepository repository) {
		InputDialog dialog = new InputDialog(new Shell(), "Please enter root package", "Please enter root package.", null, null);
		if (dialog.open() == Dialog.OK) {
			EObject element = EAUtil.resolveElement(dialog.getValue(), repository.getModels());
			if (element instanceof EAPackage)
				return (EAPackage)element;
		}
		return null;
	}
	

}
