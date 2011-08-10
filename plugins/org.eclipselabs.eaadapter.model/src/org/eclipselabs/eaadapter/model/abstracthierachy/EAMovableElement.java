/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Movable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEAMovableElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EAMovableElement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * This can be used to move elements.
	 * </div>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setNewParent(EAVersiondElement parent);

} // EAMovableElement