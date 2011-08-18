/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.eaadapter.model.EamodelPackage
 * @generated
 */
public class EamodelSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = EamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EamodelPackage.EA_ATTRIBUTE: {
				EAAttribute eaAttribute = (EAAttribute)theEObject;
				T result = caseEAAttribute(eaAttribute);
				if (result == null) result = caseEAModifiableElement(eaAttribute);
				if (result == null) result = caseEAClassifierIDLong(eaAttribute);
				if (result == null) result = caseEAVisibilityElement(eaAttribute);
				if (result == null) result = caseEATypedElement(eaAttribute);
				if (result == null) result = caseEAStereotypedElement(eaAttribute);
				if (result == null) result = caseEANamedElement(eaAttribute);
				if (result == null) result = caseEABaseClass(eaAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_ATTRIBUTE_TAG: {
				EAAttributeTag eaAttributeTag = (EAAttributeTag)theEObject;
				T result = caseEAAttributeTag(eaAttributeTag);
				if (result == null) result = caseEATaggedElement(eaAttributeTag);
				if (result == null) result = caseEANamedElement(eaAttributeTag);
				if (result == null) result = caseEABaseClass(eaAttributeTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_CONNECTOR: {
				EAConnector eaConnector = (EAConnector)theEObject;
				T result = caseEAConnector(eaConnector);
				if (result == null) result = caseEATypedElement(eaConnector);
				if (result == null) result = caseEAMovableElement(eaConnector);
				if (result == null) result = caseEAStereotypedElement(eaConnector);
				if (result == null) result = caseEANamedElement(eaConnector);
				if (result == null) result = caseEABaseClass(eaConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_CONNECTOR_END: {
				EAConnectorEnd eaConnectorEnd = (EAConnectorEnd)theEObject;
				T result = caseEAConnectorEnd(eaConnectorEnd);
				if (result == null) result = caseEABaseClass(eaConnectorEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_CONNECTOR_TAG: {
				EAConnectorTag eaConnectorTag = (EAConnectorTag)theEObject;
				T result = caseEAConnectorTag(eaConnectorTag);
				if (result == null) result = caseEATaggedElement(eaConnectorTag);
				if (result == null) result = caseEANamedElement(eaConnectorTag);
				if (result == null) result = caseEABaseClass(eaConnectorTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_DIAGRAM: {
				EADiagram eaDiagram = (EADiagram)theEObject;
				T result = caseEADiagram(eaDiagram);
				if (result == null) result = caseEAOwnedElement(eaDiagram);
				if (result == null) result = caseEAStereotypedElement(eaDiagram);
				if (result == null) result = caseEAVersiondElement(eaDiagram);
				if (result == null) result = caseEANamedElement(eaDiagram);
				if (result == null) result = caseEAMovableElement(eaDiagram);
				if (result == null) result = caseEABaseClass(eaDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_DIAGRAM_LINK: {
				EADiagramLink eaDiagramLink = (EADiagramLink)theEObject;
				T result = caseEADiagramLink(eaDiagramLink);
				if (result == null) result = caseEABaseClass(eaDiagramLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_DIAGRAM_OBJECT: {
				EADiagramObject eaDiagramObject = (EADiagramObject)theEObject;
				T result = caseEADiagramObject(eaDiagramObject);
				if (result == null) result = caseEABaseClass(eaDiagramObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_ELEMENT: {
				EAElement eaElement = (EAElement)theEObject;
				T result = caseEAElement(eaElement);
				if (result == null) result = caseEAClassifierIDLong(eaElement);
				if (result == null) result = caseEAOwnedElement(eaElement);
				if (result == null) result = caseEAVisibilityElement(eaElement);
				if (result == null) result = caseEAVersiondElement(eaElement);
				if (result == null) result = caseEATypedElement(eaElement);
				if (result == null) result = caseEAMovableElement(eaElement);
				if (result == null) result = caseEAStereotypedElement(eaElement);
				if (result == null) result = caseEANamedElement(eaElement);
				if (result == null) result = caseEABaseClass(eaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_METHOD: {
				EAMethod eaMethod = (EAMethod)theEObject;
				T result = caseEAMethod(eaMethod);
				if (result == null) result = caseEAModifiableElement(eaMethod);
				if (result == null) result = caseEAVisibilityElement(eaMethod);
				if (result == null) result = caseEATypedElement(eaMethod);
				if (result == null) result = caseEAStereotypedElement(eaMethod);
				if (result == null) result = caseEANamedElement(eaMethod);
				if (result == null) result = caseEABaseClass(eaMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_METHOD_TAG: {
				EAMethodTag eaMethodTag = (EAMethodTag)theEObject;
				T result = caseEAMethodTag(eaMethodTag);
				if (result == null) result = caseEATaggedElement(eaMethodTag);
				if (result == null) result = caseEANamedElement(eaMethodTag);
				if (result == null) result = caseEABaseClass(eaMethodTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_PACKAGE: {
				EAPackage eaPackage = (EAPackage)theEObject;
				T result = caseEAPackage(eaPackage);
				if (result == null) result = caseEAAbstractPackage(eaPackage);
				if (result == null) result = caseEAVersiondElement(eaPackage);
				if (result == null) result = caseEANamedElement(eaPackage);
				if (result == null) result = caseEAMovableElement(eaPackage);
				if (result == null) result = caseEABaseClass(eaPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_PARAMETER: {
				EAParameter eaParameter = (EAParameter)theEObject;
				T result = caseEAParameter(eaParameter);
				if (result == null) result = caseEANamedElement(eaParameter);
				if (result == null) result = caseEABaseClass(eaParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_REPOSITORY: {
				EARepository eaRepository = (EARepository)theEObject;
				T result = caseEARepository(eaRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.EA_TAGGED_VALUE: {
				EATaggedValue eaTaggedValue = (EATaggedValue)theEObject;
				T result = caseEATaggedValue(eaTaggedValue);
				if (result == null) result = caseEATaggedElement(eaTaggedValue);
				if (result == null) result = caseEANamedElement(eaTaggedValue);
				if (result == null) result = caseEABaseClass(eaTaggedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EamodelPackage.FILTER: {
				Filter filter = (Filter)theEObject;
				T result = caseFilter(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAAttribute(EAAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Attribute Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Attribute Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAAttributeTag(EAAttributeTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAConnector(EAConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Connector End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAConnectorEnd(EAConnectorEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Connector Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Connector Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAConnectorTag(EAConnectorTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEADiagram(EADiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Diagram Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Diagram Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEADiagramLink(EADiagramLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Diagram Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Diagram Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEADiagramObject(EADiagramObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAElement(EAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAMethod(EAMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Method Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Method Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAMethodTag(EAMethodTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPackage(EAPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAParameter(EAParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEARepository(EARepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Tagged Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEATaggedValue(EATaggedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Base Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEABaseClass(EABaseClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEANamedElement(EANamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Stereotyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Stereotyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAStereotypedElement(EAStereotypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEATypedElement(EATypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Visibility Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Visibility Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAVisibilityElement(EAVisibilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Modifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Modifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAModifiableElement(EAModifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Classifier ID Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Classifier ID Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAClassifierIDLong(EAClassifierIDLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Tagged Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Tagged Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEATaggedElement(EATaggedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Movable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Movable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAMovableElement(EAMovableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Versiond Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Versiond Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAVersiondElement(EAVersiondElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Owned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Owned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAOwnedElement(EAOwnedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Abstract Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Abstract Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAAbstractPackage(EAAbstractPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //EamodelSwitch
