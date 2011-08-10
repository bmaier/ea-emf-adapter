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
import org.eclipselabs.eaadapter.model.EAMethod;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.util.EAUtil;


/**
 * This is the item provider adapter for a {@link org.eclipselabs.eaadapter.model.EAMethod} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EAMethodItemProvider
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
	public EAMethodItemProvider(AdapterFactory adapterFactory) {
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
			addHasDStereotypePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addIsConstPropertyDescriptor(object);
			addIsStaticPropertyDescriptor(object);
			addReturnTypePropertyDescriptor(object);
			addReturnIsArrayPropertyDescriptor(object);
			addCodePropertyDescriptor(object);
			addThrowsPropertyDescriptor(object);
			addIsPurePropertyDescriptor(object);
			addIsRootPropertyDescriptor(object);
			addIsLeafPropertyDescriptor(object);
			addIsQueryPropertyDescriptor(object);
			addIsSynchronizedPropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
			addConcurrencyPropertyDescriptor(object);
			addClassifierIDPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Has DStereotype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDStereotypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAStereotypedElement_hasDStereotype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAStereotypedElement_hasDStereotype_feature", "_UI_EAStereotypedElement_type"),
				 AbstracthierachyPackage.Literals.EA_STEREOTYPED_ELEMENT__HAS_DSTEREOTYPE,
				 false,
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
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAVisibilityElement_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAVisibilityElement_visibility_feature", "_UI_EAVisibilityElement_type"),
				 AbstracthierachyPackage.Literals.EA_VISIBILITY_ELEMENT__VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Const feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsConstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAModifiableElement_isConst_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAModifiableElement_isConst_feature", "_UI_EAModifiableElement_type"),
				 AbstracthierachyPackage.Literals.EA_MODIFIABLE_ELEMENT__IS_CONST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAModifiableElement_isStatic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAModifiableElement_isStatic_feature", "_UI_EAModifiableElement_type"),
				 AbstracthierachyPackage.Literals.EA_MODIFIABLE_ELEMENT__IS_STATIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAMethod_returnType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_returnType_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__RETURN_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Is Array feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnIsArrayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAMethod_returnIsArray_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_returnIsArray_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__RETURN_IS_ARRAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAMethod_code_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_code_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Throws feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThrowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAMethod_throws_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_throws_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__THROWS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Pure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAMethod_isPure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_isPure_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__IS_PURE,
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
				 getString("_UI_EAMethod_isRoot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_isRoot_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__IS_ROOT,
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
				 getString("_UI_EAMethod_isLeaf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_isLeaf_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__IS_LEAF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Query feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsQueryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAMethod_isQuery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_isQuery_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__IS_QUERY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Synchronized feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSynchronizedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAMethod_isSynchronized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_isSynchronized_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__IS_SYNCHRONIZED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAMethod_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_isAbstract_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concurrency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcurrencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAMethod_concurrency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_concurrency_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__CONCURRENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classifier ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAMethod_classifierID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_classifierID_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__CLASSIFIER_ID,
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
				 getString("_UI_EAMethod_eaLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAMethod_eaLink_feature", "_UI_EAMethod_type"),
				 EamodelPackage.Literals.EA_METHOD__EA_LINK,
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
			childrenFeatures.add(EamodelPackage.Literals.EA_METHOD__PARAMETERS);
			childrenFeatures.add(EamodelPackage.Literals.EA_METHOD__TAGGED_VALUES);
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
	 * This returns EAMethod.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(
		         "org.eclipselabs.eaadapter.model",
		         "icons/EAMethod.gif");
		return imageDescriptor == null ? overlayImage(object, getResourceLocator().getImage("full/obj16/EAMethod")) : imageDescriptor.createImage();
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EAMethod)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EAMethod_type") :
			getString("_UI_EAMethod_type") + ": " + label;
			//getString("_UI_EAMethod_type") + " " + label;
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

		switch (notification.getFeatureID(EAMethod.class)) {
			case EamodelPackage.EA_METHOD__OBJECT_TYPE:
			case EamodelPackage.EA_METHOD__ID:
			case EamodelPackage.EA_METHOD__NAME:
			case EamodelPackage.EA_METHOD__NOTES:
			case EamodelPackage.EA_METHOD__GUID:
			case EamodelPackage.EA_METHOD__STEREOTYPE:
			case EamodelPackage.EA_METHOD__HAS_DSTEREOTYPE:
			case EamodelPackage.EA_METHOD__TYPE:
			case EamodelPackage.EA_METHOD__VISIBILITY:
			case EamodelPackage.EA_METHOD__IS_CONST:
			case EamodelPackage.EA_METHOD__IS_STATIC:
			case EamodelPackage.EA_METHOD__RETURN_TYPE:
			case EamodelPackage.EA_METHOD__RETURN_IS_ARRAY:
			case EamodelPackage.EA_METHOD__CODE:
			case EamodelPackage.EA_METHOD__THROWS:
			case EamodelPackage.EA_METHOD__IS_PURE:
			case EamodelPackage.EA_METHOD__IS_ROOT:
			case EamodelPackage.EA_METHOD__IS_LEAF:
			case EamodelPackage.EA_METHOD__IS_QUERY:
			case EamodelPackage.EA_METHOD__IS_SYNCHRONIZED:
			case EamodelPackage.EA_METHOD__IS_ABSTRACT:
			case EamodelPackage.EA_METHOD__CONCURRENCY:
			case EamodelPackage.EA_METHOD__CLASSIFIER_ID:
			case EamodelPackage.EA_METHOD__EA_LINK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EamodelPackage.EA_METHOD__PARAMETERS:
			case EamodelPackage.EA_METHOD__TAGGED_VALUES:
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
				(EamodelPackage.Literals.EA_METHOD__PARAMETERS,
				 EamodelFactory.eINSTANCE.createEAParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EamodelPackage.Literals.EA_METHOD__TAGGED_VALUES,
				 EamodelFactory.eINSTANCE.createEAMethodTag()));
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
