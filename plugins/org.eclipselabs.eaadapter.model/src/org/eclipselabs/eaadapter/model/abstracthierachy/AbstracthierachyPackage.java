/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyFactory
 * @model kind="package"
 * @generated
 */
public interface AbstracthierachyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracthierachy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipselabs.eaadapter.model.abstracthierachy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipselabs.eaadapter.model.abstracthierachy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstracthierachyPackage eINSTANCE = org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass <em>EA Base Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEABaseClass()
	 * @generated
	 */
	int EA_BASE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BASE_CLASS__OBJECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BASE_CLASS__ID = 1;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BASE_CLASS__REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>EA Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BASE_CLASS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement <em>EA Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEANamedElement()
	 * @generated
	 */
	int EA_NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NAMED_ELEMENT__OBJECT_TYPE = EA_BASE_CLASS__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NAMED_ELEMENT__ID = EA_BASE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NAMED_ELEMENT__REPOSITORY = EA_BASE_CLASS__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NAMED_ELEMENT__NAME = EA_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NAMED_ELEMENT__NOTES = EA_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NAMED_ELEMENT__GUID = EA_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EA Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NAMED_ELEMENT_FEATURE_COUNT = EA_BASE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement <em>EA Versiond Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAVersiondElement()
	 * @generated
	 */
	int EA_VERSIOND_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VERSIOND_ELEMENT__OBJECT_TYPE = EA_NAMED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VERSIOND_ELEMENT__ID = EA_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VERSIOND_ELEMENT__REPOSITORY = EA_NAMED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VERSIOND_ELEMENT__NAME = EA_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VERSIOND_ELEMENT__NOTES = EA_NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VERSIOND_ELEMENT__GUID = EA_NAMED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VERSIOND_ELEMENT__VERSION = EA_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Versiond Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VERSIOND_ELEMENT_FEATURE_COUNT = EA_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage <em>EA Abstract Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAAbstractPackage()
	 * @generated
	 */
	int EA_ABSTRACT_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE__OBJECT_TYPE = EA_VERSIOND_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE__ID = EA_VERSIOND_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE__REPOSITORY = EA_VERSIOND_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE__NAME = EA_VERSIOND_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE__NOTES = EA_VERSIOND_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE__GUID = EA_VERSIOND_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE__VERSION = EA_VERSIOND_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Code Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE__CODE_PATH = EA_VERSIOND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE__FLAGS = EA_VERSIOND_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE__IS_MODEL = EA_VERSIOND_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EA Abstract Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ABSTRACT_PACKAGE_FEATURE_COUNT = EA_VERSIOND_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement <em>EA Stereotyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAStereotypedElement()
	 * @generated
	 */
	int EA_STEREOTYPED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STEREOTYPED_ELEMENT__OBJECT_TYPE = EA_NAMED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STEREOTYPED_ELEMENT__ID = EA_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STEREOTYPED_ELEMENT__REPOSITORY = EA_NAMED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STEREOTYPED_ELEMENT__NAME = EA_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STEREOTYPED_ELEMENT__NOTES = EA_NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STEREOTYPED_ELEMENT__GUID = EA_NAMED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STEREOTYPED_ELEMENT__STEREOTYPE = EA_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Stereotyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STEREOTYPED_ELEMENT_FEATURE_COUNT = EA_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement <em>EA Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEATypedElement()
	 * @generated
	 */
	int EA_TYPED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TYPED_ELEMENT__OBJECT_TYPE = EA_STEREOTYPED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TYPED_ELEMENT__ID = EA_STEREOTYPED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TYPED_ELEMENT__REPOSITORY = EA_STEREOTYPED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TYPED_ELEMENT__NAME = EA_STEREOTYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TYPED_ELEMENT__NOTES = EA_STEREOTYPED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TYPED_ELEMENT__GUID = EA_STEREOTYPED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TYPED_ELEMENT__STEREOTYPE = EA_STEREOTYPED_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TYPED_ELEMENT__TYPE = EA_STEREOTYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TYPED_ELEMENT_FEATURE_COUNT = EA_STEREOTYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement <em>EA Visibility Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAVisibilityElement()
	 * @generated
	 */
	int EA_VISIBILITY_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VISIBILITY_ELEMENT__OBJECT_TYPE = EA_TYPED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VISIBILITY_ELEMENT__ID = EA_TYPED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VISIBILITY_ELEMENT__REPOSITORY = EA_TYPED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VISIBILITY_ELEMENT__NAME = EA_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VISIBILITY_ELEMENT__NOTES = EA_TYPED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VISIBILITY_ELEMENT__GUID = EA_TYPED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VISIBILITY_ELEMENT__STEREOTYPE = EA_TYPED_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VISIBILITY_ELEMENT__TYPE = EA_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VISIBILITY_ELEMENT__VISIBILITY = EA_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Visibility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VISIBILITY_ELEMENT_FEATURE_COUNT = EA_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong <em>EA Classifier ID Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAClassifierIDLong()
	 * @generated
	 */
	int EA_CLASSIFIER_ID_LONG = 2;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG__OBJECT_TYPE = EA_VISIBILITY_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG__ID = EA_VISIBILITY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG__REPOSITORY = EA_VISIBILITY_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG__NAME = EA_VISIBILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG__NOTES = EA_VISIBILITY_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG__GUID = EA_VISIBILITY_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG__STEREOTYPE = EA_VISIBILITY_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG__TYPE = EA_VISIBILITY_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG__VISIBILITY = EA_VISIBILITY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Classifier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG__CLASSIFIER_ID = EA_VISIBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Classifier ID Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CLASSIFIER_ID_LONG_FEATURE_COUNT = EA_VISIBILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement <em>EA Modifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAModifiableElement()
	 * @generated
	 */
	int EA_MODIFIABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__OBJECT_TYPE = EA_VISIBILITY_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__ID = EA_VISIBILITY_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__REPOSITORY = EA_VISIBILITY_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__NAME = EA_VISIBILITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__NOTES = EA_VISIBILITY_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__GUID = EA_VISIBILITY_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__STEREOTYPE = EA_VISIBILITY_ELEMENT__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__TYPE = EA_VISIBILITY_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__VISIBILITY = EA_VISIBILITY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__IS_CONST = EA_VISIBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT__IS_STATIC = EA_VISIBILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EA Modifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MODIFIABLE_ELEMENT_FEATURE_COUNT = EA_VISIBILITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement <em>EA Owned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAOwnedElement()
	 * @generated
	 */
	int EA_OWNED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OWNED_ELEMENT__OBJECT_TYPE = EA_VERSIOND_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OWNED_ELEMENT__ID = EA_VERSIOND_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OWNED_ELEMENT__REPOSITORY = EA_VERSIOND_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OWNED_ELEMENT__NAME = EA_VERSIOND_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OWNED_ELEMENT__NOTES = EA_VERSIOND_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OWNED_ELEMENT__GUID = EA_VERSIOND_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OWNED_ELEMENT__VERSION = EA_VERSIOND_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OWNED_ELEMENT__AUTHOR = EA_VERSIOND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OWNED_ELEMENT__IS_LOCKED = EA_VERSIOND_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EA Owned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_OWNED_ELEMENT_FEATURE_COUNT = EA_VERSIOND_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement <em>EA Tagged Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEATaggedElement()
	 * @generated
	 */
	int EA_TAGGED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_ELEMENT__OBJECT_TYPE = EA_NAMED_ELEMENT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_ELEMENT__ID = EA_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_ELEMENT__REPOSITORY = EA_NAMED_ELEMENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_ELEMENT__NAME = EA_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_ELEMENT__NOTES = EA_NAMED_ELEMENT__NOTES;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_ELEMENT__GUID = EA_NAMED_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_ELEMENT__VALUE = EA_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tag ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_ELEMENT__TAG_ID = EA_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EA Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TAGGED_ELEMENT_FEATURE_COUNT = EA_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement <em>EA Movable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAMovableElement()
	 * @generated
	 */
	int EA_MOVABLE_ELEMENT = 11;

	/**
	 * The number of structural features of the '<em>EA Movable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_MOVABLE_ELEMENT_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage <em>EA Abstract Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Abstract Package</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage
	 * @generated
	 */
	EClass getEAAbstractPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage#getCodePath <em>Code Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Path</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage#getCodePath()
	 * @see #getEAAbstractPackage()
	 * @generated
	 */
	EAttribute getEAAbstractPackage_CodePath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage#getFlags()
	 * @see #getEAAbstractPackage()
	 * @generated
	 */
	EAttribute getEAAbstractPackage_Flags();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage#getIsModel <em>Is Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Model</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage#getIsModel()
	 * @see #getEAAbstractPackage()
	 * @generated
	 */
	EAttribute getEAAbstractPackage_IsModel();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass <em>EA Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Base Class</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass
	 * @generated
	 */
	EClass getEABaseClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getObjectType()
	 * @see #getEABaseClass()
	 * @generated
	 */
	EAttribute getEABaseClass_ObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getId()
	 * @see #getEABaseClass()
	 * @generated
	 */
	EAttribute getEABaseClass_Id();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass#getRepository()
	 * @see #getEABaseClass()
	 * @generated
	 */
	EReference getEABaseClass_Repository();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong <em>EA Classifier ID Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Classifier ID Long</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong
	 * @generated
	 */
	EClass getEAClassifierIDLong();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong#getClassifierID <em>Classifier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong#getClassifierID()
	 * @see #getEAClassifierIDLong()
	 * @generated
	 */
	EAttribute getEAClassifierIDLong_ClassifierID();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement <em>EA Modifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Modifiable Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement
	 * @generated
	 */
	EClass getEAModifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement#getIsConst()
	 * @see #getEAModifiableElement()
	 * @generated
	 */
	EAttribute getEAModifiableElement_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement#getIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement#getIsStatic()
	 * @see #getEAModifiableElement()
	 * @generated
	 */
	EAttribute getEAModifiableElement_IsStatic();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement <em>EA Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Named Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement
	 * @generated
	 */
	EClass getEANamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getName()
	 * @see #getEANamedElement()
	 * @generated
	 */
	EAttribute getEANamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getNotes()
	 * @see #getEANamedElement()
	 * @generated
	 */
	EAttribute getEANamedElement_Notes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement#getGuid()
	 * @see #getEANamedElement()
	 * @generated
	 */
	EAttribute getEANamedElement_Guid();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement <em>EA Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Owned Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement
	 * @generated
	 */
	EClass getEAOwnedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement#getAuthor()
	 * @see #getEAOwnedElement()
	 * @generated
	 */
	EAttribute getEAOwnedElement_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement#getIsLocked <em>Is Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Locked</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement#getIsLocked()
	 * @see #getEAOwnedElement()
	 * @generated
	 */
	EAttribute getEAOwnedElement_IsLocked();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement <em>EA Stereotyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Stereotyped Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement
	 * @generated
	 */
	EClass getEAStereotypedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement#getStereotype()
	 * @see #getEAStereotypedElement()
	 * @generated
	 */
	EAttribute getEAStereotypedElement_Stereotype();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement <em>EA Tagged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Tagged Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement
	 * @generated
	 */
	EClass getEATaggedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement#getValue()
	 * @see #getEATaggedElement()
	 * @generated
	 */
	EAttribute getEATaggedElement_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement#getTagID <em>Tag ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag ID</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement#getTagID()
	 * @see #getEATaggedElement()
	 * @generated
	 */
	EAttribute getEATaggedElement_TagID();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement <em>EA Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Typed Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement
	 * @generated
	 */
	EClass getEATypedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement#getType()
	 * @see #getEATypedElement()
	 * @generated
	 */
	EAttribute getEATypedElement_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement <em>EA Versiond Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Versiond Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement
	 * @generated
	 */
	EClass getEAVersiondElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement#getVersion()
	 * @see #getEAVersiondElement()
	 * @generated
	 */
	EAttribute getEAVersiondElement_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement <em>EA Visibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Visibility Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement
	 * @generated
	 */
	EClass getEAVisibilityElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement#getVisibility()
	 * @see #getEAVisibilityElement()
	 * @generated
	 */
	EAttribute getEAVisibilityElement_Visibility();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement <em>EA Movable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Movable Element</em>'.
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement
	 * @generated
	 */
	EClass getEAMovableElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstracthierachyFactory getAbstracthierachyFactory();

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
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage <em>EA Abstract Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAAbstractPackage()
		 * @generated
		 */
		EClass EA_ABSTRACT_PACKAGE = eINSTANCE.getEAAbstractPackage();

		/**
		 * The meta object literal for the '<em><b>Code Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ABSTRACT_PACKAGE__CODE_PATH = eINSTANCE.getEAAbstractPackage_CodePath();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ABSTRACT_PACKAGE__FLAGS = eINSTANCE.getEAAbstractPackage_Flags();

		/**
		 * The meta object literal for the '<em><b>Is Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ABSTRACT_PACKAGE__IS_MODEL = eINSTANCE.getEAAbstractPackage_IsModel();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass <em>EA Base Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEABaseClass()
		 * @generated
		 */
		EClass EA_BASE_CLASS = eINSTANCE.getEABaseClass();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_BASE_CLASS__OBJECT_TYPE = eINSTANCE.getEABaseClass_ObjectType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_BASE_CLASS__ID = eINSTANCE.getEABaseClass_Id();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_BASE_CLASS__REPOSITORY = eINSTANCE.getEABaseClass_Repository();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong <em>EA Classifier ID Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAClassifierIDLong()
		 * @generated
		 */
		EClass EA_CLASSIFIER_ID_LONG = eINSTANCE.getEAClassifierIDLong();

		/**
		 * The meta object literal for the '<em><b>Classifier ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_CLASSIFIER_ID_LONG__CLASSIFIER_ID = eINSTANCE.getEAClassifierIDLong_ClassifierID();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement <em>EA Modifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAModifiableElement()
		 * @generated
		 */
		EClass EA_MODIFIABLE_ELEMENT = eINSTANCE.getEAModifiableElement();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_MODIFIABLE_ELEMENT__IS_CONST = eINSTANCE.getEAModifiableElement_IsConst();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_MODIFIABLE_ELEMENT__IS_STATIC = eINSTANCE.getEAModifiableElement_IsStatic();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement <em>EA Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEANamedElement()
		 * @generated
		 */
		EClass EA_NAMED_ELEMENT = eINSTANCE.getEANamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_NAMED_ELEMENT__NAME = eINSTANCE.getEANamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_NAMED_ELEMENT__NOTES = eINSTANCE.getEANamedElement_Notes();

		/**
		 * The meta object literal for the '<em><b>Guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_NAMED_ELEMENT__GUID = eINSTANCE.getEANamedElement_Guid();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement <em>EA Owned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAOwnedElement()
		 * @generated
		 */
		EClass EA_OWNED_ELEMENT = eINSTANCE.getEAOwnedElement();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_OWNED_ELEMENT__AUTHOR = eINSTANCE.getEAOwnedElement_Author();

		/**
		 * The meta object literal for the '<em><b>Is Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_OWNED_ELEMENT__IS_LOCKED = eINSTANCE.getEAOwnedElement_IsLocked();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement <em>EA Stereotyped Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAStereotypedElement()
		 * @generated
		 */
		EClass EA_STEREOTYPED_ELEMENT = eINSTANCE.getEAStereotypedElement();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_STEREOTYPED_ELEMENT__STEREOTYPE = eINSTANCE.getEAStereotypedElement_Stereotype();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement <em>EA Tagged Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEATaggedElement()
		 * @generated
		 */
		EClass EA_TAGGED_ELEMENT = eINSTANCE.getEATaggedElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_TAGGED_ELEMENT__VALUE = eINSTANCE.getEATaggedElement_Value();

		/**
		 * The meta object literal for the '<em><b>Tag ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_TAGGED_ELEMENT__TAG_ID = eINSTANCE.getEATaggedElement_TagID();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement <em>EA Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EATypedElement
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEATypedElement()
		 * @generated
		 */
		EClass EA_TYPED_ELEMENT = eINSTANCE.getEATypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_TYPED_ELEMENT__TYPE = eINSTANCE.getEATypedElement_Type();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement <em>EA Versiond Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAVersiondElement()
		 * @generated
		 */
		EClass EA_VERSIOND_ELEMENT = eINSTANCE.getEAVersiondElement();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_VERSIOND_ELEMENT__VERSION = eINSTANCE.getEAVersiondElement_Version();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement <em>EA Visibility Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAVisibilityElement
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAVisibilityElement()
		 * @generated
		 */
		EClass EA_VISIBILITY_ELEMENT = eINSTANCE.getEAVisibilityElement();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_VISIBILITY_ELEMENT__VISIBILITY = eINSTANCE.getEAVisibilityElement_Visibility();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement <em>EA Movable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement
		 * @see org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl#getEAMovableElement()
		 * @generated
		 */
		EClass EA_MOVABLE_ELEMENT = eINSTANCE.getEAMovableElement();

	}

} //AbstracthierachyPackage
