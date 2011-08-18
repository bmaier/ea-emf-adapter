/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipse.emf.common.util.EList;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement;
import org.sparx.Connector;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * A connector represents an association between two EAElements.<br>
 * The type (inherited attribute) defines what kind of connector it is. Examples are: <code>Association, Generalization, Dependency</code or <code>NoteLink</code>.<br>
 * <br>
 * <b>Very important:</b> The EA takes care that no invalid models may exist. As a consequence, any Connector which has an invalid reference <code>client</code> to the target EAElement will be 'garbage collected' by the EA!
 * <br><br><i>For more detailled documentation see <a href='http://www.sparxsystems.com.au/EAUserGuide/index.html' target='_blank'>EA User Guide</a>!</i>
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getTransitionEvent <em>Transition Event</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getTransitionGuard <em>Transition Guard</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getRouteStyle <em>Route Style</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSequenceNo <em>Sequence No</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getDiagramID <em>Diagram ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplierEnd <em>Supplier End</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClientID <em>Client ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClient <em>Client</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClientEnd <em>Client End</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_aggregation <em>Client aggregation</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_cardinality <em>Client cardinality</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_containment <em>Client containment</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_isNavigable <em>Client is Navigable</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_note <em>Client note</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_role <em>Client role</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_roleType <em>Client role Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_stereotype <em>Client stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_visibility <em>Client visibility</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_aggregation <em>Supplier aggregation</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_cardinality <em>Supplier cardinality</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_containment <em>Supplier containment</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_isNavigable <em>Supplier is Navigable</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_note <em>Supplier note</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_role <em>Supplier role</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_roleType <em>Supplier role Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_stereotype <em>Supplier stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_visibility <em>Supplier visibility</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAConnector#getIsA2dDependency <em>Is A2d Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector()
 * @model
 * @generated
 */
