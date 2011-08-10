/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement;
import org.sparx.Parameter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * A Parameter of a method.
 * <br><br><i>For detailled documentation see <a href='http://www.sparxsystems.com.au/EAUserGuide/index.html' target='_blank'>EA User Guide</a>!</i>
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAParameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAParameter#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAParameter#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAParameter#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAParameter#getClassifierID <em>Classifier ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAParameter#getOperationID <em>Operation ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAParameter#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAParameter#getEaLink <em>Ea Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAParameter()
 * @model
 * @generated
 */
public interface EAParameter extends EANamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAParameter_Type()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAParameter_Default()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAParameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAParameter_Position()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getPosition();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAParameter#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Integer value);

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
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAParameter_IsConst()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsConst();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAParameter#getIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #getIsConst()
	 * @generated
	 */
	void setIsConst(Boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAParameter_Kind()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAParameter#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Classifier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier ID</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAParameter_ClassifierID()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer" changeable="false"
	 * @generated
	 */
	String getClassifierID();

	/**
	 * Returns the value of the '<em><b>Operation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation ID</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAParameter_OperationID()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer" changeable="false"
	 * @generated
	 */
	Integer getOperationID();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(EAMethod)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAParameter_Method()
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getParameters
	 * @model opposite="parameters"
	 * @generated
	 */
	EAMethod getMethod();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAParameter#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(EAMethod value);

	/**
	 * Returns the value of the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * DO NOT TOUCH THIS! This attributed is used as a link to the Enterprise Architect and is managed internally only!
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ea Link</em>' attribute.
	 * @see #setEaLink(Parameter)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAParameter_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_Parameter" transient="true"
	 * @generated
	 */
	Parameter getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAParameter#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(Parameter value);

} // EAParameter