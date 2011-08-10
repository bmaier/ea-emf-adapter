/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipselabs.eaadapter.model.EAConnector;
import org.eclipselabs.eaadapter.model.EADiagramLink;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.sparx.Collection;
import org.sparx.Connector;
import org.sparx.DiagramLink;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Diagram Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl#getIsHidden <em>Is Hidden</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl#getEaLink <em>Ea Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EADiagramLinkImpl extends EObjectImpl implements EADiagramLink {
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
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EAConnector connector = null;

	/**
	 * This is true if the Connector reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectorESet = false;

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
	 * The default value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected String geometry = null;

	/**
	 * The default value of the '{@link #getIsHidden() <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHidden()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_HIDDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsHidden() <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHidden()
	 * @generated
	 * @ordered
	 */
	protected Boolean isHidden = null;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = null;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = null;

	/**
	 * The default value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final DiagramLink EA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected DiagramLink eaLink = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EADiagramLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.EA_DIAGRAM_LINK;
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
				id = eaLink.GetInstanceID();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_DIAGRAM_LINK__REPOSITORY, oldRepository, repository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_LINK__REPOSITORY, oldRepository, repository, !oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_DIAGRAM_LINK__REPOSITORY, oldRepository, null, oldRepositoryESet));
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
	public EAConnector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject)connector;
			connector = (EAConnector)eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR, oldConnector, connector));
			}
		}
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && connector != null) return connector;

		if (eaLink == null) {
			// if readonly is switched on, create a dummy emf object
			if (repository == null || repository.getReadonlyEaLink()) {
				if (connector == null) { 
					connector = EamodelFactory.eINSTANCE.createEAConnector();
					connector.setRepository(repository);
					connectorESet = true;
				}
				return connector;
			} else return null;
		} 
		// synchronize emf object with ea object
		try {
			if (connector == null) {
				Connector eaConnector = getConnectorReference();
				if (eaConnector != null) {
					// the emf object may not be initialized, so lets catch the nullpointer if it fails...
					try {
						Object o = eResource().getEObject(eaConnector.GetConnectorGUID());
						// if o is null, the element may be out of scope so we ingore it.
						if (o != null) connector = (EAConnector)o;
					} catch (NullPointerException e) {
					}
					connectorESet = connector != null;
				}
			} else {
				Connector eaConnector = getConnectorReference();
				if (eaConnector == null) {
					// if you get an error, that method unsetConnector() is undefined, you need to set the feature connector unsettable in your model.
					unsetConnector();
				}
			}
		} catch (Exception e) {
			if (eaLink == null)
				EAUtil.getLogger(getClass()).error("EA Link is null!", e);
			else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
		}
		// return value
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Connector getConnectorReference() {
		int connectorID = eaLink.GetConnectorID();
		if (connectorID > 0 && repository != null)
			return repository.getEaLink().GetConnectorByID(connectorID);
		else return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAConnector basicGetConnector() {
		return connector;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(EAConnector newConnector) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				if (eaLink == null) return;
				// Set new reference in ea model. Return if it fails.
				try {
					if (!setConnectorReference(newConnector))
						throw new UnsupportedOperationException("Cannot update Connector reference in ea model!");
					eaLink.Update();
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
					return;
				}
			}
		}
		// update emf reference
		EAConnector oldConnector = connector;
		connector = newConnector;
		boolean oldConnectorESet = connectorESet;
		connectorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR, oldConnector, connector, !oldConnectorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean setConnectorReference(EAConnector newConnector) {
		eaLink.SetConnectorID(newConnector.getEaLink().GetConnectorID());
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnector() {
		EAConnector oldConnector = connector;
		boolean oldConnectorESet = connectorESet;
		connector = null;
		connectorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR, oldConnector, null, oldConnectorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnector() {
		return connectorESet;
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
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorID(Integer newConnectorID) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newConnectorID != null && newConnectorID.equals(connectorID)) return;
				// update EA link
				try {
					eaLink.SetConnectorID(newConnectorID);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldConnectorID = connectorID;
		connectorID = newConnectorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR_ID, oldConnectorID, connectorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometry() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && geometry != null) return geometry;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				geometry = eaLink.GetGeometry();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return geometry;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(String newGeometry) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newGeometry != null && newGeometry.equals(geometry)) return;
				// update EA link
				try {
					eaLink.SetGeometry(newGeometry);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_LINK__GEOMETRY, oldGeometry, geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsHidden() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isHidden != null) return isHidden;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isHidden = eaLink.GetIsHidden();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isHidden;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHidden(Boolean newIsHidden) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsHidden != null && newIsHidden.equals(isHidden)) return;
				// update EA link
				try {
					eaLink.SetIsHidden(newIsHidden);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsHidden = isHidden;
		isHidden = newIsHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_LINK__IS_HIDDEN, oldIsHidden, isHidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && path != null) return path;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				path = eaLink.GetPath();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return path;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newPath != null && newPath.equals(path)) return;
				// update EA link
				try {
					eaLink.SetPath(newPath);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_LINK__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && style != null) return style;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				style = eaLink.GetStyle();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return style;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newStyle != null && newStyle.equals(style)) return;
				// update EA link
				try {
					eaLink.SetStyle(newStyle);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_LINK__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramLink getEaLink() {
		// return value
		return eaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaLink(DiagramLink newEaLink) {
		// check if any setter was called previously to transfer values to the corresponding ea object...
		if (connectorID != null) newEaLink.SetConnectorID(connectorID);
		if (geometry != null) newEaLink.SetGeometry(geometry);
		if (isHidden != null) newEaLink.SetIsHidden(isHidden);
		if (path != null) newEaLink.SetPath(path);
		if (style != null) newEaLink.SetStyle(style); 
		newEaLink.Update();
		// update emf object
		DiagramLink oldEaLink = eaLink;
		eaLink = newEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_LINK__EA_LINK, oldEaLink, eaLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public Boolean initializeAdapter(Collection collection) {
		// return if already initialized
		if (eaLink != null) return true;
		
		try {
		
			// set default values; use setter for emf notification
            
			// set ea link and transfer all values
			DiagramLink newEaLink = (DiagramLink)collection.AddNew("", "");
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
	@SuppressWarnings("rawtypes")
	public Boolean deleteAdapter(Collection collection) {
		// unused
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EamodelPackage.EA_DIAGRAM_LINK__OBJECT_TYPE:
				return getObjectType();
			case EamodelPackage.EA_DIAGRAM_LINK__ID:
				return getId();
			case EamodelPackage.EA_DIAGRAM_LINK__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR_ID:
				return getConnectorID();
			case EamodelPackage.EA_DIAGRAM_LINK__GEOMETRY:
				return getGeometry();
			case EamodelPackage.EA_DIAGRAM_LINK__IS_HIDDEN:
				return getIsHidden();
			case EamodelPackage.EA_DIAGRAM_LINK__PATH:
				return getPath();
			case EamodelPackage.EA_DIAGRAM_LINK__STYLE:
				return getStyle();
			case EamodelPackage.EA_DIAGRAM_LINK__EA_LINK:
				return getEaLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EamodelPackage.EA_DIAGRAM_LINK__REPOSITORY:
				setRepository((EARepository)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR:
				setConnector((EAConnector)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR_ID:
				setConnectorID((Integer)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__GEOMETRY:
				setGeometry((String)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__IS_HIDDEN:
				setIsHidden((Boolean)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__PATH:
				setPath((String)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__STYLE:
				setStyle((String)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__EA_LINK:
				setEaLink((DiagramLink)newValue);
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
			case EamodelPackage.EA_DIAGRAM_LINK__REPOSITORY:
				unsetRepository();
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR:
				unsetConnector();
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR_ID:
				setConnectorID(CONNECTOR_ID_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__GEOMETRY:
				setGeometry(GEOMETRY_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__IS_HIDDEN:
				setIsHidden(IS_HIDDEN_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_LINK__EA_LINK:
				setEaLink(EA_LINK_EDEFAULT);
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
			case EamodelPackage.EA_DIAGRAM_LINK__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case EamodelPackage.EA_DIAGRAM_LINK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EamodelPackage.EA_DIAGRAM_LINK__REPOSITORY:
				return isSetRepository();
			case EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR:
				return isSetConnector();
			case EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR_ID:
				return CONNECTOR_ID_EDEFAULT == null ? connectorID != null : !CONNECTOR_ID_EDEFAULT.equals(connectorID);
			case EamodelPackage.EA_DIAGRAM_LINK__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
			case EamodelPackage.EA_DIAGRAM_LINK__IS_HIDDEN:
				return IS_HIDDEN_EDEFAULT == null ? isHidden != null : !IS_HIDDEN_EDEFAULT.equals(isHidden);
			case EamodelPackage.EA_DIAGRAM_LINK__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case EamodelPackage.EA_DIAGRAM_LINK__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case EamodelPackage.EA_DIAGRAM_LINK__EA_LINK:
				return EA_LINK_EDEFAULT == null ? eaLink != null : !EA_LINK_EDEFAULT.equals(eaLink);
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
		result.append(", connectorID: ");
		result.append(getConnectorID());
		result.append(", geometry: ");
		result.append(getGeometry());
		result.append(", isHidden: ");
		result.append(getIsHidden());
		result.append(", path: ");
		result.append(getPath());
		result.append(", style: ");
		result.append(getStyle());
		result.append(", eaLink: ");
		result.append(getEaLink());
		result.append(')');
		return result.toString();
	}

} //EADiagramLinkImpl