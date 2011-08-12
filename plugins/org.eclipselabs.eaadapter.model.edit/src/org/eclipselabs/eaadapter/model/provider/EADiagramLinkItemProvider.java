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
import org.eclipselabs.eaadapter.model.EADiagramLink;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.util.EAUtil;


/**
 * This is the item provider adapter for a {@link org.eclipselabs.eaadapter.model.EADiagramLink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EADiagramLinkItemProvider
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
	public EADiagramLinkItemProvider(AdapterFactory adapterFactory) {
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
			addConnectorPropertyDescriptor(object);
			addConnectorIDPropertyDescriptor(object);
			addGeometryPropertyDescriptor(object);
			addIsHiddenPropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addEaLinkPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EADiagramLink_connector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EADiagramLink_connector_feature", "_UI_EADiagramLink_type"),
				 EamodelPackage.Literals.EA_DIAGRAM_LINK__CONNECTOR,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_EADiagramLink_connectorID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EADiagramLink_connectorID_feature", "_UI_EADiagramLink_type"),
				 EamodelPackage.Literals.EA_DIAGRAM_LINK__CONNECTOR_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Geometry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeometryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EADiagramLink_geometry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EADiagramLink_geometry_feature", "_UI_EADiagramLink_type"),
				 EamodelPackage.Literals.EA_DIAGRAM_LINK__GEOMETRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Hidden feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsHiddenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EADiagramLink_isHidden_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EADiagramLink_isHidden_feature", "_UI_EADiagramLink_type"),
				 EamodelPackage.Literals.EA_DIAGRAM_LINK__IS_HIDDEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EADiagramLink_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EADiagramLink_path_feature", "_UI_EADiagramLink_type"),
				 EamodelPackage.Literals.EA_DIAGRAM_LINK__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EADiagramLink_style_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EADiagramLink_style_feature", "_UI_EADiagramLink_type"),
				 EamodelPackage.Literals.EA_DIAGRAM_LINK__STYLE,
				 true,
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
				 getString("_UI_EADiagramLink_eaLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EADiagramLink_eaLink_feature", "_UI_EADiagramLink_type"),
				 EamodelPackage.Literals.EA_DIAGRAM_LINK__EA_LINK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EADiagramLink.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(
		         "org.eclipselabs.eaadapter.model",
		         "icons/EADiagramLink.gif");
		return imageDescriptor == null ? overlayImage(object, getResourceLocator().getImage("full/obj16/EADiagramLink")) : imageDescriptor.createImage();
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Integer labelValue = ((EADiagramLink)object).getId();
		String label = labelValue == null ? null : labelValue.toString();
	
		return label == null || label.length() == 0 ?
			getString("_UI_EADiagramLink_type") :
			getString("_UI_EADiagramLink_type") + ": " + label;
	
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

		switch (notification.getFeatureID(EADiagramLink.class)) {
			case EamodelPackage.EA_DIAGRAM_LINK__OBJECT_TYPE:
			case EamodelPackage.EA_DIAGRAM_LINK__ID:
			case EamodelPackage.EA_DIAGRAM_LINK__CONNECTOR_ID:
			case EamodelPackage.EA_DIAGRAM_LINK__GEOMETRY:
			case EamodelPackage.EA_DIAGRAM_LINK__IS_HIDDEN:
			case EamodelPackage.EA_DIAGRAM_LINK__PATH:
			case EamodelPackage.EA_DIAGRAM_LINK__STYLE:
			case EamodelPackage.EA_DIAGRAM_LINK__EA_LINK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

	@Override
	public Object getCreateChildImage(Object owner, Object feature,
			Object child, Collection<?> selection) {
		if (feature instanceof EReference) {
			Object image = EAUtil.getImageFor(((EReference)feature).getEType());
			if (image != null)
				return image;
		}
		return super.getCreateChildImage(owner, feature, child, selection);
	}
}
