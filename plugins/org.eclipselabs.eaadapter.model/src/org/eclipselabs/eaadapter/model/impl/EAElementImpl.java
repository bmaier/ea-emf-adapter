/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.eaadapter.model.EAAttribute;
import org.eclipselabs.eaadapter.model.EAConnector;
import org.eclipselabs.eaadapter.model.EAElement;
import org.eclipselabs.eaadapter.model.EAMethod;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EATaggedValue;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.Filter;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement;
import org.eclipselabs.eaadapter.model.datatypes.FilterClass;
import org.eclipselabs.eaadapter.model.datatypes.FilterType;
import org.eclipselabs.eaadapter.model.util.EAObjectContainmentEList;
import org.eclipselabs.eaadapter.model.util.EAObjectContainmentWithInverseEList;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.sparx.Attribute;
import org.sparx.Collection;
import org.sparx.Connector;
import org.sparx.CustomProperty;
import org.sparx.Element;
import org.sparx.Method;
import org.sparx.Property;
import org.sparx.TaggedValue;
import org.sparx.Transition;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getClassifierID <em>Classifier ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getIsLocked <em>Is Locked</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getClassifierType <em>Classifier Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getGenlinks <em>Genlinks</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getGenfile <em>Genfile</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getGentype <em>Gentype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getStereotypeEx <em>Stereotype Ex</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getTablespace <em>Tablespace</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getParentID <em>Parent ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl#getPackageID <em>Package ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("rawtypes")
public class EAElementImpl extends EObjectImpl implements EAElement {
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
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = "Public";

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = null;

	/**
	 * The default value of the '{@link #getClassifierID() <em>Classifier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLASSIFIER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierID() <em>Classifier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierID()
	 * @generated
	 * @ordered
	 */
	protected Integer classifierID = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = null;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = null;

	/**
	 * The default value of the '{@link #getIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLocked() <em>Is Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLocked()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLocked = null;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = null;

	/**
	 * The default value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected String classifierName = null;

	/**
	 * The default value of the '{@link #getClassifierType() <em>Classifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierType()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierType() <em>Classifier Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierType()
	 * @generated
	 * @ordered
	 */
	protected String classifierType = null;

	/**
	 * The default value of the '{@link #getComplexity() <em>Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexity()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEXITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFFICULTY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExtensionPoints() <em>Extension Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoints()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_POINTS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGenlinks() <em>Genlinks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenlinks()
	 * @generated
	 * @ordered
	 */
	protected static final String GENLINKS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGenfile() <em>Genfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenfile()
	 * @generated
	 * @ordered
	 */
	protected static final String GENFILE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGentype() <em>Gentype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGentype()
	 * @generated
	 * @ordered
	 */
	protected static final String GENTYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String multiplicity = null;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPropertyType() <em>Property Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROPERTY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected Integer propertyType = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStereotypeEx() <em>Stereotype Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotypeEx()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREOTYPE_EX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected Integer subtype = null;

