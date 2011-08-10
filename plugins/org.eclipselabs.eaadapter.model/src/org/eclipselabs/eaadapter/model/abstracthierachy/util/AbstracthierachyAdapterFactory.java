/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage
 * @generated
 */
public class AbstracthierachyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstracthierachyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstracthierachyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstracthierachyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstracthierachySwitch<Adapter> modelSwitch =
		new AbstracthierachySwitch<Adapter>() {
			@Override
			public Adapter caseEAAbstractPackage(EAAbstractPackage object) {
				return createEAAbstractPackageAdapter();
			}
			@Override
			public Adapter caseEABaseClass(EABaseClass object) {
				return createEABaseClassAdapter();
			}
			@Override
			public Adapter caseEAClassifierIDLong(EAClassifierIDLong object) {
				return createEAClassifierIDLongAdapter();
			}
			@Override
			public Adapter caseEAModifiableElement(EAModifiableElement object) {
				return createEAModifiableElementAdapter();
			}
			@Override
			public Adapter caseEANamedElement(EANamedElement object) {
				return createEANamedElementAdapter();
			}
			@Override
			public Adapter caseEAOwnedElement(EAOwnedElement object) {
				return createEAOwnedElementAdapter();
			}
			@Override
			public Adapter caseEAStereotypedElement(EAStereotypedElement object) {
				return createEAStereotypedElementAdapter();
			}
			@Override
			public Adapter caseEATaggedElement(EATaggedElement object) {
				return createEATaggedElementAdapter();
			}
			@Override
			public Adapter caseEATypedElement(EATypedElement object) {
				return createEATypedElementAdapter();
			}
			@Override
			public Adapter caseEAVersiondElement(EAVersiondElement object) {
				return createEAVersiondElementAdapter();
			}
			@Override
			public Adapter caseEAVisibilityElement(EAVisibilityElement object) {
				return createEAVisibilityElementAdapter();
			}
			@Override
			public Adapter caseEAMovableElement(EAMovableElement object) {
				return createEAMovableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage <em>EA Abstract Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage
	 * @generated
	 */
	public Adapter createEAAbstractPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass <em>EA Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass
	 * @generated
	 */
	public Adapter createEABaseClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong <em>EA Classifier ID Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong
	 * @generated
	 */
	public Adapter createEAClassifierIDLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement <em>EA Modifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement
	 * @generated
	 */
	public Adapter createEAModifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement <em>EA Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement
	 * @generated
	 */
	public Adapter createEANamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement <em>EA Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement
	 * @generated
	 */
	public Adapter createEAOwnedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement <em>EA Stereotyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement
	 * @generated
	 */
	public Adapter createEAStereotypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement <em>EA Tagged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement
	 * @generated
	 */
	public Adapter createEATaggedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement <em>EA Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement
	 * @generated
	 */
	public Adapter createEATypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement <em>EA Versiond Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement
	 * @generated
	 */
	public Adapter createEAVersiondElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement <em>EA Visibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement
	 * @generated
	 */
	public Adapter createEAVisibilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement <em>EA Movable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement
	 * @generated
	 */
	public Adapter createEAMovableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AbstracthierachyAdapterFactory
