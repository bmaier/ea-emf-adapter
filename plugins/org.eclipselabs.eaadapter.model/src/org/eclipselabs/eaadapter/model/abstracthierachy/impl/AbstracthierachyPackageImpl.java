/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyFactory;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
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

		// Load packages
		theEamodelPackage.loadPackage();

		// Fix loaded packages
		theAbstracthierachyPackage.fixPackageContents();
		theEamodelPackage.fixPackageContents();
		theDatatypesPackage.fixPackageContents();

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
		if (eaAbstractPackageEClass == null) {
			eaAbstractPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(0);
		}
		return eaAbstractPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAbstractPackage_CodePath() {
        return (EAttribute)getEAAbstractPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAbstractPackage_Flags() {
        return (EAttribute)getEAAbstractPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAbstractPackage_IsModel() {
        return (EAttribute)getEAAbstractPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEABaseClass() {
		if (eaBaseClassEClass == null) {
			eaBaseClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(1);
		}
		return eaBaseClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEABaseClass_ObjectType() {
        return (EAttribute)getEABaseClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEABaseClass_Id() {
        return (EAttribute)getEABaseClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEABaseClass_Repository() {
        return (EReference)getEABaseClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAClassifierIDLong() {
		if (eaClassifierIDLongEClass == null) {
			eaClassifierIDLongEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(2);
		}
		return eaClassifierIDLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAClassifierIDLong_ClassifierID() {
        return (EAttribute)getEAClassifierIDLong().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAModifiableElement() {
		if (eaModifiableElementEClass == null) {
			eaModifiableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(3);
		}
		return eaModifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAModifiableElement_IsConst() {
        return (EAttribute)getEAModifiableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAModifiableElement_IsStatic() {
        return (EAttribute)getEAModifiableElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEANamedElement() {
		if (eaNamedElementEClass == null) {
			eaNamedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(4);
		}
		return eaNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEANamedElement_Name() {
        return (EAttribute)getEANamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEANamedElement_Notes() {
        return (EAttribute)getEANamedElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEANamedElement_Guid() {
        return (EAttribute)getEANamedElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAOwnedElement() {
		if (eaOwnedElementEClass == null) {
			eaOwnedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(5);
		}
		return eaOwnedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAOwnedElement_Author() {
        return (EAttribute)getEAOwnedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAOwnedElement_IsLocked() {
        return (EAttribute)getEAOwnedElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAStereotypedElement() {
		if (eaStereotypedElementEClass == null) {
			eaStereotypedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(6);
		}
		return eaStereotypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAStereotypedElement_Stereotype() {
        return (EAttribute)getEAStereotypedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEATaggedElement() {
		if (eaTaggedElementEClass == null) {
			eaTaggedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(7);
		}
		return eaTaggedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEATaggedElement_Value() {
        return (EAttribute)getEATaggedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEATaggedElement_TagID() {
        return (EAttribute)getEATaggedElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEATypedElement() {
		if (eaTypedElementEClass == null) {
			eaTypedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(8);
		}
		return eaTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEATypedElement_Type() {
        return (EAttribute)getEATypedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAVersiondElement() {
		if (eaVersiondElementEClass == null) {
			eaVersiondElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(9);
		}
		return eaVersiondElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAVersiondElement_Version() {
        return (EAttribute)getEAVersiondElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAVisibilityElement() {
		if (eaVisibilityElementEClass == null) {
			eaVisibilityElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(10);
		}
		return eaVisibilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAVisibilityElement_Visibility() {
        return (EAttribute)getEAVisibilityElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAMovableElement() {
		if (eaMovableElementEClass == null) {
			eaMovableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI).getEClassifiers().get(11);
		}
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
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipselabs.eaadapter.model.abstracthierachy." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //AbstracthierachyPackageImpl
