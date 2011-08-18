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
import org.eclipselabs.eaadapter.model.EAElement;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.util.EAEditUtil;


/**
 * This is the item provider adapter for a {@link org.eclipselabs.eaadapter.model.EAElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EAElementItemProvider
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
	public EAElementItemProvider(AdapterFactory adapterFactory) {
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
			addVisibilityPropertyDescriptor(object);
			addClassifierIDPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addIsLockedPropertyDescriptor(object);
			addAbstractPropertyDescriptor(object);
			addClassifierNamePropertyDescriptor(object);
			addClassifierTypePropertyDescriptor(object);
			addComplexityPropertyDescriptor(object);
			addDifficultyPropertyDescriptor(object);
			addExtensionPointsPropertyDescriptor(object);
			addGenlinksPropertyDescriptor(object);
			addGenfilePropertyDescriptor(object);
			addGentypePropertyDescriptor(object);
			addMultiplicityPropertyDescriptor(object);
			addPhasePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addPropertyTypePropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addStereotypeExPropertyDescriptor(object);
			addSubtypePropertyDescriptor(object);
			addTablespacePropertyDescriptor(object);
			addTagPropertyDescriptor(object);
			addEaLinkPropertyDescriptor(object);
			addParentIDPropertyDescriptor(object);
			addPackageIDPropertyDescriptor(object);
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
				 getString("_UI_EAClassifierIDLong_classifierID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAClassifierIDLong_classifierID_feature", "_UI_EAClassifierIDLong_type"),
				 AbstracthierachyPackage.Literals.EA_CLASSIFIER_ID_LONG__CLASSIFIER_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAVersiondElement_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAVersiondElement_version_feature", "_UI_EAVersiondElement_type"),
				 AbstracthierachyPackage.Literals.EA_VERSIOND_ELEMENT__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAOwnedElement_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAOwnedElement_author_feature", "_UI_EAOwnedElement_type"),
				 AbstracthierachyPackage.Literals.EA_OWNED_ELEMENT__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Locked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLockedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAOwnedElement_isLocked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAOwnedElement_isLocked_feature", "_UI_EAOwnedElement_type"),
				 AbstracthierachyPackage.Literals.EA_OWNED_ELEMENT__IS_LOCKED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_abstract_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classifier Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_classifierName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_classifierName_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__CLASSIFIER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classifier Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_classifierType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_classifierType_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__CLASSIFIER_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Complexity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComplexityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_complexity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_complexity_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__COMPLEXITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Difficulty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDifficultyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_difficulty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_difficulty_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__DIFFICULTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extension Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_extensionPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_extensionPoints_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__EXTENSION_POINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Genlinks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenlinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_genlinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_genlinks_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__GENLINKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Genfile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenfilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_genfile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_genfile_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__GENFILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gentype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGentypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_gentype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_gentype_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__GENTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiplicity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiplicityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_multiplicity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_multiplicity_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__MULTIPLICITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_phase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_phase_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__PHASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_priority_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_propertyType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_propertyType_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__PROPERTY_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_status_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stereotype Ex feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStereotypeExPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_stereotypeEx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_stereotypeEx_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__STEREOTYPE_EX,
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
				 getString("_UI_EAElement_subtype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_subtype_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__SUBTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tablespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTablespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_tablespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_tablespace_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__TABLESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_tag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_tag_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__TAG,
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
				 getString("_UI_EAElement_eaLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_eaLink_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__EA_LINK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_parentID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_parentID_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__PARENT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_packageID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_packageID_feature", "_UI_EAElement_type"),
				 EamodelPackage.Literals.EA_ELEMENT__PACKAGE_ID,
				 true,
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
			childrenFeatures.add(EamodelPackage.Literals.EA_ELEMENT__ATTRIBUTES);
			childrenFeatures.add(EamodelPackage.Literals.EA_ELEMENT__CONNECTORS);
			childrenFeatures.add(EamodelPackage.Literals.EA_ELEMENT__ELEMENTS);
			childrenFeatures.add(EamodelPackage.Literals.EA_ELEMENT__METHODS);
			childrenFeatures.add(EamodelPackage.Literals.EA_ELEMENT__TAGGED_VALUES);
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
	 * This returns EAElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(
		         "org.eclipselabs.eaadapter.model",
		         "icons/EAElement.gif");
		return imageDescriptor == null ? overlayImage(object, getResourceLocator().getImage("full/obj16/EAElement")) : imageDescriptor.createImage();
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		final EAElement element = (EAElement)object;
		String label = element.getName();
	
		String stereotype = element.getStereotype() == null || element.getStereotype().length() == 0 ? 
				"" : " \u00AB" + element.getStereotype() + "\u00BB";
	  
		stereotype += " " + element.getType();
	  
		return label == null || label.length() == 0 ?
			getString("_UI_EAElement_type") :
			getString("_UI_EAElement_type") + stereotype + ": " + label;
	
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

		switch (notification.getFeatureID(EAElement.class)) {
			case EamodelPackage.EA_ELEMENT__OBJECT_TYPE:
			case EamodelPackage.EA_ELEMENT__ID:
			case EamodelPackage.EA_ELEMENT__NAME:
			case EamodelPackage.EA_ELEMENT__NOTES:
			case EamodelPackage.EA_ELEMENT__GUID:
			case EamodelPackage.EA_ELEMENT__STEREOTYPE:
			case EamodelPackage.EA_ELEMENT__TYPE:
			case EamodelPackage.EA_ELEMENT__VISIBILITY:
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_ID:
			case EamodelPackage.EA_ELEMENT__VERSION:
			case EamodelPackage.EA_ELEMENT__AUTHOR:
			case EamodelPackage.EA_ELEMENT__IS_LOCKED:
			case EamodelPackage.EA_ELEMENT__ABSTRACT:
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_NAME:
			case EamodelPackage.EA_ELEMENT__CLASSIFIER_TYPE:
			case EamodelPackage.EA_ELEMENT__COMPLEXITY:
			case EamodelPackage.EA_ELEMENT__DIFFICULTY:
			case EamodelPackage.EA_ELEMENT__EXTENSION_POINTS:
			case EamodelPackage.EA_ELEMENT__GENLINKS:
			case EamodelPackage.EA_ELEMENT__GENFILE:
			case EamodelPackage.EA_ELEMENT__GENTYPE:
			case EamodelPackage.EA_ELEMENT__MULTIPLICITY:
			case EamodelPackage.EA_ELEMENT__PHASE:
			case EamodelPackage.EA_ELEMENT__PRIORITY:
			case EamodelPackage.EA_ELEMENT__PROPERTY_TYPE:
			case EamodelPackage.EA_ELEMENT__STATUS:
			case EamodelPackage.EA_ELEMENT__STEREOTYPE_EX:
			case EamodelPackage.EA_ELEMENT__SUBTYPE:
			case EamodelPackage.EA_ELEMENT__TABLESPACE:
			case EamodelPackage.EA_ELEMENT__TAG:
			case EamodelPackage.EA_ELEMENT__EA_LINK:
			case EamodelPackage.EA_ELEMENT__PARENT_ID:
			case EamodelPackage.EA_ELEMENT__PACKAGE_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EamodelPackage.EA_ELEMENT__ATTRIBUTES:
			case EamodelPackage.EA_ELEMENT__CONNECTORS:
			case EamodelPackage.EA_ELEMENT__ELEMENTS:
			case EamodelPackage.EA_ELEMENT__METHODS:
			case EamodelPackage.EA_ELEMENT__TAGGED_VALUES:
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
				(EamodelPackage.Literals.EA_ELEMENT__ATTRIBUTES,
				 EamodelFactory.eINSTANCE.createEAAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(EamodelPackage.Literals.EA_ELEMENT__CONNECTORS,
				 EamodelFactory.eINSTANCE.createEAConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EamodelPackage.Literals.EA_ELEMENT__ELEMENTS,
				 EamodelFactory.eINSTANCE.createEAElement()));

		newChildDescriptors.add
			(createChildParameter
				(EamodelPackage.Literals.EA_ELEMENT__METHODS,
				 EamodelFactory.eINSTANCE.createEAMethod()));

		newChildDescriptors.add
			(createChildParameter
				(EamodelPackage.Literals.EA_ELEMENT__TAGGED_VALUES,
				 EamodelFactory.eINSTANCE.createEATaggedValue()));
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
