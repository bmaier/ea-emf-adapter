/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipse.emf.common.util.EList;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement;
import org.sparx.Method;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * An operation of the element it belongs to.
 * <br><br><i>For detailled documentation see <a href='http://www.sparxsystems.com.au/EAUserGuide/index.html' target='_blank'>EA User Guide</a>!</i>
 * 
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getReturnIsArray <em>Return Is Array</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getThrows <em>Throws</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getIsPure <em>Is Pure</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getIsQuery <em>Is Query</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getIsSynchronized <em>Is Synchronized</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getClassifierID <em>Classifier ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethod#getTaggedValues <em>Tagged Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod()
 * @model
 * @generated
 */
public interface EAMethod extends EAModifiableElement {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_ReturnType()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Return Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Is Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Is Array</em>' attribute.
	 * @see #setReturnIsArray(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_ReturnIsArray()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getReturnIsArray();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getReturnIsArray <em>Return Is Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Is Array</em>' attribute.
	 * @see #getReturnIsArray()
	 * @generated
	 */
	void setReturnIsArray(Boolean value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_Code()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throws</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' attribute.
	 * @see #setThrows(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_Throws()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getThrows();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getThrows <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' attribute.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(String value);

	/**
	 * Returns the value of the '<em><b>Is Pure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Pure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pure</em>' attribute.
	 * @see #setIsPure(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_IsPure()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsPure();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsPure <em>Is Pure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pure</em>' attribute.
	 * @see #getIsPure()
	 * @generated
	 */
	void setIsPure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #setIsRoot(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_IsRoot()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsRoot();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #getIsRoot()
	 * @generated
	 */
	void setIsRoot(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Leaf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_IsLeaf()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsLeaf();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #getIsLeaf()
	 * @generated
	 */
	void setIsLeaf(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_IsQuery()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsQuery();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #getIsQuery()
	 * @generated
	 */
	void setIsQuery(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronized</em>' attribute.
	 * @see #setIsSynchronized(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_IsSynchronized()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsSynchronized();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsSynchronized <em>Is Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronized</em>' attribute.
	 * @see #getIsSynchronized()
	 * @generated
	 */
	void setIsSynchronized(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_IsAbstract()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see #setConcurrency(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_Concurrency()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getConcurrency();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(String value);

	/**
	 * Returns the value of the '<em><b>Classifier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier ID</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_ClassifierID()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" changeable="false"
	 * @generated
	 */
	String getClassifierID();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAElement#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(EAElement)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_Element()
	 * @see org.eclipselabs.eaadapter.model.EAElement#getMethods
	 * @model opposite="methods"
	 * @generated
	 */
	EAElement getElement();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EAElement value);

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
	 * @see #setEaLink(Method)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_Method" transient="true"
	 * @generated
	 */
	Method getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethod#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(Method value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAParameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_Parameters()
	 * @see org.eclipselabs.eaadapter.model.EAParameter#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<EAParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAMethodTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Values</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethod_TaggedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAMethodTag> getTaggedValues();

} // EAMethod