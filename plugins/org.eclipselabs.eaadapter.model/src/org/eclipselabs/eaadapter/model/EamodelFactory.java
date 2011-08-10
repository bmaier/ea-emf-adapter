/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.eaadapter.model.EamodelPackage
 * @generated
 */
public interface EamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EamodelFactory eINSTANCE = org.eclipselabs.eaadapter.model.impl.EamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EA Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Attribute</em>'.
	 * @generated
	 */
	EAAttribute createEAAttribute();

	/**
	 * Returns a new object of class '<em>EA Attribute Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Attribute Tag</em>'.
	 * @generated
	 */
	EAAttributeTag createEAAttributeTag();

	/**
	 * Returns a new object of class '<em>EA Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Connector</em>'.
	 * @generated
	 */
	EAConnector createEAConnector();

	/**
	 * Returns a new object of class '<em>EA Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Connector End</em>'.
	 * @generated
	 */
	EAConnectorEnd createEAConnectorEnd();

	/**
	 * Returns a new object of class '<em>EA Connector Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Connector Tag</em>'.
	 * @generated
	 */
	EAConnectorTag createEAConnectorTag();

	/**
	 * Returns a new object of class '<em>EA Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Diagram</em>'.
	 * @generated
	 */
	EADiagram createEADiagram();

	/**
	 * Returns a new object of class '<em>EA Diagram Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Diagram Link</em>'.
	 * @generated
	 */
	EADiagramLink createEADiagramLink();

	/**
	 * Returns a new object of class '<em>EA Diagram Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Diagram Object</em>'.
	 * @generated
	 */
	EADiagramObject createEADiagramObject();

	/**
	 * Returns a new object of class '<em>EA Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Element</em>'.
	 * @generated
	 */
	EAElement createEAElement();

	/**
	 * Returns a new object of class '<em>EA Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Method</em>'.
	 * @generated
	 */
	EAMethod createEAMethod();

	/**
	 * Returns a new object of class '<em>EA Method Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Method Tag</em>'.
	 * @generated
	 */
	EAMethodTag createEAMethodTag();

	/**
	 * Returns a new object of class '<em>EA Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Package</em>'.
	 * @generated
	 */
	EAPackage createEAPackage();

	/**
	 * Returns a new object of class '<em>EA Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Parameter</em>'.
	 * @generated
	 */
	EAParameter createEAParameter();

	/**
	 * Returns a new object of class '<em>EA Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Repository</em>'.
	 * @generated
	 */
	EARepository createEARepository();

	/**
	 * Returns a new object of class '<em>EA Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Tagged Value</em>'.
	 * @generated
	 */
	EATaggedValue createEATaggedValue();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EamodelPackage getEamodelPackage();

} //EamodelFactory