	/**
	 * The default value of the '{@link #getTablespace() <em>Tablespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLESPACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = null;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAAttribute> attributes = null;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<EAConnector> connectors = null;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EAElement> elements = null;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<EAMethod> methods = null;

	/**
	 * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EATaggedValue> taggedValues = null;

	/**
	 * The default value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final Element EA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected Element eaLink = null;

	/**
	 * The default value of the '{@link #getParentID() <em>Parent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARENT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPackageID() <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PACKAGE_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.EA_ELEMENT;
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
				id = eaLink.GetElementID();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_ELEMENT__REPOSITORY, oldRepository, repository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__REPOSITORY, oldRepository, repository, !oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_ELEMENT__REPOSITORY, oldRepository, null, oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__NOTES, oldNotes, notes));
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
				guid = eaLink.GetElementGUID();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__STEREOTYPE, oldStereotype, stereotype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && visibility != null) return visibility;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				visibility = eaLink.GetVisibility();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return visibility;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newVisibility != null && newVisibility.equals(visibility)) return;
				// update EA link
				try {
					eaLink.SetVisibility(newVisibility);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getClassifierID() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && classifierID != null) return classifierID;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				classifierID = eaLink.GetClassifierID();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return classifierID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && version != null) return version;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				version = eaLink.GetVersion();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return version;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newVersion != null && newVersion.equals(version)) return;
				// update EA link
				try {
					eaLink.SetVersion(newVersion);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && author != null) return author;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				author = eaLink.GetAuthor();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return author;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newAuthor != null && newAuthor.equals(author)) return;
				// update EA link
				try {
					eaLink.SetAuthor(newAuthor);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLocked() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isLocked != null) return isLocked;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isLocked = eaLink.GetLocked();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isLocked;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocked(Boolean newIsLocked) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsLocked != null && newIsLocked.equals(isLocked)) return;
				// update EA link
				try {
					eaLink.SetLocked(newIsLocked);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsLocked = isLocked;
		isLocked = newIsLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__IS_LOCKED, oldIsLocked, isLocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstract() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && abstract_ != null) return abstract_;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				abstract_ = eaLink.GetAbstract();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return abstract_;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(String newAbstract) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newAbstract != null && newAbstract.equals("1") || newAbstract.equalsIgnoreCase("true"))
					newAbstract = "1";
				else newAbstract = "0";
				// update EA link
				try {
					eaLink.SetAbstract(newAbstract);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierName() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && classifierName != null) return classifierName;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				classifierName = eaLink.GetClassifierName();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return classifierName;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierName(String newClassifierName) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newClassifierName != null && newClassifierName.equals(classifierName)) return;
				// update EA link
				try {
					eaLink.SetClassifierName(newClassifierName);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldClassifierName = classifierName;
		classifierName = newClassifierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__CLASSIFIER_NAME, oldClassifierName, classifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierType() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && classifierType != null) return classifierType;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				classifierType = eaLink.GetClassifierType();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return classifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplexity() {
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
	public void setComplexity(String newComplexity) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDifficulty() {
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
	public void setDifficulty(String newDifficulty) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionPoints() {
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
	public void setExtensionPoints(String newExtensionPoints) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenlinks() {
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
	public void setGenlinks(String newGenlinks) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenfile() {
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
	public void setGenfile(String newGenfile) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGentype() {
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
	public void setGentype(String newGentype) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicity() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && multiplicity != null) return multiplicity;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				multiplicity = eaLink.GetMultiplicity();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return multiplicity;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(String newMultiplicity) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newMultiplicity != null && newMultiplicity.equals(multiplicity)) return;
				// update EA link
				try {
					eaLink.SetMultiplicity(newMultiplicity);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase() {
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
	public void setPhase(String newPhase) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
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
	public void setPriority(String newPriority) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPropertyType() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && propertyType != null) return propertyType;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				propertyType = eaLink.GetPropertyType();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return propertyType;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyType(Integer newPropertyType) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newPropertyType != null && newPropertyType.equals(propertyType)) return;
				// update EA link
				try {
					eaLink.SetPropertyType(newPropertyType);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldPropertyType = propertyType;
		propertyType = newPropertyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__PROPERTY_TYPE, oldPropertyType, propertyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
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
	public void setStatus(String newStatus) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotypeEx() {
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
	public void setStereotypeEx(String newStereotypeEx) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSubtype() {
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
	public void setSubtype(Integer newSubtype) {
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
		Integer oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTablespace() {
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
	public void setTablespace(String newTablespace) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && tag != null) return tag;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				tag = eaLink.GetTag();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return tag;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newTag != null && newTag.equals(tag)) return;
				// update EA link
				try {
					eaLink.SetTag(newTag);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement getElement() {
		if (eContainerFeatureID != EamodelPackage.EA_ELEMENT__ELEMENT) return null;
		return (EAElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(EAElement newElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElement, EamodelPackage.EA_ELEMENT__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EAElement newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID != EamodelPackage.EA_ELEMENT__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EamodelPackage.EA_ELEMENT__ELEMENTS, EAElement.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAPackage getPackage() {
		if (eContainerFeatureID != EamodelPackage.EA_ELEMENT__PACKAGE) return null;
		return (EAPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(EAPackage newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, EamodelPackage.EA_ELEMENT__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(EAPackage newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID != EamodelPackage.EA_ELEMENT__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, EamodelPackage.EA_PACKAGE__ELEMENTS, EAPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAAttribute> getAttributes() {
		if (attributes == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					attributes = new EAObjectContainmentWithInverseEList<EAAttribute>(EAAttribute.class, this, EamodelPackage.EA_ELEMENT__ATTRIBUTES, EamodelPackage.EA_ATTRIBUTE__ELEMENT, eaLink.GetAttributes());
					// fill list with ea objects
					ArrayList<EAAttribute> coll = new ArrayList<EAAttribute>();
					collection: for (Attribute eaCollElement : eaLink.GetAttributes()) {
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
								case STEREOTYPE:
									if (filter.getFilterType().equals(FilterType.EQUALS_STRING_LITERAL))
										if (filter.getFilterExpression().equals(eaCollElement.GetStereotype()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.CONTAINS_STRING_LITERAL))
										if (eaCollElement.GetStereotype().contains(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.REGEX_LITERAL))
										if (eaCollElement.GetStereotype() == null)
											if (filter.getNegate())
												break;
											else continue collection;
										else if (eaCollElement.GetStereotype().matches(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else EAUtil.getLogger(getClass()).warn("Warning! Unknown filter type detected: " + filter.getFilterType() + " If this filter type is well-known, add it to the template 'filterContainments.javajetinc' and regenerate the model code.");
								case TYPE:
									if (filter.getFilterType().equals(FilterType.EQUALS_STRING_LITERAL))
										if (filter.getFilterExpression().equals(eaCollElement.GetType()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.CONTAINS_STRING_LITERAL))
										if (eaCollElement.GetType().contains(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.REGEX_LITERAL))
										if (eaCollElement.GetType() == null)
											if (filter.getNegate())
												break;
											else continue collection;
										else if (eaCollElement.GetType().matches(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else EAUtil.getLogger(getClass()).warn("Warning! Unknown filter type detected: " + filter.getFilterType() + " If this filter type is well-known, add it to the template 'filterContainments.javajetinc' and regenerate the model code.");
								}
							}
						}

						// create emf wrapper object
						EAAttribute collElement = EamodelFactory.eINSTANCE.createEAAttribute();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						attributes.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//attributes = new EAObjectContainmentWithInverseEList<EAAttribute>(EAAttribute.class, this, EamodelPackage.EA_ELEMENT__ATTRIBUTES, EamodelPackage.EA_ATTRIBUTE__ELEMENT, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					attributes = new BasicEList<EAAttribute>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (attributes == null)
					attributes = new BasicEList<EAAttribute>();
			}
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAConnector> getConnectors() {
		if (connectors == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					connectors = new EAObjectContainmentEList<EAConnector>(EAConnector.class, this, EamodelPackage.EA_ELEMENT__CONNECTORS, eaLink.GetConnectors());
					// fill list with ea objects
					ArrayList<EAConnector> coll = new ArrayList<EAConnector>();
					collection: for (Connector eaCollElement : eaLink.GetConnectors()) {
						// the emf adapter only consideres the supplier as container for connectors
						if (eaCollElement.GetClientID() == getId()) continue;
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
								case STEREOTYPE:
									if (filter.getFilterType().equals(FilterType.EQUALS_STRING_LITERAL))
										if (filter.getFilterExpression().equals(eaCollElement.GetStereotype()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.CONTAINS_STRING_LITERAL))
										if (eaCollElement.GetStereotype().contains(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.REGEX_LITERAL))
										if (eaCollElement.GetStereotype() == null)
											if (filter.getNegate())
												break;
											else continue collection;
										else if (eaCollElement.GetStereotype().matches(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else EAUtil.getLogger(getClass()).warn("Warning! Unknown filter type detected: " + filter.getFilterType() + " If this filter type is well-known, add it to the template 'filterContainments.javajetinc' and regenerate the model code.");
								case TYPE:
									if (filter.getFilterType().equals(FilterType.EQUALS_STRING_LITERAL))
										if (filter.getFilterExpression().equals(eaCollElement.GetType()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.CONTAINS_STRING_LITERAL))
										if (eaCollElement.GetType().contains(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.REGEX_LITERAL))
										if (eaCollElement.GetType() == null)
											if (filter.getNegate())
												break;
											else continue collection;
										else if (eaCollElement.GetType().matches(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else EAUtil.getLogger(getClass()).warn("Warning! Unknown filter type detected: " + filter.getFilterType() + " If this filter type is well-known, add it to the template 'filterContainments.javajetinc' and regenerate the model code.");
								}
							}
						}

						// create emf wrapper object
						EAConnector collElement = EamodelFactory.eINSTANCE.createEAConnector();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						connectors.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//connectors = new EAObjectContainmentEList<EAConnector>(EAConnector.class, this, EamodelPackage.EA_ELEMENT__CONNECTORS, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					connectors = new BasicEList<EAConnector>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (connectors == null)
					connectors = new BasicEList<EAConnector>();
			}
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAElement> getElements() {
		if (elements == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					elements = new EAObjectContainmentWithInverseEList<EAElement>(EAElement.class, this, EamodelPackage.EA_ELEMENT__ELEMENTS, EamodelPackage.EA_ELEMENT__ELEMENT, eaLink.GetElements());
					// fill list with ea objects
					ArrayList<EAElement> coll = new ArrayList<EAElement>();
					collection: for (Element eaCollElement : eaLink.GetElements()) {
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
								case STEREOTYPE:
									if (filter.getFilterType().equals(FilterType.EQUALS_STRING_LITERAL))
										if (filter.getFilterExpression().equals(eaCollElement.GetStereotype()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.CONTAINS_STRING_LITERAL))
										if (eaCollElement.GetStereotype().contains(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.REGEX_LITERAL))
										if (eaCollElement.GetStereotype() == null)
											if (filter.getNegate())
												break;
											else continue collection;
										else if (eaCollElement.GetStereotype().matches(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else EAUtil.getLogger(getClass()).warn("Warning! Unknown filter type detected: " + filter.getFilterType() + " If this filter type is well-known, add it to the template 'filterContainments.javajetinc' and regenerate the model code.");
								case TYPE:
									if (filter.getFilterType().equals(FilterType.EQUALS_STRING_LITERAL))
										if (filter.getFilterExpression().equals(eaCollElement.GetType()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.CONTAINS_STRING_LITERAL))
										if (eaCollElement.GetType().contains(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.REGEX_LITERAL))
										if (eaCollElement.GetType() == null)
											if (filter.getNegate())
												break;
											else continue collection;
										else if (eaCollElement.GetType().matches(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else EAUtil.getLogger(getClass()).warn("Warning! Unknown filter type detected: " + filter.getFilterType() + " If this filter type is well-known, add it to the template 'filterContainments.javajetinc' and regenerate the model code.");
								}
							}
						}

						// create emf wrapper object
						EAElement collElement = EamodelFactory.eINSTANCE.createEAElement();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						elements.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//elements = new EAObjectContainmentWithInverseEList<EAElement>(EAElement.class, this, EamodelPackage.EA_ELEMENT__ELEMENTS, EamodelPackage.EA_ELEMENT__ELEMENT, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					elements = new BasicEList<EAElement>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (elements == null)
					elements = new BasicEList<EAElement>();
			}
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAMethod> getMethods() {
		if (methods == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					methods = new EAObjectContainmentWithInverseEList<EAMethod>(EAMethod.class, this, EamodelPackage.EA_ELEMENT__METHODS, EamodelPackage.EA_METHOD__ELEMENT, eaLink.GetMethods());
					// fill list with ea objects
					ArrayList<EAMethod> coll = new ArrayList<EAMethod>();
					collection: for (Method eaCollElement : eaLink.GetMethods()) {
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
								case STEREOTYPE:
									if (filter.getFilterType().equals(FilterType.EQUALS_STRING_LITERAL))
										if (filter.getFilterExpression().equals(eaCollElement.GetStereotype()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.CONTAINS_STRING_LITERAL))
										if (eaCollElement.GetStereotype().contains(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.REGEX_LITERAL))
										if (eaCollElement.GetStereotype() == null)
											if (filter.getNegate())
												break;
											else continue collection;
										else if (eaCollElement.GetStereotype().matches(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else EAUtil.getLogger(getClass()).warn("Warning! Unknown filter type detected: " + filter.getFilterType() + " If this filter type is well-known, add it to the template 'filterContainments.javajetinc' and regenerate the model code.");
								case TYPE:
									if (filter.getFilterType().equals(FilterType.EQUALS_STRING_LITERAL))
										if (filter.getFilterExpression().equals(eaCollElement.GetReturnType()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.CONTAINS_STRING_LITERAL))
										if (eaCollElement.GetReturnType().contains(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.REGEX_LITERAL))
										if (eaCollElement.GetReturnType() == null)
											if (filter.getNegate())
												break;
											else continue collection;
										else if (eaCollElement.GetReturnType().matches(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else EAUtil.getLogger(getClass()).warn("Warning! Unknown filter type detected: " + filter.getFilterType() + " If this filter type is well-known, add it to the template 'filterContainments.javajetinc' and regenerate the model code.");
								}
							}
						}

						// create emf wrapper object
						EAMethod collElement = EamodelFactory.eINSTANCE.createEAMethod();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						methods.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//methods = new EAObjectContainmentWithInverseEList<EAMethod>(EAMethod.class, this, EamodelPackage.EA_ELEMENT__METHODS, EamodelPackage.EA_METHOD__ELEMENT, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					methods = new BasicEList<EAMethod>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (methods == null)
					methods = new BasicEList<EAMethod>();
			}
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EATaggedValue> getTaggedValues() {
		if (taggedValues == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					taggedValues = new EAObjectContainmentEList<EATaggedValue>(EATaggedValue.class, this, EamodelPackage.EA_ELEMENT__TAGGED_VALUES, eaLink.GetTaggedValues());
					// fill list with ea objects
					ArrayList<EATaggedValue> coll = new ArrayList<EATaggedValue>();
					collection: for (TaggedValue eaCollElement : eaLink.GetTaggedValues()) {
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
						EATaggedValue collElement = EamodelFactory.eINSTANCE.createEATaggedValue();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						taggedValues.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//taggedValues = new EAObjectContainmentEList<EATaggedValue>(EATaggedValue.class, this, EamodelPackage.EA_ELEMENT__TAGGED_VALUES, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					taggedValues = new BasicEList<EATaggedValue>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (taggedValues == null)
					taggedValues = new BasicEList<EATaggedValue>();
			}
		}
		return taggedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getEaLink() {
		// return value
		return eaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaLink(Element newEaLink) {
		// check if any setter was called previously to transfer values to the corresponding ea object...
		if (name != null) newEaLink.SetName(name);
		if (notes != null) newEaLink.SetNotes(notes);
		if (stereotype != null) newEaLink.SetStereotype(stereotype);
		if (type != null) newEaLink.SetType(type);
		if (visibility != null) newEaLink.SetVisibility(visibility);
		if (version != null) newEaLink.SetVersion(version);
		if (author != null) newEaLink.SetAuthor(author);
		if (isLocked != null) newEaLink.SetLocked(isLocked);
		if (abstract_ != null) newEaLink.SetAbstract(abstract_.equals("1") || abstract_.equalsIgnoreCase("true") ? "1" : "0");
		if (classifierName != null) newEaLink.SetClassifierName(classifierName);
		if (multiplicity != null) newEaLink.SetMultiplicity(multiplicity);
		if (propertyType != null) newEaLink.SetPropertyType(propertyType);
		if (subtype != null) newEaLink.SetSubtype(subtype);
		if (tag != null) newEaLink.SetTag(tag); 
		updateEaLink(newEaLink);
		// update emf object
		Element oldEaLink = eaLink;
		eaLink = newEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ELEMENT__EA_LINK, oldEaLink, eaLink));
	}

	/**
	 * @generated
	 */
	private boolean updateEaLink(Element eaLink) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getParentID() {
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
	public void setParentID(Integer newParentID) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPackageID() {
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
	public void setPackageID(Integer newPackageID) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
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
			if (parent instanceof EAElement)
				eaLink.SetParentID(((EAElement)parent).getEaLink().GetElementID());
			else if (parent instanceof EAPackage)
				eaLink.SetPackageID(((EAPackage)parent).getEaLink().GetPackageID());
			else throw new UnsupportedOperationException("Unknown parent type (EAElement or EAPackage expected): " + parent);
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
			if (visibility == null) setVisibility("Public");
			if (abstract_ == null) setAbstract("0");
			setType("Class");
            
			// set ea link and transfer all values
			Element newEaLink = (Element)collection.AddNew("", "Class");
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
				Element collElement = (Element) collection.GetAt((short) i);
				if (collElement.GetElementGUID().equals(delId)) {
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
	@SuppressWarnings("unchecked")
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EamodelPackage.EA_ELEMENT__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((EAElement)otherEnd, msgs);
			case EamodelPackage.EA_ELEMENT__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((EAPackage)otherEnd, msgs);
			case EamodelPackage.EA_ELEMENT__ATTRIBUTES:
				return ((InternalEList)getAttributes()).basicAdd(otherEnd, msgs);
			case EamodelPackage.EA_ELEMENT__ELEMENTS:
				return ((InternalEList)getElements()).basicAdd(otherEnd, msgs);
			case EamodelPackage.EA_ELEMENT__METHODS:
				return ((InternalEList)getMethods()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EamodelPackage.EA_ELEMENT__ELEMENT:
				return basicSetElement(null, msgs);
			case EamodelPackage.EA_ELEMENT__PACKAGE:
				return basicSetPackage(null, msgs);
			case EamodelPackage.EA_ELEMENT__ATTRIBUTES:
				return ((InternalEList)getAttributes()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_ELEMENT__CONNECTORS:
				return ((InternalEList)getConnectors()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_ELEMENT__ELEMENTS:
				return ((InternalEList)getElements()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_ELEMENT__METHODS:
				return ((InternalEList)getMethods()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_ELEMENT__TAGGED_VALUES:
				return ((InternalEList)getTaggedValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case EamodelPackage.EA_ELEMENT__ELEMENT:
				return eInternalContainer().eInverseRemove(this, EamodelPackage.EA_ELEMENT__ELEMENTS, EAElement.class, msgs);
			case EamodelPackage.EA_ELEMENT__PACKAGE:
				return eInternalContainer().eInverseRemove(this, EamodelPackage.EA_PACKAGE__ELEMENTS, EAPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EamodelPackage.EA_ELEMENT__OBJECT_TYPE:
				return getObjectType();
			case EamodelPackage.EA_ELEMENT__ID:
				return getId();
			case EamodelPackage.EA_ELEMENT__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case EamodelPackage.EA_ELEMENT__NAME:
				return getName();
			case EamodelPackage.EA_ELEMENT__NOTES:
				return getNotes();
			case EamodelPackage.EA_ELEMENT__GUID:
				return getGuid();
			case EamodelPackage.EA_ELEMENT__STEREOTYPE:
				return getStereotype();
			case EamodelPackage.EA_ELEMENT__TYPE:
				return getType();
			case EamodelPackage.EA_ELEMENT__VISIBILITY:
				return getVisibility();
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_ID:
				return getClassifierID();
			case EamodelPackage.EA_ELEMENT__VERSION:
				return getVersion();
			case EamodelPackage.EA_ELEMENT__AUTHOR:
				return getAuthor();
			case EamodelPackage.EA_ELEMENT__IS_LOCKED:
				return getIsLocked();
			case EamodelPackage.EA_ELEMENT__ABSTRACT:
				return getAbstract();
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_NAME:
				return getClassifierName();
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_TYPE:
				return getClassifierType();
			case EamodelPackage.EA_ELEMENT__COMPLEXITY:
				return getComplexity();
			case EamodelPackage.EA_ELEMENT__DIFFICULTY:
				return getDifficulty();
			case EamodelPackage.EA_ELEMENT__EXTENSION_POINTS:
				return getExtensionPoints();
			case EamodelPackage.EA_ELEMENT__GENLINKS:
				return getGenlinks();
			case EamodelPackage.EA_ELEMENT__GENFILE:
				return getGenfile();
			case EamodelPackage.EA_ELEMENT__GENTYPE:
				return getGentype();
			case EamodelPackage.EA_ELEMENT__MULTIPLICITY:
				return getMultiplicity();
			case EamodelPackage.EA_ELEMENT__PHASE:
				return getPhase();
			case EamodelPackage.EA_ELEMENT__PRIORITY:
				return getPriority();
			case EamodelPackage.EA_ELEMENT__PROPERTY_TYPE:
				return getPropertyType();
			case EamodelPackage.EA_ELEMENT__STATUS:
				return getStatus();
			case EamodelPackage.EA_ELEMENT__STEREOTYPE_EX:
				return getStereotypeEx();
			case EamodelPackage.EA_ELEMENT__SUBTYPE:
				return getSubtype();
			case EamodelPackage.EA_ELEMENT__TABLESPACE:
				return getTablespace();
			case EamodelPackage.EA_ELEMENT__TAG:
				return getTag();
			case EamodelPackage.EA_ELEMENT__ELEMENT:
				return getElement();
			case EamodelPackage.EA_ELEMENT__PACKAGE:
				return getPackage();
			case EamodelPackage.EA_ELEMENT__ATTRIBUTES:
				return getAttributes();
			case EamodelPackage.EA_ELEMENT__CONNECTORS:
				return getConnectors();
			case EamodelPackage.EA_ELEMENT__ELEMENTS:
				return getElements();
			case EamodelPackage.EA_ELEMENT__METHODS:
				return getMethods();
			case EamodelPackage.EA_ELEMENT__TAGGED_VALUES:
				return getTaggedValues();
			case EamodelPackage.EA_ELEMENT__EA_LINK:
				return getEaLink();
			case EamodelPackage.EA_ELEMENT__PARENT_ID:
				return getParentID();
			case EamodelPackage.EA_ELEMENT__PACKAGE_ID:
				return getPackageID();
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
			case EamodelPackage.EA_ELEMENT__REPOSITORY:
				setRepository((EARepository)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__NOTES:
				setNotes((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__TYPE:
				setType((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__VERSION:
				setVersion((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__IS_LOCKED:
				setIsLocked((Boolean)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_NAME:
				setClassifierName((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__COMPLEXITY:
				setComplexity((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__DIFFICULTY:
				setDifficulty((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__EXTENSION_POINTS:
				setExtensionPoints((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__GENLINKS:
				setGenlinks((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__GENFILE:
				setGenfile((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__GENTYPE:
				setGentype((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__MULTIPLICITY:
				setMultiplicity((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__PHASE:
				setPhase((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__PRIORITY:
				setPriority((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__PROPERTY_TYPE:
				setPropertyType((Integer)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__STATUS:
				setStatus((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__STEREOTYPE_EX:
				setStereotypeEx((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__SUBTYPE:
				setSubtype((Integer)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__TABLESPACE:
				setTablespace((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__TAG:
				setTag((String)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__ELEMENT:
				setElement((EAElement)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__PACKAGE:
				setPackage((EAPackage)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__ELEMENTS:
				getElements().clear();
				getElements().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__METHODS:
				getMethods().clear();
				getMethods().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__TAGGED_VALUES:
				getTaggedValues().clear();
				getTaggedValues().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__EA_LINK:
				setEaLink((Element)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__PARENT_ID:
				setParentID((Integer)newValue);
				return;
			case EamodelPackage.EA_ELEMENT__PACKAGE_ID:
				setPackageID((Integer)newValue);
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
			case EamodelPackage.EA_ELEMENT__REPOSITORY:
				unsetRepository();
				return;
			case EamodelPackage.EA_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__IS_LOCKED:
				setIsLocked(IS_LOCKED_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_NAME:
				setClassifierName(CLASSIFIER_NAME_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__COMPLEXITY:
				setComplexity(COMPLEXITY_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__DIFFICULTY:
				setDifficulty(DIFFICULTY_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__EXTENSION_POINTS:
				setExtensionPoints(EXTENSION_POINTS_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__GENLINKS:
				setGenlinks(GENLINKS_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__GENFILE:
				setGenfile(GENFILE_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__GENTYPE:
				setGentype(GENTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__PHASE:
				setPhase(PHASE_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__PROPERTY_TYPE:
				setPropertyType(PROPERTY_TYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__STEREOTYPE_EX:
				setStereotypeEx(STEREOTYPE_EX_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__TABLESPACE:
				setTablespace(TABLESPACE_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__ELEMENT:
				setElement((EAElement)null);
				return;
			case EamodelPackage.EA_ELEMENT__PACKAGE:
				setPackage((EAPackage)null);
				return;
			case EamodelPackage.EA_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case EamodelPackage.EA_ELEMENT__CONNECTORS:
				getConnectors().clear();
				return;
			case EamodelPackage.EA_ELEMENT__ELEMENTS:
				getElements().clear();
				return;
			case EamodelPackage.EA_ELEMENT__METHODS:
				getMethods().clear();
				return;
			case EamodelPackage.EA_ELEMENT__TAGGED_VALUES:
				getTaggedValues().clear();
				return;
			case EamodelPackage.EA_ELEMENT__EA_LINK:
				setEaLink(EA_LINK_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__PARENT_ID:
				setParentID(PARENT_ID_EDEFAULT);
				return;
			case EamodelPackage.EA_ELEMENT__PACKAGE_ID:
				setPackageID(PACKAGE_ID_EDEFAULT);
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
			case EamodelPackage.EA_ELEMENT__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case EamodelPackage.EA_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EamodelPackage.EA_ELEMENT__REPOSITORY:
				return isSetRepository();
			case EamodelPackage.EA_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EamodelPackage.EA_ELEMENT__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EamodelPackage.EA_ELEMENT__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case EamodelPackage.EA_ELEMENT__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case EamodelPackage.EA_ELEMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EamodelPackage.EA_ELEMENT__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_ID:
				return CLASSIFIER_ID_EDEFAULT == null ? classifierID != null : !CLASSIFIER_ID_EDEFAULT.equals(classifierID);
			case EamodelPackage.EA_ELEMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EamodelPackage.EA_ELEMENT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case EamodelPackage.EA_ELEMENT__IS_LOCKED:
				return IS_LOCKED_EDEFAULT == null ? isLocked != null : !IS_LOCKED_EDEFAULT.equals(isLocked);
			case EamodelPackage.EA_ELEMENT__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_NAME:
				return CLASSIFIER_NAME_EDEFAULT == null ? classifierName != null : !CLASSIFIER_NAME_EDEFAULT.equals(classifierName);
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_TYPE:
				return CLASSIFIER_TYPE_EDEFAULT == null ? classifierType != null : !CLASSIFIER_TYPE_EDEFAULT.equals(classifierType);
			case EamodelPackage.EA_ELEMENT__COMPLEXITY:
				return COMPLEXITY_EDEFAULT == null ? getComplexity() != null : !COMPLEXITY_EDEFAULT.equals(getComplexity());
			case EamodelPackage.EA_ELEMENT__DIFFICULTY:
				return DIFFICULTY_EDEFAULT == null ? getDifficulty() != null : !DIFFICULTY_EDEFAULT.equals(getDifficulty());
			case EamodelPackage.EA_ELEMENT__EXTENSION_POINTS:
				return EXTENSION_POINTS_EDEFAULT == null ? getExtensionPoints() != null : !EXTENSION_POINTS_EDEFAULT.equals(getExtensionPoints());
			case EamodelPackage.EA_ELEMENT__GENLINKS:
				return GENLINKS_EDEFAULT == null ? getGenlinks() != null : !GENLINKS_EDEFAULT.equals(getGenlinks());
			case EamodelPackage.EA_ELEMENT__GENFILE:
				return GENFILE_EDEFAULT == null ? getGenfile() != null : !GENFILE_EDEFAULT.equals(getGenfile());
			case EamodelPackage.EA_ELEMENT__GENTYPE:
				return GENTYPE_EDEFAULT == null ? getGentype() != null : !GENTYPE_EDEFAULT.equals(getGentype());
			case EamodelPackage.EA_ELEMENT__MULTIPLICITY:
				return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
			case EamodelPackage.EA_ELEMENT__PHASE:
				return PHASE_EDEFAULT == null ? getPhase() != null : !PHASE_EDEFAULT.equals(getPhase());
			case EamodelPackage.EA_ELEMENT__PRIORITY:
				return PRIORITY_EDEFAULT == null ? getPriority() != null : !PRIORITY_EDEFAULT.equals(getPriority());
			case EamodelPackage.EA_ELEMENT__PROPERTY_TYPE:
				return PROPERTY_TYPE_EDEFAULT == null ? propertyType != null : !PROPERTY_TYPE_EDEFAULT.equals(propertyType);
			case EamodelPackage.EA_ELEMENT__STATUS:
				return STATUS_EDEFAULT == null ? getStatus() != null : !STATUS_EDEFAULT.equals(getStatus());
			case EamodelPackage.EA_ELEMENT__STEREOTYPE_EX:
				return STEREOTYPE_EX_EDEFAULT == null ? getStereotypeEx() != null : !STEREOTYPE_EX_EDEFAULT.equals(getStereotypeEx());
			case EamodelPackage.EA_ELEMENT__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case EamodelPackage.EA_ELEMENT__TABLESPACE:
				return TABLESPACE_EDEFAULT == null ? getTablespace() != null : !TABLESPACE_EDEFAULT.equals(getTablespace());
			case EamodelPackage.EA_ELEMENT__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case EamodelPackage.EA_ELEMENT__ELEMENT:
				return getElement() != null;
			case EamodelPackage.EA_ELEMENT__PACKAGE:
				return getPackage() != null;
			case EamodelPackage.EA_ELEMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case EamodelPackage.EA_ELEMENT__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case EamodelPackage.EA_ELEMENT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case EamodelPackage.EA_ELEMENT__METHODS:
				return methods != null && !methods.isEmpty();
			case EamodelPackage.EA_ELEMENT__TAGGED_VALUES:
				return taggedValues != null && !taggedValues.isEmpty();
			case EamodelPackage.EA_ELEMENT__EA_LINK:
				return EA_LINK_EDEFAULT == null ? eaLink != null : !EA_LINK_EDEFAULT.equals(eaLink);
			case EamodelPackage.EA_ELEMENT__PARENT_ID:
				return PARENT_ID_EDEFAULT == null ? getParentID() != null : !PARENT_ID_EDEFAULT.equals(getParentID());
			case EamodelPackage.EA_ELEMENT__PACKAGE_ID:
				return PACKAGE_ID_EDEFAULT == null ? getPackageID() != null : !PACKAGE_ID_EDEFAULT.equals(getPackageID());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == EAMovableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EAVersiondElement.class) {
			switch (derivedFeatureID) {
				case EamodelPackage.EA_ELEMENT__VERSION: return AbstracthierachyPackage.EA_VERSIOND_ELEMENT__VERSION;
				default: return -1;
			}
		}
		if (baseClass == EAOwnedElement.class) {
			switch (derivedFeatureID) {
				case EamodelPackage.EA_ELEMENT__AUTHOR: return AbstracthierachyPackage.EA_OWNED_ELEMENT__AUTHOR;
				case EamodelPackage.EA_ELEMENT__IS_LOCKED: return AbstracthierachyPackage.EA_OWNED_ELEMENT__IS_LOCKED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == EAMovableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EAVersiondElement.class) {
			switch (baseFeatureID) {
				case AbstracthierachyPackage.EA_VERSIOND_ELEMENT__VERSION: return EamodelPackage.EA_ELEMENT__VERSION;
				default: return -1;
			}
		}
		if (baseClass == EAOwnedElement.class) {
			switch (baseFeatureID) {
				case AbstracthierachyPackage.EA_OWNED_ELEMENT__AUTHOR: return EamodelPackage.EA_ELEMENT__AUTHOR;
				case AbstracthierachyPackage.EA_OWNED_ELEMENT__IS_LOCKED: return EamodelPackage.EA_ELEMENT__IS_LOCKED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", visibility: ");
		result.append(getVisibility());
		result.append(", classifierID: ");
		result.append(getClassifierID());
		result.append(", version: ");
		result.append(getVersion());
		result.append(", author: ");
		result.append(getAuthor());
		result.append(", isLocked: ");
		result.append(getIsLocked());
		result.append(", abstract: ");
		result.append(getAbstract());
		result.append(", classifierName: ");
		result.append(getClassifierName());
		result.append(", classifierType: ");
		result.append(getClassifierType());
		result.append(", multiplicity: ");
		result.append(getMultiplicity());
		result.append(", propertyType: ");
		result.append(getPropertyType());
		result.append(", subtype: ");
		result.append(getSubtype());
		result.append(", tag: ");
		result.append(getTag());
		result.append(", eaLink: ");
		result.append(getEaLink());
		result.append(')');
		return result.toString();
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

	public String getProperties() {
		final String s = 
				"1: " + eaLink.GetAbstract() + "\n" +
				"2: " + eaLink.GetActionFlags() + "\n" +
				"3: " + eaLink.GetAlias() + "\n" +
				"4: " + eaLink.GetClassfierID() + "\n" +
				"5: " + eaLink.GetClassifierID() + "\n" +
				"6: " + eaLink.GetClassifierName() + "\n" +
				"7: " + eaLink.GetClassifierType() + "\n" +
				"8: " + eaLink.GetComplexity() + "\n" +
				"8: " + eaLink.GetDifficulty() + "\n" +
				"9: " + eaLink.GetElementGUID() + "\n" +
				"10: " + eaLink.GetElementID() + "\n" +
				"11: " + eaLink.GetEventFlags() + "\n" +
				"12: " + eaLink.GetExtensionPoints() + "\n" +
				"13: " + eaLink.GetGenfile() + "\n" +
				"14: " + eaLink.GetGenlinks() + "\n" +
				"15: " + eaLink.GetGentype() + "\n" +
				"16: " + eaLink.GetHeader1() + "\n" +
				"17: " + eaLink.GetLinkedDocument() + "\n" +
				"18: " + eaLink.GetMetaType() + "\n" +
				"19: " + eaLink.GetMultiplicity() + "\n" +
				"20: " + eaLink.GetName() + "\n" +
				"21: " + eaLink.GetPackageID() + "\n" +
				"22: " + eaLink.GetParentID() + "\n" +
				"23: " + eaLink.GetPersistence() + "\n" +
				"24: " + eaLink.GetPropertyType() + "\n" +
				"25: " + eaLink.GetRunState() + "\n" +
				"26: " + eaLink.GetStatus() + "\n" +
				"27: " + eaLink.GetSubtype() + "\n" +
				"28: " + eaLink.GetTag() + "\n" +
				"29: " + eaLink.GetType() + "\n" +
				"30: " + eaLink.GetVersion();
		for (CustomProperty p : eaLink.GetCustomProperties()) {
			System.out.println("CustomProp: " + p.GetName() + " - " + p.GetValue());
		}
		for (Iterator<Property> i = eaLink.GetProperties().iterator(); i.hasNext();) {
			final Property p = i.next();
			System.out.println("Prop: " + p.GetName() + " - " + p.GetValue() + " : " + p.GetType());
		}
		for (Transition t : eaLink.GetStateTransitions()) {
			System.out.println("StateTransition: " + t.GetEvent() + " - " + t.GetTxState());
		}
		return s;
	}
	
} //EAElementImpl