/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;


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
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * The package for the EA metamodel.<br>
 * <code>EARepository</code> is the root element for all EA models.<br>
 * <br>
 * Note that the code generation templates are modified that way, that all <i>volatile</i> features are <i>disabled</i>!<br>
 * This makes it easy to deactivate certain attribute in the model without removing them.
 * </div>
 * <!-- end-model-doc -->
 * @see org.eclipselabs.eaadapter.model.EamodelFactory
 * @model kind="package"
 * @generated
 */
public interface EamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipselabs.eaadapter.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipselabs.eaadapter.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EamodelPackage eINSTANCE = org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl <em>EA Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EAAttributeImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAAttribute()
	 * @generated
	 */
	int EA_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__OBJECT_TYPE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__ID = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__REPOSITORY = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__NAME = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__NOTES = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__GUID = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__STEREOTYPE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Has DStereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__HAS_DSTEREOTYPE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__HAS_DSTEREOTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__TYPE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__VISIBILITY = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__IS_CONST = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__IS_STATIC = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Classifier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__CLASSIFIER_ID = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__CONTAINMENT = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__IS_COLLECTION = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__IS_ORDERED = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__ALLOW_DUPLICATES = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__IS_DERIVED = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__CONTAINER = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__SCALE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__PRECISION = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__LENGTH = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__LOWER_BOUND = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__UPPER_BOUND = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__DEFAULT = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__ELEMENT = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__EA_LINK = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE__TAGGED_VALUES = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>EA Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_FEATURE_COUNT = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EAAttributeTagImpl <em>EA Attribute Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EAAttributeTagImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAAttributeTag()
	 * @generated
	 */
	int EA_ATTRIBUTE_TAG = 1;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_TAG__OBJECT_TYPE = AbstracthierachyPackage.EA_TAGGED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_TAG__ID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_TAG__REPOSITORY = AbstracthierachyPackage.EA_TAGGED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_TAG__NAME = AbstracthierachyPackage.EA_TAGGED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_TAG__NOTES = AbstracthierachyPackage.EA_TAGGED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_TAG__GUID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_TAG__VALUE = AbstracthierachyPackage.EA_TAGGED_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_TAG__TAG_ID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__TAG_ID;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_TAG__EA_LINK = AbstracthierachyPackage.EA_TAGGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Attribute Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ATTRIBUTE_TAG_FEATURE_COUNT = AbstracthierachyPackage.EA_TAGGED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl <em>EA Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EAConnectorImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAConnector()
	 * @generated
	 */
	int EA_CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__OBJECT_TYPE = AbstracthierachyPackage.EA_TYPED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__ID = AbstracthierachyPackage.EA_TYPED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__REPOSITORY = AbstracthierachyPackage.EA_TYPED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__NAME = AbstracthierachyPackage.EA_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__NOTES = AbstracthierachyPackage.EA_TYPED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__GUID = AbstracthierachyPackage.EA_TYPED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__STEREOTYPE = AbstracthierachyPackage.EA_TYPED_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Has DStereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__HAS_DSTEREOTYPE = AbstracthierachyPackage.EA_TYPED_ELEMENT__HAS_DSTEREOTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__TYPE = AbstracthierachyPackage.EA_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CONNECTOR_ID = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__DIRECTION = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUBTYPE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__IS_LEAF = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__IS_ROOT = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__IS_SPEC = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Virtual Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__VIRTUAL_INHERITANCE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transition Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__TRANSITION_EVENT = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transition Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__TRANSITION_ACTION = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Transition Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__TRANSITION_GUARD = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Route Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__ROUTE_STYLE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sequence No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SEQUENCE_NO = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Diagram ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__DIAGRAM_ID = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__EA_LINK = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__TAGGED_VALUES = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Supplier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_ID = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Supplier End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_END = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_ID = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Client End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_END = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Client aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_AGGREGATION = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Client cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_CARDINALITY = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Client containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_CONTAINMENT = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Client is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_IS_NAVIGABLE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Client note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_NOTE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Client role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_ROLE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Client role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_ROLE_TYPE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Client stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_STEREOTYPE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Client visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__CLIENT_VISIBILITY = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Supplier aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_AGGREGATION = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Supplier cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_CARDINALITY = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Supplier containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_CONTAINMENT = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Supplier is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_IS_NAVIGABLE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Supplier note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_NOTE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Supplier role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_ROLE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Supplier role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_ROLE_TYPE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Supplier stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_STEREOTYPE = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Supplier visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__SUPPLIER_VISIBILITY = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Is A2d Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR__IS_A2D_DEPENDENCY = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 39;

	/**
	 * The number of structural features of the '<em>EA Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_FEATURE_COUNT = AbstracthierachyPackage.EA_TYPED_ELEMENT_FEATURE_COUNT + 40;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl <em>EA Connector End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAConnectorEnd()
	 * @generated
	 */
	int EA_CONNECTOR_END = 3;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__OBJECT_TYPE = AbstracthierachyPackage.EA_BASE_CLASS__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__ID = AbstracthierachyPackage.EA_BASE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__REPOSITORY = AbstracthierachyPackage.EA_BASE_CLASS__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__AGGREGATION = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__CARDINALITY = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__CONTAINMENT = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__IS_NAVIGABLE = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__NOTE = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__ROLE = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__ROLE_TYPE = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__STEREOTYPE = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__VISIBILITY = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__EA_LINK = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__ORDERING = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__QUALIFIER = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END__END = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>EA Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_END_FEATURE_COUNT = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EAConnectorTagImpl <em>EA Connector Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EAConnectorTagImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAConnectorTag()
	 * @generated
	 */
	int EA_CONNECTOR_TAG = 4;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_TAG__OBJECT_TYPE = AbstracthierachyPackage.EA_TAGGED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_TAG__ID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_TAG__REPOSITORY = AbstracthierachyPackage.EA_TAGGED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_TAG__NAME = AbstracthierachyPackage.EA_TAGGED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_TAG__NOTES = AbstracthierachyPackage.EA_TAGGED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_TAG__GUID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_TAG__VALUE = AbstracthierachyPackage.EA_TAGGED_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_TAG__TAG_ID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__TAG_ID;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_TAG__EA_LINK = AbstracthierachyPackage.EA_TAGGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Connector Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_TAG_FEATURE_COUNT = AbstracthierachyPackage.EA_TAGGED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl <em>EA Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EADiagramImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEADiagram()
	 * @generated
	 */
	int EA_DIAGRAM = 5;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__OBJECT_TYPE = AbstracthierachyPackage.EA_OWNED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__ID = AbstracthierachyPackage.EA_OWNED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__REPOSITORY = AbstracthierachyPackage.EA_OWNED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__NAME = AbstracthierachyPackage.EA_OWNED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__NOTES = AbstracthierachyPackage.EA_OWNED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__GUID = AbstracthierachyPackage.EA_OWNED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__VERSION = AbstracthierachyPackage.EA_OWNED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__AUTHOR = AbstracthierachyPackage.EA_OWNED_ELEMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__IS_LOCKED = AbstracthierachyPackage.EA_OWNED_ELEMENT__IS_LOCKED;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__STEREOTYPE = AbstracthierachyPackage.EA_OWNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has DStereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__HAS_DSTEREOTYPE = AbstracthierachyPackage.EA_OWNED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Swimlanes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__SWIMLANES = AbstracthierachyPackage.EA_OWNED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__TYPE = AbstracthierachyPackage.EA_OWNED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__PACKAGE = AbstracthierachyPackage.EA_OWNED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__EA_LINK = AbstracthierachyPackage.EA_OWNED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Diagram Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__DIAGRAM_LINKS = AbstracthierachyPackage.EA_OWNED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM__DIAGRAM_OBJECTS = AbstracthierachyPackage.EA_OWNED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EA Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_FEATURE_COUNT = AbstracthierachyPackage.EA_OWNED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl <em>EA Diagram Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEADiagramLink()
	 * @generated
	 */
	int EA_DIAGRAM_LINK = 6;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK__OBJECT_TYPE = AbstracthierachyPackage.EA_BASE_CLASS__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK__ID = AbstracthierachyPackage.EA_BASE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK__REPOSITORY = AbstracthierachyPackage.EA_BASE_CLASS__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK__CONNECTOR = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK__CONNECTOR_ID = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK__GEOMETRY = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK__IS_HIDDEN = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK__PATH = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK__STYLE = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK__EA_LINK = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>EA Diagram Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_LINK_FEATURE_COUNT = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl <em>EA Diagram Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEADiagramObject()
	 * @generated
	 */
	int EA_DIAGRAM_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__OBJECT_TYPE = AbstracthierachyPackage.EA_BASE_CLASS__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__ID = AbstracthierachyPackage.EA_BASE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__REPOSITORY = AbstracthierachyPackage.EA_BASE_CLASS__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__BOTTOM = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__ELEMENT = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__ELEMENT_ID = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__LEFT = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__RIGHT = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__SEQUENCE = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__TOP = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT__EA_LINK = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EA Diagram Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DIAGRAM_OBJECT_FEATURE_COUNT = AbstracthierachyPackage.EA_BASE_CLASS_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl <em>EA Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EAElementImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAElement()
	 * @generated
	 */
	int EA_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__OBJECT_TYPE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__ID = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__REPOSITORY = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__NAME = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__NOTES = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__GUID = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__GUID;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__STEREOTYPE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Has DStereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__HAS_DSTEREOTYPE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__HAS_DSTEREOTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__TYPE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__TYPE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__VISIBILITY = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Classifier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__CLASSIFIER_ID = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG__CLASSIFIER_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__VERSION = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__AUTHOR = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__IS_LOCKED = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__ABSTRACT = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__CLASSIFIER_NAME = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Classifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__CLASSIFIER_TYPE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__COMPLEXITY = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__DIFFICULTY = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Extension Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__EXTENSION_POINTS = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Genlinks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__GENLINKS = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Genfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__GENFILE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Gentype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__GENTYPE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__MULTIPLICITY = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__PHASE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__PRIORITY = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Property Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__PROPERTY_TYPE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__STATUS = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stereotype Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__STEREOTYPE_EX = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__SUBTYPE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__TABLESPACE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__TAG = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__ELEMENT = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__PACKAGE = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__ATTRIBUTES = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__CONNECTORS = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__ELEMENTS = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__METHODS = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__TAGGED_VALUES = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__EA_LINK = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Has A2d Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__HAS_A2D_DEPENDENCY = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Parent ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__PARENT_ID = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Package ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__PACKAGE_ID = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 31;

	/**
	 * The number of structural features of the '<em>EA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT_FEATURE_COUNT = AbstracthierachyPackage.EA_CLASSIFIER_ID_LONG_FEATURE_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl <em>EA Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EAMethodImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAMethod()
	 * @generated
	 */
	int EA_METHOD = 9;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__OBJECT_TYPE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__ID = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__REPOSITORY = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__NAME = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__NOTES = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__GUID = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__STEREOTYPE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Has DStereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__HAS_DSTEREOTYPE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__HAS_DSTEREOTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__TYPE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__VISIBILITY = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__IS_CONST = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__IS_STATIC = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__RETURN_TYPE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__RETURN_IS_ARRAY = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__CODE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__THROWS = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Pure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__IS_PURE = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__IS_ROOT = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__IS_LEAF = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__IS_QUERY = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__IS_SYNCHRONIZED = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__IS_ABSTRACT = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__CONCURRENCY = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Classifier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__CLASSIFIER_ID = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__ELEMENT = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__EA_LINK = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__PARAMETERS = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD__TAGGED_VALUES = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>EA Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_FEATURE_COUNT = AbstracthierachyPackage.EA_MODIFIABLE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EAMethodTagImpl <em>EA Method Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EAMethodTagImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAMethodTag()
	 * @generated
	 */
	int EA_METHOD_TAG = 10;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_TAG__OBJECT_TYPE = AbstracthierachyPackage.EA_TAGGED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_TAG__ID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_TAG__REPOSITORY = AbstracthierachyPackage.EA_TAGGED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_TAG__NAME = AbstracthierachyPackage.EA_TAGGED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_TAG__NOTES = AbstracthierachyPackage.EA_TAGGED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_TAG__GUID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_TAG__VALUE = AbstracthierachyPackage.EA_TAGGED_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_TAG__TAG_ID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__TAG_ID;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_TAG__EA_LINK = AbstracthierachyPackage.EA_TAGGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Method Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_METHOD_TAG_FEATURE_COUNT = AbstracthierachyPackage.EA_TAGGED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl <em>EA Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EAPackageImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAPackage()
	 * @generated
	 */
	int EA_PACKAGE = 11;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__OBJECT_TYPE = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__ID = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__REPOSITORY = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__NAME = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__NOTES = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__GUID = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE__GUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__VERSION = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE__VERSION;

	/**
	 * The feature id for the '<em><b>Code Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__CODE_PATH = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE__CODE_PATH;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__FLAGS = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE__FLAGS;

	/**
	 * The feature id for the '<em><b>Is Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__IS_MODEL = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE__IS_MODEL;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__DIAGRAMS = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__ELEMENTS = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__PACKAGES = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__PACKAGE = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__EA_LINK = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__STEREOTYPE = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE_FEATURE_COUNT = AbstracthierachyPackage.EA_ABSTRACT_PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EAParameterImpl <em>EA Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EAParameterImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAParameter()
	 * @generated
	 */
	int EA_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__OBJECT_TYPE = AbstracthierachyPackage.EA_NAMED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__ID = AbstracthierachyPackage.EA_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__REPOSITORY = AbstracthierachyPackage.EA_NAMED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__NAME = AbstracthierachyPackage.EA_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__NOTES = AbstracthierachyPackage.EA_NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__GUID = AbstracthierachyPackage.EA_NAMED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__TYPE = AbstracthierachyPackage.EA_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__DEFAULT = AbstracthierachyPackage.EA_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__POSITION = AbstracthierachyPackage.EA_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__IS_CONST = AbstracthierachyPackage.EA_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__KIND = AbstracthierachyPackage.EA_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Classifier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__CLASSIFIER_ID = AbstracthierachyPackage.EA_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__OPERATION_ID = AbstracthierachyPackage.EA_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__METHOD = AbstracthierachyPackage.EA_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER__EA_LINK = AbstracthierachyPackage.EA_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>EA Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PARAMETER_FEATURE_COUNT = AbstracthierachyPackage.EA_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl <em>EA Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EARepositoryImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEARepository()
	 * @generated
	 */
	int EA_REPOSITORY = 13;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__MODELS = 0;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__EA_LINK = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__FILE = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__USER = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Caching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__CACHING = 5;

	/**
	 * The feature id for the '<em><b>Readonly Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__READONLY_EA_LINK = 6;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__DIAGRAMS = 7;

	/**
	 * The feature id for the '<em><b>Prefetch Complete Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__PREFETCH_COMPLETE_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Prefetch Package Guids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__PREFETCH_PACKAGE_GUIDS = 9;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__FILTER = 10;

	/**
	 * The feature id for the '<em><b>Persistent Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__PERSISTENT_MODELS = 11;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__PERSISTENT = 12;

	/**
	 * The feature id for the '<em><b>Prefetching Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY__PREFETCHING_ENABLED = 13;

	/**
	 * The number of structural features of the '<em>EA Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_REPOSITORY_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.EATaggedValueImpl <em>EA Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.EATaggedValueImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEATaggedValue()
	 * @generated
	 */
	int EA_TAGGED_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_VALUE__OBJECT_TYPE = AbstracthierachyPackage.EA_TAGGED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_VALUE__ID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_VALUE__REPOSITORY = AbstracthierachyPackage.EA_TAGGED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_VALUE__NAME = AbstracthierachyPackage.EA_TAGGED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_VALUE__NOTES = AbstracthierachyPackage.EA_TAGGED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_VALUE__GUID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_VALUE__VALUE = AbstracthierachyPackage.EA_TAGGED_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_VALUE__TAG_ID = AbstracthierachyPackage.EA_TAGGED_ELEMENT__TAG_ID;

	/**
	 * The feature id for the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_VALUE__EA_LINK = AbstracthierachyPackage.EA_TAGGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_VALUE_FEATURE_COUNT = AbstracthierachyPackage.EA_TAGGED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.impl.FilterImpl
	 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 15;

	/**
	 * The feature id for the '<em><b>Filter Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Filter Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Filter Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NEGATE = 4;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EAAttribute <em>EA Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Attribute</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute
	 * @generated
	 */
	EClass getEAAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getContainment()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_Containment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getIsCollection()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getIsOrdered()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getAllowDuplicates <em>Allow Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Duplicates</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getAllowDuplicates()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_AllowDuplicates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getIsDerived()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getContainer()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getScale()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getPrecision()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getLength()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getLowerBound()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getUpperBound()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getDefault()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_Default();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.eaadapter.model.EAAttribute#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getElement()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EReference getEAAttribute_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttribute#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getEaLink()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EAttribute getEAAttribute_EaLink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAAttribute#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getTaggedValues()
	 * @see #getEAAttribute()
	 * @generated
	 */
	EReference getEAAttribute_TaggedValues();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EAAttributeTag <em>EA Attribute Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Attribute Tag</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttributeTag
	 * @generated
	 */
	EClass getEAAttributeTag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAAttributeTag#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAAttributeTag#getEaLink()
	 * @see #getEAAttributeTag()
	 * @generated
	 */
	EAttribute getEAAttributeTag_EaLink();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EAConnector <em>EA Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Connector</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector
	 * @generated
	 */
	EClass getEAConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getConnectorID <em>Connector ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getConnectorID()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_ConnectorID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getDirection()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSubtype()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getIsLeaf()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getIsRoot()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getIsSpec <em>Is Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Spec</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getIsSpec()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_IsSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getVirtualInheritance <em>Virtual Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Inheritance</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getVirtualInheritance()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_VirtualInheritance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getTransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Event</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getTransitionEvent()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_TransitionEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getTransitionAction <em>Transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Action</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getTransitionAction()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_TransitionAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getTransitionGuard <em>Transition Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Guard</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getTransitionGuard()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_TransitionGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getRouteStyle <em>Route Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Style</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getRouteStyle()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_RouteStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSequenceNo <em>Sequence No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence No</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSequenceNo()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_SequenceNo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getDiagramID <em>Diagram ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getDiagramID()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_DiagramID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getEaLink()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_EaLink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAConnector#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getTaggedValues()
	 * @see #getEAConnector()
	 * @generated
	 */
	EReference getEAConnector_TaggedValues();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplierID <em>Supplier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplierID()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_SupplierID();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplier()
	 * @see #getEAConnector()
	 * @generated
	 */
	EReference getEAConnector_Supplier();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplierEnd <em>Supplier End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplier End</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplierEnd()
	 * @see #getEAConnector()
	 * @generated
	 */
	EReference getEAConnector_SupplierEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getClientID <em>Client ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClientID()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_ClientID();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClient()
	 * @see #getEAConnector()
	 * @generated
	 */
	EReference getEAConnector_Client();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.eaadapter.model.EAConnector#getClientEnd <em>Client End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client End</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClientEnd()
	 * @see #getEAConnector()
	 * @generated
	 */
	EReference getEAConnector_ClientEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_aggregation <em>Client aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client aggregation</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClient_aggregation()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Client_aggregation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_cardinality <em>Client cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client cardinality</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClient_cardinality()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Client_cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_containment <em>Client containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client containment</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClient_containment()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Client_containment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_isNavigable <em>Client is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client is Navigable</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClient_isNavigable()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Client_isNavigable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_note <em>Client note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client note</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClient_note()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Client_note();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_role <em>Client role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client role</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClient_role()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Client_role();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_roleType <em>Client role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client role Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClient_roleType()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Client_roleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_stereotype <em>Client stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client stereotype</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClient_stereotype()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Client_stereotype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getClient_visibility <em>Client visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client visibility</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getClient_visibility()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Client_visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_aggregation <em>Supplier aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier aggregation</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplier_aggregation()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Supplier_aggregation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_cardinality <em>Supplier cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier cardinality</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplier_cardinality()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Supplier_cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_containment <em>Supplier containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier containment</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplier_containment()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Supplier_containment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_isNavigable <em>Supplier is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier is Navigable</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplier_isNavigable()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Supplier_isNavigable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_note <em>Supplier note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier note</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplier_note()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Supplier_note();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_role <em>Supplier role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier role</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplier_role()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Supplier_role();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_roleType <em>Supplier role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier role Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplier_roleType()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Supplier_roleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_stereotype <em>Supplier stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier stereotype</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplier_stereotype()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Supplier_stereotype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getSupplier_visibility <em>Supplier visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier visibility</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getSupplier_visibility()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_Supplier_visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnector#getIsA2dDependency <em>Is A2d Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is A2d Dependency</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnector#getIsA2dDependency()
	 * @see #getEAConnector()
	 * @generated
	 */
	EAttribute getEAConnector_IsA2dDependency();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd <em>EA Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Connector End</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd
	 * @generated
	 */
	EClass getEAConnectorEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getAggregation()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_Aggregation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getCardinality()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getContainment()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_Containment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getIsNavigable <em>Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Navigable</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getIsNavigable()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_IsNavigable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getNote()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_Note();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getRole()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getRoleType()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_RoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getStereotype()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getVisibility()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getEaLink()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_EaLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getOrdering()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getQualifier()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorEnd#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorEnd#getEnd()
	 * @see #getEAConnectorEnd()
	 * @generated
	 */
	EAttribute getEAConnectorEnd_End();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EAConnectorTag <em>EA Connector Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Connector Tag</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorTag
	 * @generated
	 */
	EClass getEAConnectorTag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAConnectorTag#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAConnectorTag#getEaLink()
	 * @see #getEAConnectorTag()
	 * @generated
	 */
	EAttribute getEAConnectorTag_EaLink();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EADiagram <em>EA Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Diagram</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagram
	 * @generated
	 */
	EClass getEADiagram();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagram#getSwimlanes <em>Swimlanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swimlanes</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagram#getSwimlanes()
	 * @see #getEADiagram()
	 * @generated
	 */
	EAttribute getEADiagram_Swimlanes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagram#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagram#getType()
	 * @see #getEADiagram()
	 * @generated
	 */
	EAttribute getEADiagram_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.eaadapter.model.EADiagram#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagram#getPackage()
	 * @see #getEADiagram()
	 * @generated
	 */
	EReference getEADiagram_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagram#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagram#getEaLink()
	 * @see #getEADiagram()
	 * @generated
	 */
	EAttribute getEADiagram_EaLink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EADiagram#getDiagramLinks <em>Diagram Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Links</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagram#getDiagramLinks()
	 * @see #getEADiagram()
	 * @generated
	 */
	EReference getEADiagram_DiagramLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EADiagram#getDiagramObjects <em>Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Objects</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagram#getDiagramObjects()
	 * @see #getEADiagram()
	 * @generated
	 */
	EReference getEADiagram_DiagramObjects();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EADiagramLink <em>EA Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Diagram Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramLink
	 * @generated
	 */
	EClass getEADiagramLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramLink#getConnector()
	 * @see #getEADiagramLink()
	 * @generated
	 */
	EReference getEADiagramLink_Connector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getConnectorID <em>Connector ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramLink#getConnectorID()
	 * @see #getEADiagramLink()
	 * @generated
	 */
	EAttribute getEADiagramLink_ConnectorID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramLink#getGeometry()
	 * @see #getEADiagramLink()
	 * @generated
	 */
	EAttribute getEADiagramLink_Geometry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getIsHidden <em>Is Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hidden</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramLink#getIsHidden()
	 * @see #getEADiagramLink()
	 * @generated
	 */
	EAttribute getEADiagramLink_IsHidden();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramLink#getPath()
	 * @see #getEADiagramLink()
	 * @generated
	 */
	EAttribute getEADiagramLink_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramLink#getStyle()
	 * @see #getEADiagramLink()
	 * @generated
	 */
	EAttribute getEADiagramLink_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramLink#getEaLink()
	 * @see #getEADiagramLink()
	 * @generated
	 */
	EAttribute getEADiagramLink_EaLink();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EADiagramObject <em>EA Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Diagram Object</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramObject
	 * @generated
	 */
	EClass getEADiagramObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramObject#getBottom()
	 * @see #getEADiagramObject()
	 * @generated
	 */
	EAttribute getEADiagramObject_Bottom();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramObject#getElement()
	 * @see #getEADiagramObject()
	 * @generated
	 */
	EReference getEADiagramObject_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramObject#getElementID()
	 * @see #getEADiagramObject()
	 * @generated
	 */
	EAttribute getEADiagramObject_ElementID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramObject#getLeft()
	 * @see #getEADiagramObject()
	 * @generated
	 */
	EAttribute getEADiagramObject_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramObject#getRight()
	 * @see #getEADiagramObject()
	 * @generated
	 */
	EAttribute getEADiagramObject_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramObject#getSequence()
	 * @see #getEADiagramObject()
	 * @generated
	 */
	EAttribute getEADiagramObject_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramObject#getTop()
	 * @see #getEADiagramObject()
	 * @generated
	 */
	EAttribute getEADiagramObject_Top();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EADiagramObject#getEaLink()
	 * @see #getEADiagramObject()
	 * @generated
	 */
	EAttribute getEADiagramObject_EaLink();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EAElement <em>EA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement
	 * @generated
	 */
	EClass getEAElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getAbstract()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getClassifierName <em>Classifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Name</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getClassifierName()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_ClassifierName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getClassifierType <em>Classifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getClassifierType()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_ClassifierType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getComplexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complexity</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getComplexity()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Complexity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getDifficulty()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getExtensionPoints <em>Extension Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Points</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getExtensionPoints()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_ExtensionPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getGenlinks <em>Genlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genlinks</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getGenlinks()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Genlinks();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getGenfile <em>Genfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genfile</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getGenfile()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Genfile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getGentype <em>Gentype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gentype</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getGentype()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Gentype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getMultiplicity()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getPhase()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Phase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getPriority()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getPropertyType()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_PropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getStatus()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getStereotypeEx <em>Stereotype Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype Ex</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getStereotypeEx()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_StereotypeEx();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getSubtype()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getTablespace <em>Tablespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tablespace</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getTablespace()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Tablespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getTag()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Tag();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.eaadapter.model.EAElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getElement()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_Element();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.eaadapter.model.EAElement#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getPackage()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getAttributes()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAElement#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getConnectors()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getElements()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAElement#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getMethods()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAElement#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getTaggedValues()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_TaggedValues();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getEaLink()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_EaLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getHasA2dDependency <em>Has A2d Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has A2d Dependency</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getHasA2dDependency()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_HasA2dDependency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getParentID <em>Parent ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getParentID()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_ParentID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAElement#getPackageID <em>Package ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAElement#getPackageID()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_PackageID();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EAMethod <em>EA Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Method</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod
	 * @generated
	 */
	EClass getEAMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getReturnType()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getReturnIsArray <em>Return Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Is Array</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getReturnIsArray()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_ReturnIsArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getCode()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getThrows()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_Throws();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsPure <em>Is Pure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pure</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getIsPure()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_IsPure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getIsRoot()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getIsLeaf()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getIsQuery()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_IsQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsSynchronized <em>Is Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronized</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getIsSynchronized()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_IsSynchronized();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getIsAbstract()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getConcurrency()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_Concurrency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getClassifierID <em>Classifier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getClassifierID()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_ClassifierID();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.eaadapter.model.EAMethod#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getElement()
	 * @see #getEAMethod()
	 * @generated
	 */
	EReference getEAMethod_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethod#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getEaLink()
	 * @see #getEAMethod()
	 * @generated
	 */
	EAttribute getEAMethod_EaLink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getParameters()
	 * @see #getEAMethod()
	 * @generated
	 */
	EReference getEAMethod_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAMethod#getTaggedValues <em>Tagged Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getTaggedValues()
	 * @see #getEAMethod()
	 * @generated
	 */
	EReference getEAMethod_TaggedValues();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EAMethodTag <em>EA Method Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Method Tag</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethodTag
	 * @generated
	 */
	EClass getEAMethodTag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAMethodTag#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAMethodTag#getEaLink()
	 * @see #getEAMethodTag()
	 * @generated
	 */
	EAttribute getEAMethodTag_EaLink();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EAPackage <em>EA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Package</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAPackage
	 * @generated
	 */
	EClass getEAPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAPackage#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAPackage#getDiagrams()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_Diagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAPackage#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAPackage#getElements()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EAPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAPackage#getPackages()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_Packages();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.eaadapter.model.EAPackage#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAPackage#getPackage()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAPackage#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAPackage#getEaLink()
	 * @see #getEAPackage()
	 * @generated
	 */
	EAttribute getEAPackage_EaLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAPackage#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAPackage#getStereotype()
	 * @see #getEAPackage()
	 * @generated
	 */
	EAttribute getEAPackage_Stereotype();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EAParameter <em>EA Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Parameter</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAParameter
	 * @generated
	 */
	EClass getEAParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAParameter#getType()
	 * @see #getEAParameter()
	 * @generated
	 */
	EAttribute getEAParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAParameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAParameter#getDefault()
	 * @see #getEAParameter()
	 * @generated
	 */
	EAttribute getEAParameter_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAParameter#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAParameter#getPosition()
	 * @see #getEAParameter()
	 * @generated
	 */
	EAttribute getEAParameter_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAParameter#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAParameter#getIsConst()
	 * @see #getEAParameter()
	 * @generated
	 */
	EAttribute getEAParameter_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAParameter#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAParameter#getKind()
	 * @see #getEAParameter()
	 * @generated
	 */
	EAttribute getEAParameter_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAParameter#getClassifierID <em>Classifier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAParameter#getClassifierID()
	 * @see #getEAParameter()
	 * @generated
	 */
	EAttribute getEAParameter_ClassifierID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAParameter#getOperationID <em>Operation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAParameter#getOperationID()
	 * @see #getEAParameter()
	 * @generated
	 */
	EAttribute getEAParameter_OperationID();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.eaadapter.model.EAParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAParameter#getMethod()
	 * @see #getEAParameter()
	 * @generated
	 */
	EReference getEAParameter_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EAParameter#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EAParameter#getEaLink()
	 * @see #getEAParameter()
	 * @generated
	 */
	EAttribute getEAParameter_EaLink();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EARepository <em>EA Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Repository</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository
	 * @generated
	 */
	EClass getEARepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EARepository#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getModels()
	 * @see #getEARepository()
	 * @generated
	 */
	EReference getEARepository_Models();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getEaLink()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_EaLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getFile()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_File();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getUser()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_User();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getPassword()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#getCaching <em>Caching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caching</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getCaching()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_Caching();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#getReadonlyEaLink <em>Readonly Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getReadonlyEaLink()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_ReadonlyEaLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagrams</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getDiagrams()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_Diagrams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#getPrefetchCompleteModel <em>Prefetch Complete Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefetch Complete Model</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getPrefetchCompleteModel()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_PrefetchCompleteModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#getPrefetchPackageGuids <em>Prefetch Package Guids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefetch Package Guids</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getPrefetchPackageGuids()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_PrefetchPackageGuids();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EARepository#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getFilter()
	 * @see #getEARepository()
	 * @generated
	 */
	EReference getEARepository_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.eaadapter.model.EARepository#getPersistentModels <em>Persistent Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistent Models</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#getPersistentModels()
	 * @see #getEARepository()
	 * @generated
	 */
	EReference getEARepository_PersistentModels();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#isPersistent()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EARepository#isPrefetchingEnabled <em>Prefetching Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefetching Enabled</em>'.
	 * @see org.eclipselabs.eaadapter.model.EARepository#isPrefetchingEnabled()
	 * @see #getEARepository()
	 * @generated
	 */
	EAttribute getEARepository_PrefetchingEnabled();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.EATaggedValue <em>EA Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Tagged Value</em>'.
	 * @see org.eclipselabs.eaadapter.model.EATaggedValue
	 * @generated
	 */
	EClass getEATaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.EATaggedValue#getEaLink <em>Ea Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea Link</em>'.
	 * @see org.eclipselabs.eaadapter.model.EATaggedValue#getEaLink()
	 * @see #getEATaggedValue()
	 * @generated
	 */
	EAttribute getEATaggedValue_EaLink();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see org.eclipselabs.eaadapter.model.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.Filter#getFilterClass <em>Filter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Class</em>'.
	 * @see org.eclipselabs.eaadapter.model.Filter#getFilterClass()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_FilterClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.Filter#getFilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.Filter#getFilterType()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_FilterType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.Filter#getFilterAttribute <em>Filter Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Attribute</em>'.
	 * @see org.eclipselabs.eaadapter.model.Filter#getFilterAttribute()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_FilterAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.Filter#getFilterExpression <em>Filter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Expression</em>'.
	 * @see org.eclipselabs.eaadapter.model.Filter#getFilterExpression()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_FilterExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.Filter#getNegate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negate</em>'.
	 * @see org.eclipselabs.eaadapter.model.Filter#getNegate()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Negate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EamodelFactory getEamodelFactory();

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
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EAAttributeImpl <em>EA Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EAAttributeImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAAttribute()
		 * @generated
		 */
		EClass EA_ATTRIBUTE = eINSTANCE.getEAAttribute();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__CONTAINMENT = eINSTANCE.getEAAttribute_Containment();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__IS_COLLECTION = eINSTANCE.getEAAttribute_IsCollection();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__IS_ORDERED = eINSTANCE.getEAAttribute_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Allow Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__ALLOW_DUPLICATES = eINSTANCE.getEAAttribute_AllowDuplicates();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__IS_DERIVED = eINSTANCE.getEAAttribute_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__CONTAINER = eINSTANCE.getEAAttribute_Container();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__SCALE = eINSTANCE.getEAAttribute_Scale();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__PRECISION = eINSTANCE.getEAAttribute_Precision();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__LENGTH = eINSTANCE.getEAAttribute_Length();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__LOWER_BOUND = eINSTANCE.getEAAttribute_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__UPPER_BOUND = eINSTANCE.getEAAttribute_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__DEFAULT = eINSTANCE.getEAAttribute_Default();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ATTRIBUTE__ELEMENT = eINSTANCE.getEAAttribute_Element();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE__EA_LINK = eINSTANCE.getEAAttribute_EaLink();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ATTRIBUTE__TAGGED_VALUES = eINSTANCE.getEAAttribute_TaggedValues();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EAAttributeTagImpl <em>EA Attribute Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EAAttributeTagImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAAttributeTag()
		 * @generated
		 */
		EClass EA_ATTRIBUTE_TAG = eINSTANCE.getEAAttributeTag();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ATTRIBUTE_TAG__EA_LINK = eINSTANCE.getEAAttributeTag_EaLink();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EAConnectorImpl <em>EA Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EAConnectorImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAConnector()
		 * @generated
		 */
		EClass EA_CONNECTOR = eINSTANCE.getEAConnector();

		/**
		 * The meta object literal for the '<em><b>Connector ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CONNECTOR_ID = eINSTANCE.getEAConnector_ConnectorID();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__DIRECTION = eINSTANCE.getEAConnector_Direction();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUBTYPE = eINSTANCE.getEAConnector_Subtype();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__IS_LEAF = eINSTANCE.getEAConnector_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__IS_ROOT = eINSTANCE.getEAConnector_IsRoot();

		/**
		 * The meta object literal for the '<em><b>Is Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__IS_SPEC = eINSTANCE.getEAConnector_IsSpec();

		/**
		 * The meta object literal for the '<em><b>Virtual Inheritance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__VIRTUAL_INHERITANCE = eINSTANCE.getEAConnector_VirtualInheritance();

		/**
		 * The meta object literal for the '<em><b>Transition Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__TRANSITION_EVENT = eINSTANCE.getEAConnector_TransitionEvent();

		/**
		 * The meta object literal for the '<em><b>Transition Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__TRANSITION_ACTION = eINSTANCE.getEAConnector_TransitionAction();

		/**
		 * The meta object literal for the '<em><b>Transition Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__TRANSITION_GUARD = eINSTANCE.getEAConnector_TransitionGuard();

		/**
		 * The meta object literal for the '<em><b>Route Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__ROUTE_STYLE = eINSTANCE.getEAConnector_RouteStyle();

		/**
		 * The meta object literal for the '<em><b>Sequence No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SEQUENCE_NO = eINSTANCE.getEAConnector_SequenceNo();

		/**
		 * The meta object literal for the '<em><b>Diagram ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__DIAGRAM_ID = eINSTANCE.getEAConnector_DiagramID();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__EA_LINK = eINSTANCE.getEAConnector_EaLink();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_CONNECTOR__TAGGED_VALUES = eINSTANCE.getEAConnector_TaggedValues();

		/**
		 * The meta object literal for the '<em><b>Supplier ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUPPLIER_ID = eINSTANCE.getEAConnector_SupplierID();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_CONNECTOR__SUPPLIER = eINSTANCE.getEAConnector_Supplier();

		/**
		 * The meta object literal for the '<em><b>Supplier End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_CONNECTOR__SUPPLIER_END = eINSTANCE.getEAConnector_SupplierEnd();

		/**
		 * The meta object literal for the '<em><b>Client ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CLIENT_ID = eINSTANCE.getEAConnector_ClientID();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_CONNECTOR__CLIENT = eINSTANCE.getEAConnector_Client();

		/**
		 * The meta object literal for the '<em><b>Client End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_CONNECTOR__CLIENT_END = eINSTANCE.getEAConnector_ClientEnd();

		/**
		 * The meta object literal for the '<em><b>Client aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CLIENT_AGGREGATION = eINSTANCE.getEAConnector_Client_aggregation();

		/**
		 * The meta object literal for the '<em><b>Client cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CLIENT_CARDINALITY = eINSTANCE.getEAConnector_Client_cardinality();

		/**
		 * The meta object literal for the '<em><b>Client containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CLIENT_CONTAINMENT = eINSTANCE.getEAConnector_Client_containment();

		/**
		 * The meta object literal for the '<em><b>Client is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CLIENT_IS_NAVIGABLE = eINSTANCE.getEAConnector_Client_isNavigable();

		/**
		 * The meta object literal for the '<em><b>Client note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CLIENT_NOTE = eINSTANCE.getEAConnector_Client_note();

		/**
		 * The meta object literal for the '<em><b>Client role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CLIENT_ROLE = eINSTANCE.getEAConnector_Client_role();

		/**
		 * The meta object literal for the '<em><b>Client role Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CLIENT_ROLE_TYPE = eINSTANCE.getEAConnector_Client_roleType();

		/**
		 * The meta object literal for the '<em><b>Client stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CLIENT_STEREOTYPE = eINSTANCE.getEAConnector_Client_stereotype();

		/**
		 * The meta object literal for the '<em><b>Client visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__CLIENT_VISIBILITY = eINSTANCE.getEAConnector_Client_visibility();

		/**
		 * The meta object literal for the '<em><b>Supplier aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUPPLIER_AGGREGATION = eINSTANCE.getEAConnector_Supplier_aggregation();

		/**
		 * The meta object literal for the '<em><b>Supplier cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUPPLIER_CARDINALITY = eINSTANCE.getEAConnector_Supplier_cardinality();

		/**
		 * The meta object literal for the '<em><b>Supplier containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUPPLIER_CONTAINMENT = eINSTANCE.getEAConnector_Supplier_containment();

		/**
		 * The meta object literal for the '<em><b>Supplier is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUPPLIER_IS_NAVIGABLE = eINSTANCE.getEAConnector_Supplier_isNavigable();

		/**
		 * The meta object literal for the '<em><b>Supplier note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUPPLIER_NOTE = eINSTANCE.getEAConnector_Supplier_note();

		/**
		 * The meta object literal for the '<em><b>Supplier role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUPPLIER_ROLE = eINSTANCE.getEAConnector_Supplier_role();

		/**
		 * The meta object literal for the '<em><b>Supplier role Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUPPLIER_ROLE_TYPE = eINSTANCE.getEAConnector_Supplier_roleType();

		/**
		 * The meta object literal for the '<em><b>Supplier stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUPPLIER_STEREOTYPE = eINSTANCE.getEAConnector_Supplier_stereotype();

		/**
		 * The meta object literal for the '<em><b>Supplier visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__SUPPLIER_VISIBILITY = eINSTANCE.getEAConnector_Supplier_visibility();

		/**
		 * The meta object literal for the '<em><b>Is A2d Dependency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR__IS_A2D_DEPENDENCY = eINSTANCE.getEAConnector_IsA2dDependency();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl <em>EA Connector End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EAConnectorEndImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAConnectorEnd()
		 * @generated
		 */
		EClass EA_CONNECTOR_END = eINSTANCE.getEAConnectorEnd();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__AGGREGATION = eINSTANCE.getEAConnectorEnd_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__CARDINALITY = eINSTANCE.getEAConnectorEnd_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__CONTAINMENT = eINSTANCE.getEAConnectorEnd_Containment();

		/**
		 * The meta object literal for the '<em><b>Is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__IS_NAVIGABLE = eINSTANCE.getEAConnectorEnd_IsNavigable();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__NOTE = eINSTANCE.getEAConnectorEnd_Note();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__ROLE = eINSTANCE.getEAConnectorEnd_Role();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__ROLE_TYPE = eINSTANCE.getEAConnectorEnd_RoleType();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__STEREOTYPE = eINSTANCE.getEAConnectorEnd_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__VISIBILITY = eINSTANCE.getEAConnectorEnd_Visibility();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__EA_LINK = eINSTANCE.getEAConnectorEnd_EaLink();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__ORDERING = eINSTANCE.getEAConnectorEnd_Ordering();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__QUALIFIER = eINSTANCE.getEAConnectorEnd_Qualifier();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_END__END = eINSTANCE.getEAConnectorEnd_End();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EAConnectorTagImpl <em>EA Connector Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EAConnectorTagImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAConnectorTag()
		 * @generated
		 */
		EClass EA_CONNECTOR_TAG = eINSTANCE.getEAConnectorTag();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CONNECTOR_TAG__EA_LINK = eINSTANCE.getEAConnectorTag_EaLink();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EADiagramImpl <em>EA Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EADiagramImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEADiagram()
		 * @generated
		 */
		EClass EA_DIAGRAM = eINSTANCE.getEADiagram();

		/**
		 * The meta object literal for the '<em><b>Swimlanes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM__SWIMLANES = eINSTANCE.getEADiagram_Swimlanes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM__TYPE = eINSTANCE.getEADiagram_Type();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_DIAGRAM__PACKAGE = eINSTANCE.getEADiagram_Package();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM__EA_LINK = eINSTANCE.getEADiagram_EaLink();

		/**
		 * The meta object literal for the '<em><b>Diagram Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_DIAGRAM__DIAGRAM_LINKS = eINSTANCE.getEADiagram_DiagramLinks();

		/**
		 * The meta object literal for the '<em><b>Diagram Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_DIAGRAM__DIAGRAM_OBJECTS = eINSTANCE.getEADiagram_DiagramObjects();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl <em>EA Diagram Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EADiagramLinkImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEADiagramLink()
		 * @generated
		 */
		EClass EA_DIAGRAM_LINK = eINSTANCE.getEADiagramLink();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_DIAGRAM_LINK__CONNECTOR = eINSTANCE.getEADiagramLink_Connector();

		/**
		 * The meta object literal for the '<em><b>Connector ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_LINK__CONNECTOR_ID = eINSTANCE.getEADiagramLink_ConnectorID();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_LINK__GEOMETRY = eINSTANCE.getEADiagramLink_Geometry();

		/**
		 * The meta object literal for the '<em><b>Is Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_LINK__IS_HIDDEN = eINSTANCE.getEADiagramLink_IsHidden();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_LINK__PATH = eINSTANCE.getEADiagramLink_Path();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_LINK__STYLE = eINSTANCE.getEADiagramLink_Style();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_LINK__EA_LINK = eINSTANCE.getEADiagramLink_EaLink();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl <em>EA Diagram Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EADiagramObjectImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEADiagramObject()
		 * @generated
		 */
		EClass EA_DIAGRAM_OBJECT = eINSTANCE.getEADiagramObject();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_OBJECT__BOTTOM = eINSTANCE.getEADiagramObject_Bottom();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_DIAGRAM_OBJECT__ELEMENT = eINSTANCE.getEADiagramObject_Element();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_OBJECT__ELEMENT_ID = eINSTANCE.getEADiagramObject_ElementID();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_OBJECT__LEFT = eINSTANCE.getEADiagramObject_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_OBJECT__RIGHT = eINSTANCE.getEADiagramObject_Right();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_OBJECT__SEQUENCE = eINSTANCE.getEADiagramObject_Sequence();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_OBJECT__TOP = eINSTANCE.getEADiagramObject_Top();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_DIAGRAM_OBJECT__EA_LINK = eINSTANCE.getEADiagramObject_EaLink();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EAElementImpl <em>EA Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EAElementImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAElement()
		 * @generated
		 */
		EClass EA_ELEMENT = eINSTANCE.getEAElement();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__ABSTRACT = eINSTANCE.getEAElement_Abstract();

		/**
		 * The meta object literal for the '<em><b>Classifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__CLASSIFIER_NAME = eINSTANCE.getEAElement_ClassifierName();

		/**
		 * The meta object literal for the '<em><b>Classifier Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__CLASSIFIER_TYPE = eINSTANCE.getEAElement_ClassifierType();

		/**
		 * The meta object literal for the '<em><b>Complexity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__COMPLEXITY = eINSTANCE.getEAElement_Complexity();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__DIFFICULTY = eINSTANCE.getEAElement_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Extension Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__EXTENSION_POINTS = eINSTANCE.getEAElement_ExtensionPoints();

		/**
		 * The meta object literal for the '<em><b>Genlinks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__GENLINKS = eINSTANCE.getEAElement_Genlinks();

		/**
		 * The meta object literal for the '<em><b>Genfile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__GENFILE = eINSTANCE.getEAElement_Genfile();

		/**
		 * The meta object literal for the '<em><b>Gentype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__GENTYPE = eINSTANCE.getEAElement_Gentype();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__MULTIPLICITY = eINSTANCE.getEAElement_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__PHASE = eINSTANCE.getEAElement_Phase();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__PRIORITY = eINSTANCE.getEAElement_Priority();

		/**
		 * The meta object literal for the '<em><b>Property Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__PROPERTY_TYPE = eINSTANCE.getEAElement_PropertyType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__STATUS = eINSTANCE.getEAElement_Status();

		/**
		 * The meta object literal for the '<em><b>Stereotype Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__STEREOTYPE_EX = eINSTANCE.getEAElement_StereotypeEx();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__SUBTYPE = eINSTANCE.getEAElement_Subtype();

		/**
		 * The meta object literal for the '<em><b>Tablespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__TABLESPACE = eINSTANCE.getEAElement_Tablespace();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__TAG = eINSTANCE.getEAElement_Tag();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ELEMENT__ELEMENT = eINSTANCE.getEAElement_Element();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ELEMENT__PACKAGE = eINSTANCE.getEAElement_Package();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ELEMENT__ATTRIBUTES = eINSTANCE.getEAElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ELEMENT__CONNECTORS = eINSTANCE.getEAElement_Connectors();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ELEMENT__ELEMENTS = eINSTANCE.getEAElement_Elements();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ELEMENT__METHODS = eINSTANCE.getEAElement_Methods();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ELEMENT__TAGGED_VALUES = eINSTANCE.getEAElement_TaggedValues();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__EA_LINK = eINSTANCE.getEAElement_EaLink();

		/**
		 * The meta object literal for the '<em><b>Has A2d Dependency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__HAS_A2D_DEPENDENCY = eINSTANCE.getEAElement_HasA2dDependency();

		/**
		 * The meta object literal for the '<em><b>Parent ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__PARENT_ID = eINSTANCE.getEAElement_ParentID();

		/**
		 * The meta object literal for the '<em><b>Package ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__PACKAGE_ID = eINSTANCE.getEAElement_PackageID();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EAMethodImpl <em>EA Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EAMethodImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAMethod()
		 * @generated
		 */
		EClass EA_METHOD = eINSTANCE.getEAMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__RETURN_TYPE = eINSTANCE.getEAMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Return Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__RETURN_IS_ARRAY = eINSTANCE.getEAMethod_ReturnIsArray();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__CODE = eINSTANCE.getEAMethod_Code();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__THROWS = eINSTANCE.getEAMethod_Throws();

		/**
		 * The meta object literal for the '<em><b>Is Pure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__IS_PURE = eINSTANCE.getEAMethod_IsPure();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__IS_ROOT = eINSTANCE.getEAMethod_IsRoot();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__IS_LEAF = eINSTANCE.getEAMethod_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__IS_QUERY = eINSTANCE.getEAMethod_IsQuery();

		/**
		 * The meta object literal for the '<em><b>Is Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__IS_SYNCHRONIZED = eINSTANCE.getEAMethod_IsSynchronized();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__IS_ABSTRACT = eINSTANCE.getEAMethod_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__CONCURRENCY = eINSTANCE.getEAMethod_Concurrency();

		/**
		 * The meta object literal for the '<em><b>Classifier ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__CLASSIFIER_ID = eINSTANCE.getEAMethod_ClassifierID();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_METHOD__ELEMENT = eINSTANCE.getEAMethod_Element();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD__EA_LINK = eINSTANCE.getEAMethod_EaLink();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_METHOD__PARAMETERS = eINSTANCE.getEAMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_METHOD__TAGGED_VALUES = eINSTANCE.getEAMethod_TaggedValues();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EAMethodTagImpl <em>EA Method Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EAMethodTagImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAMethodTag()
		 * @generated
		 */
		EClass EA_METHOD_TAG = eINSTANCE.getEAMethodTag();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_METHOD_TAG__EA_LINK = eINSTANCE.getEAMethodTag_EaLink();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EAPackageImpl <em>EA Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EAPackageImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAPackage()
		 * @generated
		 */
		EClass EA_PACKAGE = eINSTANCE.getEAPackage();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PACKAGE__DIAGRAMS = eINSTANCE.getEAPackage_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PACKAGE__ELEMENTS = eINSTANCE.getEAPackage_Elements();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PACKAGE__PACKAGES = eINSTANCE.getEAPackage_Packages();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PACKAGE__PACKAGE = eINSTANCE.getEAPackage_Package();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PACKAGE__EA_LINK = eINSTANCE.getEAPackage_EaLink();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PACKAGE__STEREOTYPE = eINSTANCE.getEAPackage_Stereotype();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EAParameterImpl <em>EA Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EAParameterImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEAParameter()
		 * @generated
		 */
		EClass EA_PARAMETER = eINSTANCE.getEAParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PARAMETER__TYPE = eINSTANCE.getEAParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PARAMETER__DEFAULT = eINSTANCE.getEAParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PARAMETER__POSITION = eINSTANCE.getEAParameter_Position();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PARAMETER__IS_CONST = eINSTANCE.getEAParameter_IsConst();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PARAMETER__KIND = eINSTANCE.getEAParameter_Kind();

		/**
		 * The meta object literal for the '<em><b>Classifier ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PARAMETER__CLASSIFIER_ID = eINSTANCE.getEAParameter_ClassifierID();

		/**
		 * The meta object literal for the '<em><b>Operation ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PARAMETER__OPERATION_ID = eINSTANCE.getEAParameter_OperationID();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PARAMETER__METHOD = eINSTANCE.getEAParameter_Method();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_PARAMETER__EA_LINK = eINSTANCE.getEAParameter_EaLink();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl <em>EA Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EARepositoryImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEARepository()
		 * @generated
		 */
		EClass EA_REPOSITORY = eINSTANCE.getEARepository();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_REPOSITORY__MODELS = eINSTANCE.getEARepository_Models();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__EA_LINK = eINSTANCE.getEARepository_EaLink();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__FILE = eINSTANCE.getEARepository_File();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__USER = eINSTANCE.getEARepository_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__PASSWORD = eINSTANCE.getEARepository_Password();

		/**
		 * The meta object literal for the '<em><b>Caching</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__CACHING = eINSTANCE.getEARepository_Caching();

		/**
		 * The meta object literal for the '<em><b>Readonly Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__READONLY_EA_LINK = eINSTANCE.getEARepository_ReadonlyEaLink();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__DIAGRAMS = eINSTANCE.getEARepository_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Prefetch Complete Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__PREFETCH_COMPLETE_MODEL = eINSTANCE.getEARepository_PrefetchCompleteModel();

		/**
		 * The meta object literal for the '<em><b>Prefetch Package Guids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__PREFETCH_PACKAGE_GUIDS = eINSTANCE.getEARepository_PrefetchPackageGuids();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_REPOSITORY__FILTER = eINSTANCE.getEARepository_Filter();

		/**
		 * The meta object literal for the '<em><b>Persistent Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_REPOSITORY__PERSISTENT_MODELS = eINSTANCE.getEARepository_PersistentModels();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__PERSISTENT = eINSTANCE.getEARepository_Persistent();

		/**
		 * The meta object literal for the '<em><b>Prefetching Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_REPOSITORY__PREFETCHING_ENABLED = eINSTANCE.getEARepository_PrefetchingEnabled();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.EATaggedValueImpl <em>EA Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.EATaggedValueImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getEATaggedValue()
		 * @generated
		 */
		EClass EA_TAGGED_VALUE = eINSTANCE.getEATaggedValue();

		/**
		 * The meta object literal for the '<em><b>Ea Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_TAGGED_VALUE__EA_LINK = eINSTANCE.getEATaggedValue_EaLink();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.impl.FilterImpl
		 * @see org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Filter Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__FILTER_CLASS = eINSTANCE.getFilter_FilterClass();

		/**
		 * The meta object literal for the '<em><b>Filter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__FILTER_TYPE = eINSTANCE.getFilter_FilterType();

		/**
		 * The meta object literal for the '<em><b>Filter Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__FILTER_ATTRIBUTE = eINSTANCE.getFilter_FilterAttribute();

		/**
		 * The meta object literal for the '<em><b>Filter Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__FILTER_EXPRESSION = eINSTANCE.getFilter_FilterExpression();

		/**
		 * The meta object literal for the '<em><b>Negate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__NEGATE = eINSTANCE.getFilter_Negate();

	}

} //EamodelPackage
