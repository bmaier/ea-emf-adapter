/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyFactory;
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
import org.eclipselabs.eaadapter.model.datatypes.DatatypesPackage;
import org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl;
import org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstracthierachyPackageImpl extends EPackageImpl implements AbstracthierachyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaAbstractPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaBaseClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaClassifierIDLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaModifiableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaOwnedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaStereotypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaTaggedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaVersiondElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaVisibilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaMovableElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbstracthierachyPackageImpl() {
		super(eNS_URI, AbstracthierachyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AbstracthierachyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AbstracthierachyPackage init() {
		if (isInited) return (AbstracthierachyPackage)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI);

		// Obtain or create and register package
		AbstracthierachyPackageImpl theAbstracthierachyPackage = (AbstracthierachyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AbstracthierachyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AbstracthierachyPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EamodelPackageImpl theEamodelPackage = (EamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EamodelPackage.eNS_URI) instanceof EamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EamodelPackage.eNS_URI) : EamodelPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theAbstracthierachyPackage.createPackageContents();
		theEamodelPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theAbstracthierachyPackage.initializePackageContents();
		theEamodelPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbstracthierachyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AbstracthierachyPackage.eNS_URI, theAbstracthierachyPackage);
		return theAbstracthierachyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAAbstractPackage() {
		return eaAbstractPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAbstractPackage_CodePath() {
		return (EAttribute)eaAbstractPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAbstractPackage_Flags() {
		return (EAttribute)eaAbstractPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAbstractPackage_IsModel() {
		return (EAttribute)eaAbstractPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEABaseClass() {
		return eaBaseClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEABaseClass_ObjectType() {
		return (EAttribute)eaBaseClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEABaseClass_Id() {
		return (EAttribute)eaBaseClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEABaseClass_Repository() {
		return (EReference)eaBaseClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAClassifierIDLong() {
		return eaClassifierIDLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAClassifierIDLong_ClassifierID() {
		return (EAttribute)eaClassifierIDLongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAModifiableElement() {
		return eaModifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAModifiableElement_IsConst() {
		return (EAttribute)eaModifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAModifiableElement_IsStatic() {
		return (EAttribute)eaModifiableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEANamedElement() {
		return eaNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEANamedElement_Name() {
		return (EAttribute)eaNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEANamedElement_Notes() {
		return (EAttribute)eaNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEANamedElement_Guid() {
		return (EAttribute)eaNamedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAOwnedElement() {
		return eaOwnedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAOwnedElement_Author() {
		return (EAttribute)eaOwnedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAOwnedElement_IsLocked() {
		return (EAttribute)eaOwnedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAStereotypedElement() {
		return eaStereotypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAStereotypedElement_Stereotype() {
		return (EAttribute)eaStereotypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEATaggedElement() {
		return eaTaggedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEATaggedElement_Value() {
		return (EAttribute)eaTaggedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEATaggedElement_TagID() {
		return (EAttribute)eaTaggedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEATypedElement() {
		return eaTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEATypedElement_Type() {
		return (EAttribute)eaTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAVersiondElement() {
		return eaVersiondElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAVersiondElement_Version() {
		return (EAttribute)eaVersiondElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAVisibilityElement() {
		return eaVisibilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAVisibilityElement_Visibility() {
		return (EAttribute)eaVisibilityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAMovableElement() {
		return eaMovableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstracthierachyFactory getAbstracthierachyFactory() {
		return (AbstracthierachyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eaAbstractPackageEClass = createEClass(EA_ABSTRACT_PACKAGE);
		createEAttribute(eaAbstractPackageEClass, EA_ABSTRACT_PACKAGE__CODE_PATH);
		createEAttribute(eaAbstractPackageEClass, EA_ABSTRACT_PACKAGE__FLAGS);
		createEAttribute(eaAbstractPackageEClass, EA_ABSTRACT_PACKAGE__IS_MODEL);

		eaBaseClassEClass = createEClass(EA_BASE_CLASS);
		createEAttribute(eaBaseClassEClass, EA_BASE_CLASS__OBJECT_TYPE);
		createEAttribute(eaBaseClassEClass, EA_BASE_CLASS__ID);
		createEReference(eaBaseClassEClass, EA_BASE_CLASS__REPOSITORY);

		eaClassifierIDLongEClass = createEClass(EA_CLASSIFIER_ID_LONG);
		createEAttribute(eaClassifierIDLongEClass, EA_CLASSIFIER_ID_LONG__CLASSIFIER_ID);

		eaModifiableElementEClass = createEClass(EA_MODIFIABLE_ELEMENT);
		createEAttribute(eaModifiableElementEClass, EA_MODIFIABLE_ELEMENT__IS_CONST);
		createEAttribute(eaModifiableElementEClass, EA_MODIFIABLE_ELEMENT__IS_STATIC);

		eaNamedElementEClass = createEClass(EA_NAMED_ELEMENT);
		createEAttribute(eaNamedElementEClass, EA_NAMED_ELEMENT__NAME);
		createEAttribute(eaNamedElementEClass, EA_NAMED_ELEMENT__NOTES);
		createEAttribute(eaNamedElementEClass, EA_NAMED_ELEMENT__GUID);

		eaOwnedElementEClass = createEClass(EA_OWNED_ELEMENT);
		createEAttribute(eaOwnedElementEClass, EA_OWNED_ELEMENT__AUTHOR);
		createEAttribute(eaOwnedElementEClass, EA_OWNED_ELEMENT__IS_LOCKED);

		eaStereotypedElementEClass = createEClass(EA_STEREOTYPED_ELEMENT);
		createEAttribute(eaStereotypedElementEClass, EA_STEREOTYPED_ELEMENT__STEREOTYPE);

		eaTaggedElementEClass = createEClass(EA_TAGGED_ELEMENT);
		createEAttribute(eaTaggedElementEClass, EA_TAGGED_ELEMENT__VALUE);
		createEAttribute(eaTaggedElementEClass, EA_TAGGED_ELEMENT__TAG_ID);

		eaTypedElementEClass = createEClass(EA_TYPED_ELEMENT);
		createEAttribute(eaTypedElementEClass, EA_TYPED_ELEMENT__TYPE);

		eaVersiondElementEClass = createEClass(EA_VERSIOND_ELEMENT);
		createEAttribute(eaVersiondElementEClass, EA_VERSIOND_ELEMENT__VERSION);

		eaVisibilityElementEClass = createEClass(EA_VISIBILITY_ELEMENT);
		createEAttribute(eaVisibilityElementEClass, EA_VISIBILITY_ELEMENT__VISIBILITY);

		eaMovableElementEClass = createEClass(EA_MOVABLE_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EamodelPackage theEamodelPackage = (EamodelPackage)EPackage.Registry.INSTANCE.getEPackage(EamodelPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eaAbstractPackageEClass.getESuperTypes().add(this.getEAVersiondElement());
		eaClassifierIDLongEClass.getESuperTypes().add(this.getEAVisibilityElement());
		eaModifiableElementEClass.getESuperTypes().add(this.getEAVisibilityElement());
		eaNamedElementEClass.getESuperTypes().add(this.getEABaseClass());
		eaOwnedElementEClass.getESuperTypes().add(this.getEAVersiondElement());
		eaStereotypedElementEClass.getESuperTypes().add(this.getEANamedElement());
		eaTaggedElementEClass.getESuperTypes().add(this.getEANamedElement());
		eaTypedElementEClass.getESuperTypes().add(this.getEAStereotypedElement());
		eaVersiondElementEClass.getESuperTypes().add(this.getEANamedElement());
		eaVersiondElementEClass.getESuperTypes().add(this.getEAMovableElement());
		eaVisibilityElementEClass.getESuperTypes().add(this.getEATypedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(eaAbstractPackageEClass, EAAbstractPackage.class, "EAAbstractPackage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAAbstractPackage_CodePath(), ecorePackage.getEString(), "codePath", null, 0, 1, EAAbstractPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAbstractPackage_Flags(), ecorePackage.getEString(), "flags", null, 0, 1, EAAbstractPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAbstractPackage_IsModel(), ecorePackage.getEBooleanObject(), "isModel", null, 0, 1, EAAbstractPackage.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaBaseClassEClass, EABaseClass.class, "EABaseClass", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEABaseClass_ObjectType(), ecorePackage.getEString(), "objectType", null, 0, 1, EABaseClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEABaseClass_Id(), ecorePackage.getEIntegerObject(), "id", null, 0, 1, EABaseClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEABaseClass_Repository(), theEamodelPackage.getEARepository(), null, "repository", null, 0, 1, EABaseClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(eaBaseClassEClass, ecorePackage.getEBooleanObject(), "initializeAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getEACollection(), "collection", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eaBaseClassEClass, ecorePackage.getEBooleanObject(), "deleteAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getEACollection(), "collection", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaClassifierIDLongEClass, EAClassifierIDLong.class, "EAClassifierIDLong", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAClassifierIDLong_ClassifierID(), ecorePackage.getEIntegerObject(), "classifierID", null, 0, 1, EAClassifierIDLong.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaModifiableElementEClass, EAModifiableElement.class, "EAModifiableElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAModifiableElement_IsConst(), ecorePackage.getEBooleanObject(), "isConst", null, 0, 1, EAModifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAModifiableElement_IsStatic(), ecorePackage.getEBooleanObject(), "isStatic", null, 0, 1, EAModifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaNamedElementEClass, EANamedElement.class, "EANamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEANamedElement_Name(), ecorePackage.getEString(), "name", "name", 0, 1, EANamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEANamedElement_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, EANamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEANamedElement_Guid(), ecorePackage.getEString(), "guid", null, 0, 1, EANamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaOwnedElementEClass, EAOwnedElement.class, "EAOwnedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAOwnedElement_Author(), ecorePackage.getEString(), "author", null, 0, 1, EAOwnedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAOwnedElement_IsLocked(), ecorePackage.getEBooleanObject(), "isLocked", null, 0, 1, EAOwnedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaStereotypedElementEClass, EAStereotypedElement.class, "EAStereotypedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAStereotypedElement_Stereotype(), ecorePackage.getEString(), "stereotype", null, 0, 1, EAStereotypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaTaggedElementEClass, EATaggedElement.class, "EATaggedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEATaggedElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, EATaggedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEATaggedElement_TagID(), ecorePackage.getEIntegerObject(), "tagID", null, 0, 1, EATaggedElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaTypedElementEClass, EATypedElement.class, "EATypedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEATypedElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, EATypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaVersiondElementEClass, EAVersiondElement.class, "EAVersiondElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAVersiondElement_Version(), ecorePackage.getEString(), "version", null, 0, 1, EAVersiondElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaVisibilityElementEClass, EAVisibilityElement.class, "EAVisibilityElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAVisibilityElement_Visibility(), ecorePackage.getEString(), "visibility", "Public", 0, 1, EAVisibilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaMovableElementEClass, EAMovableElement.class, "EAMovableElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(eaMovableElementEClass, null, "setNewParent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEAVersiondElement(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //AbstracthierachyPackageImpl
