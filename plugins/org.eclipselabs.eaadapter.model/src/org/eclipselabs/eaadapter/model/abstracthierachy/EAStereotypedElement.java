/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Stereotyped Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement#getHasDStereotype <em>Has DStereotype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEAStereotypedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EAStereotypedElement extends EANamedElement {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEAStereotypedElement_Stereotype()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Has DStereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Each stereotyped element can be checked whether the stereotype contains a '-X'.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has DStereotype</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEAStereotypedElement_HasDStereotype()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	Boolean getHasDStereotype();

} // EAStereotypedElement