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
import org.eclipselabs.eaadapter.model.EAConnectorEnd;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.sparx.Collection;
import org.sparx.ConnectorEnd;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EAConnectorEndImpl extends EObjectImpl implements EAConnectorEnd {
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
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AGGREGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected Integer aggregation = null;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = null;

	/**
	 * The default value of the '{@link #getContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINMENT_EDEFAULT = "Unspecified";

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
	 * The default value of the '{@link #getIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NAVIGABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNavigable = null;

	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = null;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = null;

	/**
	 * The default value of the '{@link #getRoleType() <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleType() <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected String roleType = null;

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
	 * The default value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorEnd EA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected ConnectorEnd eaLink = null;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORDERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected Integer ordering = null;

	/**
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected String qualifier = null;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAConnectorEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.EA_CONNECTOR_END;
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
				id = 1;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_CONNECTOR_END__REPOSITORY, oldRepository, repository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__REPOSITORY, oldRepository, repository, !oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_CONNECTOR_END__REPOSITORY, oldRepository, null, oldRepositoryESet));
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
	public Integer getAggregation() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && aggregation != null) return aggregation;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				aggregation = eaLink.GetAggregation();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return aggregation;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(Integer newAggregation) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newAggregation != null && newAggregation.equals(aggregation)) return;
				// update EA link
				try {
					eaLink.SetAggregation(newAggregation);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldAggregation = aggregation;
		aggregation = newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__AGGREGATION, oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinality() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && cardinality != null) return cardinality;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				cardinality = eaLink.GetCardinality();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return cardinality;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newCardinality != null && newCardinality.equals(cardinality)) return;
				// update EA link
				try {
					eaLink.SetCardinality(newCardinality);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__CARDINALITY, oldCardinality, cardinality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__CONTAINMENT, oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNavigable() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && isNavigable != null) return isNavigable;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				isNavigable = eaLink.GetIsNavigable();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return isNavigable;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigable(Boolean newIsNavigable) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newIsNavigable != null && newIsNavigable.equals(isNavigable)) return;
				// update EA link
				try {
					eaLink.SetIsNavigable(newIsNavigable);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Boolean oldIsNavigable = isNavigable;
		isNavigable = newIsNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__IS_NAVIGABLE, oldIsNavigable, isNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && note != null) return note;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				note = eaLink.GetRoleNote();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return note;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newNote != null && newNote.equals(note)) return;
				// update EA link
				try {
					eaLink.SetRoleNote(newNote);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && role != null) return role;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				role = eaLink.GetRole();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return role;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newRole != null && newRole.equals(role)) return;
				// update EA link
				try {
					eaLink.SetRole(newRole);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleType() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && roleType != null) return roleType;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				roleType = eaLink.GetRoleType();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return roleType;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleType(String newRoleType) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newRoleType != null && newRoleType.equals(roleType)) return;
				// update EA link
				try {
					eaLink.SetRoleType(newRoleType);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldRoleType = roleType;
		roleType = newRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__ROLE_TYPE, oldRoleType, roleType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__STEREOTYPE, oldStereotype, stereotype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd getEaLink() {
		// return value
		return eaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaLink(ConnectorEnd newEaLink) {
		ConnectorEnd oldEaLink = eaLink;
		eaLink = newEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__EA_LINK, oldEaLink, eaLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOrdering() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && ordering != null) return ordering;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				ordering = eaLink.GetOrdering();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return ordering;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(Integer newOrdering) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newOrdering != null && newOrdering.equals(ordering)) return;
				// update EA link
				try {
					eaLink.SetOrdering(newOrdering);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldOrdering = ordering;
		ordering = newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifier() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && qualifier != null) return qualifier;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				qualifier = eaLink.GetQualifier();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return qualifier;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(String newQualifier) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newQualifier != null && newQualifier.equals(qualifier)) return;
				// update EA link
				try {
					eaLink.SetQualifier(newQualifier);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		String oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_CONNECTOR_END__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && end != null) return end;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				end = eaLink.GetEnd();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return end;
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
			if (containment == null) setContainment("Unspecified");
			if (visibility == null) setVisibility("Public");
            
			// set ea link and transfer all values
			ConnectorEnd newEaLink = (ConnectorEnd)collection.AddNew("", "");
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
			case EamodelPackage.EA_CONNECTOR_END__OBJECT_TYPE:
				return getObjectType();
			case EamodelPackage.EA_CONNECTOR_END__ID:
				return getId();
			case EamodelPackage.EA_CONNECTOR_END__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case EamodelPackage.EA_CONNECTOR_END__AGGREGATION:
				return getAggregation();
			case EamodelPackage.EA_CONNECTOR_END__CARDINALITY:
				return getCardinality();
			case EamodelPackage.EA_CONNECTOR_END__CONTAINMENT:
				return getContainment();
			case EamodelPackage.EA_CONNECTOR_END__IS_NAVIGABLE:
				return getIsNavigable();
			case EamodelPackage.EA_CONNECTOR_END__NOTE:
				return getNote();
			case EamodelPackage.EA_CONNECTOR_END__ROLE:
				return getRole();
			case EamodelPackage.EA_CONNECTOR_END__ROLE_TYPE:
				return getRoleType();
			case EamodelPackage.EA_CONNECTOR_END__STEREOTYPE:
				return getStereotype();
			case EamodelPackage.EA_CONNECTOR_END__VISIBILITY:
				return getVisibility();
			case EamodelPackage.EA_CONNECTOR_END__EA_LINK:
				return getEaLink();
			case EamodelPackage.EA_CONNECTOR_END__ORDERING:
				return getOrdering();
			case EamodelPackage.EA_CONNECTOR_END__QUALIFIER:
				return getQualifier();
			case EamodelPackage.EA_CONNECTOR_END__END:
				return getEnd();
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
			case EamodelPackage.EA_CONNECTOR_END__REPOSITORY:
				setRepository((EARepository)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__AGGREGATION:
				setAggregation((Integer)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__CARDINALITY:
				setCardinality((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__CONTAINMENT:
				setContainment((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__IS_NAVIGABLE:
				setIsNavigable((Boolean)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__NOTE:
				setNote((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__ROLE:
				setRole((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__ROLE_TYPE:
				setRoleType((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__EA_LINK:
				setEaLink((ConnectorEnd)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__ORDERING:
				setOrdering((Integer)newValue);
				return;
			case EamodelPackage.EA_CONNECTOR_END__QUALIFIER:
				setQualifier((String)newValue);
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
			case EamodelPackage.EA_CONNECTOR_END__REPOSITORY:
				unsetRepository();
				return;
			case EamodelPackage.EA_CONNECTOR_END__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__IS_NAVIGABLE:
				setIsNavigable(IS_NAVIGABLE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__NOTE:
				setNote(NOTE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__ROLE_TYPE:
				setRoleType(ROLE_TYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__EA_LINK:
				setEaLink(EA_LINK_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case EamodelPackage.EA_CONNECTOR_END__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
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
			case EamodelPackage.EA_CONNECTOR_END__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case EamodelPackage.EA_CONNECTOR_END__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EamodelPackage.EA_CONNECTOR_END__REPOSITORY:
				return isSetRepository();
			case EamodelPackage.EA_CONNECTOR_END__AGGREGATION:
				return AGGREGATION_EDEFAULT == null ? aggregation != null : !AGGREGATION_EDEFAULT.equals(aggregation);
			case EamodelPackage.EA_CONNECTOR_END__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case EamodelPackage.EA_CONNECTOR_END__CONTAINMENT:
				return CONTAINMENT_EDEFAULT == null ? containment != null : !CONTAINMENT_EDEFAULT.equals(containment);
			case EamodelPackage.EA_CONNECTOR_END__IS_NAVIGABLE:
				return IS_NAVIGABLE_EDEFAULT == null ? isNavigable != null : !IS_NAVIGABLE_EDEFAULT.equals(isNavigable);
			case EamodelPackage.EA_CONNECTOR_END__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
			case EamodelPackage.EA_CONNECTOR_END__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case EamodelPackage.EA_CONNECTOR_END__ROLE_TYPE:
				return ROLE_TYPE_EDEFAULT == null ? roleType != null : !ROLE_TYPE_EDEFAULT.equals(roleType);
			case EamodelPackage.EA_CONNECTOR_END__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case EamodelPackage.EA_CONNECTOR_END__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case EamodelPackage.EA_CONNECTOR_END__EA_LINK:
				return EA_LINK_EDEFAULT == null ? eaLink != null : !EA_LINK_EDEFAULT.equals(eaLink);
			case EamodelPackage.EA_CONNECTOR_END__ORDERING:
				return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
			case EamodelPackage.EA_CONNECTOR_END__QUALIFIER:
				return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
			case EamodelPackage.EA_CONNECTOR_END__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
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
		result.append(", aggregation: ");
		result.append(getAggregation());
		result.append(", cardinality: ");
		result.append(getCardinality());
		result.append(", containment: ");
		result.append(getContainment());
		result.append(", isNavigable: ");
		result.append(getIsNavigable());
		result.append(", note: ");
		// remove line breaks
		result.append(getNote() == null ? note : note.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r"));
		result.append(", role: ");
		result.append(getRole());
		result.append(", roleType: ");
		result.append(getRoleType());
		result.append(", stereotype: ");
		result.append(getStereotype());
		result.append(", visibility: ");
		result.append(getVisibility());
		result.append(", eaLink: ");
		result.append(getEaLink());
		result.append(", ordering: ");
		result.append(getOrdering());
		result.append(", qualifier: ");
		result.append(getQualifier());
		result.append(", end: ");
		result.append(getEnd());
		result.append(')');
		return result.toString();
	}

} //EAConnectorEndImpl