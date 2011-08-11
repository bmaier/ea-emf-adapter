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
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.util.EAUtil;


/**
 * This is the item provider adapter for a {@link org.eclipselabs.eaadapter.model.EARepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EARepositoryItemProvider
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
	public EARepositoryItemProvider(AdapterFactory adapterFactory) {
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

			addEaLinkPropertyDescriptor(object);
			addFilePropertyDescriptor(object);
			addUserPropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addCachingPropertyDescriptor(object);
			addReadonlyEaLinkPropertyDescriptor(object);
			addDiagramsPropertyDescriptor(object);
			addPrefetchCompleteModelPropertyDescriptor(object);
			addPrefetchPackageGuidsPropertyDescriptor(object);
			addPersistentPropertyDescriptor(object);
			addPrefetchingEnabledPropertyDescriptor(object);
			addShowWindowPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_EARepository_eaLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_eaLink_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__EA_LINK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_file_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_file_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_user_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_user_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_password_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Caching feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCachingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_caching_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_caching_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__CACHING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Readonly Ea Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadonlyEaLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_readonlyEaLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_readonlyEaLink_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__READONLY_EA_LINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagrams feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_diagrams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_diagrams_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__DIAGRAMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prefetch Complete Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefetchCompleteModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_prefetchCompleteModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_prefetchCompleteModel_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__PREFETCH_COMPLETE_MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prefetch Package Guids feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefetchPackageGuidsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_prefetchPackageGuids_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_prefetchPackageGuids_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__PREFETCH_PACKAGE_GUIDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persistent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_persistent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_persistent_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__PERSISTENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prefetching Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefetchingEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_prefetchingEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_prefetchingEnabled_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__PREFETCHING_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Window feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowWindowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EARepository_showWindow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EARepository_showWindow_feature", "_UI_EARepository_type"),
				 EamodelPackage.Literals.EA_REPOSITORY__SHOW_WINDOW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(EamodelPackage.Literals.EA_REPOSITORY__MODELS);
			childrenFeatures.add(EamodelPackage.Literals.EA_REPOSITORY__FILTER);
			childrenFeatures.add(EamodelPackage.Literals.EA_REPOSITORY__PERSISTENT_MODELS);
		}
//		((EARepository)object).setPrefetchingEnabled(false);
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
	 * This returns EARepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(
		         "org.eclipselabs.eaadapter.model",
		         "icons/EARepository.gif");
		return imageDescriptor == null ? overlayImage(object, getResourceLocator().getImage("full/obj16/EARepository")) : imageDescriptor.createImage();
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EARepository)object).getFile();
		return label == null || label.length() == 0 ?
			getString("_UI_EARepository_type") :
			getString("_UI_EARepository_type") + ": " + label;
			//getString("_UI_EARepository_type") + " " + label;
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

		switch (notification.getFeatureID(EARepository.class)) {
			case EamodelPackage.EA_REPOSITORY__EA_LINK:
			case EamodelPackage.EA_REPOSITORY__FILE:
			case EamodelPackage.EA_REPOSITORY__USER:
			case EamodelPackage.EA_REPOSITORY__PASSWORD:
			case EamodelPackage.EA_REPOSITORY__CACHING:
			case EamodelPackage.EA_REPOSITORY__READONLY_EA_LINK:
			case EamodelPackage.EA_REPOSITORY__DIAGRAMS:
			case EamodelPackage.EA_REPOSITORY__PREFETCH_COMPLETE_MODEL:
			case EamodelPackage.EA_REPOSITORY__PREFETCH_PACKAGE_GUIDS:
			case EamodelPackage.EA_REPOSITORY__PERSISTENT:
			case EamodelPackage.EA_REPOSITORY__PREFETCHING_ENABLED:
			case EamodelPackage.EA_REPOSITORY__SHOW_WINDOW:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EamodelPackage.EA_REPOSITORY__MODELS:
			case EamodelPackage.EA_REPOSITORY__FILTER:
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
				(EamodelPackage.Literals.EA_REPOSITORY__MODELS,
				 EamodelFactory.eINSTANCE.createEAPackage()));

		newChildDescriptors.add
			(createChildParameter
				(EamodelPackage.Literals.EA_REPOSITORY__FILTER,
				 EamodelFactory.eINSTANCE.createFilter()));
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
