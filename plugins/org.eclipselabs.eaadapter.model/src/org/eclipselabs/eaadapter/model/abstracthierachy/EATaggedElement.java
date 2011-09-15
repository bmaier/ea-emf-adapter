/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Tagged Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement#getTagID <em>Tag ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEATaggedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EATaggedElement extends EANamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEATaggedElement_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag ID</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEATaggedElement_TagID()
	 * @model changeable="false"
	 * @generated
	 */
	Integer getTagID();

} // EATaggedElement