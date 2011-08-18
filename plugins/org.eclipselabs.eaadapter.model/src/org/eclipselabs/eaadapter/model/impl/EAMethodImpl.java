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
import org.eclipselabs.eaadapter.model.EAElement;
import org.eclipselabs.eaadapter.model.EAMethod;
import org.eclipselabs.eaadapter.model.EAMethodTag;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EAParameter;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.Filter;
import org.eclipselabs.eaadapter.model.datatypes.FilterClass;
import org.eclipselabs.eaadapter.model.datatypes.FilterType;
import org.eclipselabs.eaadapter.model.util.EAObjectContainmentEList;
import org.eclipselabs.eaadapter.model.util.EAObjectContainmentWithInverseEList;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.sparx.Collection;
import org.sparx.Method;
import org.sparx.MethodTag;
import org.sparx.Parameter;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getIsConst <em>Is Const</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getReturnIsArray <em>Return Is Array</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getThrows <em>Throws</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getIsPure <em>Is Pure</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getIsRoot <em>Is Root</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getIsQuery <em>Is Query</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getIsSynchronized <em>Is Synchronized</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getClassifierID <em>Classifier ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl#getTaggedValues <em>Tagged Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("rawtypes")
public class EAMethodImpl extends EObjectImpl implements EAMethod {
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
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = null;

	/**
	 * The default value of the '{@link #getReturnIsArray() <em>Return Is Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnIsArray()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RETURN_IS_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnIsArray() <em>Return Is Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnIsArray()
	 * @generated
	 * @ordered
	 */
	protected Boolean returnIsArray = null;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = null;

	/**
	 * The default value of the '{@link #getThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected static final String THROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected String throws_ = null;

	/**
	 * The default value of the '{@link #getIsPure() <em>Is Pure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPure() <em>Is Pure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPure()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPure = null;

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
	 * The cached value of the '{@link #getIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRoot()
	 * @generated
	 * @ordered
	 */
	protected Boolean isRoot = null;

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
	 * The cached value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLeaf = null;

	/**
	 * The default value of the '{@link #getIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsQuery()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsQuery()
	 * @generated
	 * @ordered
	 */
	protected Boolean isQuery = null;

	/**
	 * The default value of the '{@link #getIsSynchronized() <em>Is Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SYNCHRONIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSynchronized() <em>Is Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynchronized()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSynchronized = null;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = null;

	/**
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected String concurrency = null;

	/**
	 * The default value of the '{@link #getClassifierID() <em>Classifier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierID()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierID() <em>Classifier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierID()
	 * @generated
	 * @ordered
	 */
	protected String classifierID = null;