public interface EAConnector extends EATypedElement, EAMovableElement {
	/**
	 * Returns the value of the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector ID</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_ConnectorID()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer" changeable="false"
	 * @generated
	 */
	Integer getConnectorID();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Direction()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Subtype()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getSubtype();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(String value);

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
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_IsLeaf()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean" volatile="true"
	 * @generated
	 */
	Boolean getIsLeaf();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #getIsLeaf()
	 * @generated
	 */
	void setIsLeaf(Boolean value);

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
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_IsRoot()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean" volatile="true"
	 * @generated
	 */
	Boolean getIsRoot();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #getIsRoot()
	 * @generated
	 */
	void setIsRoot(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Spec</em>' attribute.
	 * @see #setIsSpec(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_IsSpec()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean" volatile="true"
	 * @generated
	 */
	Boolean getIsSpec();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getIsSpec <em>Is Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Spec</em>' attribute.
	 * @see #getIsSpec()
	 * @generated
	 */
	void setIsSpec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Virtual Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Inheritance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Inheritance</em>' attribute.
	 * @see #setVirtualInheritance(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_VirtualInheritance()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getVirtualInheritance();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getVirtualInheritance <em>Virtual Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Inheritance</em>' attribute.
	 * @see #getVirtualInheritance()
	 * @generated
	 */
	void setVirtualInheritance(String value);

	/**
	 * Returns the value of the '<em><b>Transition Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Event</em>' attribute.
	 * @see #setTransitionEvent(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_TransitionEvent()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getTransitionEvent();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getTransitionEvent <em>Transition Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Event</em>' attribute.
	 * @see #getTransitionEvent()
	 * @generated
	 */
	void setTransitionEvent(String value);

	/**
	 * Returns the value of the '<em><b>Transition Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Action</em>' attribute.
	 * @see #setTransitionAction(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_TransitionAction()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getTransitionAction();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getTransitionAction <em>Transition Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Action</em>' attribute.
	 * @see #getTransitionAction()
	 * @generated
	 */
	void setTransitionAction(String value);

	/**
	 * Returns the value of the '<em><b>Transition Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Guard</em>' attribute.
	 * @see #setTransitionGuard(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_TransitionGuard()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getTransitionGuard();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getTransitionGuard <em>Transition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Guard</em>' attribute.
	 * @see #getTransitionGuard()
	 * @generated
	 */
	void setTransitionGuard(String value);

	/**
	 * Returns the value of the '<em><b>Route Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Style</em>' attribute.
	 * @see #setRouteStyle(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_RouteStyle()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getRouteStyle();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getRouteStyle <em>Route Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Style</em>' attribute.
	 * @see #getRouteStyle()
	 * @generated
	 */
	void setRouteStyle(Integer value);

	/**
	 * Returns the value of the '<em><b>Sequence No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence No</em>' attribute.
	 * @see #setSequenceNo(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_SequenceNo()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getSequenceNo();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSequenceNo <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence No</em>' attribute.
	 * @see #getSequenceNo()
	 * @generated
	 */
	void setSequenceNo(Integer value);

	/**
	 * Returns the value of the '<em><b>Diagram ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram ID</em>' attribute.
	 * @see #setDiagramID(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_DiagramID()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer" volatile="true"
	 * @generated
	 */
	Integer getDiagramID();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getDiagramID <em>Diagram ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram ID</em>' attribute.
	 * @see #getDiagramID()
	 * @generated
	 */
	void setDiagramID(Integer value);

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
	 * @see #setEaLink(Connector)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_Connector" transient="true"
	 * @generated
	 */
	Connector getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(Connector value);

	/**
	 * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAConnectorTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Values</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_TaggedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAConnectorTag> getTaggedValues();

	/**
	 * Returns the value of the '<em><b>Supplier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier ID</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_SupplierID()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer" changeable="false"
	 * @generated
	 */
	Integer getSupplierID();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * This reference is handled as the opposite to the <code>connectors</code> containment.
	 * If the containment changes, this references is updated as well.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Supplier()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	EAElement getSupplier();

	/**
	 * Returns the value of the '<em><b>Supplier End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier End</em>' containment reference.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_SupplierEnd()
	 * @model containment="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EAConnectorEnd getSupplierEnd();

	/**
	 * Returns the value of the '<em><b>Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client ID</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_ClientID()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer" changeable="false"
	 * @generated
	 */
	Integer getClientID();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Reference to the target EAElement of this connector.<br>
	 * <b>Note:</b> Take care that this reference will always be valid, otherwise the EA takes care of it and 'garbage collects' it.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #isSetClient()
	 * @see #unsetClient()
	 * @see #setClient(EAElement)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Client()
	 * @model unsettable="true"
	 * @generated
	 */
	EAElement getClient();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #isSetClient()
	 * @see #unsetClient()
	 * @see #getClient()
	 * @generated
	 */
	void setClient(EAElement value);

	/**
	 * Unsets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClient()
	 * @see #getClient()
	 * @see #setClient(EAElement)
	 * @generated
	 */
	void unsetClient();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient <em>Client</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client</em>' reference is set.
	 * @see #unsetClient()
	 * @see #getClient()
	 * @see #setClient(EAElement)
	 * @generated
	 */
	boolean isSetClient();

	/**
	 * Returns the value of the '<em><b>Client End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client End</em>' containment reference.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_ClientEnd()
	 * @model containment="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EAConnectorEnd getClientEnd();

	/**
	 * Returns the value of the '<em><b>Client aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>ClientEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client aggregation</em>' attribute.
	 * @see #setClient_aggregation(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Client_aggregation()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getClient_aggregation();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_aggregation <em>Client aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client aggregation</em>' attribute.
	 * @see #getClient_aggregation()
	 * @generated
	 */
	void setClient_aggregation(Integer value);

	/**
	 * Returns the value of the '<em><b>Client cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>ClientEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client cardinality</em>' attribute.
	 * @see #setClient_cardinality(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Client_cardinality()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getClient_cardinality();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_cardinality <em>Client cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client cardinality</em>' attribute.
	 * @see #getClient_cardinality()
	 * @generated
	 */
	void setClient_cardinality(String value);

	/**
	 * Returns the value of the '<em><b>Client containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>ClientEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client containment</em>' attribute.
	 * @see #setClient_containment(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Client_containment()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getClient_containment();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_containment <em>Client containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client containment</em>' attribute.
	 * @see #getClient_containment()
	 * @generated
	 */
	void setClient_containment(String value);

	/**
	 * Returns the value of the '<em><b>Client is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>ClientEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client is Navigable</em>' attribute.
	 * @see #setClient_isNavigable(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Client_isNavigable()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getClient_isNavigable();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_isNavigable <em>Client is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client is Navigable</em>' attribute.
	 * @see #getClient_isNavigable()
	 * @generated
	 */
	void setClient_isNavigable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Client note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>ClientEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client note</em>' attribute.
	 * @see #setClient_note(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Client_note()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getClient_note();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_note <em>Client note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client note</em>' attribute.
	 * @see #getClient_note()
	 * @generated
	 */
	void setClient_note(String value);

	/**
	 * Returns the value of the '<em><b>Client role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>ClientEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client role</em>' attribute.
	 * @see #setClient_role(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Client_role()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getClient_role();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_role <em>Client role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client role</em>' attribute.
	 * @see #getClient_role()
	 * @generated
	 */
	void setClient_role(String value);

	/**
	 * Returns the value of the '<em><b>Client role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>ClientEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client role Type</em>' attribute.
	 * @see #setClient_roleType(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Client_roleType()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getClient_roleType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_roleType <em>Client role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client role Type</em>' attribute.
	 * @see #getClient_roleType()
	 * @generated
	 */
	void setClient_roleType(String value);

	/**
	 * Returns the value of the '<em><b>Client stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>ClientEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client stereotype</em>' attribute.
	 * @see #setClient_stereotype(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Client_stereotype()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getClient_stereotype();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_stereotype <em>Client stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client stereotype</em>' attribute.
	 * @see #getClient_stereotype()
	 * @generated
	 */
	void setClient_stereotype(String value);

	/**
	 * Returns the value of the '<em><b>Client visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>ClientEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client visibility</em>' attribute.
	 * @see #setClient_visibility(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Client_visibility()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getClient_visibility();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_visibility <em>Client visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client visibility</em>' attribute.
	 * @see #getClient_visibility()
	 * @generated
	 */
	void setClient_visibility(String value);

	/**
	 * Returns the value of the '<em><b>Supplier aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>SupplierEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier aggregation</em>' attribute.
	 * @see #setSupplier_aggregation(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Supplier_aggregation()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getSupplier_aggregation();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_aggregation <em>Supplier aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier aggregation</em>' attribute.
	 * @see #getSupplier_aggregation()
	 * @generated
	 */
	void setSupplier_aggregation(Integer value);

	/**
	 * Returns the value of the '<em><b>Supplier cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>SupplierEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier cardinality</em>' attribute.
	 * @see #setSupplier_cardinality(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Supplier_cardinality()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getSupplier_cardinality();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_cardinality <em>Supplier cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier cardinality</em>' attribute.
	 * @see #getSupplier_cardinality()
	 * @generated
	 */
	void setSupplier_cardinality(String value);

	/**
	 * Returns the value of the '<em><b>Supplier containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>SupplierEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier containment</em>' attribute.
	 * @see #setSupplier_containment(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Supplier_containment()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getSupplier_containment();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_containment <em>Supplier containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier containment</em>' attribute.
	 * @see #getSupplier_containment()
	 * @generated
	 */
	void setSupplier_containment(String value);

	/**
	 * Returns the value of the '<em><b>Supplier is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>SupplierEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier is Navigable</em>' attribute.
	 * @see #setSupplier_isNavigable(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Supplier_isNavigable()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getSupplier_isNavigable();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_isNavigable <em>Supplier is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier is Navigable</em>' attribute.
	 * @see #getSupplier_isNavigable()
	 * @generated
	 */
	void setSupplier_isNavigable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Supplier note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>SupplierEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier note</em>' attribute.
	 * @see #setSupplier_note(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Supplier_note()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getSupplier_note();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_note <em>Supplier note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier note</em>' attribute.
	 * @see #getSupplier_note()
	 * @generated
	 */
	void setSupplier_note(String value);

	/**
	 * Returns the value of the '<em><b>Supplier role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>SupplierEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier role</em>' attribute.
	 * @see #setSupplier_role(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Supplier_role()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getSupplier_role();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_role <em>Supplier role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier role</em>' attribute.
	 * @see #getSupplier_role()
	 * @generated
	 */
	void setSupplier_role(String value);

	/**
	 * Returns the value of the '<em><b>Supplier role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>SupplierEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier role Type</em>' attribute.
	 * @see #setSupplier_roleType(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Supplier_roleType()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getSupplier_roleType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_roleType <em>Supplier role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier role Type</em>' attribute.
	 * @see #getSupplier_roleType()
	 * @generated
	 */
	void setSupplier_roleType(String value);

	/**
	 * Returns the value of the '<em><b>Supplier stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>SupplierEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier stereotype</em>' attribute.
	 * @see #setSupplier_stereotype(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Supplier_stereotype()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getSupplier_stereotype();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_stereotype <em>Supplier stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier stereotype</em>' attribute.
	 * @see #getSupplier_stereotype()
	 * @generated
	 */
	void setSupplier_stereotype(String value);

	/**
	 * Returns the value of the '<em><b>Supplier visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of the <b>SupplierEnd</b> object of type <code>ConnectorEnd</code>.<br>
	 * So, this is a wrapper attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier visibility</em>' attribute.
	 * @see #setSupplier_visibility(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_Supplier_visibility()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getSupplier_visibility();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_visibility <em>Supplier visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier visibility</em>' attribute.
	 * @see #getSupplier_visibility()
	 * @generated
	 */
	void setSupplier_visibility(String value);

	/**
	 * Returns the value of the '<em><b>Is A2d Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Returns, whether the connection has the stereotype <i>A2D</i> and is of the type <i>dependency</i>.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is A2d Dependency</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAConnector_IsA2dDependency()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	Boolean getIsA2dDependency();

} // EAConnector