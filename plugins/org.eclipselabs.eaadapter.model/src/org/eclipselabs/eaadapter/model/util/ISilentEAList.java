package org.eclipselabs.eaadapter.model.util;

/**
 * <div class='userdoc'>
 * If silent operation is switched on, the list must not call methods of {@link EAListHelper}!
 * </div>
 */
public interface ISilentEAList {

	void setSilentOperation(boolean silentOperation);
	
}
