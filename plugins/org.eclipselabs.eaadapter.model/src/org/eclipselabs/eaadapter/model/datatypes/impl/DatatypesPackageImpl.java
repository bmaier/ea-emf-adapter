/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.datatypes.impl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl;
import org.eclipselabs.eaadapter.model.datatypes.DatatypesFactory;
import org.eclipselabs.eaadapter.model.datatypes.DatatypesPackage;
import org.eclipselabs.eaadapter.model.impl.EamodelPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterAttributeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eaCollectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_AttributeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_AttributeTagEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_ConnectorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_ConnectorEndEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_ConntectorTagEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_DiagramEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_DiagramLinkEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_DiagramObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_ElementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_MethodEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_MethodTagEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_PackageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_ParameterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_RepositoryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType t_TaggedValueEDataType = null;

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
	 * @see org.eclipselabs.eaadapter.model.datatypes.DatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesPackageImpl() {
		super(eNS_URI, DatatypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static DatatypesPackage init() {
		if (isInited) return (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EamodelPackageImpl theEamodelPackage = (EamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EamodelPackage.eNS_URI) instanceof EamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EamodelPackage.eNS_URI) : EamodelPackage.eINSTANCE);
		AbstracthierachyPackageImpl theAbstracthierachyPackage = (AbstracthierachyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI) instanceof AbstracthierachyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI) : AbstracthierachyPackage.eINSTANCE);

		// Load packages
		theEamodelPackage.loadPackage();

		// Fix loaded packages
		theDatatypesPackage.fixPackageContents();
		theEamodelPackage.fixPackageContents();
		theAbstracthierachyPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
		return theDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterClass() {
		if (filterClassEEnum == null) {
			filterClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(16);
		}
		return filterClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterType() {
		if (filterTypeEEnum == null) {
			filterTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(17);
		}
		return filterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterAttribute() {
		if (filterAttributeEEnum == null) {
			filterAttributeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(18);
		}
		return filterAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEACollection() {
		if (eaCollectionEDataType == null) {
			eaCollectionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return eaCollectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_Attribute() {
		if (t_AttributeEDataType == null) {
			t_AttributeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return t_AttributeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_AttributeTag() {
		if (t_AttributeTagEDataType == null) {
			t_AttributeTagEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return t_AttributeTagEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_Connector() {
		if (t_ConnectorEDataType == null) {
			t_ConnectorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return t_ConnectorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_ConnectorEnd() {
		if (t_ConnectorEndEDataType == null) {
			t_ConnectorEndEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return t_ConnectorEndEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_ConntectorTag() {
		if (t_ConntectorTagEDataType == null) {
			t_ConntectorTagEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return t_ConntectorTagEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_Diagram() {
		if (t_DiagramEDataType == null) {
			t_DiagramEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return t_DiagramEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_DiagramLink() {
		if (t_DiagramLinkEDataType == null) {
			t_DiagramLinkEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return t_DiagramLinkEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_DiagramObject() {
		if (t_DiagramObjectEDataType == null) {
			t_DiagramObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return t_DiagramObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_Element() {
		if (t_ElementEDataType == null) {
			t_ElementEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return t_ElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_Method() {
		if (t_MethodEDataType == null) {
			t_MethodEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(10);
		}
		return t_MethodEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_MethodTag() {
		if (t_MethodTagEDataType == null) {
			t_MethodTagEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(11);
		}
		return t_MethodTagEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_Package() {
		if (t_PackageEDataType == null) {
			t_PackageEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(12);
		}
		return t_PackageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_Parameter() {
		if (t_ParameterEDataType == null) {
			t_ParameterEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(13);
		}
		return t_ParameterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_Repository() {
		if (t_RepositoryEDataType == null) {
			t_RepositoryEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(14);
		}
		return t_RepositoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getT_TaggedValue() {
		if (t_TaggedValueEDataType == null) {
			t_TaggedValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI).getEClassifiers().get(15);
		}
		return t_TaggedValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactory getDatatypesFactory() {
		return (DatatypesFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.eclipselabs.eaadapter.model.datatypes." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //DatatypesPackageImpl
