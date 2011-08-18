package org.eclipselabs.eaadapter.model.util;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipselabs.eaadapter.model.EAConnector;

public class EAEditUtil {

	/**
	 * <div class='userdoc'>
	 * Return an image for the given object.<br> 
	 * If object is a classifier, the image of that classifier is returned.<br>
	 * If it is an unknown type, null is returned.
	 * </div>
	 * @param object
	 * @return
	 */
	public static Object getImageFor(Object object) {
		String className = object instanceof EClassifier ? ((EClassifier)object).getName() : object.getClass().getSimpleName();
		if (className.endsWith("Impl"))
			className = className.substring(0, className.length() - 4);
		className += ".gif";
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(
		         "org.eclipselabs.eaadapter.model",
		         "icons/" + className);
		return imageDescriptor == null ? null : imageDescriptor.createImage();		
	}

	
	/**
	 * <div class='userdoc'>
	 * Build label for a connector instance.<br>
	 * The label contains connector name and roles as well as supplier and client names.
	 * </div>
	 * @param connector
	 * @return
	 */
	public static String getConnectorLabel(EAConnector connector) {
		// initialize some variables
		String label = connector.getName();
		String supplierRole = connector.getSupplier_role();
		String clientRole = connector.getClient_role();
		String client = connector.getClient() == null ? "<null>" : connector.getClient().getName();
		String supplier = connector.getSupplier() == null ? "<null>" : connector.getSupplier().getName();
		
		// some names, if set
		label = label != null && label.length() > 0 ? "(" + label + ") " : "";
		supplier += supplierRole != null && supplierRole.length() > 0 ? "." + supplierRole : "";
		client += clientRole != null && clientRole.length() > 0 ? "." + clientRole : "";
		
		// get client and supplier names and direction
		label += supplier;
		label += connector.getDirection() == null ? "  -?-  " :
			connector.getDirection().equals("Unspecified") ? "  --  " :
				connector.getDirection().equals("Bi-Directional") ? "  <->  " :
					connector.getDirection().equals("Source -> Destination") ? "  ->  " :
						connector.getDirection().equals("Destination -> Source") ? "  <-  " :
							"  -?-  ";
		label += client;
		
		return label;
	}
}
