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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.eaadapter.model.EAAttribute;
import org.eclipselabs.eaadapter.model.EAAttributeTag;
import org.eclipselabs.eaadapter.model.EAElement;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.Filter;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong;
import org.eclipselabs.eaadapter.model.datatypes.FilterClass;
import org.eclipselabs.eaadapter.model.datatypes.FilterType;
import org.eclipselabs.eaadapter.model.util.EAObjectContainmentEList;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.sparx.Attribute;
import org.sparx.AttributeTag;
import org.sparx.Collection;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getHasDStereotype <em>Has DStereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getClassifierID <em>Classifier ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl#getTaggedValues <em>Tagged Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("rawtypes")
public class EAAttributeImpl extends EObjectImpl implements EAAttribute {
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
	 * The default value of the '{@link #getHasDStereotype() <em>Has DStereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_DSTEREOTYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #getIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConst()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConst()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConst = null;

	/**
	 * The default value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STATIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStatic = null;

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
	 * The default value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected String containment = null;

	/**
	 * The default value of the '{@link #getIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCollection()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_COLLECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCollection()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCollection = null;

	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOrdered = null;

	/**
	 * The default value of the '{@link #getAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_DUPLICATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowDuplicates() <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDuplicates()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowDuplicates = null;

	/**
	 * The default value of the '{@link #getIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DERIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDerived = null;

	/**
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected String container = null;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECISION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = null;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected String lowerBound = null;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected String upperBound = null;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = null;

	/**
	 * The default value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final Attribute EA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected Attribute eaLink = null;

	/**
	 * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EAAttributeTag> taggedValues = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.EA_ATTRIBUTE;
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
				id = eaLink.GetAttributeID();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_ATTRIBUTE__REPOSITORY, oldRepository, repository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__REPOSITORY, oldRepository, repository, !oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_ATTRIBUTE__REPOSITORY, oldRepository, null, oldRepositoryESet));
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
					if (!eaLink.Update()) return;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__NAME, oldName, name));
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
					if (!eaLink.Update()) return;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__NOTES, oldNotes, notes));
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
				guid = eaLink.GetAttributeGUID();
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
					if (!eaLink.Update()) return;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasDStereotype() {
		return getStereotype().contains("-D");
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
					if (!eaLink.Update()) return;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__TYPE, oldType, type));
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
					if (!eaLink.Update()) return;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConst() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isConst != null) return isConst;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isConst = eaLink.GetIsConst();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isConst;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConst(Boolean newIsConst) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsConst != null && newIsConst.equals(isConst)) return;
				// update EA link
				try {
					eaLink.SetIsConst(newIsConst);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsConst = isConst;
		isConst = newIsConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__IS_CONST, oldIsConst, isConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStatic() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isStatic != null) return isStatic;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isStatic = eaLink.GetIsStatic();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isStatic;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(Boolean newIsStatic) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsStatic != null && newIsStatic.equals(isStatic)) return;
				// update EA link
				try {
					eaLink.SetIsStatic(newIsStatic);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__IS_STATIC, oldIsStatic, isStatic));
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
	public String getContainment() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && containment != null) return containment;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				containment = eaLink.GetContainment();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return containment;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(String newContainment) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newContainment != null && newContainment.equals(containment)) return;
				// update EA link
				try {
					eaLink.SetContainment(newContainment);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCollection() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isCollection != null) return isCollection;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isCollection = eaLink.GetIsCollection();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isCollection;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(Boolean newIsCollection) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsCollection != null && newIsCollection.equals(isCollection)) return;
				// update EA link
				try {
					eaLink.SetIsCollection(newIsCollection);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsCollection = isCollection;
		isCollection = newIsCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__IS_COLLECTION, oldIsCollection, isCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOrdered() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isOrdered != null) return isOrdered;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isOrdered = eaLink.GetIsOrdered();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isOrdered;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(Boolean newIsOrdered) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsOrdered != null && newIsOrdered.equals(isOrdered)) return;
				// update EA link
				try {
					eaLink.SetIsOrdered(newIsOrdered);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowDuplicates() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && allowDuplicates != null) return allowDuplicates;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				allowDuplicates = eaLink.GetAllowDuplicates();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return allowDuplicates;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDuplicates(Boolean newAllowDuplicates) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newAllowDuplicates != null && newAllowDuplicates.equals(allowDuplicates)) return;
				// update EA link
				try {
					eaLink.SetAllowDuplicates(newAllowDuplicates);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldAllowDuplicates = allowDuplicates;
		allowDuplicates = newAllowDuplicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__ALLOW_DUPLICATES, oldAllowDuplicates, allowDuplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDerived() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isDerived != null) return isDerived;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isDerived = eaLink.GetIsDerived();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isDerived;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(Boolean newIsDerived) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsDerived != null && newIsDerived.equals(isDerived)) return;
				// update EA link
				try {
					eaLink.SetIsDerived(newIsDerived);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainer() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && container != null) return container;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				container = eaLink.GetContainer();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return container;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(String newContainer) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newContainer != null && newContainer.equals(container)) return;
				// update EA link
				try {
					eaLink.SetContainer(newContainer);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale() {
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
	public void setScale(String newScale) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecision() {
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
	public void setPrecision(String newPrecision) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLength() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && length != null) return length;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				length = eaLink.GetLength();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return length;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newLength != null && newLength.equals(length)) return;
				// update EA link
				try {
					eaLink.SetLength(newLength);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerBound() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && lowerBound != null) return lowerBound;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				lowerBound = eaLink.GetLowerBound();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return lowerBound;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(String newLowerBound) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newLowerBound != null && newLowerBound.equals(lowerBound)) return;
				// update EA link
				try {
					eaLink.SetLowerBound(newLowerBound);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBound() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && upperBound != null) return upperBound;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				upperBound = eaLink.GetUpperBound();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return upperBound;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(String newUpperBound) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newUpperBound != null && newUpperBound.equals(upperBound)) return;
				// update EA link
				try {
					eaLink.SetUpperBound(newUpperBound);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && default_ != null) return default_;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				default_ = eaLink.GetDefault();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return default_;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newDefault != null && newDefault.equals(default_)) return;
				// update EA link
				try {
					eaLink.SetDefault(newDefault);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement getElement() {
		if (eContainerFeatureID != EamodelPackage.EA_ATTRIBUTE__ELEMENT) return null;
		return (EAElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(EAElement newElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElement, EamodelPackage.EA_ATTRIBUTE__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EAElement newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID != EamodelPackage.EA_ATTRIBUTE__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EamodelPackage.EA_ELEMENT__ATTRIBUTES, EAElement.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getEaLink() {
		// return value
		return eaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaLink(Attribute newEaLink) {
		// check if any setter was called previously to transfer values to the corresponding ea object...
		if (name != null) newEaLink.SetName(name);
		if (notes != null) newEaLink.SetNotes(notes);
		if (stereotype != null) newEaLink.SetStereotype(stereotype);
		if (type != null) newEaLink.SetType(type);
		if (visibility != null) newEaLink.SetVisibility(visibility);
		if (isConst != null) newEaLink.SetIsConst(isConst);
		if (isStatic != null) newEaLink.SetIsStatic(isStatic);
		if (containment != null) newEaLink.SetContainment(containment);
		if (isCollection != null) newEaLink.SetIsCollection(isCollection);
		if (isOrdered != null) newEaLink.SetIsOrdered(isOrdered);
		if (allowDuplicates != null) newEaLink.SetAllowDuplicates(allowDuplicates);
		if (isDerived != null) newEaLink.SetIsDerived(isDerived);
		if (container != null) newEaLink.SetContainer(container);
		if (length != null) newEaLink.SetLength(length);
		if (lowerBound != null) newEaLink.SetLowerBound(lowerBound);
		if (upperBound != null) newEaLink.SetUpperBound(upperBound);
		if (default_ != null) newEaLink.SetDefault(default_); 
		newEaLink.Update();
		// update emf object
		Attribute oldEaLink = eaLink;
		eaLink = newEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_ATTRIBUTE__EA_LINK, oldEaLink, eaLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAAttributeTag> getTaggedValues() {
		if (taggedValues == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					taggedValues = new EAObjectContainmentEList<EAAttributeTag>(EAAttributeTag.class, this, EamodelPackage.EA_ATTRIBUTE__TAGGED_VALUES, eaLink.GetTaggedValues());
					// fill list with ea objects
					ArrayList<EAAttributeTag> coll = new ArrayList<EAAttributeTag>();
					collection: for (AttributeTag eaCollElement : eaLink.GetTaggedValues()) {
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
						EAAttributeTag collElement = EamodelFactory.eINSTANCE.createEAAttributeTag();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						taggedValues.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//taggedValues = new EAObjectContainmentEList<EAAttributeTag>(EAAttributeTag.class, this, EamodelPackage.EA_ATTRIBUTE__TAGGED_VALUES, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					taggedValues = new BasicEList<EAAttributeTag>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (taggedValues == null)
					taggedValues = new BasicEList<EAAttributeTag>();
			}
		}
		return taggedValues;
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
            
			// set ea link and transfer all values
			Attribute newEaLink = (Attribute)collection.AddNew("", "");
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
				Attribute collElement = (Attribute) collection.GetAt((short) i);
				if (collElement.GetAttributeGUID().equals(delId)) {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EamodelPackage.EA_ATTRIBUTE__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((EAElement)otherEnd, msgs);
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
			case EamodelPackage.EA_ATTRIBUTE__ELEMENT:
				return basicSetElement(null, msgs);
			case EamodelPackage.EA_ATTRIBUTE__TAGGED_VALUES:
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
			case EamodelPackage.EA_ATTRIBUTE__ELEMENT:
				return eInternalContainer().eInverseRemove(this, EamodelPackage.EA_ELEMENT__ATTRIBUTES, EAElement.class, msgs);
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
			case EamodelPackage.EA_ATTRIBUTE__OBJECT_TYPE:
				return getObjectType();
			case EamodelPackage.EA_ATTRIBUTE__ID:
				return getId();
			case EamodelPackage.EA_ATTRIBUTE__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case EamodelPackage.EA_ATTRIBUTE__NAME:
				return getName();
			case EamodelPackage.EA_ATTRIBUTE__NOTES:
				return getNotes();
			case EamodelPackage.EA_ATTRIBUTE__GUID:
				return getGuid();
			case EamodelPackage.EA_ATTRIBUTE__STEREOTYPE:
				return getStereotype();
			case EamodelPackage.EA_ATTRIBUTE__HAS_DSTEREOTYPE:
				return getHasDStereotype();
			case EamodelPackage.EA_ATTRIBUTE__TYPE:
				return getType();
			case EamodelPackage.EA_ATTRIBUTE__VISIBILITY:
				return getVisibility();
			case EamodelPackage.EA_ATTRIBUTE__IS_CONST:
				return getIsConst();
			case EamodelPackage.EA_ATTRIBUTE__IS_STATIC:
				return getIsStatic();
			case EamodelPackage.EA_ATTRIBUTE__CLASSIFIER_ID:
				return getClassifierID();
			case EamodelPackage.EA_ATTRIBUTE__CONTAINMENT:
				return getContainment();
			case EamodelPackage.EA_ATTRIBUTE__IS_COLLECTION:
				return getIsCollection();
			case EamodelPackage.EA_ATTRIBUTE__IS_ORDERED:
				return getIsOrdered();
			case EamodelPackage.EA_ATTRIBUTE__ALLOW_DUPLICATES:
				return getAllowDuplicates();
			case EamodelPackage.EA_ATTRIBUTE__IS_DERIVED:
				return getIsDerived();
			case EamodelPackage.EA_ATTRIBUTE__CONTAINER:
				return getContainer();
			case EamodelPackage.EA_ATTRIBUTE__SCALE:
				return getScale();
			case EamodelPackage.EA_ATTRIBUTE__PRECISION:
				return getPrecision();
			case EamodelPackage.EA_ATTRIBUTE__LENGTH:
				return getLength();
			case EamodelPackage.EA_ATTRIBUTE__LOWER_BOUND:
				return getLowerBound();
			case EamodelPackage.EA_ATTRIBUTE__UPPER_BOUND:
				return getUpperBound();
			case EamodelPackage.EA_ATTRIBUTE__DEFAULT:
				return getDefault();
			case EamodelPackage.EA_ATTRIBUTE__ELEMENT:
				return getElement();
			case EamodelPackage.EA_ATTRIBUTE__EA_LINK:
				return getEaLink();
			case EamodelPackage.EA_ATTRIBUTE__TAGGED_VALUES:
				return getTaggedValues();
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
			case EamodelPackage.EA_ATTRIBUTE__REPOSITORY:
				setRepository((EARepository)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__NOTES:
				setNotes((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__IS_CONST:
				setIsConst((Boolean)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__CONTAINMENT:
				setContainment((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__IS_COLLECTION:
				setIsCollection((Boolean)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__ALLOW_DUPLICATES:
				setAllowDuplicates((Boolean)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__CONTAINER:
				setContainer((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__SCALE:
				setScale((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__PRECISION:
				setPrecision((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__LENGTH:
				setLength((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__LOWER_BOUND:
				setLowerBound((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__UPPER_BOUND:
				setUpperBound((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__DEFAULT:
				setDefault((String)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__ELEMENT:
				setElement((EAElement)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__EA_LINK:
				setEaLink((Attribute)newValue);
				return;
			case EamodelPackage.EA_ATTRIBUTE__TAGGED_VALUES:
				getTaggedValues().clear();
				getTaggedValues().addAll((java.util.Collection)newValue);
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
			case EamodelPackage.EA_ATTRIBUTE__REPOSITORY:
				unsetRepository();
				return;
			case EamodelPackage.EA_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__IS_CONST:
				setIsConst(IS_CONST_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__IS_COLLECTION:
				setIsCollection(IS_COLLECTION_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__ALLOW_DUPLICATES:
				setAllowDuplicates(ALLOW_DUPLICATES_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__ELEMENT:
				setElement((EAElement)null);
				return;
			case EamodelPackage.EA_ATTRIBUTE__EA_LINK:
				setEaLink(EA_LINK_EDEFAULT);
				return;
			case EamodelPackage.EA_ATTRIBUTE__TAGGED_VALUES:
				getTaggedValues().clear();
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
			case EamodelPackage.EA_ATTRIBUTE__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case EamodelPackage.EA_ATTRIBUTE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EamodelPackage.EA_ATTRIBUTE__REPOSITORY:
				return isSetRepository();
			case EamodelPackage.EA_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EamodelPackage.EA_ATTRIBUTE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EamodelPackage.EA_ATTRIBUTE__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case EamodelPackage.EA_ATTRIBUTE__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case EamodelPackage.EA_ATTRIBUTE__HAS_DSTEREOTYPE:
				return HAS_DSTEREOTYPE_EDEFAULT == null ? getHasDStereotype() != null : !HAS_DSTEREOTYPE_EDEFAULT.equals(getHasDStereotype());
			case EamodelPackage.EA_ATTRIBUTE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EamodelPackage.EA_ATTRIBUTE__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case EamodelPackage.EA_ATTRIBUTE__IS_CONST:
				return IS_CONST_EDEFAULT == null ? isConst != null : !IS_CONST_EDEFAULT.equals(isConst);
			case EamodelPackage.EA_ATTRIBUTE__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? isStatic != null : !IS_STATIC_EDEFAULT.equals(isStatic);
			case EamodelPackage.EA_ATTRIBUTE__CLASSIFIER_ID:
				return CLASSIFIER_ID_EDEFAULT == null ? classifierID != null : !CLASSIFIER_ID_EDEFAULT.equals(classifierID);
			case EamodelPackage.EA_ATTRIBUTE__CONTAINMENT:
				return CONTAINMENT_EDEFAULT == null ? containment != null : !CONTAINMENT_EDEFAULT.equals(containment);
			case EamodelPackage.EA_ATTRIBUTE__IS_COLLECTION:
				return IS_COLLECTION_EDEFAULT == null ? isCollection != null : !IS_COLLECTION_EDEFAULT.equals(isCollection);
			case EamodelPackage.EA_ATTRIBUTE__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case EamodelPackage.EA_ATTRIBUTE__ALLOW_DUPLICATES:
				return ALLOW_DUPLICATES_EDEFAULT == null ? allowDuplicates != null : !ALLOW_DUPLICATES_EDEFAULT.equals(allowDuplicates);
			case EamodelPackage.EA_ATTRIBUTE__IS_DERIVED:
				return IS_DERIVED_EDEFAULT == null ? isDerived != null : !IS_DERIVED_EDEFAULT.equals(isDerived);
			case EamodelPackage.EA_ATTRIBUTE__CONTAINER:
				return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
			case EamodelPackage.EA_ATTRIBUTE__SCALE:
				return SCALE_EDEFAULT == null ? getScale() != null : !SCALE_EDEFAULT.equals(getScale());
			case EamodelPackage.EA_ATTRIBUTE__PRECISION:
				return PRECISION_EDEFAULT == null ? getPrecision() != null : !PRECISION_EDEFAULT.equals(getPrecision());
			case EamodelPackage.EA_ATTRIBUTE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case EamodelPackage.EA_ATTRIBUTE__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case EamodelPackage.EA_ATTRIBUTE__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case EamodelPackage.EA_ATTRIBUTE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case EamodelPackage.EA_ATTRIBUTE__ELEMENT:
				return getElement() != null;
			case EamodelPackage.EA_ATTRIBUTE__EA_LINK:
				return EA_LINK_EDEFAULT == null ? eaLink != null : !EA_LINK_EDEFAULT.equals(eaLink);
			case EamodelPackage.EA_ATTRIBUTE__TAGGED_VALUES:
				return taggedValues != null && !taggedValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == EAClassifierIDLong.class) {
			switch (derivedFeatureID) {
				case EamodelPackage.EA_ATTRIBUTE__CLASSIFIER_ID: return AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__CLASSIFIER_ID;
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
		if (baseClass == EAClassifierIDLong.class) {
			switch (baseFeatureID) {
				case AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__CLASSIFIER_ID: return EamodelPackage.EA_ATTRIBUTE__CLASSIFIER_ID;
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
		result.append(", isConst: ");
		result.append(getIsConst());
		result.append(", isStatic: ");
		result.append(getIsStatic());
		result.append(", classifierID: ");
		result.append(getClassifierID());
		result.append(", containment: ");
		result.append(getContainment());
		result.append(", isCollection: ");
		result.append(getIsCollection());
		result.append(", isOrdered: ");
		result.append(getIsOrdered());
		result.append(", allowDuplicates: ");
		result.append(getAllowDuplicates());
		result.append(", isDerived: ");
		result.append(getIsDerived());
		result.append(", container: ");
		result.append(getContainer());
		result.append(", length: ");
		result.append(getLength());
		result.append(", lowerBound: ");
		result.append(getLowerBound());
		result.append(", upperBound: ");
		result.append(getUpperBound());
		result.append(", default: ");
		result.append(getDefault());
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

} //EAAttributeImpl