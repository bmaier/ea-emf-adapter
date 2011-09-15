/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Owned Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement#getIsLocked <em>Is Locked</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEAOwnedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EAOwnedElement extends EAVersiondElement {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEAOwnedElement_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Locked</em>' attribute.
	 * @see #setIsLocked(Boolean)
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEAOwnedElement_IsLocked()
	 * @model
	 * @generated
	 */
	Boolean getIsLocked();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement#getIsLocked <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locked</em>' attribute.
	 * @see #getIsLocked()
	 * @generated
	 */
	void setIsLocked(Boolean value);

} // EAOwnedElement