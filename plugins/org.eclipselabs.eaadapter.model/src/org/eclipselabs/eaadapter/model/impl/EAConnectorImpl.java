/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.eaadapter.model.EAConnector;
import org.eclipselabs.eaadapter.model.EAConnectorEnd;
import org.eclipselabs.eaadapter.model.EAConnectorTag;
import org.eclipselabs.eaadapter.model.EAElement;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.Filter;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement;
import org.eclipselabs.eaadapter.model.datatypes.FilterClass;
import org.eclipselabs.eaadapter.model.datatypes.FilterType;
import org.eclipselabs.eaadapter.model.util.EAObjectContainmentEList;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.sparx.Collection;
import org.sparx.Connector;
import org.sparx.ConnectorTag;
import org.sparx.Element;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getIsSpec <em>Is Spec</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getTransitionEvent <em>Transition Event</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getTransitionGuard <em>Transition Guard</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getRouteStyle <em>Route Style</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSequenceNo <em>Sequence No</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getDiagramID <em>Diagram ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplierEnd <em>Supplier End</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClientID <em>Client ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClient <em>Client</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClientEnd <em>Client End</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClient_aggregation <em>Client aggregation</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClient_cardinality <em>Client cardinality</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClient_containment <em>Client containment</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClient_isNavigable <em>Client is Navigable</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClient_note <em>Client note</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClient_role <em>Client role</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClient_roleType <em>Client role Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClient_stereotype <em>Client stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getClient_visibility <em>Client visibility</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplier_aggregation <em>Supplier aggregation</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplier_cardinality <em>Supplier cardinality</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplier_containment <em>Supplier containment</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplier_isNavigable <em>Supplier is Navigable</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplier_note <em>Supplier note</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplier_role <em>Supplier role</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplier_roleType <em>Supplier role Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplier_stereotype <em>Supplier stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getSupplier_visibility <em>Supplier visibility</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl#getIsA2dDependency <em>Is A2d Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("rawtypes")
public class EAConnectorImpl extends EObjectImpl implements EAConnector {
	/**
	 * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected String objectType = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = null;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected EARepository repository = null;

	/**
	 * This is true if the Repository reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repositoryESet = false;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "name";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = null;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = null;

	/**
	 * The default value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected static final String GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected String guid = null;

	/**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected String stereotype = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = null;

	/**
	 * The default value of the '{@link #getConnectorID() <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorID() <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorID()
	 * @generated
	 * @ordered
	 */
	protected Integer connectorID = null;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = null;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = null;

	/**
	 * The default value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LEAF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ROOT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsSpec() <em>Is Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SPEC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVirtualInheritance() <em>Virtual Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualInheritance()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_INHERITANCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransitionEvent() <em>Transition Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_EVENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransitionAction() <em>Transition Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionAction()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_ACTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransitionGuard() <em>Transition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITION_GUARD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRouteStyle() <em>Route Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteStyle()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROUTE_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteStyle() <em>Route Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteStyle()
	 * @generated
	 * @ordered
	 */
	protected Integer routeStyle = null;

	/**
	 * The default value of the '{@link #getSequenceNo() <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SEQUENCE_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceNo() <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNo()
	 * @generated
	 * @ordered
	 */
	protected Integer sequenceNo = null;

	/**
	 * The default value of the '{@link #getDiagramID() <em>Diagram ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIAGRAM_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final Connector EA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected Connector eaLink = null;

	/**
	 * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EAConnectorTag> taggedValues = null;

	/**
	 * The default value of the '{@link #getSupplierID() <em>Supplier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUPPLIER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierID() <em>Supplier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierID()
	 * @generated
	 * @ordered
	 */
	protected Integer supplierID = null;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected EAElement supplier = null;

	/**
	 * The default value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLIENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientID()
	 * @generated
	 * @ordered
	 */
	protected Integer clientID = null;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected EAElement client = null;

	/**
	 * This is true if the Client reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientESet = false;

	/**
	 * The default value of the '{@link #getClient_aggregation() <em>Client aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_aggregation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLIENT_AGGREGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient_aggregation() <em>Client aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_aggregation()
	 * @generated
	 * @ordered
	 */
	protected Integer client_aggregation = null;

	/**
	 * The default value of the '{@link #getClient_cardinality() <em>Client cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_cardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient_cardinality() <em>Client cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_cardinality()
	 * @generated
	 * @ordered
	 */
	protected String client_cardinality = null;

	/**
	 * The default value of the '{@link #getClient_containment() <em>Client containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_containment()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_CONTAINMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient_containment() <em>Client containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_containment()
	 * @generated
	 * @ordered
	 */
	protected String client_containment = null;

	/**
	 * The default value of the '{@link #getClient_isNavigable() <em>Client is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_isNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CLIENT_IS_NAVIGABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient_isNavigable() <em>Client is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_isNavigable()
	 * @generated
	 * @ordered
	 */
	protected Boolean client_isNavigable = null;

	/**
	 * The default value of the '{@link #getClient_note() <em>Client note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_note()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient_note() <em>Client note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_note()
	 * @generated
	 * @ordered
	 */
	protected String client_note = null;

	/**
	 * The default value of the '{@link #getClient_role() <em>Client role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_role()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient_role() <em>Client role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_role()
	 * @generated
	 * @ordered
	 */
	protected String client_role = null;

	/**
	 * The default value of the '{@link #getClient_roleType() <em>Client role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_roleType()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ROLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient_roleType() <em>Client role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_roleType()
	 * @generated
	 * @ordered
	 */
	protected String client_roleType = null;

	/**
	 * The default value of the '{@link #getClient_stereotype() <em>Client stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_stereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_STEREOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient_stereotype() <em>Client stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_stereotype()
	 * @generated
	 * @ordered
	 */
	protected String client_stereotype = null;

	/**
	 * The default value of the '{@link #getClient_visibility() <em>Client visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_visibility()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient_visibility() <em>Client visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_visibility()
	 * @generated
	 * @ordered
	 */
	protected String client_visibility = null;

	/**
	 * The default value of the '{@link #getSupplier_aggregation() <em>Supplier aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_aggregation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUPPLIER_AGGREGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier_aggregation() <em>Supplier aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_aggregation()
	 * @generated
	 * @ordered
	 */
	protected Integer supplier_aggregation = null;

	/**
	 * The default value of the '{@link #getSupplier_cardinality() <em>Supplier cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_cardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier_cardinality() <em>Supplier cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_cardinality()
	 * @generated
	 * @ordered
	 */
	protected String supplier_cardinality = null;

	/**
	 * The default value of the '{@link #getSupplier_containment() <em>Supplier containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_containment()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_CONTAINMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier_containment() <em>Supplier containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_containment()
	 * @generated
	 * @ordered
	 */
	protected String supplier_containment = null;

