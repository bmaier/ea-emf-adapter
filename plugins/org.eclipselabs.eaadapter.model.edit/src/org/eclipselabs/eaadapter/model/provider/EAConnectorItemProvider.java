/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipselabs.eaadapter.model.EAConnector;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.util.EAEditUtil;


/**
 * This is the item provider adapter for a {@link org.eclipselabs.eaadapter.model.EAConnector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EAConnectorItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAConnectorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addObjectTypePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addGuidPropertyDescriptor(object);
			addStereotypePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addConnectorIDPropertyDescriptor(object);
			addDirectionPropertyDescriptor(object);
			addSubtypePropertyDescriptor(object);
			addIsLeafPropertyDescriptor(object);
			addIsRootPropertyDescriptor(object);
			addIsSpecPropertyDescriptor(object);
			addVirtualInheritancePropertyDescriptor(object);
			addTransitionEventPropertyDescriptor(object);
			addTransitionActionPropertyDescriptor(object);
			addTransitionGuardPropertyDescriptor(object);
			addRouteStylePropertyDescriptor(object);
			addSequenceNoPropertyDescriptor(object);
			addDiagramIDPropertyDescriptor(object);
			addEaLinkPropertyDescriptor(object);
			addSupplierIDPropertyDescriptor(object);
			addClientIDPropertyDescriptor(object);
			addClientPropertyDescriptor(object);
			addClient_aggregationPropertyDescriptor(object);
			addClient_cardinalityPropertyDescriptor(object);
			addClient_containmentPropertyDescriptor(object);
			addClient_isNavigablePropertyDescriptor(object);
			addClient_notePropertyDescriptor(object);
			addClient_rolePropertyDescriptor(object);
			addClient_roleTypePropertyDescriptor(object);
			addClient_stereotypePropertyDescriptor(object);
			addClient_visibilityPropertyDescriptor(object);
			addSupplier_aggregationPropertyDescriptor(object);
			addSupplier_cardinalityPropertyDescriptor(object);
			addSupplier_containmentPropertyDescriptor(object);
			addSupplier_isNavigablePropertyDescriptor(object);
			addSupplier_notePropertyDescriptor(object);
			addSupplier_rolePropertyDescriptor(object);
			addSupplier_roleTypePropertyDescriptor(object);
			addSupplier_stereotypePropertyDescriptor(object);
			addSupplier_visibilityPropertyDescriptor(object);
			addIsA2dDependencyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Object Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EABaseClass_objectType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EABaseClass_objectType_feature", "_UI_EABaseClass_type"),
				 AbstracthierachyPackage.Literals.EA_BASE_CLASS__OBJECT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EABaseClass_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EABaseClass_id_feature", "_UI_EABaseClass_type"),
				 AbstracthierachyPackage.Literals.EA_BASE_CLASS__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EANamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EANamedElement_name_feature", "_UI_EANamedElement_type"),
				 AbstracthierachyPackage.Literals.EA_NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EANamedElement_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EANamedElement_notes_feature", "_UI_EANamedElement_type"),
				 AbstracthierachyPackage.Literals.EA_NAMED_ELEMENT__NOTES,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EANamedElement_guid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EANamedElement_guid_feature", "_UI_EANamedElement_type"),
				 AbstracthierachyPackage.Literals.EA_NAMED_ELEMENT__GUID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stereotype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStereotypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAStereotypedElement_stereotype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAStereotypedElement_stereotype_feature", "_UI_EAStereotypedElement_type"),
				 AbstracthierachyPackage.Literals.EA_STEREOTYPED_ELEMENT__STEREOTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EATypedElement_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EATypedElement_type_feature", "_UI_EATypedElement_type"),
				 AbstracthierachyPackage.Literals.EA_TYPED_ELEMENT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connector ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_connectorID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_connectorID_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CONNECTOR_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_direction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_direction_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subtype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubtypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_subtype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_subtype_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUBTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Leaf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLeafPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_isLeaf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_isLeaf_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__IS_LEAF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Root feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_isRoot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_isRoot_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__IS_ROOT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Spec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSpecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_isSpec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_isSpec_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__IS_SPEC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Virtual Inheritance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVirtualInheritancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_virtualInheritance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_virtualInheritance_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__VIRTUAL_INHERITANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transition Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_transitionEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_transitionEvent_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__TRANSITION_EVENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transition Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_transitionAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_transitionAction_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__TRANSITION_ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transition Guard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionGuardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_transitionGuard_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_transitionGuard_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__TRANSITION_GUARD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Route Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRouteStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_routeStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_routeStyle_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__ROUTE_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequence No feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceNoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_sequenceNo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_sequenceNo_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SEQUENCE_NO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagram ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_diagramID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_diagramID_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__DIAGRAM_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ea Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEaLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_eaLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_eaLink_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__EA_LINK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplierIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_supplierID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_supplierID_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_clientID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_clientID_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_client_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_client_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client aggregation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClient_aggregationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_client_aggregation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_client_aggregation_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT_AGGREGATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClient_cardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_client_cardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_client_cardinality_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT_CARDINALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client containment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClient_containmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_client_containment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_client_containment_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT_CONTAINMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client is Navigable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClient_isNavigablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_client_isNavigable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_client_isNavigable_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT_IS_NAVIGABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client note feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClient_notePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_client_note_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_client_note_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT_NOTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClient_rolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_client_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_client_role_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT_ROLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client role Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClient_roleTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_client_roleType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_client_roleType_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT_ROLE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client stereotype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClient_stereotypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_client_stereotype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_client_stereotype_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT_STEREOTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClient_visibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_client_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_client_visibility_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__CLIENT_VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier aggregation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplier_aggregationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_supplier_aggregation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_supplier_aggregation_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_AGGREGATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplier_cardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_supplier_cardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_supplier_cardinality_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_CARDINALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier containment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplier_containmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_supplier_containment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_supplier_containment_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_CONTAINMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier is Navigable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplier_isNavigablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_supplier_isNavigable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_supplier_isNavigable_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_IS_NAVIGABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier note feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplier_notePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_supplier_note_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_supplier_note_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_NOTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplier_rolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_supplier_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_supplier_role_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_ROLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier role Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplier_roleTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_supplier_roleType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_supplier_roleType_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_ROLE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier stereotype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplier_stereotypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_supplier_stereotype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_supplier_stereotype_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_STEREOTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplier visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupplier_visibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_supplier_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_supplier_visibility_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is A2d Dependency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsA2dDependencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAConnector_isA2dDependency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAConnector_isA2dDependency_feature", "_UI_EAConnector_type"),
				 EamodelPackage.Literals.EA_CONNECTOR__IS_A2D_DEPENDENCY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EamodelPackage.Literals.EA_CONNECTOR__TAGGED_VALUES);
			childrenFeatures.add(EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_END);
			childrenFeatures.add(EamodelPackage.Literals.EA_CONNECTOR__CLIENT_END);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EAConnector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(
		         "org.eclipselabs.eaadapter.model",
		         "icons/EAConnector.gif");
		return imageDescriptor == null ? overlayImage(object, getResourceLocator().getImage("full/obj16/EAConnector")) : imageDescriptor.createImage();
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String type = ((EAConnector) object).getType();
		type = (type == null || type.isEmpty()) ? "" : " (" + type + ")";
		return getString("_UI_EAConnector_type") + type + ": " + EAEditUtil.getConnectorLabel((EAConnector)object);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EAConnector.class)) {
			case EamodelPackage.EA_CONNECTOR__OBJECT_TYPE:
			case EamodelPackage.EA_CONNECTOR__ID:
			case EamodelPackage.EA_CONNECTOR__NAME:
			case EamodelPackage.EA_CONNECTOR__NOTES:
			case EamodelPackage.EA_CONNECTOR__GUID:
			case EamodelPackage.EA_CONNECTOR__STEREOTYPE:
			case EamodelPackage.EA_CONNECTOR__TYPE:
			case EamodelPackage.EA_CONNECTOR__CONNECTOR_ID:
			case EamodelPackage.EA_CONNECTOR__DIRECTION:
			case EamodelPackage.EA_CONNECTOR__SUBTYPE:
			case EamodelPackage.EA_CONNECTOR__IS_LEAF:
			case EamodelPackage.EA_CONNECTOR__IS_ROOT:
			case EamodelPackage.EA_CONNECTOR__IS_SPEC:
			case EamodelPackage.EA_CONNECTOR__VIRTUAL_INHERITANCE:
			case EamodelPackage.EA_CONNECTOR__TRANSITION_EVENT:
			case EamodelPackage.EA_CONNECTOR__TRANSITION_ACTION:
			case EamodelPackage.EA_CONNECTOR__TRANSITION_GUARD:
			case EamodelPackage.EA_CONNECTOR__ROUTE_STYLE:
			case EamodelPackage.EA_CONNECTOR__SEQUENCE_NO:
			case EamodelPackage.EA_CONNECTOR__DIAGRAM_ID:
			case EamodelPackage.EA_CONNECTOR__EA_LINK:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ID:
			case EamodelPackage.EA_CONNECTOR__CLIENT_ID:
			case EamodelPackage.EA_CONNECTOR__CLIENT_AGGREGATION:
			case EamodelPackage.EA_CONNECTOR__CLIENT_CARDINALITY:
			case EamodelPackage.EA_CONNECTOR__CLIENT_CONTAINMENT:
			case EamodelPackage.EA_CONNECTOR__CLIENT_IS_NAVIGABLE:
			case EamodelPackage.EA_CONNECTOR__CLIENT_NOTE:
			case EamodelPackage.EA_CONNECTOR__CLIENT_ROLE:
			case EamodelPackage.EA_CONNECTOR__CLIENT_ROLE_TYPE:
			case EamodelPackage.EA_CONNECTOR__CLIENT_STEREOTYPE:
			case EamodelPackage.EA_CONNECTOR__CLIENT_VISIBILITY:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_AGGREGATION:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_CARDINALITY:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_CONTAINMENT:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_IS_NAVIGABLE:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_NOTE:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_ROLE_TYPE:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_STEREOTYPE:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_VISIBILITY:
			case EamodelPackage.EA_CONNECTOR__IS_A2D_DEPENDENCY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EamodelPackage.EA_CONNECTOR__TAGGED_VALUES:
			case EamodelPackage.EA_CONNECTOR__SUPPLIER_END:
			case EamodelPackage.EA_CONNECTOR__CLIENT_END:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EamodelPackage.Literals.EA_CONNECTOR__TAGGED_VALUES,
				 EamodelFactory.eINSTANCE.createEAConnectorTag()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EaEditPlugin.INSTANCE;
	}

	/**
	 * If there is a user defined icon for this child, return it.
	 * Otherwise call super.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCreateChildImage(Object owner, Object feature,
			Object child, Collection<?> selection) {
		if (feature instanceof EReference) {
			Object image = EAEditUtil.getImageFor(((EReference)feature).getEType());
			if (image != null)
				return image;
		}
		return super.getCreateChildImage(owner, feature, child, selection);
	}

}
