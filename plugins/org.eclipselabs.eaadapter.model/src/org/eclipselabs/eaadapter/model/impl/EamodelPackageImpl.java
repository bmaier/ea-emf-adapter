/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.Filter;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.impl.AbstracthierachyPackageImpl;
import org.eclipselabs.eaadapter.model.datatypes.DatatypesPackage;
import org.eclipselabs.eaadapter.model.datatypes.impl.DatatypesPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EamodelPackageImpl extends EPackageImpl implements EamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaAttributeTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaConnectorEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaConnectorTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaDiagramLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaDiagramObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaMethodTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaTaggedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

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
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EamodelPackageImpl() {
		super(eNS_URI, EamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EamodelPackage init() {
		if (isInited) return (EamodelPackage)EPackage.Registry.INSTANCE.getEPackage(EamodelPackage.eNS_URI);

		// Obtain or create and register package
		EamodelPackageImpl theEamodelPackage = (EamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EamodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		AbstracthierachyPackageImpl theAbstracthierachyPackage = (AbstracthierachyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI) instanceof AbstracthierachyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI) : AbstracthierachyPackage.eINSTANCE);

		// Create package meta-data objects
		theEamodelPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theAbstracthierachyPackage.createPackageContents();

		// Initialize created meta-data
		theEamodelPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theAbstracthierachyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EamodelPackage.eNS_URI, theEamodelPackage);
		return theEamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAAttribute() {
		return eaAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_Containment() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_IsCollection() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_IsOrdered() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_AllowDuplicates() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_IsDerived() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_Container() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_Scale() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_Precision() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_Length() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_LowerBound() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_UpperBound() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_Default() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAAttribute_Element() {
		return (EReference)eaAttributeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttribute_EaLink() {
		return (EAttribute)eaAttributeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAAttribute_TaggedValues() {
		return (EReference)eaAttributeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAAttributeTag() {
		return eaAttributeTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAAttributeTag_EaLink() {
		return (EAttribute)eaAttributeTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAConnector() {
		return eaConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_ConnectorID() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Direction() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Subtype() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_IsLeaf() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_IsRoot() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_IsSpec() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_VirtualInheritance() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_TransitionEvent() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_TransitionAction() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_TransitionGuard() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_RouteStyle() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_SequenceNo() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_DiagramID() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_EaLink() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAConnector_TaggedValues() {
		return (EReference)eaConnectorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_SupplierID() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAConnector_Supplier() {
		return (EReference)eaConnectorEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAConnector_SupplierEnd() {
		return (EReference)eaConnectorEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_ClientID() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAConnector_Client() {
		return (EReference)eaConnectorEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAConnector_ClientEnd() {
		return (EReference)eaConnectorEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Client_aggregation() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Client_cardinality() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Client_containment() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Client_isNavigable() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Client_note() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Client_role() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Client_roleType() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Client_stereotype() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Client_visibility() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Supplier_aggregation() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Supplier_cardinality() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Supplier_containment() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Supplier_isNavigable() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Supplier_note() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Supplier_role() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Supplier_roleType() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Supplier_stereotype() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_Supplier_visibility() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnector_IsA2dDependency() {
		return (EAttribute)eaConnectorEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAConnectorEnd() {
		return eaConnectorEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_Aggregation() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_Cardinality() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_Containment() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_IsNavigable() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_Note() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_Role() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_RoleType() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_Stereotype() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_Visibility() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_EaLink() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_Ordering() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_Qualifier() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorEnd_End() {
		return (EAttribute)eaConnectorEndEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAConnectorTag() {
		return eaConnectorTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAConnectorTag_EaLink() {
		return (EAttribute)eaConnectorTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEADiagram() {
		return eaDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagram_Swimlanes() {
		return (EAttribute)eaDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagram_Type() {
		return (EAttribute)eaDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagram_Package() {
		return (EReference)eaDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagram_EaLink() {
		return (EAttribute)eaDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagram_DiagramLinks() {
		return (EReference)eaDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagram_DiagramObjects() {
		return (EReference)eaDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEADiagramLink() {
		return eaDiagramLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagramLink_Connector() {
		return (EReference)eaDiagramLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramLink_ConnectorID() {
		return (EAttribute)eaDiagramLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramLink_Geometry() {
		return (EAttribute)eaDiagramLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramLink_IsHidden() {
		return (EAttribute)eaDiagramLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramLink_Path() {
		return (EAttribute)eaDiagramLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramLink_Style() {
		return (EAttribute)eaDiagramLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramLink_EaLink() {
		return (EAttribute)eaDiagramLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEADiagramObject() {
		return eaDiagramObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramObject_Bottom() {
		return (EAttribute)eaDiagramObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagramObject_Element() {
		return (EReference)eaDiagramObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramObject_ElementID() {
		return (EAttribute)eaDiagramObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramObject_Left() {
		return (EAttribute)eaDiagramObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramObject_Right() {
		return (EAttribute)eaDiagramObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramObject_Sequence() {
		return (EAttribute)eaDiagramObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramObject_Top() {
		return (EAttribute)eaDiagramObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagramObject_EaLink() {
		return (EAttribute)eaDiagramObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAElement() {
		return eaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Abstract() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_ClassifierName() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_ClassifierType() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Complexity() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Difficulty() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_ExtensionPoints() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Genlinks() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Genfile() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Gentype() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Multiplicity() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Phase() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Priority() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_PropertyType() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Status() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_StereotypeEx() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Subtype() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Tablespace() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Tag() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAElement_Element() {
		return (EReference)eaElementEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAElement_Package() {
		return (EReference)eaElementEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAElement_Attributes() {
		return (EReference)eaElementEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAElement_Connectors() {
		return (EReference)eaElementEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAElement_Elements() {
		return (EReference)eaElementEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAElement_Methods() {
		return (EReference)eaElementEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAElement_TaggedValues() {
		return (EReference)eaElementEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_EaLink() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_ParentID() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_PackageID() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAMethod() {
		return eaMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_ReturnType() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_ReturnIsArray() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_Code() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_Throws() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_IsPure() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_IsRoot() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_IsLeaf() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_IsQuery() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_IsSynchronized() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_IsAbstract() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_Concurrency() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_ClassifierID() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAMethod_Element() {
		return (EReference)eaMethodEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethod_EaLink() {
		return (EAttribute)eaMethodEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAMethod_Parameters() {
		return (EReference)eaMethodEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAMethod_TaggedValues() {
		return (EReference)eaMethodEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAMethodTag() {
		return eaMethodTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAMethodTag_EaLink() {
		return (EAttribute)eaMethodTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAPackage() {
		return eaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAPackage_Diagrams() {
		return (EReference)eaPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAPackage_Elements() {
		return (EReference)eaPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAPackage_Packages() {
		return (EReference)eaPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAPackage_Package() {
		return (EReference)eaPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAPackage_EaLink() {
		return (EAttribute)eaPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAPackage_Stereotype() {
		return (EAttribute)eaPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAParameter() {
		return eaParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAParameter_Type() {
		return (EAttribute)eaParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAParameter_Default() {
		return (EAttribute)eaParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAParameter_Position() {
		return (EAttribute)eaParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAParameter_IsConst() {
		return (EAttribute)eaParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAParameter_Kind() {
		return (EAttribute)eaParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAParameter_ClassifierID() {
		return (EAttribute)eaParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAParameter_OperationID() {
		return (EAttribute)eaParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAParameter_Method() {
		return (EReference)eaParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAParameter_EaLink() {
		return (EAttribute)eaParameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEARepository() {
		return eaRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEARepository_Models() {
		return (EReference)eaRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_EaLink() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_File() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_User() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_Password() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_Caching() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_ReadonlyEaLink() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_Diagrams() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_PrefetchCompleteModel() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_PrefetchPackageGuids() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEARepository_Filter() {
		return (EReference)eaRepositoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEARepository_PersistentModels() {
		return (EReference)eaRepositoryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_Persistent() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_PrefetchingEnabled() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEARepository_ShowWindow() {
		return (EAttribute)eaRepositoryEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEATaggedValue() {
		return eaTaggedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEATaggedValue_EaLink() {
		return (EAttribute)eaTaggedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_FilterClass() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_FilterType() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_FilterAttribute() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_FilterExpression() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Negate() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EamodelFactory getEamodelFactory() {
		return (EamodelFactory)getEFactoryInstance();
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
		eaAttributeEClass = createEClass(EA_ATTRIBUTE);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__CONTAINMENT);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__IS_COLLECTION);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__IS_ORDERED);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__ALLOW_DUPLICATES);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__IS_DERIVED);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__CONTAINER);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__SCALE);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__PRECISION);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__LENGTH);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__LOWER_BOUND);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__UPPER_BOUND);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__DEFAULT);
		createEReference(eaAttributeEClass, EA_ATTRIBUTE__ELEMENT);
		createEAttribute(eaAttributeEClass, EA_ATTRIBUTE__EA_LINK);
		createEReference(eaAttributeEClass, EA_ATTRIBUTE__TAGGED_VALUES);

		eaAttributeTagEClass = createEClass(EA_ATTRIBUTE_TAG);
		createEAttribute(eaAttributeTagEClass, EA_ATTRIBUTE_TAG__EA_LINK);

		eaConnectorEClass = createEClass(EA_CONNECTOR);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CONNECTOR_ID);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__DIRECTION);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUBTYPE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__IS_LEAF);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__IS_ROOT);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__IS_SPEC);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__VIRTUAL_INHERITANCE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__TRANSITION_EVENT);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__TRANSITION_ACTION);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__TRANSITION_GUARD);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__ROUTE_STYLE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SEQUENCE_NO);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__DIAGRAM_ID);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__EA_LINK);
		createEReference(eaConnectorEClass, EA_CONNECTOR__TAGGED_VALUES);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_ID);
		createEReference(eaConnectorEClass, EA_CONNECTOR__SUPPLIER);
		createEReference(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_END);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CLIENT_ID);
		createEReference(eaConnectorEClass, EA_CONNECTOR__CLIENT);
		createEReference(eaConnectorEClass, EA_CONNECTOR__CLIENT_END);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CLIENT_AGGREGATION);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CLIENT_CARDINALITY);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CLIENT_CONTAINMENT);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CLIENT_IS_NAVIGABLE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CLIENT_NOTE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CLIENT_ROLE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CLIENT_ROLE_TYPE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CLIENT_STEREOTYPE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__CLIENT_VISIBILITY);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_AGGREGATION);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_CARDINALITY);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_CONTAINMENT);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_IS_NAVIGABLE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_NOTE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_ROLE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_ROLE_TYPE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_STEREOTYPE);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__SUPPLIER_VISIBILITY);
		createEAttribute(eaConnectorEClass, EA_CONNECTOR__IS_A2D_DEPENDENCY);

		eaConnectorEndEClass = createEClass(EA_CONNECTOR_END);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__AGGREGATION);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__CARDINALITY);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__CONTAINMENT);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__IS_NAVIGABLE);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__NOTE);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__ROLE);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__ROLE_TYPE);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__STEREOTYPE);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__VISIBILITY);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__EA_LINK);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__ORDERING);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__QUALIFIER);
		createEAttribute(eaConnectorEndEClass, EA_CONNECTOR_END__END);

		eaConnectorTagEClass = createEClass(EA_CONNECTOR_TAG);
		createEAttribute(eaConnectorTagEClass, EA_CONNECTOR_TAG__EA_LINK);

		eaDiagramEClass = createEClass(EA_DIAGRAM);
		createEAttribute(eaDiagramEClass, EA_DIAGRAM__SWIMLANES);
		createEAttribute(eaDiagramEClass, EA_DIAGRAM__TYPE);
		createEReference(eaDiagramEClass, EA_DIAGRAM__PACKAGE);
		createEAttribute(eaDiagramEClass, EA_DIAGRAM__EA_LINK);
		createEReference(eaDiagramEClass, EA_DIAGRAM__DIAGRAM_LINKS);
		createEReference(eaDiagramEClass, EA_DIAGRAM__DIAGRAM_OBJECTS);

		eaDiagramLinkEClass = createEClass(EA_DIAGRAM_LINK);
		createEReference(eaDiagramLinkEClass, EA_DIAGRAM_LINK__CONNECTOR);
		createEAttribute(eaDiagramLinkEClass, EA_DIAGRAM_LINK__CONNECTOR_ID);
		createEAttribute(eaDiagramLinkEClass, EA_DIAGRAM_LINK__GEOMETRY);
		createEAttribute(eaDiagramLinkEClass, EA_DIAGRAM_LINK__IS_HIDDEN);
		createEAttribute(eaDiagramLinkEClass, EA_DIAGRAM_LINK__PATH);
		createEAttribute(eaDiagramLinkEClass, EA_DIAGRAM_LINK__STYLE);
		createEAttribute(eaDiagramLinkEClass, EA_DIAGRAM_LINK__EA_LINK);

		eaDiagramObjectEClass = createEClass(EA_DIAGRAM_OBJECT);
		createEAttribute(eaDiagramObjectEClass, EA_DIAGRAM_OBJECT__BOTTOM);
		createEReference(eaDiagramObjectEClass, EA_DIAGRAM_OBJECT__ELEMENT);
		createEAttribute(eaDiagramObjectEClass, EA_DIAGRAM_OBJECT__ELEMENT_ID);
		createEAttribute(eaDiagramObjectEClass, EA_DIAGRAM_OBJECT__LEFT);
		createEAttribute(eaDiagramObjectEClass, EA_DIAGRAM_OBJECT__RIGHT);
		createEAttribute(eaDiagramObjectEClass, EA_DIAGRAM_OBJECT__SEQUENCE);
		createEAttribute(eaDiagramObjectEClass, EA_DIAGRAM_OBJECT__TOP);
		createEAttribute(eaDiagramObjectEClass, EA_DIAGRAM_OBJECT__EA_LINK);

		eaElementEClass = createEClass(EA_ELEMENT);
		createEAttribute(eaElementEClass, EA_ELEMENT__ABSTRACT);
		createEAttribute(eaElementEClass, EA_ELEMENT__CLASSIFIER_NAME);
		createEAttribute(eaElementEClass, EA_ELEMENT__CLASSIFIER_TYPE);
		createEAttribute(eaElementEClass, EA_ELEMENT__COMPLEXITY);
		createEAttribute(eaElementEClass, EA_ELEMENT__DIFFICULTY);
		createEAttribute(eaElementEClass, EA_ELEMENT__EXTENSION_POINTS);
		createEAttribute(eaElementEClass, EA_ELEMENT__GENLINKS);
		createEAttribute(eaElementEClass, EA_ELEMENT__GENFILE);
		createEAttribute(eaElementEClass, EA_ELEMENT__GENTYPE);
		createEAttribute(eaElementEClass, EA_ELEMENT__MULTIPLICITY);
		createEAttribute(eaElementEClass, EA_ELEMENT__PHASE);
		createEAttribute(eaElementEClass, EA_ELEMENT__PRIORITY);
		createEAttribute(eaElementEClass, EA_ELEMENT__PROPERTY_TYPE);
		createEAttribute(eaElementEClass, EA_ELEMENT__STATUS);
		createEAttribute(eaElementEClass, EA_ELEMENT__STEREOTYPE_EX);
		createEAttribute(eaElementEClass, EA_ELEMENT__SUBTYPE);
		createEAttribute(eaElementEClass, EA_ELEMENT__TABLESPACE);
		createEAttribute(eaElementEClass, EA_ELEMENT__TAG);
		createEReference(eaElementEClass, EA_ELEMENT__ELEMENT);
		createEReference(eaElementEClass, EA_ELEMENT__PACKAGE);
		createEReference(eaElementEClass, EA_ELEMENT__ATTRIBUTES);
		createEReference(eaElementEClass, EA_ELEMENT__CONNECTORS);
		createEReference(eaElementEClass, EA_ELEMENT__ELEMENTS);
		createEReference(eaElementEClass, EA_ELEMENT__METHODS);
		createEReference(eaElementEClass, EA_ELEMENT__TAGGED_VALUES);
		createEAttribute(eaElementEClass, EA_ELEMENT__EA_LINK);
		createEAttribute(eaElementEClass, EA_ELEMENT__PARENT_ID);
		createEAttribute(eaElementEClass, EA_ELEMENT__PACKAGE_ID);

		eaMethodEClass = createEClass(EA_METHOD);
		createEAttribute(eaMethodEClass, EA_METHOD__RETURN_TYPE);
		createEAttribute(eaMethodEClass, EA_METHOD__RETURN_IS_ARRAY);
		createEAttribute(eaMethodEClass, EA_METHOD__CODE);
		createEAttribute(eaMethodEClass, EA_METHOD__THROWS);
		createEAttribute(eaMethodEClass, EA_METHOD__IS_PURE);
		createEAttribute(eaMethodEClass, EA_METHOD__IS_ROOT);
		createEAttribute(eaMethodEClass, EA_METHOD__IS_LEAF);
		createEAttribute(eaMethodEClass, EA_METHOD__IS_QUERY);
		createEAttribute(eaMethodEClass, EA_METHOD__IS_SYNCHRONIZED);
		createEAttribute(eaMethodEClass, EA_METHOD__IS_ABSTRACT);
		createEAttribute(eaMethodEClass, EA_METHOD__CONCURRENCY);
		createEAttribute(eaMethodEClass, EA_METHOD__CLASSIFIER_ID);
		createEReference(eaMethodEClass, EA_METHOD__ELEMENT);
		createEAttribute(eaMethodEClass, EA_METHOD__EA_LINK);
		createEReference(eaMethodEClass, EA_METHOD__PARAMETERS);
		createEReference(eaMethodEClass, EA_METHOD__TAGGED_VALUES);

		eaMethodTagEClass = createEClass(EA_METHOD_TAG);
		createEAttribute(eaMethodTagEClass, EA_METHOD_TAG__EA_LINK);

		eaPackageEClass = createEClass(EA_PACKAGE);
		createEReference(eaPackageEClass, EA_PACKAGE__DIAGRAMS);
		createEReference(eaPackageEClass, EA_PACKAGE__ELEMENTS);
		createEReference(eaPackageEClass, EA_PACKAGE__PACKAGES);
		createEReference(eaPackageEClass, EA_PACKAGE__PACKAGE);
		createEAttribute(eaPackageEClass, EA_PACKAGE__EA_LINK);
		createEAttribute(eaPackageEClass, EA_PACKAGE__STEREOTYPE);

		eaParameterEClass = createEClass(EA_PARAMETER);
		createEAttribute(eaParameterEClass, EA_PARAMETER__TYPE);
		createEAttribute(eaParameterEClass, EA_PARAMETER__DEFAULT);
		createEAttribute(eaParameterEClass, EA_PARAMETER__POSITION);
		createEAttribute(eaParameterEClass, EA_PARAMETER__IS_CONST);
		createEAttribute(eaParameterEClass, EA_PARAMETER__KIND);
		createEAttribute(eaParameterEClass, EA_PARAMETER__CLASSIFIER_ID);
		createEAttribute(eaParameterEClass, EA_PARAMETER__OPERATION_ID);
		createEReference(eaParameterEClass, EA_PARAMETER__METHOD);
		createEAttribute(eaParameterEClass, EA_PARAMETER__EA_LINK);

		eaRepositoryEClass = createEClass(EA_REPOSITORY);
		createEReference(eaRepositoryEClass, EA_REPOSITORY__MODELS);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__EA_LINK);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__FILE);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__USER);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__PASSWORD);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__CACHING);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__READONLY_EA_LINK);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__DIAGRAMS);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__PREFETCH_COMPLETE_MODEL);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__PREFETCH_PACKAGE_GUIDS);
		createEReference(eaRepositoryEClass, EA_REPOSITORY__FILTER);
		createEReference(eaRepositoryEClass, EA_REPOSITORY__PERSISTENT_MODELS);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__PERSISTENT);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__PREFETCHING_ENABLED);
		createEAttribute(eaRepositoryEClass, EA_REPOSITORY__SHOW_WINDOW);

		eaTaggedValueEClass = createEClass(EA_TAGGED_VALUE);
		createEAttribute(eaTaggedValueEClass, EA_TAGGED_VALUE__EA_LINK);

		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__FILTER_CLASS);
		createEAttribute(filterEClass, FILTER__FILTER_TYPE);
		createEAttribute(filterEClass, FILTER__FILTER_ATTRIBUTE);
		createEAttribute(filterEClass, FILTER__FILTER_EXPRESSION);
		createEAttribute(filterEClass, FILTER__NEGATE);
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
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		AbstracthierachyPackage theAbstracthierachyPackage = (AbstracthierachyPackage)EPackage.Registry.INSTANCE.getEPackage(AbstracthierachyPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDatatypesPackage);
		getESubpackages().add(theAbstracthierachyPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eaAttributeEClass.getESuperTypes().add(theAbstracthierachyPackage.getEAModifiableElement());
		eaAttributeEClass.getESuperTypes().add(theAbstracthierachyPackage.getEAClassifierIDLong());
		eaAttributeTagEClass.getESuperTypes().add(theAbstracthierachyPackage.getEATaggedElement());
		eaConnectorEClass.getESuperTypes().add(theAbstracthierachyPackage.getEATypedElement());
		eaConnectorEClass.getESuperTypes().add(theAbstracthierachyPackage.getEAMovableElement());
		eaConnectorEndEClass.getESuperTypes().add(theAbstracthierachyPackage.getEABaseClass());
		eaConnectorTagEClass.getESuperTypes().add(theAbstracthierachyPackage.getEATaggedElement());
		eaDiagramEClass.getESuperTypes().add(theAbstracthierachyPackage.getEAOwnedElement());
		eaDiagramEClass.getESuperTypes().add(theAbstracthierachyPackage.getEAStereotypedElement());
		eaDiagramLinkEClass.getESuperTypes().add(theAbstracthierachyPackage.getEABaseClass());
		eaDiagramObjectEClass.getESuperTypes().add(theAbstracthierachyPackage.getEABaseClass());
		eaElementEClass.getESuperTypes().add(theAbstracthierachyPackage.getEAClassifierIDLong());
		eaElementEClass.getESuperTypes().add(theAbstracthierachyPackage.getEAOwnedElement());
		eaMethodEClass.getESuperTypes().add(theAbstracthierachyPackage.getEAModifiableElement());
		eaMethodTagEClass.getESuperTypes().add(theAbstracthierachyPackage.getEATaggedElement());
		eaPackageEClass.getESuperTypes().add(theAbstracthierachyPackage.getEAAbstractPackage());
		eaParameterEClass.getESuperTypes().add(theAbstracthierachyPackage.getEANamedElement());
		eaTaggedValueEClass.getESuperTypes().add(theAbstracthierachyPackage.getEATaggedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(eaAttributeEClass, EAAttribute.class, "EAAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAAttribute_Containment(), theDatatypesPackage.getString(), "containment", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_IsCollection(), theDatatypesPackage.getBoolean(), "isCollection", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_IsOrdered(), theDatatypesPackage.getBoolean(), "isOrdered", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_AllowDuplicates(), theDatatypesPackage.getBoolean(), "allowDuplicates", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_IsDerived(), theDatatypesPackage.getBoolean(), "isDerived", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_Container(), theDatatypesPackage.getString(), "container", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_Scale(), theDatatypesPackage.getString(), "scale", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_Precision(), theDatatypesPackage.getString(), "precision", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_Length(), theDatatypesPackage.getString(), "length", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_LowerBound(), theDatatypesPackage.getString(), "lowerBound", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_UpperBound(), theDatatypesPackage.getString(), "upperBound", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_Default(), theDatatypesPackage.getString(), "default", null, 0, 1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAAttribute_Element(), this.getEAElement(), this.getEAElement_Attributes(), "element", null, 0, 1, EAAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAAttribute_EaLink(), theDatatypesPackage.getT_Attribute(), "eaLink", null, 0, 1, EAAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAAttribute_TaggedValues(), this.getEAAttributeTag(), null, "taggedValues", null, 0, -1, EAAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaAttributeTagEClass, EAAttributeTag.class, "EAAttributeTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAAttributeTag_EaLink(), theDatatypesPackage.getT_AttributeTag(), "eaLink", null, 0, 1, EAAttributeTag.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaConnectorEClass, EAConnector.class, "EAConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAConnector_ConnectorID(), theDatatypesPackage.getInteger(), "connectorID", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Direction(), theDatatypesPackage.getString(), "direction", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Subtype(), theDatatypesPackage.getString(), "subtype", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_IsLeaf(), theDatatypesPackage.getBoolean(), "isLeaf", null, 0, 1, EAConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_IsRoot(), theDatatypesPackage.getBoolean(), "isRoot", null, 0, 1, EAConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_IsSpec(), theDatatypesPackage.getBoolean(), "isSpec", null, 0, 1, EAConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_VirtualInheritance(), theDatatypesPackage.getString(), "virtualInheritance", null, 0, 1, EAConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_TransitionEvent(), theDatatypesPackage.getString(), "transitionEvent", null, 0, 1, EAConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_TransitionAction(), theDatatypesPackage.getString(), "transitionAction", null, 0, 1, EAConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_TransitionGuard(), theDatatypesPackage.getString(), "transitionGuard", null, 0, 1, EAConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_RouteStyle(), theDatatypesPackage.getInteger(), "routeStyle", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_SequenceNo(), theDatatypesPackage.getInteger(), "sequenceNo", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_DiagramID(), theDatatypesPackage.getInteger(), "diagramID", null, 0, 1, EAConnector.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_EaLink(), theDatatypesPackage.getT_Connector(), "eaLink", null, 0, 1, EAConnector.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAConnector_TaggedValues(), this.getEAConnectorTag(), null, "taggedValues", null, 0, -1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_SupplierID(), theDatatypesPackage.getInteger(), "supplierID", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAConnector_Supplier(), this.getEAElement(), null, "supplier", null, 0, 1, EAConnector.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAConnector_SupplierEnd(), this.getEAConnectorEnd(), null, "supplierEnd", null, 0, 1, EAConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_ClientID(), theDatatypesPackage.getInteger(), "clientID", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAConnector_Client(), this.getEAElement(), null, "client", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAConnector_ClientEnd(), this.getEAConnectorEnd(), null, "clientEnd", null, 0, 1, EAConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Client_aggregation(), theDatatypesPackage.getInteger(), "client_aggregation", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Client_cardinality(), theDatatypesPackage.getString(), "client_cardinality", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Client_containment(), theDatatypesPackage.getString(), "client_containment", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Client_isNavigable(), theDatatypesPackage.getBoolean(), "client_isNavigable", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Client_note(), theDatatypesPackage.getString(), "client_note", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Client_role(), theDatatypesPackage.getString(), "client_role", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Client_roleType(), theDatatypesPackage.getString(), "client_roleType", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Client_stereotype(), theDatatypesPackage.getString(), "client_stereotype", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Client_visibility(), theDatatypesPackage.getString(), "client_visibility", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Supplier_aggregation(), theDatatypesPackage.getInteger(), "supplier_aggregation", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Supplier_cardinality(), theDatatypesPackage.getString(), "supplier_cardinality", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Supplier_containment(), theDatatypesPackage.getString(), "supplier_containment", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Supplier_isNavigable(), theDatatypesPackage.getBoolean(), "supplier_isNavigable", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Supplier_note(), theDatatypesPackage.getString(), "supplier_note", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Supplier_role(), theDatatypesPackage.getString(), "supplier_role", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Supplier_roleType(), theDatatypesPackage.getString(), "supplier_roleType", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Supplier_stereotype(), theDatatypesPackage.getString(), "supplier_stereotype", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_Supplier_visibility(), theDatatypesPackage.getString(), "supplier_visibility", null, 0, 1, EAConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnector_IsA2dDependency(), theDatatypesPackage.getBoolean(), "isA2dDependency", null, 0, 1, EAConnector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaConnectorEndEClass, EAConnectorEnd.class, "EAConnectorEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAConnectorEnd_Aggregation(), theDatatypesPackage.getInteger(), "aggregation", null, 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_Cardinality(), theDatatypesPackage.getString(), "cardinality", null, 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_Containment(), theDatatypesPackage.getString(), "containment", "Unspecified", 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_IsNavigable(), theDatatypesPackage.getBoolean(), "isNavigable", null, 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_Note(), theDatatypesPackage.getString(), "note", null, 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_Role(), theDatatypesPackage.getString(), "role", null, 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_RoleType(), theDatatypesPackage.getString(), "roleType", null, 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_Stereotype(), theDatatypesPackage.getString(), "stereotype", null, 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_Visibility(), theDatatypesPackage.getString(), "visibility", "Public", 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_EaLink(), theDatatypesPackage.getT_ConnectorEnd(), "eaLink", null, 0, 1, EAConnectorEnd.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_Ordering(), theDatatypesPackage.getInteger(), "ordering", null, 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_Qualifier(), theDatatypesPackage.getString(), "qualifier", null, 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAConnectorEnd_End(), theDatatypesPackage.getString(), "end", null, 0, 1, EAConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaConnectorTagEClass, EAConnectorTag.class, "EAConnectorTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAConnectorTag_EaLink(), theDatatypesPackage.getT_ConntectorTag(), "eaLink", null, 0, 1, EAConnectorTag.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaDiagramEClass, EADiagram.class, "EADiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEADiagram_Swimlanes(), theDatatypesPackage.getString(), "swimlanes", null, 0, 1, EADiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagram_Type(), theDatatypesPackage.getString(), "type", null, 0, 1, EADiagram.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEADiagram_Package(), this.getEAPackage(), this.getEAPackage_Diagrams(), "package", null, 0, 1, EADiagram.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagram_EaLink(), theDatatypesPackage.getT_Diagram(), "eaLink", null, 0, 1, EADiagram.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEADiagram_DiagramLinks(), this.getEADiagramLink(), null, "diagramLinks", null, 0, -1, EADiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEADiagram_DiagramObjects(), this.getEADiagramObject(), null, "diagramObjects", null, 0, -1, EADiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaDiagramLinkEClass, EADiagramLink.class, "EADiagramLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEADiagramLink_Connector(), this.getEAConnector(), null, "connector", null, 0, 1, EADiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramLink_ConnectorID(), theDatatypesPackage.getInteger(), "connectorID", null, 0, 1, EADiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramLink_Geometry(), theDatatypesPackage.getString(), "geometry", null, 0, 1, EADiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramLink_IsHidden(), theDatatypesPackage.getBoolean(), "isHidden", null, 0, 1, EADiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramLink_Path(), theDatatypesPackage.getString(), "path", null, 0, 1, EADiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramLink_Style(), theDatatypesPackage.getString(), "style", null, 0, 1, EADiagramLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramLink_EaLink(), theDatatypesPackage.getT_DiagramLink(), "eaLink", null, 0, 1, EADiagramLink.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaDiagramObjectEClass, EADiagramObject.class, "EADiagramObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEADiagramObject_Bottom(), theDatatypesPackage.getInteger(), "bottom", null, 0, 1, EADiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEADiagramObject_Element(), this.getEAElement(), null, "element", null, 0, 1, EADiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramObject_ElementID(), theDatatypesPackage.getInteger(), "elementID", null, 0, 1, EADiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramObject_Left(), theDatatypesPackage.getInteger(), "left", null, 0, 1, EADiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramObject_Right(), theDatatypesPackage.getInteger(), "right", null, 0, 1, EADiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramObject_Sequence(), theDatatypesPackage.getInteger(), "sequence", null, 0, 1, EADiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramObject_Top(), theDatatypesPackage.getInteger(), "top", null, 0, 1, EADiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEADiagramObject_EaLink(), theDatatypesPackage.getT_DiagramObject(), "eaLink", null, 0, 1, EADiagramObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaElementEClass, EAElement.class, "EAElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAElement_Abstract(), theDatatypesPackage.getString(), "abstract", "0", 0, 1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_ClassifierName(), theDatatypesPackage.getString(), "classifierName", null, 0, 1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_ClassifierType(), theDatatypesPackage.getString(), "classifierType", null, 0, 1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Complexity(), theDatatypesPackage.getString(), "complexity", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Difficulty(), theDatatypesPackage.getString(), "difficulty", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_ExtensionPoints(), theDatatypesPackage.getString(), "extensionPoints", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Genlinks(), theDatatypesPackage.getString(), "genlinks", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Genfile(), theDatatypesPackage.getString(), "genfile", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Gentype(), theDatatypesPackage.getString(), "gentype", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Multiplicity(), theDatatypesPackage.getString(), "multiplicity", null, 0, 1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Phase(), theDatatypesPackage.getString(), "phase", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Priority(), theDatatypesPackage.getString(), "priority", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_PropertyType(), theDatatypesPackage.getInteger(), "propertyType", null, 0, 1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Status(), theDatatypesPackage.getString(), "status", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_StereotypeEx(), theDatatypesPackage.getString(), "stereotypeEx", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Subtype(), theDatatypesPackage.getInteger(), "subtype", null, 0, 1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Tablespace(), theDatatypesPackage.getString(), "tablespace", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_Tag(), theDatatypesPackage.getString(), "tag", null, 0, 1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAElement_Element(), this.getEAElement(), this.getEAElement_Elements(), "element", null, 0, 1, EAElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAElement_Package(), this.getEAPackage(), this.getEAPackage_Elements(), "package", null, 0, 1, EAElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAElement_Attributes(), this.getEAAttribute(), this.getEAAttribute_Element(), "attributes", null, 0, -1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAElement_Connectors(), this.getEAConnector(), null, "connectors", null, 0, -1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAElement_Elements(), this.getEAElement(), this.getEAElement_Element(), "elements", null, 0, -1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAElement_Methods(), this.getEAMethod(), this.getEAMethod_Element(), "methods", null, 0, -1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAElement_TaggedValues(), this.getEATaggedValue(), null, "taggedValues", null, 0, -1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_EaLink(), theDatatypesPackage.getT_Element(), "eaLink", null, 0, 1, EAElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_ParentID(), theDatatypesPackage.getInteger(), "parentID", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAElement_PackageID(), theDatatypesPackage.getInteger(), "packageID", null, 0, 1, EAElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaMethodEClass, EAMethod.class, "EAMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAMethod_ReturnType(), theDatatypesPackage.getString(), "returnType", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_ReturnIsArray(), theDatatypesPackage.getBoolean(), "returnIsArray", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_Code(), theDatatypesPackage.getString(), "code", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_Throws(), theDatatypesPackage.getString(), "throws", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_IsPure(), theDatatypesPackage.getBoolean(), "isPure", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_IsRoot(), theDatatypesPackage.getBoolean(), "isRoot", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_IsLeaf(), theDatatypesPackage.getBoolean(), "isLeaf", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_IsQuery(), theDatatypesPackage.getBoolean(), "isQuery", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_IsSynchronized(), theDatatypesPackage.getBoolean(), "isSynchronized", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_IsAbstract(), theDatatypesPackage.getBoolean(), "isAbstract", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_Concurrency(), theDatatypesPackage.getString(), "concurrency", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_ClassifierID(), theDatatypesPackage.getString(), "classifierID", null, 0, 1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAMethod_Element(), this.getEAElement(), this.getEAElement_Methods(), "element", null, 0, 1, EAMethod.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAMethod_EaLink(), theDatatypesPackage.getT_Method(), "eaLink", null, 0, 1, EAMethod.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAMethod_Parameters(), this.getEAParameter(), this.getEAParameter_Method(), "parameters", null, 0, -1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAMethod_TaggedValues(), this.getEAMethodTag(), null, "taggedValues", null, 0, -1, EAMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaMethodTagEClass, EAMethodTag.class, "EAMethodTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAMethodTag_EaLink(), theDatatypesPackage.getT_MethodTag(), "eaLink", null, 0, 1, EAMethodTag.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaPackageEClass, EAPackage.class, "EAPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAPackage_Diagrams(), this.getEADiagram(), this.getEADiagram_Package(), "diagrams", null, 0, -1, EAPackage.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAPackage_Elements(), this.getEAElement(), this.getEAElement_Package(), "elements", null, 0, -1, EAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAPackage_Packages(), this.getEAPackage(), this.getEAPackage_Package(), "packages", null, 0, -1, EAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAPackage_Package(), this.getEAPackage(), this.getEAPackage_Packages(), "package", null, 0, 1, EAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAPackage_EaLink(), theDatatypesPackage.getT_Package(), "eaLink", null, 0, 1, EAPackage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAPackage_Stereotype(), theDatatypesPackage.getString(), "stereotype", null, 0, 1, EAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaParameterEClass, EAParameter.class, "EAParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAParameter_Type(), theDatatypesPackage.getString(), "type", null, 0, 1, EAParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAParameter_Default(), theDatatypesPackage.getString(), "default", null, 0, 1, EAParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAParameter_Position(), theDatatypesPackage.getInteger(), "position", null, 0, 1, EAParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAParameter_IsConst(), theDatatypesPackage.getBoolean(), "isConst", null, 0, 1, EAParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAParameter_Kind(), theDatatypesPackage.getString(), "kind", null, 0, 1, EAParameter.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAParameter_ClassifierID(), theDatatypesPackage.getString(), "classifierID", null, 0, 1, EAParameter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAParameter_OperationID(), theDatatypesPackage.getInteger(), "operationID", null, 0, 1, EAParameter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAParameter_Method(), this.getEAMethod(), this.getEAMethod_Parameters(), "method", null, 0, 1, EAParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAParameter_EaLink(), theDatatypesPackage.getT_Parameter(), "eaLink", null, 0, 1, EAParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaRepositoryEClass, EARepository.class, "EARepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEARepository_Models(), this.getEAPackage(), null, "models", null, 0, -1, EARepository.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_EaLink(), theDatatypesPackage.getT_Repository(), "eaLink", null, 0, 1, EARepository.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_File(), theDatatypesPackage.getString(), "file", null, 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_User(), theDatatypesPackage.getString(), "user", null, 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_Password(), theDatatypesPackage.getString(), "password", null, 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_Caching(), theDatatypesPackage.getBoolean(), "caching", "true", 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_ReadonlyEaLink(), theDatatypesPackage.getBoolean(), "readonlyEaLink", "false", 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_Diagrams(), theDatatypesPackage.getBoolean(), "diagrams", "false", 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_PrefetchCompleteModel(), theDatatypesPackage.getBoolean(), "prefetchCompleteModel", "false", 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_PrefetchPackageGuids(), theDatatypesPackage.getString(), "prefetchPackageGuids", null, 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEARepository_Filter(), this.getFilter(), null, "filter", null, 0, -1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEARepository_PersistentModels(), this.getEAPackage(), null, "persistentModels", null, 0, -1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_Persistent(), ecorePackage.getEBoolean(), "persistent", "false", 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_PrefetchingEnabled(), ecorePackage.getEBoolean(), "prefetchingEnabled", "false", 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEARepository_ShowWindow(), ecorePackage.getEBoolean(), "showWindow", "false", 0, 1, EARepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eaRepositoryEClass, theDatatypesPackage.getBoolean(), "openFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eaRepositoryEClass, null, "closeFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eaRepositoryEClass, null, "prefetch", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eaRepositoryEClass, null, "exitEA", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eaTaggedValueEClass, EATaggedValue.class, "EATaggedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEATaggedValue_EaLink(), theDatatypesPackage.getT_TaggedValue(), "eaLink", null, 0, 1, EATaggedValue.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_FilterClass(), theDatatypesPackage.getFilterClass(), "filterClass", "All", 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_FilterType(), theDatatypesPackage.getFilterType(), "filterType", "ContainsStringLiteral", 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_FilterAttribute(), theDatatypesPackage.getFilterAttribute(), "filterAttribute", "stereotype", 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_FilterExpression(), theDatatypesPackage.getString(), "filterExpression", "", 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_Negate(), theDatatypesPackage.getBoolean(), "negate", "false", 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EamodelPackageImpl
