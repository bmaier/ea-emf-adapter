/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EamodelFactoryImpl extends EFactoryImpl implements EamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EamodelFactory init() {
		try {
			EamodelFactory theEamodelFactory = (EamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.eclipselabs.eaadapter.model"); 
			if (theEamodelFactory != null) {
				return theEamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EamodelPackage.EA_ATTRIBUTE: return createEAAttribute();
			case EamodelPackage.EA_ATTRIBUTE_TAG: return createEAAttributeTag();
			case EamodelPackage.EA_CONNECTOR: return createEAConnector();
			case EamodelPackage.EA_CONNECTOR_END: return createEAConnectorEnd();
			case EamodelPackage.EA_CONNECTOR_TAG: return createEAConnectorTag();
			case EamodelPackage.EA_DIAGRAM: return createEADiagram();
			case EamodelPackage.EA_DIAGRAM_LINK: return createEADiagramLink();
			case EamodelPackage.EA_DIAGRAM_OBJECT: return createEADiagramObject();
			case EamodelPackage.EA_ELEMENT: return createEAElement();
			case EamodelPackage.EA_METHOD: return createEAMethod();
			case EamodelPackage.EA_METHOD_TAG: return createEAMethodTag();
			case EamodelPackage.EA_PACKAGE: return createEAPackage();
			case EamodelPackage.EA_PARAMETER: return createEAParameter();
			case EamodelPackage.EA_REPOSITORY: return createEARepository();
			case EamodelPackage.EA_TAGGED_VALUE: return createEATaggedValue();
			case EamodelPackage.FILTER: return createFilter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAAttribute createEAAttribute() {
		EAAttributeImpl eaAttribute = new EAAttributeImpl();
		return eaAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAAttributeTag createEAAttributeTag() {
		EAAttributeTagImpl eaAttributeTag = new EAAttributeTagImpl();
		return eaAttributeTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAConnector createEAConnector() {
		EAConnectorImpl eaConnector = new EAConnectorImpl();
		return eaConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAConnectorEnd createEAConnectorEnd() {
		EAConnectorEndImpl eaConnectorEnd = new EAConnectorEndImpl();
		return eaConnectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAConnectorTag createEAConnectorTag() {
		EAConnectorTagImpl eaConnectorTag = new EAConnectorTagImpl();
		return eaConnectorTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADiagram createEADiagram() {
		EADiagramImpl eaDiagram = new EADiagramImpl();
		return eaDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADiagramLink createEADiagramLink() {
		EADiagramLinkImpl eaDiagramLink = new EADiagramLinkImpl();
		return eaDiagramLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADiagramObject createEADiagramObject() {
		EADiagramObjectImpl eaDiagramObject = new EADiagramObjectImpl();
		return eaDiagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement createEAElement() {
		EAElementImpl eaElement = new EAElementImpl();
		return eaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAMethod createEAMethod() {
		EAMethodImpl eaMethod = new EAMethodImpl();
		return eaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAMethodTag createEAMethodTag() {
		EAMethodTagImpl eaMethodTag = new EAMethodTagImpl();
		return eaMethodTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAPackage createEAPackage() {
		EAPackageImpl eaPackage = new EAPackageImpl();
		return eaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAParameter createEAParameter() {
		EAParameterImpl eaParameter = new EAParameterImpl();
		return eaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EARepository createEARepository() {
		EARepositoryImpl eaRepository = new EARepositoryImpl();
		return eaRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EATaggedValue createEATaggedValue() {
		EATaggedValueImpl eaTaggedValue = new EATaggedValueImpl();
		return eaTaggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EamodelPackage getEamodelPackage() {
		return (EamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EamodelPackage getPackage() {
		return EamodelPackage.eINSTANCE;
	}

} //EamodelFactoryImpl