	/**
	 * The default value of the '{@link #getSupplier_isNavigable() <em>Supplier is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_isNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPLIER_IS_NAVIGABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier_isNavigable() <em>Supplier is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_isNavigable()
	 * @generated
	 * @ordered
	 */
	protected Boolean supplier_isNavigable = null;

	/**
	 * The default value of the '{@link #getSupplier_note() <em>Supplier note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_note()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier_note() <em>Supplier note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_note()
	 * @generated
	 * @ordered
	 */
	protected String supplier_note = null;

	/**
	 * The default value of the '{@link #getSupplier_role() <em>Supplier role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_role()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier_role() <em>Supplier role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_role()
	 * @generated
	 * @ordered
	 */
	protected String supplier_role = null;

	/**
	 * The default value of the '{@link #getSupplier_roleType() <em>Supplier role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_roleType()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_ROLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier_roleType() <em>Supplier role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_roleType()
	 * @generated
	 * @ordered
	 */
	protected String supplier_roleType = null;

	/**
	 * The default value of the '{@link #getSupplier_stereotype() <em>Supplier stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_stereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_STEREOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier_stereotype() <em>Supplier stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_stereotype()
	 * @generated
	 * @ordered
	 */
	protected String supplier_stereotype = null;

	/**
	 * The default value of the '{@link #getSupplier_visibility() <em>Supplier visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_visibility()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier_visibility() <em>Supplier visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier_visibility()
	 * @generated
	 * @ordered
	 */
	protected String supplier_visibility = null;

