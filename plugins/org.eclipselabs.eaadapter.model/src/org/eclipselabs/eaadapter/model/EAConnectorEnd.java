/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass;
import org.sparx.ConnectorEnd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getContainment <em>Containment</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd()
 * @model
 * @generated
 */
public interface EAConnectorEnd extends EABaseClass {
	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see #setAggregation(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_Aggregation()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getAggregation();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(Integer value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_Cardinality()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * The default value is <code>"Unspecified"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_Containment()
	 * @model default="Unspecified" dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getContainment();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #getContainment()
	 * @generated
	 */
	void setContainment(String value);

	/**
	 * Returns the value of the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Navigable</em>' attribute.
	 * @see #setIsNavigable(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_IsNavigable()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsNavigable();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getIsNavigable <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Navigable</em>' attribute.
	 * @see #getIsNavigable()
	 * @generated
	 */
	void setIsNavigable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_Note()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_Role()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' attribute.
	 * @see #setRoleType(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_RoleType()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getRoleType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getRoleType <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' attribute.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(String value);

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
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_Stereotype()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"Public"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_Visibility()
	 * @model default="Public" dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ea Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ea Link</em>' attribute.
	 * @see #setEaLink(ConnectorEnd)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_ConnectorEnd" transient="true"
	 * @generated
	 */
	ConnectorEnd getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(ConnectorEnd value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see #setOrdering(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_Ordering()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getOrdering();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(Integer value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_Qualifier()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnectorEnd_End()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" changeable="false"
	 * @generated
	 */
	String getEnd();

} // EAConnectorEnd