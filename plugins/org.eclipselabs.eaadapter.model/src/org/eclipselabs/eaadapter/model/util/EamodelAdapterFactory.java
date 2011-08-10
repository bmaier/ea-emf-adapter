/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.eaadapter.model.EAAttribute;
import org.eclipselabs.eaadapter.model.EAAttributeTag;
import org.eclipselabs.eaadapter.model.EAConnector;
import org.eclipselabs.eaadapter.model.EAConnectorEnd;
import org.eclipselabs.eaadapter.model.EAConnectorTag;
import org.eclipselabs.eaadapter.model.EADiagram;
import org.eclipselabs.eaadapter.model.EADiagramLink;
import org.eclipselabs.eaadapter.model.EADiagramObject;
import org.eclipselabs.eaadapter.model.EAElement;
import org.eclipselabs.eaadapter.model.EAMethod;
import org.eclipselabs.eaadapter.model.EAMethodTag;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EAParameter;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EATaggedValue;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.Filter;
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
 * @see org.eclipselabs.eaadapter.model.EamodelPackage
 * @generated
 */
public class EamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EamodelPackage.eINSTANCE;
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
	protected EamodelSwitch<Adapter> modelSwitch =
		new EamodelSwitch<Adapter>() {
			@Override
			public Adapter caseEAAttribute(EAAttribute object) {
				return createEAAttributeAdapter();
			}
			@Override
			public Adapter caseEAAttributeTag(EAAttributeTag object) {
				return createEAAttributeTagAdapter();
			}
			@Override
			public Adapter caseEAConnector(EAConnector object) {
				return createEAConnectorAdapter();
			}
			@Override
			public Adapter caseEAConnectorEnd(EAConnectorEnd object) {
				return createEAConnectorEndAdapter();
			}
			@Override
			public Adapter caseEAConnectorTag(EAConnectorTag object) {
				return createEAConnectorTagAdapter();
			}
			@Override
			public Adapter caseEADiagram(EADiagram object) {
				return createEADiagramAdapter();
			}
			@Override
			public Adapter caseEADiagramLink(EADiagramLink object) {
				return createEADiagramLinkAdapter();
			}
			@Override
			public Adapter caseEADiagramObject(EADiagramObject object) {
				return createEADiagramObjectAdapter();
			}
			@Override
			public Adapter caseEAElement(EAElement object) {
				return createEAElementAdapter();
			}
			@Override
			public Adapter caseEAMethod(EAMethod object) {
				return createEAMethodAdapter();
			}
			@Override
			public Adapter caseEAMethodTag(EAMethodTag object) {
				return createEAMethodTagAdapter();
			}
			@Override
			public Adapter caseEAPackage(EAPackage object) {
				return createEAPackageAdapter();
			}
			@Override
			public Adapter caseEAParameter(EAParameter object) {
				return createEAParameterAdapter();
			}
			@Override
			public Adapter caseEARepository(EARepository object) {
				return createEARepositoryAdapter();
			}
			@Override
			public Adapter caseEATaggedValue(EATaggedValue object) {
				return createEATaggedValueAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseEABaseClass(EABaseClass object) {
				return createEABaseClassAdapter();
			}
			@Override
			public Adapter caseEANamedElement(EANamedElement object) {
				return createEANamedElementAdapter();
			}
			@Override
			public Adapter caseEAStereotypedElement(EAStereotypedElement object) {
				return createEAStereotypedElementAdapter();
			}
			@Override
			public Adapter caseEATypedElement(EATypedElement object) {
				return createEATypedElementAdapter();
			}
			@Override
			public Adapter caseEAVisibilityElement(EAVisibilityElement object) {
				return createEAVisibilityElementAdapter();
			}
			@Override
			public Adapter caseEAModifiableElement(EAModifiableElement object) {
				return createEAModifiableElementAdapter();
			}
			@Override
			public Adapter caseEAClassifierIDLong(EAClassifierIDLong object) {
				return createEAClassifierIDLongAdapter();
			}
			@Override
			public Adapter caseEATaggedElement(EATaggedElement object) {
				return createEATaggedElementAdapter();
			}
			@Override
			public Adapter caseEAMovableElement(EAMovableElement object) {
				return createEAMovableElementAdapter();
			}
			@Override
			public Adapter caseEAVersiondElement(EAVersiondElement object) {
				return createEAVersiondElementAdapter();
			}
			@Override
			public Adapter caseEAOwnedElement(EAOwnedElement object) {
				return createEAOwnedElementAdapter();
			}
			@Override
			public Adapter caseEAAbstractPackage(EAAbstractPackage object) {
				return createEAAbstractPackageAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EAAttribute <em>EA Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute
	 * @generated
	 */
	public Adapter createEAAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EAAttributeTag <em>EA Attribute Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EAAttributeTag
	 * @generated
	 */
	public Adapter createEAAttributeTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EAConnector <em>EA Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EAConnector
	 * @generated
	 */
	public Adapter createEAConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd <em>EA Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd
	 * @generated
	 */
	public Adapter createEAConnectorEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EAConnectorTag <em>EA Connector Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorTag
	 * @generated
	 */
	public Adapter createEAConnectorTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EADiagram <em>EA Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EADiagram
	 * @generated
	 */
	public Adapter createEADiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EADiagramLink <em>EA Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EADiagramLink
	 * @generated
	 */
	public Adapter createEADiagramLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EADiagramObject <em>EA Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EADiagramObject
	 * @generated
	 */
	public Adapter createEADiagramObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EAElement <em>EA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EAElement
	 * @generated
	 */
	public Adapter createEAElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EAMethod <em>EA Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EAMethod
	 * @generated
	 */
	public Adapter createEAMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EAMethodTag <em>EA Method Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EAMethodTag
	 * @generated
	 */
	public Adapter createEAMethodTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EAPackage <em>EA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EAPackage
	 * @generated
	 */
	public Adapter createEAPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EAParameter <em>EA Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EAParameter
	 * @generated
	 */
	public Adapter createEAParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EARepository <em>EA Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EARepository
	 * @generated
	 */
	public Adapter createEARepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.EATaggedValue <em>EA Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.EATaggedValue
	 * @generated
	 */
	public Adapter createEATaggedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.eaadapter.model.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.eaadapter.model.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
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

} //EamodelAdapterFactory
