package org.eclipselabs.eaadapter.tools.plugin;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class EaToolsPlugin extends Plugin{
	
    // logger configuration
//    private static final String LOG_PROPERTIES_FILE = "logger.properties";

    //log manager
//    private PluginLogManager logManager;
    
    public static final String PLUGIN_ID = "org.eclipselabs.eaadapter.tools";
    
	private static EaToolsPlugin eaToolsPlugin;

    public EaToolsPlugin(){
    	super();
    	eaToolsPlugin = this;
    }
	
	public void start(BundleContext context) throws Exception {
		super.start(context);
		
//		configure();
	}
	
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
//        if(this.logManager != null) {
//            logManager.shutdown();
//            logManager = null;
//        }
        eaToolsPlugin = null;
	}

//	/**
//     * @return Returns the logManager.
//     */
//    public static PluginLogManager getLogManager() {
//        return getDefault().logManager;
//    }

	
    /**
     * Returns the shared plugin instance.
     */
    public static EaToolsPlugin getDefault() {
        return eaToolsPlugin;
    }

	
//    private void configure() {
//        URL url = getBundle().getEntry("/" + LOG_PROPERTIES_FILE);
//        try {
//            InputStream inputStream = url.openStream();
//            if(inputStream != null) {
//                Properties properties = new Properties();
//                properties.load(inputStream);
//                inputStream.close();
//                logManager = new PluginLogManager(getDefault(), properties);
//            }
//        } catch (IOException e) {
//            IStatus status = new Status(
//                    IStatus.ERROR,
//                    getDefault().getBundle().getSymbolicName(),
//                    IStatus.ERROR,
//                    "Error while initializing log properties." + e.getMessage(),
//                    e);
//            getDefault().getLog().log(status);
//            throw new RuntimeException(
//                    "Error while initializing log properties.", e);
//        }
//    }

}
