/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.eaadapter.model.EARepository;
import org.sparx.Collection;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Base Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * Base class for all adapter elements
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEABaseClass()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EABaseClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * The objectType defines the EA type for each element.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEABaseClass_ObjectType()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" changeable="false"
	 * @generated
	 */
	String getObjectType();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Each EA element has a <i>local</i> ID.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEABaseClass_Id()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer" changeable="false"
	 * @generated
	 */
	Integer getId();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #isSetRepository()
	 * @see #unsetRepository()
	 * @see #setRepository(EARepository)
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#getEABaseClass_Repository()
	 * @model unsettable="true"
	 * @generated
	 */
	EARepository getRepository();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #isSetRepository()
	 * @see #unsetRepository()
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(EARepository value);

	/**
	 * Unsets the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepository()
	 * @see #getRepository()
	 * @see #setRepository(EARepository)
	 * @generated
	 */
	void unsetRepository();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getRepository <em>Repository</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repository</em>' reference is set.
	 * @see #unsetRepository()
	 * @see #getRepository()
	 * @see #setRepository(EARepository)
	 * @generated
	 */
	boolean isSetRepository();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * This initialized a new Element on the EA!<br>
	 * This method is used internally to create new elements.
	 * </div>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean" collectionDataType="org.eclipselabs.eaadapter.model.datatypes.EACollection"
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	Boolean initializeAdapter(Collection collection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * This deletes an element of the EA.<br>
	 * Used internally!
	 * </div>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean" collectionDataType="org.eclipselabs.eaadapter.model.datatypes.EACollection"
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	Boolean deleteAdapter(Collection collection);

} // EABaseClass