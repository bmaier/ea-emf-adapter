/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.datatypes;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.eaadapter.model.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipselabs.eaadapter.model.datatypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipselabs.eaadapter.model.datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.datatypes.FilterClass <em>Filter Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterClass
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getFilterClass()
	 * @generated
	 */
	int FILTER_CLASS = 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.datatypes.FilterType <em>Filter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterType
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.datatypes.FilterAttribute <em>Filter Attribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterAttribute
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getFilterAttribute()
	 * @generated
	 */
	int FILTER_ATTRIBUTE = 2;

	/**
	 * The meta object id for the '<em>EA Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.Collection
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getEACollection()
	 * @generated
	 */
	int EA_COLLECTION = 3;

	/**
	 * The meta object id for the '<em>TAttribute</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.Attribute
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Attribute()
	 * @generated
	 */
	int TATTRIBUTE = 4;

	/**
	 * The meta object id for the '<em>TAttribute Tag</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.AttributeTag
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_AttributeTag()
	 * @generated
	 */
	int TATTRIBUTE_TAG = 5;

	/**
	 * The meta object id for the '<em>TConnector</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.Connector
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Connector()
	 * @generated
	 */
	int TCONNECTOR = 6;

	/**
	 * The meta object id for the '<em>TConnector End</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.ConnectorEnd
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_ConnectorEnd()
	 * @generated
	 */
	int TCONNECTOR_END = 7;

	/**
	 * The meta object id for the '<em>TConntector Tag</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.ConnectorTag
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_ConntectorTag()
	 * @generated
	 */
	int TCONNTECTOR_TAG = 8;

	/**
	 * The meta object id for the '<em>TDiagram</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.Diagram
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Diagram()
	 * @generated
	 */
	int TDIAGRAM = 9;

	/**
	 * The meta object id for the '<em>TDiagram Link</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.DiagramLink
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_DiagramLink()
	 * @generated
	 */
	int TDIAGRAM_LINK = 10;

	/**
	 * The meta object id for the '<em>TDiagram Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.DiagramObject
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_DiagramObject()
	 * @generated
	 */
	int TDIAGRAM_OBJECT = 11;

	/**
	 * The meta object id for the '<em>TElement</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.Element
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Element()
	 * @generated
	 */
	int TELEMENT = 12;

	/**
	 * The meta object id for the '<em>TMethod</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.Method
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Method()
	 * @generated
	 */
	int TMETHOD = 13;

	/**
	 * The meta object id for the '<em>TMethod Tag</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.MethodTag
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_MethodTag()
	 * @generated
	 */
	int TMETHOD_TAG = 14;

	/**
	 * The meta object id for the '<em>TPackage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.Package
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Package()
	 * @generated
	 */
	int TPACKAGE = 15;

	/**
	 * The meta object id for the '<em>TParameter</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.Parameter
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Parameter()
	 * @generated
	 */
	int TPARAMETER = 16;

	/**
	 * The meta object id for the '<em>TRepository</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.Repository
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Repository()
	 * @generated
	 */
	int TREPOSITORY = 17;

	/**
	 * The meta object id for the '<em>TTagged Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sparx.TaggedValue
	 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_TaggedValue()
	 * @generated
	 */
	int TTAGGED_VALUE = 18;

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.eaadapter.model.datatypes.FilterClass <em>Filter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Class</em>'.
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterClass
	 * @generated
	 */
	EEnum getFilterClass();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.eaadapter.model.datatypes.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterType
	 * @generated
	 */
	EEnum getFilterType();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.eaadapter.model.datatypes.FilterAttribute <em>Filter Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Attribute</em>'.
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterAttribute
	 * @generated
	 */
	EEnum getFilterAttribute();

	/**
	 * Returns the meta object for data type '{@link org.sparx.Collection <em>EA Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EA Collection</em>'.
	 * @see org.sparx.Collection
	 * @model instanceClass="org.sparx.Collection" serializeable="false"
	 * @generated
	 */
	EDataType getEACollection();

	/**
	 * Returns the meta object for data type '{@link org.sparx.Attribute <em>TAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAttribute</em>'.
	 * @see org.sparx.Attribute
	 * @model instanceClass="org.sparx.Attribute" serializeable="false"
	 * @generated
	 */
	EDataType getT_Attribute();

	/**
	 * Returns the meta object for data type '{@link org.sparx.AttributeTag <em>TAttribute Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAttribute Tag</em>'.
	 * @see org.sparx.AttributeTag
	 * @model instanceClass="org.sparx.AttributeTag" serializeable="false"
	 * @generated
	 */
	EDataType getT_AttributeTag();

	/**
	 * Returns the meta object for data type '{@link org.sparx.Connector <em>TConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TConnector</em>'.
	 * @see org.sparx.Connector
	 * @model instanceClass="org.sparx.Connector" serializeable="false"
	 * @generated
	 */
	EDataType getT_Connector();

	/**
	 * Returns the meta object for data type '{@link org.sparx.ConnectorEnd <em>TConnector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TConnector End</em>'.
	 * @see org.sparx.ConnectorEnd
	 * @model instanceClass="org.sparx.ConnectorEnd" serializeable="false"
	 * @generated
	 */
	EDataType getT_ConnectorEnd();

	/**
	 * Returns the meta object for data type '{@link org.sparx.ConnectorTag <em>TConntector Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TConntector Tag</em>'.
	 * @see org.sparx.ConnectorTag
	 * @model instanceClass="org.sparx.ConnectorTag" serializeable="false"
	 * @generated
	 */
	EDataType getT_ConntectorTag();

	/**
	 * Returns the meta object for data type '{@link org.sparx.Diagram <em>TDiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDiagram</em>'.
	 * @see org.sparx.Diagram
	 * @model instanceClass="org.sparx.Diagram" serializeable="false"
	 * @generated
	 */
	EDataType getT_Diagram();

	/**
	 * Returns the meta object for data type '{@link org.sparx.DiagramLink <em>TDiagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDiagram Link</em>'.
	 * @see org.sparx.DiagramLink
	 * @model instanceClass="org.sparx.DiagramLink" serializeable="false"
	 * @generated
	 */
	EDataType getT_DiagramLink();

	/**
	 * Returns the meta object for data type '{@link org.sparx.DiagramObject <em>TDiagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDiagram Object</em>'.
	 * @see org.sparx.DiagramObject
	 * @model instanceClass="org.sparx.DiagramObject" serializeable="false"
	 * @generated
	 */
	EDataType getT_DiagramObject();

	/**
	 * Returns the meta object for data type '{@link org.sparx.Element <em>TElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TElement</em>'.
	 * @see org.sparx.Element
	 * @model instanceClass="org.sparx.Element" serializeable="false"
	 * @generated
	 */
	EDataType getT_Element();

	/**
	 * Returns the meta object for data type '{@link org.sparx.Method <em>TMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMethod</em>'.
	 * @see org.sparx.Method
	 * @model instanceClass="org.sparx.Method" serializeable="false"
	 * @generated
	 */
	EDataType getT_Method();

	/**
	 * Returns the meta object for data type '{@link org.sparx.MethodTag <em>TMethod Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMethod Tag</em>'.
	 * @see org.sparx.MethodTag
	 * @model instanceClass="org.sparx.MethodTag" serializeable="false"
	 * @generated
	 */
	EDataType getT_MethodTag();

	/**
	 * Returns the meta object for data type '{@link org.sparx.Package <em>TPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPackage</em>'.
	 * @see org.sparx.Package
	 * @model instanceClass="org.sparx.Package" serializeable="false"
	 * @generated
	 */
	EDataType getT_Package();

	/**
	 * Returns the meta object for data type '{@link org.sparx.Parameter <em>TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TParameter</em>'.
	 * @see org.sparx.Parameter
	 * @model instanceClass="org.sparx.Parameter" serializeable="false"
	 * @generated
	 */
	EDataType getT_Parameter();

	/**
	 * Returns the meta object for data type '{@link org.sparx.Repository <em>TRepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRepository</em>'.
	 * @see org.sparx.Repository
	 * @model instanceClass="org.sparx.Repository" serializeable="false"
	 * @generated
	 */
	EDataType getT_Repository();

	/**
	 * Returns the meta object for data type '{@link org.sparx.TaggedValue <em>TTagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TTagged Value</em>'.
	 * @see org.sparx.TaggedValue
	 * @model instanceClass="org.sparx.TaggedValue" serializeable="false"
	 * @generated
	 */
	EDataType getT_TaggedValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.datatypes.FilterClass <em>Filter Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.datatypes.FilterClass
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getFilterClass()
		 * @generated
		 */
		EEnum FILTER_CLASS = eINSTANCE.getFilterClass();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.datatypes.FilterType <em>Filter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.datatypes.FilterType
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getFilterType()
		 * @generated
		 */
		EEnum FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.datatypes.FilterAttribute <em>Filter Attribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.datatypes.FilterAttribute
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getFilterAttribute()
		 * @generated
		 */
		EEnum FILTER_ATTRIBUTE = eINSTANCE.getFilterAttribute();

		/**
		 * The meta object literal for the '<em>EA Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.Collection
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getEACollection()
		 * @generated
		 */
		EDataType EA_COLLECTION = eINSTANCE.getEACollection();

		/**
		 * The meta object literal for the '<em>TAttribute</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.Attribute
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Attribute()
		 * @generated
		 */
		EDataType TATTRIBUTE = eINSTANCE.getT_Attribute();

		/**
		 * The meta object literal for the '<em>TAttribute Tag</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.AttributeTag
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_AttributeTag()
		 * @generated
		 */
		EDataType TATTRIBUTE_TAG = eINSTANCE.getT_AttributeTag();

		/**
		 * The meta object literal for the '<em>TConnector</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.Connector
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Connector()
		 * @generated
		 */
		EDataType TCONNECTOR = eINSTANCE.getT_Connector();

		/**
		 * The meta object literal for the '<em>TConnector End</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.ConnectorEnd
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_ConnectorEnd()
		 * @generated
		 */
		EDataType TCONNECTOR_END = eINSTANCE.getT_ConnectorEnd();

		/**
		 * The meta object literal for the '<em>TConntector Tag</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.ConnectorTag
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_ConntectorTag()
		 * @generated
		 */
		EDataType TCONNTECTOR_TAG = eINSTANCE.getT_ConntectorTag();

		/**
		 * The meta object literal for the '<em>TDiagram</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.Diagram
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Diagram()
		 * @generated
		 */
		EDataType TDIAGRAM = eINSTANCE.getT_Diagram();

		/**
		 * The meta object literal for the '<em>TDiagram Link</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.DiagramLink
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_DiagramLink()
		 * @generated
		 */
		EDataType TDIAGRAM_LINK = eINSTANCE.getT_DiagramLink();

		/**
		 * The meta object literal for the '<em>TDiagram Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.DiagramObject
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_DiagramObject()
		 * @generated
		 */
		EDataType TDIAGRAM_OBJECT = eINSTANCE.getT_DiagramObject();

		/**
		 * The meta object literal for the '<em>TElement</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.Element
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Element()
		 * @generated
		 */
		EDataType TELEMENT = eINSTANCE.getT_Element();

		/**
		 * The meta object literal for the '<em>TMethod</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.Method
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Method()
		 * @generated
		 */
		EDataType TMETHOD = eINSTANCE.getT_Method();

		/**
		 * The meta object literal for the '<em>TMethod Tag</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.MethodTag
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_MethodTag()
		 * @generated
		 */
		EDataType TMETHOD_TAG = eINSTANCE.getT_MethodTag();

		/**
		 * The meta object literal for the '<em>TPackage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.Package
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Package()
		 * @generated
		 */
		EDataType TPACKAGE = eINSTANCE.getT_Package();

		/**
		 * The meta object literal for the '<em>TParameter</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.Parameter
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Parameter()
		 * @generated
		 */
		EDataType TPARAMETER = eINSTANCE.getT_Parameter();

		/**
		 * The meta object literal for the '<em>TRepository</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.Repository
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_Repository()
		 * @generated
		 */
		EDataType TREPOSITORY = eINSTANCE.getT_Repository();

		/**
		 * The meta object literal for the '<em>TTagged Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sparx.TaggedValue
		 * @see org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl#getT_TaggedValue()
		 * @generated
		 */
		EDataType TTAGGED_VALUE = eINSTANCE.getT_TaggedValue();

	}

} //DatatypesPackage
