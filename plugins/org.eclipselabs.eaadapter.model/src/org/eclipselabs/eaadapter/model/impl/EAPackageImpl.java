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
import org.eclipselabs.eaadapter.model.EADiagram;
import org.eclipselabs.eaadapter.model.EAElement;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.Filter;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement;
import org.eclipselabs.eaadapter.model.datatypes.FilterClass;
import org.eclipselabs.eaadapter.model.datatypes.FilterType;
import org.eclipselabs.eaadapter.model.util.EAObjectContainmentWithInverseEList;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.sparx.Collection;
import org.sparx.Element;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getCodePath <em>Code Path</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getIsModel <em>Is Model</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("rawtypes")
public class EAPackageImpl extends EObjectImpl implements EAPackage {
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
	 * The default value of the '{@link #getCodePath() <em>Code Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePath()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodePath() <em>Code Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePath()
	 * @generated
	 * @ordered
	 */
	protected String codePath = null;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected String flags = null;

	/**
	 * The default value of the '{@link #getIsModel() <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsModel() <em>Is Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModel()
	 * @generated
	 * @ordered
	 */
	protected Boolean isModel = null;

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
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackage> packages = null;

	/**
	 * The default value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final org.sparx.Package EA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected org.sparx.Package eaLink = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.EA_PACKAGE;
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
				id = eaLink.GetPackageID();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_PACKAGE__REPOSITORY, oldRepository, repository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_PACKAGE__REPOSITORY, oldRepository, repository, !oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_PACKAGE__REPOSITORY, oldRepository, null, oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_PACKAGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_PACKAGE__NOTES, oldNotes, notes));
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
				guid = eaLink.GetPackageGUID();
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
					if (!eaLink.Update()) return;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_PACKAGE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodePath() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && codePath != null) return codePath;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				codePath = eaLink.GetCodePath();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return codePath;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePath(String newCodePath) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newCodePath != null && newCodePath.equals(codePath)) return;
				// update EA link
				try {
					eaLink.SetCodePath(newCodePath);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldCodePath = codePath;
		codePath = newCodePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_PACKAGE__CODE_PATH, oldCodePath, codePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlags() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && flags != null) return flags;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				flags = eaLink.GetFlags();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return flags;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(String newFlags) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newFlags != null && newFlags.equals(flags)) return;
				// update EA link
				try {
					eaLink.SetFlags(newFlags);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_PACKAGE__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsModel() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isModel != null) return isModel;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isModel = eaLink.GetIsModel();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EADiagram> getDiagrams() {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
		return new BasicEList<EADiagram>();
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
					elements = new EAObjectContainmentWithInverseEList<EAElement>(EAElement.class, this, EamodelPackage.EA_PACKAGE__ELEMENTS, EamodelPackage.EA_ELEMENT__PACKAGE, eaLink.GetElements());
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
					//elements = new EAObjectContainmentWithInverseEList<EAElement>(EAElement.class, this, EamodelPackage.EA_PACKAGE__ELEMENTS, EamodelPackage.EA_ELEMENT__PACKAGE, null); // changed to BasicEList because EAList should not be initialized with collection null!
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
	public EList<EAPackage> getPackages() {
		if (packages == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					packages = new EAObjectContainmentWithInverseEList<EAPackage>(EAPackage.class, this, EamodelPackage.EA_PACKAGE__PACKAGES, EamodelPackage.EA_PACKAGE__PACKAGE, eaLink.GetPackages());
					// fill list with ea objects
					ArrayList<EAPackage> coll = new ArrayList<EAPackage>();
					collection: for (org.sparx.Package eaCollElement : eaLink.GetPackages()) {
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
										if (filter.getFilterExpression().equals(eaCollElement.GetElement().GetStereotype()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.CONTAINS_STRING_LITERAL))
										if (eaCollElement.GetElement().GetStereotype().contains(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else if (filter.getFilterType().equals(FilterType.REGEX_LITERAL))
										if (eaCollElement.GetElement().GetStereotype() == null)
											if (filter.getNegate())
												break;
											else continue collection;
										else if (eaCollElement.GetElement().GetStereotype().matches(filter.getFilterExpression()) ^ filter.getNegate())
											continue collection;
										else break;
									else EAUtil.getLogger(getClass()).warn("Warning! Unknown filter type detected: " + filter.getFilterType() + " If this filter type is well-known, add it to the template 'filterContainments.javajetinc' and regenerate the model code.");
								}
							}
						}

						// create emf wrapper object
						EAPackage collElement = EamodelFactory.eINSTANCE.createEAPackage();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						packages.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//packages = new EAObjectContainmentWithInverseEList<EAPackage>(EAPackage.class, this, EamodelPackage.EA_PACKAGE__PACKAGES, EamodelPackage.EA_PACKAGE__PACKAGE, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					packages = new BasicEList<EAPackage>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (packages == null)
					packages = new BasicEList<EAPackage>();
			}
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAPackage getPackage() {
		if (eContainerFeatureID != EamodelPackage.EA_PACKAGE__PACKAGE) return null;
		return (EAPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(EAPackage newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, EamodelPackage.EA_PACKAGE__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(EAPackage newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID != EamodelPackage.EA_PACKAGE__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, EamodelPackage.EA_PACKAGE__PACKAGES, EAPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_PACKAGE__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.sparx.Package getEaLink() {
		// return value
		return eaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaLink(org.sparx.Package newEaLink) {
		// check if any setter was called previously to transfer values to the corresponding ea object...
		if (name != null) newEaLink.SetName(name);
		if (notes != null) newEaLink.SetNotes(notes);
		if (version != null) newEaLink.SetVersion(version);
		if (codePath != null) newEaLink.SetCodePath(codePath);
		if (flags != null) newEaLink.SetFlags(flags);
		if (stereotype != null) {
			newEaLink.Update(); // this initializes subelements of the ea object
			if (newEaLink.GetElement() != null) {
				newEaLink.GetElement().SetStereotype(stereotype);
			} else EAUtil.getLogger(getClass()).error("Subelement newEaLink.Element is null of new: " + this); 
		}
//		newEaLink.GetIsVersionControlled() // TODO: we need this check for updates...
		newEaLink.Update();
		// update emf object
		org.sparx.Package oldEaLink = eaLink;
		eaLink = newEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_PACKAGE__EA_LINK, oldEaLink, eaLink));
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
				stereotype = eaLink.GetElement() == null ? null : eaLink.GetElement().GetStereotype();
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
					eaLink.GetElement().SetStereotype(newStereotype);
					eaLink.GetElement().Update();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_PACKAGE__STEREOTYPE, oldStereotype, stereotype));
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
			eaLink.SetParentID(((EAPackage)parent).getEaLink().GetPackageID());
			eaLink.Update();
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
			org.sparx.Package newEaLink = (org.sparx.Package)collection.AddNew("", "");
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
				org.sparx.Package collElement = (org.sparx.Package) collection.GetAt((short) i);
				if (collElement.GetPackageGUID().equals(delId)) {
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
			case EamodelPackage.EA_PACKAGE__ELEMENTS:
				return ((InternalEList)getElements()).basicAdd(otherEnd, msgs);
			case EamodelPackage.EA_PACKAGE__PACKAGES:
				return ((InternalEList)getPackages()).basicAdd(otherEnd, msgs);
			case EamodelPackage.EA_PACKAGE__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((EAPackage)otherEnd, msgs);
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
			case EamodelPackage.EA_PACKAGE__DIAGRAMS:
				return ((InternalEList)getDiagrams()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_PACKAGE__ELEMENTS:
				return ((InternalEList)getElements()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_PACKAGE__PACKAGES:
				return ((InternalEList)getPackages()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_PACKAGE__PACKAGE:
				return basicSetPackage(null, msgs);
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
			case EamodelPackage.EA_PACKAGE__PACKAGE:
				return eInternalContainer().eInverseRemove(this, EamodelPackage.EA_PACKAGE__PACKAGES, EAPackage.class, msgs);
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
			case EamodelPackage.EA_PACKAGE__OBJECT_TYPE:
				return getObjectType();
			case EamodelPackage.EA_PACKAGE__ID:
				return getId();
			case EamodelPackage.EA_PACKAGE__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case EamodelPackage.EA_PACKAGE__NAME:
				return getName();
			case EamodelPackage.EA_PACKAGE__NOTES:
				return getNotes();
			case EamodelPackage.EA_PACKAGE__GUID:
				return getGuid();
			case EamodelPackage.EA_PACKAGE__VERSION:
				return getVersion();
			case EamodelPackage.EA_PACKAGE__CODE_PATH:
				return getCodePath();
			case EamodelPackage.EA_PACKAGE__FLAGS:
				return getFlags();
			case EamodelPackage.EA_PACKAGE__IS_MODEL:
				return getIsModel();
			case EamodelPackage.EA_PACKAGE__DIAGRAMS:
				return getDiagrams();
			case EamodelPackage.EA_PACKAGE__ELEMENTS:
				return getElements();
			case EamodelPackage.EA_PACKAGE__PACKAGES:
				return getPackages();
			case EamodelPackage.EA_PACKAGE__PACKAGE:
				return getPackage();
			case EamodelPackage.EA_PACKAGE__EA_LINK:
				return getEaLink();
			case EamodelPackage.EA_PACKAGE__STEREOTYPE:
				return getStereotype();
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
			case EamodelPackage.EA_PACKAGE__REPOSITORY:
				setRepository((EARepository)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__NOTES:
				setNotes((String)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__VERSION:
				setVersion((String)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__CODE_PATH:
				setCodePath((String)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__FLAGS:
				setFlags((String)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__ELEMENTS:
				getElements().clear();
				getElements().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__PACKAGE:
				setPackage((EAPackage)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__EA_LINK:
				setEaLink((org.sparx.Package)newValue);
				return;
			case EamodelPackage.EA_PACKAGE__STEREOTYPE:
				setStereotype((String)newValue);
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
			case EamodelPackage.EA_PACKAGE__REPOSITORY:
				unsetRepository();
				return;
			case EamodelPackage.EA_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EamodelPackage.EA_PACKAGE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EamodelPackage.EA_PACKAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EamodelPackage.EA_PACKAGE__CODE_PATH:
				setCodePath(CODE_PATH_EDEFAULT);
				return;
			case EamodelPackage.EA_PACKAGE__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case EamodelPackage.EA_PACKAGE__DIAGRAMS:
				getDiagrams().clear();
				return;
			case EamodelPackage.EA_PACKAGE__ELEMENTS:
				getElements().clear();
				return;
			case EamodelPackage.EA_PACKAGE__PACKAGES:
				getPackages().clear();
				return;
			case EamodelPackage.EA_PACKAGE__PACKAGE:
				setPackage((EAPackage)null);
				return;
			case EamodelPackage.EA_PACKAGE__EA_LINK:
				setEaLink(EA_LINK_EDEFAULT);
				return;
			case EamodelPackage.EA_PACKAGE__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
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
			case EamodelPackage.EA_PACKAGE__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case EamodelPackage.EA_PACKAGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EamodelPackage.EA_PACKAGE__REPOSITORY:
				return isSetRepository();
			case EamodelPackage.EA_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EamodelPackage.EA_PACKAGE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EamodelPackage.EA_PACKAGE__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case EamodelPackage.EA_PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EamodelPackage.EA_PACKAGE__CODE_PATH:
				return CODE_PATH_EDEFAULT == null ? codePath != null : !CODE_PATH_EDEFAULT.equals(codePath);
			case EamodelPackage.EA_PACKAGE__FLAGS:
				return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
			case EamodelPackage.EA_PACKAGE__IS_MODEL:
				return IS_MODEL_EDEFAULT == null ? isModel != null : !IS_MODEL_EDEFAULT.equals(isModel);
			case EamodelPackage.EA_PACKAGE__DIAGRAMS:
				return !getDiagrams().isEmpty();
			case EamodelPackage.EA_PACKAGE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case EamodelPackage.EA_PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case EamodelPackage.EA_PACKAGE__PACKAGE:
				return getPackage() != null;
			case EamodelPackage.EA_PACKAGE__EA_LINK:
				return EA_LINK_EDEFAULT == null ? eaLink != null : !EA_LINK_EDEFAULT.equals(eaLink);
			case EamodelPackage.EA_PACKAGE__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
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
		result.append(", version: ");
		result.append(getVersion());
		result.append(", codePath: ");
		result.append(getCodePath());
		result.append(", flags: ");
		result.append(getFlags());
		result.append(", isModel: ");
		result.append(getIsModel());
		result.append(", eaLink: ");
		result.append(getEaLink());
		result.append(", stereotype: ");
		result.append(getStereotype());
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

} //EAPackageImpl