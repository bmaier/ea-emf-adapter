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
import org.eclipselabs.eaadapter.model.EADiagramObject;
import org.eclipselabs.eaadapter.model.EAElement;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.sparx.Collection;
import org.sparx.DiagramObject;
import org.sparx.Element;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getElementID <em>Element ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getTop <em>Top</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl#getEaLink <em>Ea Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EADiagramObjectImpl extends EObjectImpl implements EADiagramObject {
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
	 * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected Integer bottom = null;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EAElement element = null;

	/**
	 * This is true if the Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elementESet = false;

	/**
	 * The default value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementID() <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementID()
	 * @generated
	 * @ordered
	 */
	protected Integer elementID = null;

	/**
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Integer left = null;

	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Integer right = null;

	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected Integer sequence = null;

	/**
	 * The default value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected Integer top = null;

	/**
	 * The default value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final DiagramObject EA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected DiagramObject eaLink = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EADiagramObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.EA_DIAGRAM_OBJECT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_DIAGRAM_OBJECT__REPOSITORY, oldRepository, repository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_OBJECT__REPOSITORY, oldRepository, repository, !oldRepositoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_DIAGRAM_OBJECT__REPOSITORY, oldRepository, null, oldRepositoryESet));
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
	public Integer getBottom() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && bottom != null) return bottom;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				bottom = eaLink.GetBottom();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return bottom;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(Integer newBottom) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newBottom != null && newBottom.equals(bottom)) return;
				// update EA link
				try {
					eaLink.SetBottom(newBottom);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_OBJECT__BOTTOM, oldBottom, bottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (EAElement)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT, oldElement, element));
			}
		}
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && element != null) return element;

		if (eaLink == null) {
			// if readonly is switched on, create a dummy emf object
			if (repository == null || repository.getReadonlyEaLink()) {
				if (element == null) { 
					element = EamodelFactory.eINSTANCE.createEAElement();
					element.setRepository(repository);
					elementESet = true;
				}
				return element;
			} else return null;
		} 
		// synchronize emf object with ea object
		try {
			if (element == null) {
				Element eaElement = getElementReference();
				if (eaElement != null) {
					// the emf object may not be initialized, so lets catch the nullpointer if it fails...
					try {
						Object o = eResource().getEObject(eaElement.GetElementGUID());
						// if o is null, the element may be out of scope so we ingore it.
						if (o != null) element = (EAElement)o;
					} catch (NullPointerException e) {
					}
					elementESet = element != null;
				}
			} else {
				Element eaElement = getElementReference();
				if (eaElement == null) {
					// if you get an error, that method unsetElement() is undefined, you need to set the feature element unsettable in your model.
					unsetElement();
				}
			}
		} catch (Exception e) {
			if (eaLink == null)
				EAUtil.getLogger(getClass()).error("EA Link is null!", e);
			else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
		}
		// return value
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Element getElementReference() {
		int elementID = eaLink.GetElementID();
		if (elementID > 0 && repository != null)
			return repository.getEaLink().GetElementByID(elementID);
		else return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement basicGetElement() {
		return element;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EAElement newElement) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				if (eaLink == null) return;
				// Set new reference in ea model. Return if it fails.
				try {
					if (!setElementReference(newElement))
						throw new UnsupportedOperationException("Cannot update Element reference in ea model!");
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
		EAElement oldElement = element;
		element = newElement;
		boolean oldElementESet = elementESet;
		elementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT, oldElement, element, !oldElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean setElementReference(EAElement newElement) {
		eaLink.SetElementID(newElement.getEaLink().GetElementID());
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElement() {
		EAElement oldElement = element;
		boolean oldElementESet = elementESet;
		element = null;
		elementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT, oldElement, null, oldElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElement() {
		return elementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getElementID() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && elementID != null) return elementID;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				elementID = eaLink.GetElementID();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return elementID;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementID(Integer newElementID) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newElementID != null && newElementID.equals(elementID)) return;
				// update EA link
				try {
					eaLink.SetElementID(newElementID);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldElementID = elementID;
		elementID = newElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT_ID, oldElementID, elementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLeft() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && left != null) return left;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				left = eaLink.GetLeft();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return left;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Integer newLeft) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newLeft != null && newLeft.equals(left)) return;
				// update EA link
				try {
					eaLink.SetLeft(newLeft);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_OBJECT__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRight() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && right != null) return right;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				right = eaLink.GetRight();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return right;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Integer newRight) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newRight != null && newRight.equals(right)) return;
				// update EA link
				try {
					eaLink.SetRight(newRight);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_OBJECT__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSequence() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && sequence != null) return sequence;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				sequence = eaLink.GetSequence();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return sequence;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Integer newSequence) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newSequence != null && newSequence.equals(sequence)) return;
				// update EA link
				try {
					eaLink.SetSequence(newSequence);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_OBJECT__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTop() {
		// if value was already fetched, use the old one.
		if (getRepository() != null && repository.getCaching() && top != null) return top;
		// fetch value from ea model if adapter link is present
		if (eaLink != null) {
			try {
				top = eaLink.GetTop();
			} catch (Exception e) {
				EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
			}
		}
		// return value
		return top;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(Integer newTop) {
		if (repository != null) {
			if (!repository.getReadonlyEaLink()) {
				// (if you get an error here, that eaLink cannot be resolved, you need to add that attribute to the model)
				if (eaLink == null) return;
				if (newTop != null && newTop.equals(top)) return;
				// update EA link
				try {
					eaLink.SetTop(newTop);
					if (!eaLink.Update()) return;
				} catch (Exception e) {
					if (eaLink == null)
						EAUtil.getLogger(getClass()).error("EA Link is null!", e);
					else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				}
			}
		}
		// update emf object
		Integer oldTop = top;
		top = newTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_OBJECT__TOP, oldTop, top));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramObject getEaLink() {
		// return value
		return eaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaLink(DiagramObject newEaLink) {
		// check if any setter was called previously to transfer values to the corresponding ea object...
		if (bottom != null) newEaLink.SetBottom(bottom);
		if (elementID != null) newEaLink.SetElementID(elementID);
		if (left != null) newEaLink.SetLeft(left);
		if (right != null) newEaLink.SetRight(right);
		if (sequence != null) newEaLink.SetSequence(sequence);
		if (top != null) newEaLink.SetTop(top); 
		newEaLink.Update();
		// update emf object
		DiagramObject oldEaLink = eaLink;
		eaLink = newEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_DIAGRAM_OBJECT__EA_LINK, oldEaLink, eaLink));
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
			DiagramObject newEaLink = (DiagramObject)collection.AddNew("", "");
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
			case EamodelPackage.EA_DIAGRAM_OBJECT__OBJECT_TYPE:
				return getObjectType();
			case EamodelPackage.EA_DIAGRAM_OBJECT__ID:
				return getId();
			case EamodelPackage.EA_DIAGRAM_OBJECT__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case EamodelPackage.EA_DIAGRAM_OBJECT__BOTTOM:
				return getBottom();
			case EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT_ID:
				return getElementID();
			case EamodelPackage.EA_DIAGRAM_OBJECT__LEFT:
				return getLeft();
			case EamodelPackage.EA_DIAGRAM_OBJECT__RIGHT:
				return getRight();
			case EamodelPackage.EA_DIAGRAM_OBJECT__SEQUENCE:
				return getSequence();
			case EamodelPackage.EA_DIAGRAM_OBJECT__TOP:
				return getTop();
			case EamodelPackage.EA_DIAGRAM_OBJECT__EA_LINK:
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
			case EamodelPackage.EA_DIAGRAM_OBJECT__REPOSITORY:
				setRepository((EARepository)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__BOTTOM:
				setBottom((Integer)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT:
				setElement((EAElement)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT_ID:
				setElementID((Integer)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__LEFT:
				setLeft((Integer)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__RIGHT:
				setRight((Integer)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__SEQUENCE:
				setSequence((Integer)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__TOP:
				setTop((Integer)newValue);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__EA_LINK:
				setEaLink((DiagramObject)newValue);
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
			case EamodelPackage.EA_DIAGRAM_OBJECT__REPOSITORY:
				unsetRepository();
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__BOTTOM:
				setBottom(BOTTOM_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT:
				unsetElement();
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT_ID:
				setElementID(ELEMENT_ID_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__RIGHT:
				setRight(RIGHT_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__TOP:
				setTop(TOP_EDEFAULT);
				return;
			case EamodelPackage.EA_DIAGRAM_OBJECT__EA_LINK:
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
			case EamodelPackage.EA_DIAGRAM_OBJECT__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case EamodelPackage.EA_DIAGRAM_OBJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EamodelPackage.EA_DIAGRAM_OBJECT__REPOSITORY:
				return isSetRepository();
			case EamodelPackage.EA_DIAGRAM_OBJECT__BOTTOM:
				return BOTTOM_EDEFAULT == null ? bottom != null : !BOTTOM_EDEFAULT.equals(bottom);
			case EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT:
				return isSetElement();
			case EamodelPackage.EA_DIAGRAM_OBJECT__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementID != null : !ELEMENT_ID_EDEFAULT.equals(elementID);
			case EamodelPackage.EA_DIAGRAM_OBJECT__LEFT:
				return LEFT_EDEFAULT == null ? left != null : !LEFT_EDEFAULT.equals(left);
			case EamodelPackage.EA_DIAGRAM_OBJECT__RIGHT:
				return RIGHT_EDEFAULT == null ? right != null : !RIGHT_EDEFAULT.equals(right);
			case EamodelPackage.EA_DIAGRAM_OBJECT__SEQUENCE:
				return SEQUENCE_EDEFAULT == null ? sequence != null : !SEQUENCE_EDEFAULT.equals(sequence);
			case EamodelPackage.EA_DIAGRAM_OBJECT__TOP:
				return TOP_EDEFAULT == null ? top != null : !TOP_EDEFAULT.equals(top);
			case EamodelPackage.EA_DIAGRAM_OBJECT__EA_LINK:
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
		result.append(", bottom: ");
		result.append(getBottom());
		result.append(", elementID: ");
		result.append(getElementID());
		result.append(", left: ");
		result.append(getLeft());
		result.append(", right: ");
		result.append(getRight());
		result.append(", sequence: ");
		result.append(getSequence());
		result.append(", top: ");
		result.append(getTop());
		result.append(", eaLink: ");
		result.append(getEaLink());
		result.append(')');
		return result.toString();
	}

} //EADiagramObjectImpl