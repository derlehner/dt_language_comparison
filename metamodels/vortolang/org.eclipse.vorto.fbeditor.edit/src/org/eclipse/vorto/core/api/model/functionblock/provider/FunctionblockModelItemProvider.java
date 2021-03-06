/**
 * Copyright (c) 2017 Bosch Software Innovations GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *  
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * Contributors:
 * Bosch Software Innovations GmbH - Please refer to git log
 * 
 * *******************************************************************************
 * generated by Functionblock.genmodel
 */
package org.eclipse.vorto.core.api.model.functionblock.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.eclipse.vorto.core.api.model.datatype.DatatypeFactory;

import org.eclipse.vorto.core.api.model.functionblock.FunctionblockFactory;
import org.eclipse.vorto.core.api.model.functionblock.FunctionblockModel;
import org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage;

import org.eclipse.vorto.core.api.model.model.ModelPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.vorto.core.api.model.functionblock.FunctionblockModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionblockModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2017 Bosch Software Innovations GmbH and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nand Eclipse Distribution License v1.0 which accompany this distribution.\n \nThe Eclipse Public License is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nThe Eclipse Distribution License is available at\nhttp://www.eclipse.org/org/documents/edl-v10.php.\n\nContributors:\nBosch Software Innovations GmbH - Please refer to git log\n\n*******************************************************************************\ngenerated by Functionblock.genmodel"; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionblockModelItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addNamespacePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addReferencesPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDisplaynamePropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addSuperTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Model_name_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_name_feature", "_UI_Model_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModelPackage.Literals.MODEL__NAME,
				 true,
				 false,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Model_namespace_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_namespace_feature", "_UI_Model_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModelPackage.Literals.MODEL__NAMESPACE,
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
				 getString("_UI_Model_version_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_version_feature", "_UI_Model_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModelPackage.Literals.MODEL__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Model_references_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_references_feature", "_UI_Model_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModelPackage.Literals.MODEL__REFERENCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Model_description_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_description_feature", "_UI_Model_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModelPackage.Literals.MODEL__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Displayname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplaynamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Model_displayname_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_displayname_feature", "_UI_Model_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModelPackage.Literals.MODEL__DISPLAYNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Model_category_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_category_feature", "_UI_Model_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModelPackage.Literals.MODEL__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lang feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLangPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Model_lang_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_lang_feature", "_UI_Model_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ModelPackage.Literals.MODEL__LANG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionblockModel_superType_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionblockModel_superType_feature", "_UI_FunctionblockModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 FunctionblockPackage.Literals.FUNCTIONBLOCK_MODEL__SUPER_TYPE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(FunctionblockPackage.Literals.FUNCTIONBLOCK_MODEL__FUNCTIONBLOCK);
			childrenFeatures.add(FunctionblockPackage.Literals.FUNCTIONBLOCK_MODEL__ENTITIES);
			childrenFeatures.add(FunctionblockPackage.Literals.FUNCTIONBLOCK_MODEL__ENUMS);
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
	 * This returns FunctionblockModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionblockModel")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionblockModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionblockModel_type") : //$NON-NLS-1$
			getString("_UI_FunctionblockModel_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(FunctionblockModel.class)) {
			case FunctionblockPackage.FUNCTIONBLOCK_MODEL__NAMESPACE:
			case FunctionblockPackage.FUNCTIONBLOCK_MODEL__VERSION:
			case FunctionblockPackage.FUNCTIONBLOCK_MODEL__DESCRIPTION:
			case FunctionblockPackage.FUNCTIONBLOCK_MODEL__DISPLAYNAME:
			case FunctionblockPackage.FUNCTIONBLOCK_MODEL__CATEGORY:
			case FunctionblockPackage.FUNCTIONBLOCK_MODEL__LANG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FunctionblockPackage.FUNCTIONBLOCK_MODEL__FUNCTIONBLOCK:
			case FunctionblockPackage.FUNCTIONBLOCK_MODEL__ENTITIES:
			case FunctionblockPackage.FUNCTIONBLOCK_MODEL__ENUMS:
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
				(FunctionblockPackage.Literals.FUNCTIONBLOCK_MODEL__FUNCTIONBLOCK,
				 FunctionblockFactory.eINSTANCE.createFunctionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionblockPackage.Literals.FUNCTIONBLOCK_MODEL__ENTITIES,
				 DatatypeFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionblockPackage.Literals.FUNCTIONBLOCK_MODEL__ENUMS,
				 DatatypeFactory.eINSTANCE.createEnum()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FunctionblockEditPlugin.INSTANCE;
	}

}