	/**
	 * The default value of the '{@link #getIsA2dDependency() <em>Is A2d Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsA2dDependency()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_A2D_DEPENDENCY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.EA_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectType() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && objectType != null) return objectType;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				objectType = eaLink.GetObjectType().name();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getId() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && id != null) return id;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				id = eaLink.GetConnectorID();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EARepository getRepository() {
		if (repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject)repository;
			repository = (EARepository)eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_CONNECTOR__REPOSITORY, oldRepository, repository));
			}
		}
		// return value
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EARepository basicGetRepository() {
		return repository;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(EARepository newRepository) {
		EARepository oldRepository = repository;
		repository = newRepository;
		boolean oldRepositoryESet = repositoryESet;
		repositoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__REPOSITORY, oldRepository, repository, !oldRepositoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepository() {
		EARepository oldRepository = repository;
		boolean oldRepositoryESet = repositoryESet;
		repository = null;
		repositoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_CONNECTOR__REPOSITORY, oldRepository, null, oldRepositoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepository() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && name != null) return name;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				name = eaLink.GetName();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return name;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newName != null && newName.equals(name)) return;
				// update EA link
				try {
					eaLink.SetName(newName);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && notes != null) return notes;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				notes = eaLink.GetNotes();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return notes;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newNotes != null && newNotes.equals(notes)) return;
				// update EA link
				try {
					eaLink.SetNotes(newNotes);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuid() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && guid != null) return guid;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				guid = eaLink.GetConnectorGUID();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && stereotype != null) return stereotype;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				stereotype = eaLink.GetStereotype();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return stereotype;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newStereotype != null && newStereotype.equals(stereotype)) return;
				// update EA link
				try {
					eaLink.SetStereotype(newStereotype);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldStereotype = stereotype;
		stereotype = newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && type != null) return type;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				type = eaLink.GetType();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return type;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newType != null && newType.equals(type)) return;
				// update EA link
				try {
					eaLink.SetType(newType);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getConnectorID() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && connectorID != null) return connectorID;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				connectorID = eaLink.GetConnectorID();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return connectorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirection() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && direction != null) return direction;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				direction = eaLink.GetDirection();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return direction;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(String newDirection) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newDirection != null && newDirection.equals(direction)) return;
				// update EA link
				try {
					eaLink.SetDirection(newDirection);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && subtype != null) return subtype;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				subtype = eaLink.GetSubtype();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return subtype;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSubtype != null && newSubtype.equals(subtype)) return;
				// update EA link
				try {
					eaLink.SetSubtype(newSubtype);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLeaf() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(Boolean newIsLeaf) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsRoot() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(Boolean newIsRoot) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSpec() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSpec(Boolean newIsSpec) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVirtualInheritance() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualInheritance(String newVirtualInheritance) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionEvent() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionEvent(String newTransitionEvent) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionAction() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionAction(String newTransitionAction) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionGuard() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionGuard(String newTransitionGuard) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRouteStyle() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && routeStyle != null) return routeStyle;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				routeStyle = eaLink.GetRouteStyle();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return routeStyle;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteStyle(Integer newRouteStyle) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newRouteStyle != null && newRouteStyle.equals(routeStyle)) return;
				// update EA link
				try {
					eaLink.SetRouteStyle(newRouteStyle);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldRouteStyle = routeStyle;
		routeStyle = newRouteStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__ROUTE_STYLE, oldRouteStyle, routeStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSequenceNo() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && sequenceNo != null) return sequenceNo;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				sequenceNo = eaLink.GetSequenceNo();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return sequenceNo;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNo(Integer newSequenceNo) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSequenceNo != null && newSequenceNo.equals(sequenceNo)) return;
				// update EA link
				try {
					eaLink.SetSequenceNo(newSequenceNo);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldSequenceNo = sequenceNo;
		sequenceNo = newSequenceNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SEQUENCE_NO, oldSequenceNo, sequenceNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDiagramID() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramID(Integer newDiagramID) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getEaLink() {
		// return value
		return eaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaLink(Connector newEaLink) {
		// check if any setter was called previously to transfer values to the corresponding ea object...
		if (name != null) newEaLink.SetName(name);
		if (notes != null) newEaLink.SetNotes(notes);
		if (stereotype != null) newEaLink.SetStereotype(stereotype);
		if (type != null) newEaLink.SetType(type);
		if (direction != null) newEaLink.SetDirection(direction);
		if (subtype != null) newEaLink.SetSubtype(subtype);
		if (routeStyle != null) newEaLink.SetRouteStyle(routeStyle);
		if (sequenceNo != null) newEaLink.SetSequenceNo(sequenceNo);  
		updateEaLink(newEaLink); // this initializes subelements of the ea object
		if (newEaLink.GetClientEnd() != null) {
			if (client_aggregation != null) newEaLink.GetClientEnd().SetAggregation(client_aggregation);  
			if (client_cardinality != null) newEaLink.GetClientEnd().SetCardinality(client_cardinality);  
			if (client_containment != null) newEaLink.GetClientEnd().SetContainment(client_containment);  
			if (client_isNavigable != null) newEaLink.GetClientEnd().SetIsNavigable(client_isNavigable);  
			if (client_note != null) newEaLink.GetClientEnd().SetRoleNote(client_note);  
			if (client_role != null) newEaLink.GetClientEnd().SetRole(client_role);  
			if (client_roleType != null) newEaLink.GetClientEnd().SetRoleType(client_roleType);  
			if (client_stereotype != null) newEaLink.GetClientEnd().SetStereotype(client_stereotype);  
			if (client_visibility != null) newEaLink.GetClientEnd().SetVisibility(client_visibility);  
        } else EAUtil.getLogger(getClass()).error("Subelement newEaLink.ClientEnd is null of new: " + this);
		if (newEaLink.GetSupplierEnd() != null) {
			if (supplier_aggregation != null) newEaLink.GetSupplierEnd().SetAggregation(supplier_aggregation);  
			if (supplier_cardinality != null) newEaLink.GetSupplierEnd().SetCardinality(supplier_cardinality);  
			if (supplier_containment != null) newEaLink.GetSupplierEnd().SetContainment(supplier_containment);  
			if (supplier_isNavigable != null) newEaLink.GetSupplierEnd().SetIsNavigable(supplier_isNavigable);  
			if (supplier_note != null) newEaLink.GetSupplierEnd().SetRoleNote(supplier_note);  
			if (supplier_role != null) newEaLink.GetSupplierEnd().SetRole(supplier_role);  
			if (supplier_roleType != null) newEaLink.GetSupplierEnd().SetRoleType(supplier_roleType);  
			if (supplier_stereotype != null) newEaLink.GetSupplierEnd().SetStereotype(supplier_stereotype);  
			if (supplier_visibility != null) newEaLink.GetSupplierEnd().SetVisibility(supplier_visibility);
        } else EAUtil.getLogger(getClass()).error("Subelement newEaLink.SupplierEnd is null of new: " + this); 
		updateEaLink(newEaLink);
		// update emf object
		Connector oldEaLink = eaLink;
		eaLink = newEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__EA_LINK, oldEaLink, eaLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAConnectorTag> getTaggedValues() {
		if (taggedValues == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					taggedValues = new EAObjectContainmentEList<EAConnectorTag>(EAConnectorTag.class, this, EamodelPackage.EA_CONNECTOR__TAGGED_VALUES, eaLink.GetTaggedValues());
					// fill list with ea objects
					ArrayList<EAConnectorTag> coll = new ArrayList<EAConnectorTag>();
					collection: for (ConnectorTag eaCollElement : eaLink.GetTaggedValues()) {
						// check if element is filtered out
						for (Filter filter : repository.getFilter()) {
							if (filter.getFilterClass().equals(FilterClass.ALL) || filter.getFilterClass().getLiteral().equals(eaCollElement.getClass().getSimpleName())) {
								switch (filter.getFilterAttribute()) {
								case NAME:
									if (filter.getFilterType().equals(FilterType.EQUALS_STRING_LITERAL))
										if (filter.getFilterExpression().equals(eaCollElement.GetName()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.CONTAINS_STRING_LITERAL))
										if (eaCollElement.GetName().contains(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.REGEX_LITERAL))
										if (eaCollElement.GetName() == null)
											if (filter.getNegate())
												break;
											else continue collection;
										else if (eaCollElement.GetName().matches(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else EAUtil.getLogger(getClass()).warn("Warning! Unknown filter type detected: " + filter.getFilterType() + " If this filter type is well-known, add it to the template 'filterContainments.javajetinc' and regenerate the model code.");
								}
							}
						}

						// create emf wrapper object
						EAConnectorTag collElement = EamodelFactory.eINSTANCE.createEAConnectorTag();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						taggedValues.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//taggedValues = new EAObjectContainmentEList<EAConnectorTag>(EAConnectorTag.class, this, EamodelPackage.EA_CONNECTOR__TAGGED_VALUES, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					taggedValues = new BasicEList<EAConnectorTag>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (taggedValues == null)
					taggedValues = new BasicEList<EAConnectorTag>();
			}
		}
		return taggedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSupplierID() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && supplierID != null) return supplierID;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				supplierID = eaLink.GetSupplierID();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return supplierID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement getSupplier() {
		return eContainer() instanceof EAElement ? (EAElement)eContainer() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAConnectorEnd getSupplierEnd() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplierEnd(EAConnectorEnd newSupplierEnd, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Supplier End' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getClientID() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && clientID != null) return clientID;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				clientID = eaLink.GetClientID();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return clientID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (EAElement)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_CONNECTOR__CLIENT, oldClient, client));
			}
		}
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && client != null) return client;

		if (eaLink == null) {
			// if readonly is switched on, create a dummy emf object
			if (repository == null || repository.getReadonlyEaLink()) {
				if (client == null) { 
					client = EamodelFactory.eINSTANCE.createEAElement();
					client.setRepository(repository);
					clientESet = true;
				}
				return client;
			} else return null;
		} 
		// synchronize emf object with ea object
		try {
			if (client == null) {
				Element eaClient = getClientReference();
				if (eaClient != null) {
					// the emf object may not be initialized, so lets catch the nullpointer if it fails...
					try {
						final Resource resource = eResource();
						Object o = resource.getEObject(eaClient.GetElementGUID());
						// if o is null, the element may be out of scope so we ingore it.
						if (o != null) client = (EAElement)o;
					} catch (NullPointerException e) {
					}
					clientESet = client != null;
				}
			} else {
				Element eaClient = getClientReference();
				if (eaClient == null) {
					// if you get an error, that method unsetClient() is undefined, you need to set the feature client unsettable in your model.
					unsetClient();
				}
			}
		} catch (Exception e) {
			if (eaLink == null)
				EAUtil.getLogger(getClass()).error("EA Link is null!", e);
			else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
		}
		// return value
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Element getClientReference() {
		try {
			int clientID = eaLink.GetClientID();
			if (clientID > 0 && repository != null)
				return repository.getEaLink().GetElementByID(clientID);
		} catch (NullPointerException e) {
			EAUtil.getLogger(getClass()).error("Nullpointer exception occured while getting connector client", e); 
		} catch (Exception e) {
			EAUtil.getLogger(getClass()).error("An exception occured while getting connector client", e); 
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement basicGetClient() {
		return client;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(EAElement newClient) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				if (eaLink == null) return;
				// Set new reference in ea model. Return if it fails.
				try {
					if (!setClientReference(newClient))
						throw new UnsupportedOperationException("Cannot update Client reference in ea model!");
					updateEaLink(eaLink);
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
					return;
				}
			}
		}
		// update emf reference
		EAElement oldClient = client;
		client = newClient;
		boolean oldClientESet = clientESet;
		clientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__CLIENT, oldClient, client, !oldClientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean setClientReference(EAElement newClient) {
		eaLink.SetClientID(newClient.getEaLink().GetElementID());
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClient() {
		EAElement oldClient = client;
		boolean oldClientESet = clientESet;
		client = null;
		clientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_CONNECTOR__CLIENT, oldClient, null, oldClientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClient() {
		return clientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAConnectorEnd getClientEnd() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientEnd(EAConnectorEnd newClientEnd, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Client End' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getClient_aggregation() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && client_aggregation != null) return client_aggregation;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetClientEnd() != null) {
						client_aggregation = eaLink.GetClientEnd().GetAggregation();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return client_aggregation;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_aggregation(Integer newClient_aggregation) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newClient_aggregation != null && newClient_aggregation.equals(client_aggregation)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetClientEnd() != null) {
						eaLink.GetClientEnd().SetAggregation(newClient_aggregation);
						eaLink.GetClientEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldClient_aggregation = client_aggregation;
		client_aggregation = newClient_aggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__CLIENT_AGGREGATION, oldClient_aggregation, client_aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClient_cardinality() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && client_cardinality != null) return client_cardinality;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetClientEnd() != null) {
						client_cardinality = eaLink.GetClientEnd().GetCardinality();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return client_cardinality;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_cardinality(String newClient_cardinality) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newClient_cardinality != null && newClient_cardinality.equals(client_cardinality)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetClientEnd() != null) {
						eaLink.GetClientEnd().SetCardinality(newClient_cardinality);
						eaLink.GetClientEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldClient_cardinality = client_cardinality;
		client_cardinality = newClient_cardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__CLIENT_CARDINALITY, oldClient_cardinality, client_cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClient_containment() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && client_containment != null) return client_containment;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetClientEnd() != null) {
						client_containment = eaLink.GetClientEnd().GetContainment();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return client_containment;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_containment(String newClient_containment) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newClient_containment != null && newClient_containment.equals(client_containment)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetClientEnd() != null) {
						eaLink.GetClientEnd().SetContainment(newClient_containment);
						eaLink.GetClientEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldClient_containment = client_containment;
		client_containment = newClient_containment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__CLIENT_CONTAINMENT, oldClient_containment, client_containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getClient_isNavigable() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && client_isNavigable != null) return client_isNavigable;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetClientEnd() != null) {
						client_isNavigable = eaLink.GetClientEnd().GetIsNavigable();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return client_isNavigable;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_isNavigable(Boolean newClient_isNavigable) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newClient_isNavigable != null && newClient_isNavigable.equals(client_isNavigable)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetClientEnd() != null) {
						eaLink.GetClientEnd().SetIsNavigable(newClient_isNavigable);
						eaLink.GetClientEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldClient_isNavigable = client_isNavigable;
		client_isNavigable = newClient_isNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__CLIENT_IS_NAVIGABLE, oldClient_isNavigable, client_isNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClient_note() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && client_note != null) return client_note;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetClientEnd() != null) {
						client_note = eaLink.GetClientEnd().GetRoleNote();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return client_note;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_note(String newClient_note) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newClient_note != null && newClient_note.equals(client_note)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetClientEnd() != null) {
						eaLink.GetClientEnd().SetRoleNote(newClient_note);
						eaLink.GetClientEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldClient_note = client_note;
		client_note = newClient_note;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__CLIENT_NOTE, oldClient_note, client_note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClient_role() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && client_role != null) return client_role;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetClientEnd() != null) {
						client_role = eaLink.GetClientEnd().GetRole();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return client_role;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_role(String newClient_role) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newClient_role != null && newClient_role.equals(client_role)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetClientEnd() != null) {
						eaLink.GetClientEnd().SetRole(newClient_role);
						eaLink.GetClientEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldClient_role = client_role;
		client_role = newClient_role;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__CLIENT_ROLE, oldClient_role, client_role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClient_roleType() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && client_roleType != null) return client_roleType;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetClientEnd() != null) {
						client_roleType = eaLink.GetClientEnd().GetRoleType();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return client_roleType;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_roleType(String newClient_roleType) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newClient_roleType != null && newClient_roleType.equals(client_roleType)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetClientEnd() != null) {
						eaLink.GetClientEnd().SetRoleType(newClient_roleType);
						eaLink.GetClientEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldClient_roleType = client_roleType;
		client_roleType = newClient_roleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__CLIENT_ROLE_TYPE, oldClient_roleType, client_roleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClient_stereotype() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && client_stereotype != null) return client_stereotype;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetClientEnd() != null) {
						client_stereotype = eaLink.GetClientEnd().GetStereotype();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return client_stereotype;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_stereotype(String newClient_stereotype) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newClient_stereotype != null && newClient_stereotype.equals(client_stereotype)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetClientEnd() != null) {
						eaLink.GetClientEnd().SetStereotype(newClient_stereotype);
						eaLink.GetClientEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldClient_stereotype = client_stereotype;
		client_stereotype = newClient_stereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__CLIENT_STEREOTYPE, oldClient_stereotype, client_stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClient_visibility() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && client_visibility != null) return client_visibility;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetClientEnd() != null) {
						client_visibility = eaLink.GetClientEnd().GetVisibility();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return client_visibility;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_visibility(String newClient_visibility) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newClient_visibility != null && newClient_visibility.equals(client_visibility)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetClientEnd() != null) {
						eaLink.GetClientEnd().SetVisibility(newClient_visibility);
						eaLink.GetClientEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldClient_visibility = client_visibility;
		client_visibility = newClient_visibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__CLIENT_VISIBILITY, oldClient_visibility, client_visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSupplier_aggregation() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && supplier_aggregation != null) return supplier_aggregation;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetSupplierEnd() != null) {
						supplier_aggregation = eaLink.GetSupplierEnd().GetAggregation();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return supplier_aggregation;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier_aggregation(Integer newSupplier_aggregation) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSupplier_aggregation != null && newSupplier_aggregation.equals(supplier_aggregation)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetSupplierEnd() != null) {
						eaLink.GetSupplierEnd().SetAggregation(newSupplier_aggregation);
						eaLink.GetSupplierEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldSupplier_aggregation = supplier_aggregation;
		supplier_aggregation = newSupplier_aggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SUPPLIER_AGGREGATION, oldSupplier_aggregation, supplier_aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplier_cardinality() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && supplier_cardinality != null) return supplier_cardinality;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetSupplierEnd() != null) {
						supplier_cardinality = eaLink.GetSupplierEnd().GetCardinality();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return supplier_cardinality;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier_cardinality(String newSupplier_cardinality) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSupplier_cardinality != null && newSupplier_cardinality.equals(supplier_cardinality)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetSupplierEnd() != null) {
						eaLink.GetSupplierEnd().SetCardinality(newSupplier_cardinality);
						eaLink.GetSupplierEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldSupplier_cardinality = supplier_cardinality;
		supplier_cardinality = newSupplier_cardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SUPPLIER_CARDINALITY, oldSupplier_cardinality, supplier_cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplier_containment() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && supplier_containment != null) return supplier_containment;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetSupplierEnd() != null) {
						supplier_containment = eaLink.GetSupplierEnd().GetContainment();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return supplier_containment;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier_containment(String newSupplier_containment) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSupplier_containment != null && newSupplier_containment.equals(supplier_containment)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetSupplierEnd() != null) {
						eaLink.GetSupplierEnd().SetContainment(newSupplier_containment);
						eaLink.GetSupplierEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldSupplier_containment = supplier_containment;
		supplier_containment = newSupplier_containment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SUPPLIER_CONTAINMENT, oldSupplier_containment, supplier_containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSupplier_isNavigable() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && supplier_isNavigable != null) return supplier_isNavigable;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetSupplierEnd() != null) {
						supplier_isNavigable = eaLink.GetSupplierEnd().GetIsNavigable();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return supplier_isNavigable;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier_isNavigable(Boolean newSupplier_isNavigable) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSupplier_isNavigable != null && newSupplier_isNavigable.equals(supplier_isNavigable)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetSupplierEnd() != null) {
						eaLink.GetSupplierEnd().SetIsNavigable(newSupplier_isNavigable);
						eaLink.GetSupplierEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldSupplier_isNavigable = supplier_isNavigable;
		supplier_isNavigable = newSupplier_isNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SUPPLIER_IS_NAVIGABLE, oldSupplier_isNavigable, supplier_isNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplier_note() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && supplier_note != null) return supplier_note;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetSupplierEnd() != null) {
						supplier_note = eaLink.GetSupplierEnd().GetRoleNote();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return supplier_note;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier_note(String newSupplier_note) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSupplier_note != null && newSupplier_note.equals(supplier_note)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetSupplierEnd() != null) {
						eaLink.GetSupplierEnd().SetRoleNote(newSupplier_note);
						eaLink.GetSupplierEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldSupplier_note = supplier_note;
		supplier_note = newSupplier_note;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SUPPLIER_NOTE, oldSupplier_note, supplier_note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplier_role() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && supplier_role != null) return supplier_role;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetSupplierEnd() != null) {
						supplier_role = eaLink.GetSupplierEnd().GetRole();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return supplier_role;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier_role(String newSupplier_role) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSupplier_role != null && newSupplier_role.equals(supplier_role)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetSupplierEnd() != null) {
						eaLink.GetSupplierEnd().SetRole(newSupplier_role);
						eaLink.GetSupplierEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldSupplier_role = supplier_role;
		supplier_role = newSupplier_role;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE, oldSupplier_role, supplier_role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplier_roleType() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && supplier_roleType != null) return supplier_roleType;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetSupplierEnd() != null) {
						supplier_roleType = eaLink.GetSupplierEnd().GetRoleType();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return supplier_roleType;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier_roleType(String newSupplier_roleType) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSupplier_roleType != null && newSupplier_roleType.equals(supplier_roleType)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetSupplierEnd() != null) {
						eaLink.GetSupplierEnd().SetRoleType(newSupplier_roleType);
						eaLink.GetSupplierEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldSupplier_roleType = supplier_roleType;
		supplier_roleType = newSupplier_roleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE_TYPE, oldSupplier_roleType, supplier_roleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplier_stereotype() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && supplier_stereotype != null) return supplier_stereotype;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetSupplierEnd() != null) {
						supplier_stereotype = eaLink.GetSupplierEnd().GetStereotype();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return supplier_stereotype;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier_stereotype(String newSupplier_stereotype) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSupplier_stereotype != null && newSupplier_stereotype.equals(supplier_stereotype)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetSupplierEnd() != null) {
						eaLink.GetSupplierEnd().SetStereotype(newSupplier_stereotype);
						eaLink.GetSupplierEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldSupplier_stereotype = supplier_stereotype;
		supplier_stereotype = newSupplier_stereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SUPPLIER_STEREOTYPE, oldSupplier_stereotype, supplier_stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplier_visibility() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && supplier_visibility != null) return supplier_visibility;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {  
					if (eaLink.GetSupplierEnd() != null) {
						supplier_visibility = eaLink.GetSupplierEnd().GetVisibility();
					}
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return supplier_visibility;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier_visibility(String newSupplier_visibility) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSupplier_visibility != null && newSupplier_visibility.equals(supplier_visibility)) return;
				// update EA link
				try {  
					if (isUnderVersionControl())
						return;
					if (eaLink.GetSupplierEnd() != null) {
						eaLink.GetSupplierEnd().SetVisibility(newSupplier_visibility);
						eaLink.GetSupplierEnd().Update();
					}
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldSupplier_visibility = supplier_visibility;
		supplier_visibility = newSupplier_visibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR__SUPPLIER_VISIBILITY, oldSupplier_visibility, supplier_visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsA2dDependency() {
		return getStereotype().equals("A2D") && getType().equals("Dependency");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewParent(EAVersiondElement parent) {
		if (eaLink == null) return;

		// to perform a move, set the ID of the new parent. The collections are updated automatically (I hope...)
		try {
			eaLink.SetSupplierID(((EAElement)parent).getEaLink().GetElementID());
			updateEaLink(eaLink);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Perhaps EA has produced an error: " + eaLink.GetLastError());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean initializeAdapter(Collection collection) {
		// return if already initialized
		if (eaLink != null) return true;
		
		try {
		
			// set default values; use setter for emf notification
			if (name == null) setName("name");
            
			// set ea link and transfer all values
			Connector newEaLink = (Connector)collection.AddNew("", "Association");
			if (newEaLink != null) {
				setEaLink(newEaLink);
			
				// update EA model
				collection.Refresh();
				return true;
			} else return false;  // EA model could not be created
			
		} catch (Exception e) {
			e.printStackTrace();
			if (eaLink == null)
				System.err.println("EA Link is null!");
			else System.err.println("Perhaps EA has produced an error: " + eaLink.GetLastError());
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean deleteAdapter(Collection collection) {
		// return if not initialized
		if (eaLink == null) return true;
		
		// iterate through collection elements to delete element
		try {
			String delId = getGuid();
			short count = collection.GetCount();
			for (int i = count - 1; i >= 0; i--) {
				Connector collElement = (Connector) collection.GetAt((short) i);
				if (collElement.GetConnectorGUID().equals(delId)) {
					collection.Delete((short) i);
					collection.Refresh();
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (eaLink == null)
				System.err.println("EA Link is null!");
			else System.err.println("Perhaps EA has produced an error: " + eaLink.GetLastError());
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EamodelPackage.EA_CONNECTOR__TAGGED_VALUES:
				return ((InternalEList)getTaggedValues()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_END:
				return basicSetSupplierEnd(null, msgs);
			case EamodelPackage.EA_CONNECTOR__CLIENT_END:
				return basicSetClientEnd(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EamodelPackage.EA_CONNECTOR__OBJECT_TYPE:
				return getObjectType();
			case EamodelPackage.EA_CONNECTOR__ID:
				return getId();
			case EamodelPackage.EA_CONNECTOR__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case EamodelPackage.EA_CONNECTOR__NAME:
				return getName();
			case EamodelPackage.EA_CONNECTOR__NOTES:
				return getNotes();
			case EamodelPackage.EA_CONNECTOR__GUID:
				return getGuid();
			case EamodelPackage.EA_CONNECTOR__STEREOTYPE:
				return getStereotype();
			case EamodelPackage.EA_CONNECTOR__TYPE:
				return getType();
			case EamodelPackage.EA_CONNECTOR__CONNECTOR_ID:
				return getConnectorID();
			case EamodelPackage.EA_CONNECTOR__DIRECTION:
				return getDirection();
			case EamodelPackage.EA_CONNECTOR__SUBTYPE:
				return getSubtype();
			case EamodelPackage.EA_CONNECTOR__IS_LEAF:
				return getIsLeaf();
			case EamodelPackage.EA_CONNECTOR__IS_ROOT:
				return getIsRoot();
			case EamodelPackage.EA_CONNECTOR__IS_SPEC:
				return getIsSpec();
			case EamodelPackage.EA_CONNECTOR__VIRTUAL_INHERITANCE:
				return getVirtualInheritance();
			case EamodelPackage.EA_CONNECTOR__TRANSITION_EVENT:
				return getTransitionEvent();
			case EamodelPackage.EA_CONNECTOR__TRANSITION_ACTION:
				return getTransitionAction();
			case EamodelPackage.EA_CONNECTOR__TRANSITION_GUARD:
				return getTransitionGuard();
			case EamodelPackage.EA_CONNECTOR__ROUTE_STYLE:
				return getRouteStyle();
			case EamodelPackage.EA_CONNECTOR__SEQUENCE_NO:
				return getSequenceNo();
			case EamodelPackage.EA_CONNECTOR__DIAGRAM_ID:
				return getDiagramID();
			case EamodelPackage.EA_CONNECTOR__EA_LINK:
				return getEaLink();
			case EamodelPackage.EA_CONNECTOR__TAGGED_VALUES:
				return getTaggedValues();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ID:
				return getSupplierID();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_END:
				return getSupplierEnd();
			case EamodelPackage.EA_CONNECTOR__CLIENT_ID:
				return getClientID();
			case EamodelPackage.EA_CONNECTOR__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case EamodelPackage.EA_CONNECTOR__CLIENT_END:
				return getClientEnd();
			case EamodelPackage.EA_CONNECTOR__CLIENT_AGGREGATION:
				return getClient_aggregation();
			case EamodelPackage.EA_CONNECTOR__CLIENT_CARDINALITY:
				return getClient_cardinality();
			case EamodelPackage.EA_CONNECTOR__CLIENT_CONTAINMENT:
				return getClient_containment();
			case EamodelPackage.EA_CONNECTOR__CLIENT_IS_NAVIGABLE:
				return getClient_isNavigable();
			case EamodelPackage.EA_CONNECTOR__CLIENT_NOTE:
				return getClient_note();
			case EamodelPackage.EA_CONNECTOR__CLIENT_ROLE:
				return getClient_role();
			case EamodelPackage.EA_CONNECTOR__CLIENT_ROLE_TYPE:
				return getClient_roleType();
			case EamodelPackage.EA_CONNECTOR__CLIENT_STEREOTYPE:
				return getClient_stereotype();
			case EamodelPackage.EA_CONNECTOR__CLIENT_VISIBILITY:
				return getClient_visibility();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_AGGREGATION:
				return getSupplier_aggregation();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_CARDINALITY:
				return getSupplier_cardinality();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_CONTAINMENT:
				return getSupplier_containment();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_IS_NAVIGABLE:
				return getSupplier_isNavigable();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_NOTE:
				return getSupplier_note();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE:
				return getSupplier_role();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE_TYPE:
				return getSupplier_roleType();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_STEREOTYPE:
				return getSupplier_stereotype();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_VISIBILITY:
				return getSupplier_visibility();
			case EamodelPackage.EA_CONNECTOR__IS_A2D_DEPENDENCY:
				return getIsA2dDependency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EamodelPackage.EA_CONNECTOR__REPOSITORY:
				setRepository((EARepository)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__NOTES:
				setNotes((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__TYPE:
				setType((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__DIRECTION:
				setDirection((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__IS_ROOT:
				setIsRoot((Boolean)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__IS_SPEC:
				setIsSpec((Boolean)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__VIRTUAL_INHERITANCE:
				setVirtualInheritance((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__TRANSITION_EVENT:
				setTransitionEvent((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__TRANSITION_ACTION:
				setTransitionAction((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__TRANSITION_GUARD:
				setTransitionGuard((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__ROUTE_STYLE:
				setRouteStyle((Integer)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SEQUENCE_NO:
				setSequenceNo((Integer)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__DIAGRAM_ID:
				setDiagramID((Integer)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__EA_LINK:
				setEaLink((Connector)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__TAGGED_VALUES:
				getTaggedValues().clear();
				getTaggedValues().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT:
				setClient((EAElement)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_AGGREGATION:
				setClient_aggregation((Integer)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_CARDINALITY:
				setClient_cardinality((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_CONTAINMENT:
				setClient_containment((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_IS_NAVIGABLE:
				setClient_isNavigable((Boolean)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_NOTE:
				setClient_note((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_ROLE:
				setClient_role((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_ROLE_TYPE:
				setClient_roleType((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_STEREOTYPE:
				setClient_stereotype((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_VISIBILITY:
				setClient_visibility((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_AGGREGATION:
				setSupplier_aggregation((Integer)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_CARDINALITY:
				setSupplier_cardinality((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_CONTAINMENT:
				setSupplier_containment((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_IS_NAVIGABLE:
				setSupplier_isNavigable((Boolean)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_NOTE:
				setSupplier_note((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE:
				setSupplier_role((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE_TYPE:
				setSupplier_roleType((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_STEREOTYPE:
				setSupplier_stereotype((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_VISIBILITY:
				setSupplier_visibility((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case EamodelPackage.EA_CONNECTOR__REPOSITORY:
				unsetRepository();
				return;
			case EamodelPackage.EA_CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__IS_SPEC:
				setIsSpec(IS_SPEC_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__VIRTUAL_INHERITANCE:
				setVirtualInheritance(VIRTUAL_INHERITANCE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__TRANSITION_EVENT:
				setTransitionEvent(TRANSITION_EVENT_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__TRANSITION_ACTION:
				setTransitionAction(TRANSITION_ACTION_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__TRANSITION_GUARD:
				setTransitionGuard(TRANSITION_GUARD_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__ROUTE_STYLE:
				setRouteStyle(ROUTE_STYLE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SEQUENCE_NO:
				setSequenceNo(SEQUENCE_NO_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__DIAGRAM_ID:
				setDiagramID(DIAGRAM_ID_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__EA_LINK:
				setEaLink(EA_LINK_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__TAGGED_VALUES:
				getTaggedValues().clear();
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT:
				unsetClient();
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_AGGREGATION:
				setClient_aggregation(CLIENT_AGGREGATION_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_CARDINALITY:
				setClient_cardinality(CLIENT_CARDINALITY_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_CONTAINMENT:
				setClient_containment(CLIENT_CONTAINMENT_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_IS_NAVIGABLE:
				setClient_isNavigable(CLIENT_IS_NAVIGABLE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_NOTE:
				setClient_note(CLIENT_NOTE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_ROLE:
				setClient_role(CLIENT_ROLE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_ROLE_TYPE:
				setClient_roleType(CLIENT_ROLE_TYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_STEREOTYPE:
				setClient_stereotype(CLIENT_STEREOTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__CLIENT_VISIBILITY:
				setClient_visibility(CLIENT_VISIBILITY_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_AGGREGATION:
				setSupplier_aggregation(SUPPLIER_AGGREGATION_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_CARDINALITY:
				setSupplier_cardinality(SUPPLIER_CARDINALITY_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_CONTAINMENT:
				setSupplier_containment(SUPPLIER_CONTAINMENT_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_IS_NAVIGABLE:
				setSupplier_isNavigable(SUPPLIER_IS_NAVIGABLE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_NOTE:
				setSupplier_note(SUPPLIER_NOTE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE:
				setSupplier_role(SUPPLIER_ROLE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE_TYPE:
				setSupplier_roleType(SUPPLIER_ROLE_TYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_STEREOTYPE:
				setSupplier_stereotype(SUPPLIER_STEREOTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_VISIBILITY:
				setSupplier_visibility(SUPPLIER_VISIBILITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EamodelPackage.EA_CONNECTOR__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case EamodelPackage.EA_CONNECTOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EamodelPackage.EA_CONNECTOR__REPOSITORY:
				return isSetRepository();
			case EamodelPackage.EA_CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EamodelPackage.EA_CONNECTOR__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EamodelPackage.EA_CONNECTOR__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case EamodelPackage.EA_CONNECTOR__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case EamodelPackage.EA_CONNECTOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EamodelPackage.EA_CONNECTOR__CONNECTOR_ID:
				return CONNECTOR_ID_EDEFAULT == null ? connectorID != null : !CONNECTOR_ID_EDEFAULT.equals(connectorID);
			case EamodelPackage.EA_CONNECTOR__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case EamodelPackage.EA_CONNECTOR__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case EamodelPackage.EA_CONNECTOR__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? getIsLeaf() != null : !IS_LEAF_EDEFAULT.equals(getIsLeaf());
			case EamodelPackage.EA_CONNECTOR__IS_ROOT:
				return IS_ROOT_EDEFAULT == null ? getIsRoot() != null : !IS_ROOT_EDEFAULT.equals(getIsRoot());
			case EamodelPackage.EA_CONNECTOR__IS_SPEC:
				return IS_SPEC_EDEFAULT == null ? getIsSpec() != null : !IS_SPEC_EDEFAULT.equals(getIsSpec());
			case EamodelPackage.EA_CONNECTOR__VIRTUAL_INHERITANCE:
				return VIRTUAL_INHERITANCE_EDEFAULT == null ? getVirtualInheritance() != null : !VIRTUAL_INHERITANCE_EDEFAULT.equals(getVirtualInheritance());
			case EamodelPackage.EA_CONNECTOR__TRANSITION_EVENT:
				return TRANSITION_EVENT_EDEFAULT == null ? getTransitionEvent() != null : !TRANSITION_EVENT_EDEFAULT.equals(getTransitionEvent());
			case EamodelPackage.EA_CONNECTOR__TRANSITION_ACTION:
				return TRANSITION_ACTION_EDEFAULT == null ? getTransitionAction() != null : !TRANSITION_ACTION_EDEFAULT.equals(getTransitionAction());
			case EamodelPackage.EA_CONNECTOR__TRANSITION_GUARD:
				return TRANSITION_GUARD_EDEFAULT == null ? getTransitionGuard() != null : !TRANSITION_GUARD_EDEFAULT.equals(getTransitionGuard());
			case EamodelPackage.EA_CONNECTOR__ROUTE_STYLE:
				return ROUTE_STYLE_EDEFAULT == null ? routeStyle != null : !ROUTE_STYLE_EDEFAULT.equals(routeStyle);
			case EamodelPackage.EA_CONNECTOR__SEQUENCE_NO:
				return SEQUENCE_NO_EDEFAULT == null ? sequenceNo != null : !SEQUENCE_NO_EDEFAULT.equals(sequenceNo);
			case EamodelPackage.EA_CONNECTOR__DIAGRAM_ID:
				return DIAGRAM_ID_EDEFAULT == null ? getDiagramID() != null : !DIAGRAM_ID_EDEFAULT.equals(getDiagramID());
			case EamodelPackage.EA_CONNECTOR__EA_LINK:
				return EA_LINK_EDEFAULT == null ? eaLink != null : !EA_LINK_EDEFAULT.equals(eaLink);
			case EamodelPackage.EA_CONNECTOR__TAGGED_VALUES:
				return taggedValues != null && !taggedValues.isEmpty();
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ID:
				return SUPPLIER_ID_EDEFAULT == null ? supplierID != null : !SUPPLIER_ID_EDEFAULT.equals(supplierID);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER:
				return supplier != null;
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_END:
				return getSupplierEnd() != null;
			case EamodelPackage.EA_CONNECTOR__CLIENT_ID:
				return CLIENT_ID_EDEFAULT == null ? clientID != null : !CLIENT_ID_EDEFAULT.equals(clientID);
			case EamodelPackage.EA_CONNECTOR__CLIENT:
				return isSetClient();
			case EamodelPackage.EA_CONNECTOR__CLIENT_END:
				return getClientEnd() != null;
			case EamodelPackage.EA_CONNECTOR__CLIENT_AGGREGATION:
				return CLIENT_AGGREGATION_EDEFAULT == null ? client_aggregation != null : !CLIENT_AGGREGATION_EDEFAULT.equals(client_aggregation);
			case EamodelPackage.EA_CONNECTOR__CLIENT_CARDINALITY:
				return CLIENT_CARDINALITY_EDEFAULT == null ? client_cardinality != null : !CLIENT_CARDINALITY_EDEFAULT.equals(client_cardinality);
			case EamodelPackage.EA_CONNECTOR__CLIENT_CONTAINMENT:
				return CLIENT_CONTAINMENT_EDEFAULT == null ? client_containment != null : !CLIENT_CONTAINMENT_EDEFAULT.equals(client_containment);
			case EamodelPackage.EA_CONNECTOR__CLIENT_IS_NAVIGABLE:
				return CLIENT_IS_NAVIGABLE_EDEFAULT == null ? client_isNavigable != null : !CLIENT_IS_NAVIGABLE_EDEFAULT.equals(client_isNavigable);
			case EamodelPackage.EA_CONNECTOR__CLIENT_NOTE:
				return CLIENT_NOTE_EDEFAULT == null ? client_note != null : !CLIENT_NOTE_EDEFAULT.equals(client_note);
			case EamodelPackage.EA_CONNECTOR__CLIENT_ROLE:
				return CLIENT_ROLE_EDEFAULT == null ? client_role != null : !CLIENT_ROLE_EDEFAULT.equals(client_role);
			case EamodelPackage.EA_CONNECTOR__CLIENT_ROLE_TYPE:
				return CLIENT_ROLE_TYPE_EDEFAULT == null ? client_roleType != null : !CLIENT_ROLE_TYPE_EDEFAULT.equals(client_roleType);
			case EamodelPackage.EA_CONNECTOR__CLIENT_STEREOTYPE:
				return CLIENT_STEREOTYPE_EDEFAULT == null ? client_stereotype != null : !CLIENT_STEREOTYPE_EDEFAULT.equals(client_stereotype);
			case EamodelPackage.EA_CONNECTOR__CLIENT_VISIBILITY:
				return CLIENT_VISIBILITY_EDEFAULT == null ? client_visibility != null : !CLIENT_VISIBILITY_EDEFAULT.equals(client_visibility);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_AGGREGATION:
				return SUPPLIER_AGGREGATION_EDEFAULT == null ? supplier_aggregation != null : !SUPPLIER_AGGREGATION_EDEFAULT.equals(supplier_aggregation);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_CARDINALITY:
				return SUPPLIER_CARDINALITY_EDEFAULT == null ? supplier_cardinality != null : !SUPPLIER_CARDINALITY_EDEFAULT.equals(supplier_cardinality);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_CONTAINMENT:
				return SUPPLIER_CONTAINMENT_EDEFAULT == null ? supplier_containment != null : !SUPPLIER_CONTAINMENT_EDEFAULT.equals(supplier_containment);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_IS_NAVIGABLE:
				return SUPPLIER_IS_NAVIGABLE_EDEFAULT == null ? supplier_isNavigable != null : !SUPPLIER_IS_NAVIGABLE_EDEFAULT.equals(supplier_isNavigable);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_NOTE:
				return SUPPLIER_NOTE_EDEFAULT == null ? supplier_note != null : !SUPPLIER_NOTE_EDEFAULT.equals(supplier_note);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE:
				return SUPPLIER_ROLE_EDEFAULT == null ? supplier_role != null : !SUPPLIER_ROLE_EDEFAULT.equals(supplier_role);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE_TYPE:
				return SUPPLIER_ROLE_TYPE_EDEFAULT == null ? supplier_roleType != null : !SUPPLIER_ROLE_TYPE_EDEFAULT.equals(supplier_roleType);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_STEREOTYPE:
				return SUPPLIER_STEREOTYPE_EDEFAULT == null ? supplier_stereotype != null : !SUPPLIER_STEREOTYPE_EDEFAULT.equals(supplier_stereotype);
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_VISIBILITY:
				return SUPPLIER_VISIBILITY_EDEFAULT == null ? supplier_visibility != null : !SUPPLIER_VISIBILITY_EDEFAULT.equals(supplier_visibility);
			case EamodelPackage.EA_CONNECTOR__IS_A2D_DEPENDENCY:
				return IS_A2D_DEPENDENCY_EDEFAULT == null ? getIsA2dDependency() != null : !IS_A2D_DEPENDENCY_EDEFAULT.equals(getIsA2dDependency());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (objectType: ");
		result.append(getObjectType());
		result.append(", id: ");
		result.append(getId());
		result.append(", name: ");
		result.append(getName());
		result.append(", notes: ");
		result.append(getNotes());
		result.append(", guid: ");
		result.append(getGuid());
		result.append(", stereotype: ");
		result.append(getStereotype());
		result.append(", type: ");
		result.append(getType());
		result.append(", connectorID: ");
		result.append(getConnectorID());
		result.append(", direction: ");
		result.append(getDirection());
		result.append(", subtype: ");
		result.append(getSubtype());
		result.append(", routeStyle: ");
		result.append(getRouteStyle());
		result.append(", sequenceNo: ");
		result.append(getSequenceNo());
		result.append(", eaLink: ");
		result.append(getEaLink());
		result.append(", supplierID: ");
		result.append(getSupplierID());
		result.append(", clientID: ");
		result.append(getClientID());
		result.append(", client_aggregation: ");
		result.append(getClient_aggregation());
		result.append(", client_cardinality: ");
		result.append(getClient_cardinality());
		result.append(", client_containment: ");
		result.append(getClient_containment());
		result.append(", client_isNavigable: ");
		result.append(getClient_isNavigable());
		result.append(", client_note: ");
		result.append(getClient_note());
		result.append(", client_role: ");
		result.append(getClient_role());
		result.append(", client_roleType: ");
		result.append(getClient_roleType());
		result.append(", client_stereotype: ");
		result.append(getClient_stereotype());
		result.append(", client_visibility: ");
		result.append(getClient_visibility());
		result.append(", supplier_aggregation: ");
		result.append(getSupplier_aggregation());
		result.append(", supplier_cardinality: ");
		result.append(getSupplier_cardinality());
		result.append(", supplier_containment: ");
		result.append(getSupplier_containment());
		result.append(", supplier_isNavigable: ");
		result.append(getSupplier_isNavigable());
		result.append(", supplier_note: ");
		result.append(getSupplier_note());
		result.append(", supplier_role: ");
		result.append(getSupplier_role());
		result.append(", supplier_roleType: ");
		result.append(getSupplier_roleType());
		result.append(", supplier_stereotype: ");
		result.append(getSupplier_stereotype());
		result.append(", supplier_visibility: ");
		result.append(getSupplier_visibility());
		result.append(')');
		return result.toString();
	}

	/**
	 * Update EA Link only if not under version control!
	 * @generated
	 */
	private boolean updateEaLink(Connector eaLink) {
		final EAPackage p = EAUtil.getContainerOfType(this, EamodelPackage.Literals.EA_PACKAGE);
		if (p == null || p.getEaLink() == null || !p.getEaLink().GetIsVersionControlled()) {
			try {
				return eaLink.Update();
			} catch (Exception e) {
			}
		} else {
			// not possible if under version control
		}
		return false;
	}

