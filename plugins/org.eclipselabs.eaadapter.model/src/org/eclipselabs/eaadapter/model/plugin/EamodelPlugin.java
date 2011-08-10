package org.eclipselabs.eaadapter.model.plugin;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class EamodelPlugin extends Plugin{
	
    private static EamodelPlugin eamodelPlugin;

    public EamodelPlugin(){
    	super();
    	eamodelPlugin = this;
    }
	
	public void start(BundleContext context) throws Exception {
		super.start(context);
		
	}
	
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
        eamodelPlugin = null;
	}


	
    /**
     * Returns the shared plugin instance.
     */
    public static EamodelPlugin getDefault() {
        return eamodelPlugin;
    }

	
}
