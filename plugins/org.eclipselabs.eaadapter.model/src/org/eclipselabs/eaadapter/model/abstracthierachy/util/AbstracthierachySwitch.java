/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage
 * @generated
 */
public class AbstracthierachySwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstracthierachyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstracthierachySwitch() {
		if (modelPackage == null) {
			modelPackage = AbstracthierachyPackage.eINSTANCE;
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
			case AbstracthierachyPackage.EA_ABSTRACT_PACKAGE: {
				EAAbstractPackage eaAbstractPackage = (EAAbstractPackage)theEObject;
				T result = caseEAAbstractPackage(eaAbstractPackage);
				if (result == null) result = caseEAVersiondElement(eaAbstractPackage);
				if (result == null) result = caseEANamedElement(eaAbstractPackage);
				if (result == null) result = caseEAMovableElement(eaAbstractPackage);
				if (result == null) result = caseEABaseClass(eaAbstractPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_BASE_CLASS: {
				EABaseClass eaBaseClass = (EABaseClass)theEObject;
				T result = caseEABaseClass(eaBaseClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG: {
				EAClassifierIDLong eaClassifierIDLong = (EAClassifierIDLong)theEObject;
				T result = caseEAClassifierIDLong(eaClassifierIDLong);
				if (result == null) result = caseEAVisibilityElement(eaClassifierIDLong);
				if (result == null) result = caseEATypedElement(eaClassifierIDLong);
				if (result == null) result = caseEAStereotypedElement(eaClassifierIDLong);
				if (result == null) result = caseEANamedElement(eaClassifierIDLong);
				if (result == null) result = caseEABaseClass(eaClassifierIDLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT: {
				EAModifiableElement eaModifiableElement = (EAModifiableElement)theEObject;
				T result = caseEAModifiableElement(eaModifiableElement);
				if (result == null) result = caseEAVisibilityElement(eaModifiableElement);
				if (result == null) result = caseEATypedElement(eaModifiableElement);
				if (result == null) result = caseEAStereotypedElement(eaModifiableElement);
				if (result == null) result = caseEANamedElement(eaModifiableElement);
				if (result == null) result = caseEABaseClass(eaModifiableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_NAMED_ELEMENT: {
				EANamedElement eaNamedElement = (EANamedElement)theEObject;
				T result = caseEANamedElement(eaNamedElement);
				if (result == null) result = caseEABaseClass(eaNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_OWNED_ELEMENT: {
				EAOwnedElement eaOwnedElement = (EAOwnedElement)theEObject;
				T result = caseEAOwnedElement(eaOwnedElement);
				if (result == null) result = caseEAVersiondElement(eaOwnedElement);
				if (result == null) result = caseEANamedElement(eaOwnedElement);
				if (result == null) result = caseEAMovableElement(eaOwnedElement);
				if (result == null) result = caseEABaseClass(eaOwnedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_STEREOTYPED_ELEMENT: {
				EAStereotypedElement eaStereotypedElement = (EAStereotypedElement)theEObject;
				T result = caseEAStereotypedElement(eaStereotypedElement);
				if (result == null) result = caseEANamedElement(eaStereotypedElement);
				if (result == null) result = caseEABaseClass(eaStereotypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_TAGGED_ELEMENT: {
				EATaggedElement eaTaggedElement = (EATaggedElement)theEObject;
				T result = caseEATaggedElement(eaTaggedElement);
				if (result == null) result = caseEANamedElement(eaTaggedElement);
				if (result == null) result = caseEABaseClass(eaTaggedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_TYPED_ELEMENT: {
				EATypedElement eaTypedElement = (EATypedElement)theEObject;
				T result = caseEATypedElement(eaTypedElement);
				if (result == null) result = caseEAStereotypedElement(eaTypedElement);
				if (result == null) result = caseEANamedElement(eaTypedElement);
				if (result == null) result = caseEABaseClass(eaTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_VERSIOND_ELEMENT: {
				EAVersiondElement eaVersiondElement = (EAVersiondElement)theEObject;
				T result = caseEAVersiondElement(eaVersiondElement);
				if (result == null) result = caseEANamedElement(eaVersiondElement);
				if (result == null) result = caseEAMovableElement(eaVersiondElement);
				if (result == null) result = caseEABaseClass(eaVersiondElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_VISIBILITY_ELEMENT: {
				EAVisibilityElement eaVisibilityElement = (EAVisibilityElement)theEObject;
				T result = caseEAVisibilityElement(eaVisibilityElement);
				if (result == null) result = caseEATypedElement(eaVisibilityElement);
				if (result == null) result = caseEAStereotypedElement(eaVisibilityElement);
				if (result == null) result = caseEANamedElement(eaVisibilityElement);
				if (result == null) result = caseEABaseClass(eaVisibilityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstracthierachyPackage.EA_MOVABLE_ELEMENT: {
				EAMovableElement eaMovableElement = (EAMovableElement)theEObject;
				T result = caseEAMovableElement(eaMovableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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

} //AbstracthierachySwitch
