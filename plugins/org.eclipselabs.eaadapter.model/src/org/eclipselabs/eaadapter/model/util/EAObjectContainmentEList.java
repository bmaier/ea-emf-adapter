/**
 * 
 */
package org.eclipselabs.eaadapter.model.util;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <div class='userdoc'>
 * This EList calls {@link EAListHelper} methods after an element was added, removed or changed.
 * </div>
 */
public class EAObjectContainmentEList<E> extends EObjectContainmentEList<E> implements ISilentEAList {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private org.sparx.Collection<?> collection;
	
	private boolean silentOperation = false;
	
	/**
	 * @param dataClass
	 * @param owner
	 * @param featureID
	 * @param inverseFeatureID
	 */
	public EAObjectContainmentEList(Class<?> dataClass, InternalEObject owner, int featureID, 
			org.sparx.Collection<?> collection) {
		super(dataClass, owner, featureID);
		this.collection = collection;
	}

	@Override
	protected void didAdd(int index, E newObject) {
		if (!silentOperation) 
			EAListHelper.didAdd(index, newObject, collection, owner);
	}

	@Override
	protected void didRemove(int index, E oldObject) {
		if (!silentOperation)
			EAListHelper.didRemove(index, oldObject, collection);
	}

	@Override
	protected void didChange() {
		if (!silentOperation)
			EAListHelper.didChange(collection);
	}

	@Override
	protected void didClear(int size, Object[] oldObjects) {
		if (!silentOperation)
			EAListHelper.didClear(size, oldObjects, collection);
	}

	@Override
	protected void didMove(int index, E movedObject, int oldIndex) {
		if (!silentOperation)
			EAListHelper.didMove(index, movedObject, oldIndex, collection);
	}

	@Override
	protected void didSet(int index, E newObject, E oldObject) {
		if (!silentOperation)
			EAListHelper.didSet(index, newObject, oldObject, collection);
	}

	public void setSilentOperation(boolean silentOperation) {
		this.silentOperation = silentOperation;
	}
}
