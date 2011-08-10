/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Modifiable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement#getIsStatic <em>Is Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEAModifiableElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EAModifiableElement extends EAVisibilityElement {
	/**
	 * Returns the value of the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Const</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Const</em>' attribute.
	 * @see #setIsConst(Boolean)
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEAModifiableElement_IsConst()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsConst();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement#getIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #getIsConst()
	 * @generated
	 */
	void setIsConst(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(Boolean)
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEAModifiableElement_IsStatic()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsStatic();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement#getIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #getIsStatic()
	 * @generated
	 */
	void setIsStatic(Boolean value);

} // EAModifiableElement