	/**
	 * The default value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final Method EA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected Method eaLink = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EAParameter> parameters = null;

	/**
	 * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EAMethodTag> taggedValues = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.EA_METHOD;
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
				id = eaLink.GetMethodID();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_METHOD__REPOSITORY, oldRepository, repository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__REPOSITORY, oldRepository, repository, !oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_METHOD__REPOSITORY, oldRepository, null, oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__NOTES, oldNotes, notes));
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
				guid = eaLink.GetMethodGUID();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__STEREOTYPE, oldStereotype, stereotype));
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
				type = eaLink.GetReturnType();
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
					eaLink.SetReturnType(newType);
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__VISIBILITY, oldVisibility, visibility));
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
					if (!updateEaLink(eaLink)) return;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__IS_CONST, oldIsConst, isConst));
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
					if (!updateEaLink(eaLink)) return;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && returnType != null) return returnType;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				returnType = eaLink.GetReturnType();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return returnType;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newReturnType != null && newReturnType.equals(returnType)) return;
				// update EA link
				try {
					eaLink.SetReturnType(newReturnType);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReturnIsArray() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && returnIsArray != null) return returnIsArray;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				returnIsArray = eaLink.GetReturnIsArray();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return returnIsArray;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnIsArray(Boolean newReturnIsArray) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newReturnIsArray != null && newReturnIsArray.equals(returnIsArray)) return;
				// update EA link
				try {
					eaLink.SetReturnIsArray(newReturnIsArray);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldReturnIsArray = returnIsArray;
		returnIsArray = newReturnIsArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__RETURN_IS_ARRAY, oldReturnIsArray, returnIsArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && code != null) return code;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				code = eaLink.GetCode();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return code;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newCode != null && newCode.equals(code)) return;
				// update EA link
				try {
					eaLink.SetCode(newCode);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThrows() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && throws_ != null) return throws_;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				throws_ = eaLink.GetThrows();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return throws_;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrows(String newThrows) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newThrows != null && newThrows.equals(throws_)) return;
				// update EA link
				try {
					eaLink.SetThrows(newThrows);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldThrows = throws_;
		throws_ = newThrows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__THROWS, oldThrows, throws_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPure() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isPure != null) return isPure;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isPure = eaLink.GetIsPure();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isPure;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPure(Boolean newIsPure) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsPure != null && newIsPure.equals(isPure)) return;
				// update EA link
				try {
					eaLink.SetIsPure(newIsPure);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsPure = isPure;
		isPure = newIsPure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__IS_PURE, oldIsPure, isPure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsRoot() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isRoot != null) return isRoot;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isRoot = eaLink.GetIsRoot();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isRoot;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(Boolean newIsRoot) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsRoot != null && newIsRoot.equals(isRoot)) return;
				// update EA link
				try {
					eaLink.SetIsRoot(newIsRoot);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLeaf() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isLeaf != null) return isLeaf;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isLeaf = eaLink.GetIsLeaf();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isLeaf;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(Boolean newIsLeaf) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsLeaf != null && newIsLeaf.equals(isLeaf)) return;
				// update EA link
				try {
					eaLink.SetIsLeaf(newIsLeaf);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsQuery() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isQuery != null) return isQuery;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isQuery = eaLink.GetIsQuery();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isQuery;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(Boolean newIsQuery) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsQuery != null && newIsQuery.equals(isQuery)) return;
				// update EA link
				try {
					eaLink.SetIsQuery(newIsQuery);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsQuery = isQuery;
		isQuery = newIsQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__IS_QUERY, oldIsQuery, isQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSynchronized() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isSynchronized != null) return isSynchronized;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isSynchronized = eaLink.GetIsSynchronized();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isSynchronized;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronized(Boolean newIsSynchronized) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsSynchronized != null && newIsSynchronized.equals(isSynchronized)) return;
				// update EA link
				try {
					eaLink.SetIsSynchronized(newIsSynchronized);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsSynchronized = isSynchronized;
		isSynchronized = newIsSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__IS_SYNCHRONIZED, oldIsSynchronized, isSynchronized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isAbstract != null) return isAbstract;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isAbstract = eaLink.GetAbstract();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isAbstract;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsAbstract != null && newIsAbstract.equals(isAbstract)) return;
				// update EA link
				try {
					eaLink.SetAbstract(newIsAbstract);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcurrency() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && concurrency != null) return concurrency;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				concurrency = eaLink.GetConcurrency();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return concurrency;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(String newConcurrency) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newConcurrency != null && newConcurrency.equals(concurrency)) return;
				// update EA link
				try {
					eaLink.SetConcurrency(newConcurrency);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldConcurrency = concurrency;
		concurrency = newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__CONCURRENCY, oldConcurrency, concurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierID() {
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
	public EAElement getElement() {
		if (eContainerFeatureID != EamodelPackage.EA_METHOD__ELEMENT) return null;
		return (EAElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(EAElement newElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElement, EamodelPackage.EA_METHOD__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EAElement newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID != EamodelPackage.EA_METHOD__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EamodelPackage.EA_ELEMENT__METHODS, EAElement.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getEaLink() {
		// return value
		return eaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaLink(Method newEaLink) {
		// check if any setter was called previously to transfer values to the corresponding ea object...
		if (name != null) newEaLink.SetName(name);
		if (notes != null) newEaLink.SetNotes(notes);
		if (stereotype != null) newEaLink.SetStereotype(stereotype);
		if (type != null) newEaLink.SetReturnType(type);
		if (visibility != null) newEaLink.SetVisibility(visibility);
		if (isConst != null) newEaLink.SetIsConst(isConst);
		if (isStatic != null) newEaLink.SetIsStatic(isStatic);
		if (returnType != null) newEaLink.SetReturnType(returnType);
		if (returnIsArray != null) newEaLink.SetReturnIsArray(returnIsArray);
		if (code != null) newEaLink.SetCode(code);
		if (throws_ != null) newEaLink.SetThrows(throws_);
		if (isPure != null) newEaLink.SetIsPure(isPure);
		if (isRoot != null) newEaLink.SetIsRoot(isRoot);
		if (isLeaf != null) newEaLink.SetIsLeaf(isLeaf);
		if (isQuery != null) newEaLink.SetIsQuery(isQuery);
		if (isSynchronized != null) newEaLink.SetIsSynchronized(isSynchronized);
		if (isAbstract != null) newEaLink.SetAbstract(isAbstract);
		if (concurrency != null) newEaLink.SetConcurrency(concurrency); 
		updateEaLink(newEaLink);
		// update emf object
		Method oldEaLink = eaLink;
		eaLink = newEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_METHOD__EA_LINK, oldEaLink, eaLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAParameter> getParameters() {
		if (parameters == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					parameters = new EAObjectContainmentWithInverseEList<EAParameter>(EAParameter.class, this, EamodelPackage.EA_METHOD__PARAMETERS, EamodelPackage.EA_PARAMETER__METHOD, eaLink.GetParameters());
					// fill list with ea objects
					ArrayList<EAParameter> coll = new ArrayList<EAParameter>();
					collection: for (Parameter eaCollElement : eaLink.GetParameters()) {
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
						EAParameter collElement = EamodelFactory.eINSTANCE.createEAParameter();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						parameters.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//parameters = new EAObjectContainmentWithInverseEList<EAParameter>(EAParameter.class, this, EamodelPackage.EA_METHOD__PARAMETERS, EamodelPackage.EA_PARAMETER__METHOD, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					parameters = new BasicEList<EAParameter>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (parameters == null)
					parameters = new BasicEList<EAParameter>();
			}
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAMethodTag> getTaggedValues() {
		if (taggedValues == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					taggedValues = new EAObjectContainmentEList<EAMethodTag>(EAMethodTag.class, this, EamodelPackage.EA_METHOD__TAGGED_VALUES, eaLink.GetTaggedValues());
					// fill list with ea objects
					ArrayList<EAMethodTag> coll = new ArrayList<EAMethodTag>();
					collection: for (MethodTag eaCollElement : eaLink.GetTaggedValues()) {
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
						EAMethodTag collElement = EamodelFactory.eINSTANCE.createEAMethodTag();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						taggedValues.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//taggedValues = new EAObjectContainmentEList<EAMethodTag>(EAMethodTag.class, this, EamodelPackage.EA_METHOD__TAGGED_VALUES, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					taggedValues = new BasicEList<EAMethodTag>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (taggedValues == null)
					taggedValues = new BasicEList<EAMethodTag>();
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
			Method newEaLink = (Method)collection.AddNew("", "");
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
				Method collElement = (Method) collection.GetAt((short) i);
				if (collElement.GetMethodGUID().equals(delId)) {
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
			case EamodelPackage.EA_METHOD__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((EAElement)otherEnd, msgs);
			case EamodelPackage.EA_METHOD__PARAMETERS:
				return ((InternalEList)getParameters()).basicAdd(otherEnd, msgs);
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
			case EamodelPackage.EA_METHOD__ELEMENT:
				return basicSetElement(null, msgs);
			case EamodelPackage.EA_METHOD__PARAMETERS:
				return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_METHOD__TAGGED_VALUES:
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
			case EamodelPackage.EA_METHOD__ELEMENT:
				return eInternalContainer().eInverseRemove(this, EamodelPackage.EA_ELEMENT__METHODS, EAElement.class, msgs);
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
			case EamodelPackage.EA_METHOD__OBJECT_TYPE:
				return getObjectType();
			case EamodelPackage.EA_METHOD__ID:
				return getId();
			case EamodelPackage.EA_METHOD__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case EamodelPackage.EA_METHOD__NAME:
				return getName();
			case EamodelPackage.EA_METHOD__NOTES:
				return getNotes();
			case EamodelPackage.EA_METHOD__GUID:
				return getGuid();
			case EamodelPackage.EA_METHOD__STEREOTYPE:
				return getStereotype();
			case EamodelPackage.EA_METHOD__TYPE:
				return getType();
			case EamodelPackage.EA_METHOD__VISIBILITY:
				return getVisibility();
			case EamodelPackage.EA_METHOD__IS_CONST:
				return getIsConst();
			case EamodelPackage.EA_METHOD__IS_STATIC:
				return getIsStatic();
			case EamodelPackage.EA_METHOD__RETURN_TYPE:
				return getReturnType();
			case EamodelPackage.EA_METHOD__RETURN_IS_ARRAY:
				return getReturnIsArray();
			case EamodelPackage.EA_METHOD__CODE:
				return getCode();
			case EamodelPackage.EA_METHOD__THROWS:
				return getThrows();
			case EamodelPackage.EA_METHOD__IS_PURE:
				return getIsPure();
			case EamodelPackage.EA_METHOD__IS_ROOT:
				return getIsRoot();
			case EamodelPackage.EA_METHOD__IS_LEAF:
				return getIsLeaf();
			case EamodelPackage.EA_METHOD__IS_QUERY:
				return getIsQuery();
			case EamodelPackage.EA_METHOD__IS_SYNCHRONIZED:
				return getIsSynchronized();
			case EamodelPackage.EA_METHOD__IS_ABSTRACT:
				return getIsAbstract();
			case EamodelPackage.EA_METHOD__CONCURRENCY:
				return getConcurrency();
			case EamodelPackage.EA_METHOD__CLASSIFIER_ID:
				return getClassifierID();
			case EamodelPackage.EA_METHOD__ELEMENT:
				return getElement();
			case EamodelPackage.EA_METHOD__EA_LINK:
				return getEaLink();
			case EamodelPackage.EA_METHOD__PARAMETERS:
				return getParameters();
			case EamodelPackage.EA_METHOD__TAGGED_VALUES:
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
			case EamodelPackage.EA_METHOD__REPOSITORY:
				setRepository((EARepository)newValue);
				return;
			case EamodelPackage.EA_METHOD__NAME:
				setName((String)newValue);
				return;
			case EamodelPackage.EA_METHOD__NOTES:
				setNotes((String)newValue);
				return;
			case EamodelPackage.EA_METHOD__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case EamodelPackage.EA_METHOD__TYPE:
				setType((String)newValue);
				return;
			case EamodelPackage.EA_METHOD__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case EamodelPackage.EA_METHOD__IS_CONST:
				setIsConst((Boolean)newValue);
				return;
			case EamodelPackage.EA_METHOD__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case EamodelPackage.EA_METHOD__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case EamodelPackage.EA_METHOD__RETURN_IS_ARRAY:
				setReturnIsArray((Boolean)newValue);
				return;
			case EamodelPackage.EA_METHOD__CODE:
				setCode((String)newValue);
				return;
			case EamodelPackage.EA_METHOD__THROWS:
				setThrows((String)newValue);
				return;
			case EamodelPackage.EA_METHOD__IS_PURE:
				setIsPure((Boolean)newValue);
				return;
			case EamodelPackage.EA_METHOD__IS_ROOT:
				setIsRoot((Boolean)newValue);
				return;
			case EamodelPackage.EA_METHOD__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case EamodelPackage.EA_METHOD__IS_QUERY:
				setIsQuery((Boolean)newValue);
				return;
			case EamodelPackage.EA_METHOD__IS_SYNCHRONIZED:
				setIsSynchronized((Boolean)newValue);
				return;
			case EamodelPackage.EA_METHOD__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case EamodelPackage.EA_METHOD__CONCURRENCY:
				setConcurrency((String)newValue);
				return;
			case EamodelPackage.EA_METHOD__ELEMENT:
				setElement((EAElement)newValue);
				return;
			case EamodelPackage.EA_METHOD__EA_LINK:
				setEaLink((Method)newValue);
				return;
			case EamodelPackage.EA_METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_METHOD__TAGGED_VALUES:
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
			case EamodelPackage.EA_METHOD__REPOSITORY:
				unsetRepository();
				return;
			case EamodelPackage.EA_METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__IS_CONST:
				setIsConst(IS_CONST_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__RETURN_IS_ARRAY:
				setReturnIsArray(RETURN_IS_ARRAY_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__THROWS:
				setThrows(THROWS_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__IS_PURE:
				setIsPure(IS_PURE_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__IS_SYNCHRONIZED:
				setIsSynchronized(IS_SYNCHRONIZED_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__ELEMENT:
				setElement((EAElement)null);
				return;
			case EamodelPackage.EA_METHOD__EA_LINK:
				setEaLink(EA_LINK_EDEFAULT);
				return;
			case EamodelPackage.EA_METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case EamodelPackage.EA_METHOD__TAGGED_VALUES:
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
			case EamodelPackage.EA_METHOD__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case EamodelPackage.EA_METHOD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EamodelPackage.EA_METHOD__REPOSITORY:
				return isSetRepository();
			case EamodelPackage.EA_METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EamodelPackage.EA_METHOD__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EamodelPackage.EA_METHOD__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case EamodelPackage.EA_METHOD__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case EamodelPackage.EA_METHOD__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EamodelPackage.EA_METHOD__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case EamodelPackage.EA_METHOD__IS_CONST:
				return IS_CONST_EDEFAULT == null ? isConst != null : !IS_CONST_EDEFAULT.equals(isConst);
			case EamodelPackage.EA_METHOD__IS_STATIC:
				return IS_STATIC_EDEFAULT == null ? isStatic != null : !IS_STATIC_EDEFAULT.equals(isStatic);
			case EamodelPackage.EA_METHOD__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case EamodelPackage.EA_METHOD__RETURN_IS_ARRAY:
				return RETURN_IS_ARRAY_EDEFAULT == null ? returnIsArray != null : !RETURN_IS_ARRAY_EDEFAULT.equals(returnIsArray);
			case EamodelPackage.EA_METHOD__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case EamodelPackage.EA_METHOD__THROWS:
				return THROWS_EDEFAULT == null ? throws_ != null : !THROWS_EDEFAULT.equals(throws_);
			case EamodelPackage.EA_METHOD__IS_PURE:
				return IS_PURE_EDEFAULT == null ? isPure != null : !IS_PURE_EDEFAULT.equals(isPure);
			case EamodelPackage.EA_METHOD__IS_ROOT:
				return IS_ROOT_EDEFAULT == null ? isRoot != null : !IS_ROOT_EDEFAULT.equals(isRoot);
			case EamodelPackage.EA_METHOD__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
			case EamodelPackage.EA_METHOD__IS_QUERY:
				return IS_QUERY_EDEFAULT == null ? isQuery != null : !IS_QUERY_EDEFAULT.equals(isQuery);
			case EamodelPackage.EA_METHOD__IS_SYNCHRONIZED:
				return IS_SYNCHRONIZED_EDEFAULT == null ? isSynchronized != null : !IS_SYNCHRONIZED_EDEFAULT.equals(isSynchronized);
			case EamodelPackage.EA_METHOD__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case EamodelPackage.EA_METHOD__CONCURRENCY:
				return CONCURRENCY_EDEFAULT == null ? concurrency != null : !CONCURRENCY_EDEFAULT.equals(concurrency);
			case EamodelPackage.EA_METHOD__CLASSIFIER_ID:
				return CLASSIFIER_ID_EDEFAULT == null ? classifierID != null : !CLASSIFIER_ID_EDEFAULT.equals(classifierID);
			case EamodelPackage.EA_METHOD__ELEMENT:
				return getElement() != null;
			case EamodelPackage.EA_METHOD__EA_LINK:
				return EA_LINK_EDEFAULT == null ? eaLink != null : !EA_LINK_EDEFAULT.equals(eaLink);
			case EamodelPackage.EA_METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case EamodelPackage.EA_METHOD__TAGGED_VALUES:
				return taggedValues != null && !taggedValues.isEmpty();
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
		result.append(", visibility: ");
		result.append(getVisibility());
		result.append(", isConst: ");
		result.append(getIsConst());
		result.append(", isStatic: ");
		result.append(getIsStatic());
		result.append(", returnType: ");
		result.append(getReturnType());
		result.append(", returnIsArray: ");
		result.append(getReturnIsArray());
		result.append(", code: ");
		result.append(getCode());
		result.append(", throws: ");
		result.append(getThrows());
		result.append(", isPure: ");
		result.append(getIsPure());
		result.append(", isRoot: ");
		result.append(getIsRoot());
		result.append(", isLeaf: ");
		result.append(getIsLeaf());
		result.append(", isQuery: ");
		result.append(getIsQuery());
		result.append(", isSynchronized: ");
		result.append(getIsSynchronized());
		result.append(", isAbstract: ");
		result.append(getIsAbstract());
		result.append(", concurrency: ");
		result.append(getConcurrency());
		result.append(", classifierID: ");
		result.append(getClassifierID());
		result.append(", eaLink: ");
		result.append(getEaLink());
		result.append(')');
		return result.toString();
	}

	/**
	 * Update EA Link only if not under version control!
	 * @generated
	 */
	private boolean updateEaLink(Method eaLink) {
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

} //EAMethodImpl