	/**
	 * Checks if this object is under version control.
	 * @generated
	 */
	private boolean isUnderVersionControl() {
		final EAPackage p = EAUtil.getContainerOfType(this, EamodelPackage.Literals.EA_PACKAGE);
		if (p == null) {
			EAUtil.getLogger(getClass()).warn("Cannot get containing package! Is this element contained somewhere meaningful? " + this);
			return false;
		} else if (p.getEaLink() == null) {
			EAUtil.getLogger(getClass()).warn("Cannot get EA Link of containing package! " + p);
			return false;
		} else {
			return p.getEaLink().GetIsVersionControlled();
		}
	}

	/**
	 * Calculate the hashcode over the global unique identifier (guid) of the ea object.
	 * @generated
	 */
	@Override
	public int hashCode() {
		String guid = getGuid();
		if (guid != null) {
			if (!guidHashMap.containsKey(guid)) {
				int hashCode = super.hashCode();
				guidHashMap.put(guid, hashCode);
				return hashCode;
			} else return guidHashMap.get(guid);
		} else return super.hashCode();
	}
	
	/**
	 * @generated
	 */
	transient private static Map<String,Integer> guidHashMap = new HashMap<String, Integer>(); 

	/**
	 * @generated
	 */
	@Override
	public boolean equals(Object obj) {
		return obj != null && hashCode() == obj.hashCode();
	}

} //EAConnectorImpl