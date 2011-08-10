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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.eaadapter.model.EADiagram;
import org.eclipselabs.eaadapter.model.EADiagramLink;
import org.eclipselabs.eaadapter.model.EADiagramObject;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement;
import org.eclipselabs.eaadapter.model.util.EAObjectContainmentEList;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.sparx.Collection;
import org.sparx.Diagram;
import org.sparx.DiagramLink;
import org.sparx.DiagramObject;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getIsLocked <em>Is Locked</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getHasDStereotype <em>Has DStereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getSwimlanes <em>Swimlanes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getDiagramLinks <em>Diagram Links</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl#getDiagramObjects <em>Diagram Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("rawtypes")
public class EADiagramImpl extends EObjectImpl implements EADiagram {
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
	 * The default value of the '{@link #getSwimlanes() <em>Swimlanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwimlanes()
	 * @generated
	 * @ordered
	 */
	protected static final String SWIMLANES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwimlanes() <em>Swimlanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwimlanes()
	 * @generated
	 * @ordered
	 */
	protected String swimlanes = null;

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
	 * The default value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final Diagram EA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected Diagram eaLink = null;

	/**
	 * The cached value of the '{@link #getDiagramLinks() <em>Diagram Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EADiagramLink> diagramLinks = null;

	/**
	 * The cached value of the '{@link #getDiagramObjects() <em>Diagram Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EADiagramObject> diagramObjects = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EADiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.EA_DIAGRAM;
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
				id = eaLink.GetDiagramID();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_DIAGRAM__REPOSITORY, oldRepository, repository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM__REPOSITORY, oldRepository, repository, !oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_DIAGRAM__REPOSITORY, oldRepository, null, oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM__NOTES, oldNotes, notes));
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
				guid = eaLink.GetDiagramGUID();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM__AUTHOR, oldAuthor, author));
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
				isLocked = eaLink.GetIsLocked();
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
					eaLink.SetIsLocked(newIsLocked);
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM__IS_LOCKED, oldIsLocked, isLocked));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM__STEREOTYPE, oldStereotype, stereotype));
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
	public String getSwimlanes() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && swimlanes != null) return swimlanes;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				swimlanes = eaLink.GetSwimlanes();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return swimlanes;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwimlanes(String newSwimlanes) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSwimlanes != null && newSwimlanes.equals(swimlanes)) return;
				// update EA link
				try {
					eaLink.SetSwimlanes(newSwimlanes);
					if (!updateEaLink(eaLink)) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldSwimlanes = swimlanes;
		swimlanes = newSwimlanes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM__SWIMLANES, oldSwimlanes, swimlanes));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAPackage getPackage() {
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
	public void setPackage(EAPackage newPackage) {
		// This feature is marked volatile, in case of the EA model we just ignore it.
		// If you need to implement this, ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getEaLink() {
		// return value
		return eaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaLink(Diagram newEaLink) {
		// check if any setter was called previously to transfer values to the corresponding ea object...
		if (name != null) newEaLink.SetName(name);
		if (notes != null) newEaLink.SetNotes(notes);
		if (version != null) newEaLink.SetVersion(version);
		if (author != null) newEaLink.SetAuthor(author);
		if (isLocked != null) newEaLink.SetIsLocked(isLocked);
		if (stereotype != null) newEaLink.SetStereotype(stereotype);
		if (swimlanes != null) newEaLink.SetSwimlanes(swimlanes); 
		updateEaLink(newEaLink);
		// update emf object
		Diagram oldEaLink = eaLink;
		eaLink = newEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM__EA_LINK, oldEaLink, eaLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EADiagramLink> getDiagramLinks() {
		if (diagramLinks == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					diagramLinks = new EAObjectContainmentEList<EADiagramLink>(EADiagramLink.class, this, EamodelPackage.EA_DIAGRAM__DIAGRAM_LINKS, eaLink.GetDiagramLinks());
					// fill list with ea objects
					ArrayList<EADiagramLink> coll = new ArrayList<EADiagramLink>();
					for (DiagramLink eaCollElement : eaLink.GetDiagramLinks()) {

						// create emf wrapper object
						EADiagramLink collElement = EamodelFactory.eINSTANCE.createEADiagramLink();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						diagramLinks.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//diagramLinks = new EAObjectContainmentEList<EADiagramLink>(EADiagramLink.class, this, EamodelPackage.EA_DIAGRAM__DIAGRAM_LINKS, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					diagramLinks = new BasicEList<EADiagramLink>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (diagramLinks == null)
					diagramLinks = new BasicEList<EADiagramLink>();
			}
		}
		return diagramLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EADiagramObject> getDiagramObjects() {
		if (diagramObjects == null) {
			try {
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					diagramObjects = new EAObjectContainmentEList<EADiagramObject>(EADiagramObject.class, this, EamodelPackage.EA_DIAGRAM__DIAGRAM_OBJECTS, eaLink.GetDiagramObjects());
					// fill list with ea objects
					ArrayList<EADiagramObject> coll = new ArrayList<EADiagramObject>();
					for (DiagramObject eaCollElement : eaLink.GetDiagramObjects()) {

						// create emf wrapper object
						EADiagramObject collElement = EamodelFactory.eINSTANCE.createEADiagramObject();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(repository);
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						diagramObjects.addAll(coll);
				} else /*if (repository == null || repository.getReadonlyEaLink()) */{ // changed because null may be returned
					// use default emf-only elist without notifications for ea..
					//diagramObjects = new EAObjectContainmentEList<EADiagramObject>(EADiagramObject.class, this, EamodelPackage.EA_DIAGRAM__DIAGRAM_OBJECTS, null); // changed to BasicEList because EAList should not be initialized with collection null!
					// TODO: Error handling if we are _not_ in readonly mode and repository is _not_ null!!
					diagramObjects = new BasicEList<EADiagramObject>();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (diagramObjects == null)
					diagramObjects = new BasicEList<EADiagramObject>();
			}
		}
		return diagramObjects;
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
			throw new UnsupportedOperationException("Please add move-support for this class in 'implementedGenOperation.TODO.override.javajet'.");
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
			Diagram newEaLink = (Diagram)collection.AddNew("", "");
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
				Diagram collElement = (Diagram) collection.GetAt((short) i);
				if (collElement.GetDiagramGUID().equals(delId)) {
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
			case EamodelPackage.EA_DIAGRAM__DIAGRAM_LINKS:
				return ((InternalEList)getDiagramLinks()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_DIAGRAM__DIAGRAM_OBJECTS:
				return ((InternalEList)getDiagramObjects()).basicRemove(otherEnd, msgs);
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
			case EamodelPackage.EA_DIAGRAM__PACKAGE:
				return eInternalContainer().eInverseRemove(this, EamodelPackage.EA_PACKAGE__DIAGRAMS, EAPackage.class, msgs);
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
			case EamodelPackage.EA_DIAGRAM__OBJECT_TYPE:
				return getObjectType();
			case EamodelPackage.EA_DIAGRAM__ID:
				return getId();
			case EamodelPackage.EA_DIAGRAM__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case EamodelPackage.EA_DIAGRAM__NAME:
				return getName();
			case EamodelPackage.EA_DIAGRAM__NOTES:
				return getNotes();
			case EamodelPackage.EA_DIAGRAM__GUID:
				return getGuid();
			case EamodelPackage.EA_DIAGRAM__VERSION:
				return getVersion();
			case EamodelPackage.EA_DIAGRAM__AUTHOR:
				return getAuthor();
			case EamodelPackage.EA_DIAGRAM__IS_LOCKED:
				return getIsLocked();
			case EamodelPackage.EA_DIAGRAM__STEREOTYPE:
				return getStereotype();
			case EamodelPackage.EA_DIAGRAM__HAS_DSTEREOTYPE:
				return getHasDStereotype();
			case EamodelPackage.EA_DIAGRAM__SWIMLANES:
				return getSwimlanes();
			case EamodelPackage.EA_DIAGRAM__TYPE:
				return getType();
			case EamodelPackage.EA_DIAGRAM__PACKAGE:
				return getPackage();
			case EamodelPackage.EA_DIAGRAM__EA_LINK:
				return getEaLink();
			case EamodelPackage.EA_DIAGRAM__DIAGRAM_LINKS:
				return getDiagramLinks();
			case EamodelPackage.EA_DIAGRAM__DIAGRAM_OBJECTS:
				return getDiagramObjects();
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
			case EamodelPackage.EA_DIAGRAM__REPOSITORY:
				setRepository((EARepository)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__NOTES:
				setNotes((String)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__VERSION:
				setVersion((String)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__AUTHOR:
				setAuthor((String)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__IS_LOCKED:
				setIsLocked((Boolean)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__SWIMLANES:
				setSwimlanes((String)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__PACKAGE:
				setPackage((EAPackage)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__EA_LINK:
				setEaLink((Diagram)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__DIAGRAM_LINKS:
				getDiagramLinks().clear();
				getDiagramLinks().addAll((java.util.Collection)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM__DIAGRAM_OBJECTS:
				getDiagramObjects().clear();
				getDiagramObjects().addAll((java.util.Collection)newValue);
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
			case EamodelPackage.EA_DIAGRAM__REPOSITORY:
				unsetRepository();
				return;
			case EamodelPackage.EA_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM__IS_LOCKED:
				setIsLocked(IS_LOCKED_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM__SWIMLANES:
				setSwimlanes(SWIMLANES_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM__PACKAGE:
				setPackage((EAPackage)null);
				return;
			case EamodelPackage.EA_DIAGRAM__EA_LINK:
				setEaLink(EA_LINK_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM__DIAGRAM_LINKS:
				getDiagramLinks().clear();
				return;
			case EamodelPackage.EA_DIAGRAM__DIAGRAM_OBJECTS:
				getDiagramObjects().clear();
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
			case EamodelPackage.EA_DIAGRAM__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case EamodelPackage.EA_DIAGRAM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EamodelPackage.EA_DIAGRAM__REPOSITORY:
				return isSetRepository();
			case EamodelPackage.EA_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EamodelPackage.EA_DIAGRAM__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case EamodelPackage.EA_DIAGRAM__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case EamodelPackage.EA_DIAGRAM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EamodelPackage.EA_DIAGRAM__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case EamodelPackage.EA_DIAGRAM__IS_LOCKED:
				return IS_LOCKED_EDEFAULT == null ? isLocked != null : !IS_LOCKED_EDEFAULT.equals(isLocked);
			case EamodelPackage.EA_DIAGRAM__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case EamodelPackage.EA_DIAGRAM__HAS_DSTEREOTYPE:
				return HAS_DSTEREOTYPE_EDEFAULT == null ? getHasDStereotype() != null : !HAS_DSTEREOTYPE_EDEFAULT.equals(getHasDStereotype());
			case EamodelPackage.EA_DIAGRAM__SWIMLANES:
				return SWIMLANES_EDEFAULT == null ? swimlanes != null : !SWIMLANES_EDEFAULT.equals(swimlanes);
			case EamodelPackage.EA_DIAGRAM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EamodelPackage.EA_DIAGRAM__PACKAGE:
				return getPackage() != null;
			case EamodelPackage.EA_DIAGRAM__EA_LINK:
				return EA_LINK_EDEFAULT == null ? eaLink != null : !EA_LINK_EDEFAULT.equals(eaLink);
			case EamodelPackage.EA_DIAGRAM__DIAGRAM_LINKS:
				return diagramLinks != null && !diagramLinks.isEmpty();
			case EamodelPackage.EA_DIAGRAM__DIAGRAM_OBJECTS:
				return diagramObjects != null && !diagramObjects.isEmpty();
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
		if (baseClass == EAStereotypedElement.class) {
			switch (derivedFeatureID) {
				case EamodelPackage.EA_DIAGRAM__STEREOTYPE: return AbstracthierachyPackage.EA_STEREOTYPED_ELEMENT__STEREOTYPE;
				case EamodelPackage.EA_DIAGRAM__HAS_DSTEREOTYPE: return AbstracthierachyPackage.EA_STEREOTYPED_ELEMENT__HAS_DSTEREOTYPE;
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
		if (baseClass == EAStereotypedElement.class) {
			switch (baseFeatureID) {
				case AbstracthierachyPackage.EA_STEREOTYPED_ELEMENT__STEREOTYPE: return EamodelPackage.EA_DIAGRAM__STEREOTYPE;
				case AbstracthierachyPackage.EA_STEREOTYPED_ELEMENT__HAS_DSTEREOTYPE: return EamodelPackage.EA_DIAGRAM__HAS_DSTEREOTYPE;
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
		result.append(", version: ");
		result.append(getVersion());
		result.append(", author: ");
		result.append(getAuthor());
		result.append(", isLocked: ");
		result.append(getIsLocked());
		result.append(", stereotype: ");
		result.append(getStereotype());
		result.append(", swimlanes: ");
		result.append(getSwimlanes());
		result.append(", type: ");
		result.append(getType());
		result.append(", eaLink: ");
		result.append(getEaLink());
		result.append(')');
		return result.toString();
	}

	/**
	 * Update EA Link only if not under version control!
	 * @generated
	 */
	private boolean updateEaLink(Diagram eaLink) {
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

} //EADiagramImpl