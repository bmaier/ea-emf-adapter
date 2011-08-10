/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * Each element of the EA metamodel is a EANamedElement!
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getGuid <em>Guid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEANamedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EANamedElement extends EABaseClass {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"name"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * The name of the EA element.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEANamedElement_Name()
	 * @model default="name" dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Each EA element may have a note.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEANamedElement_Notes()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Each element of the EA has a Global Unique IDendifier!<br>
	 * This guid is used as an ID for the EMF model as well!<br>
	 * Unfortunately, it is a readonly attribute for EA elements.<br>
	 * <b>Important: This attribute is set automatically if the adapter is initialized via <code>initializeAdapter</code>!</b>
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEANamedElement_Guid()
	 * @model id="true" dataType="org.eclipselabs.eaadapter.model.datatypes.String" changeable="false"
	 * @generated
	 */
	String getGuid();

} // EANamedElement