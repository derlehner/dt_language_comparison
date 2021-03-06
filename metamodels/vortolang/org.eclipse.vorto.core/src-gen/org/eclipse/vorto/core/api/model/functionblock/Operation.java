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
package org.eclipse.vorto.core.api.model.functionblock;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.vorto.core.api.model.datatype.Presence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.Operation#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.Operation#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.Operation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.Operation#isBreakable <em>Breakable</em>}</li>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.Operation#getPresence <em>Presence</em>}</li>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.Operation#isExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2017 Bosch Software Innovations GmbH and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nand Eclipse Distribution License v1.0 which accompany this distribution.\n \nThe Eclipse Public License is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nThe Eclipse Distribution License is available at\nhttp://www.eclipse.org/org/documents/edl-v10.php.\n\nContributors:\nBosch Software Innovations GmbH - Please refer to git log\n\n*******************************************************************************\ngenerated by Functionblock.genmodel"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.vorto.core.api.model.functionblock.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.vorto.core.api.model.functionblock.Param}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getOperation_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Param> getParams();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(ReturnType)
	 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getOperation_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	ReturnType getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.vorto.core.api.model.functionblock.Operation#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ReturnType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getOperation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.vorto.core.api.model.functionblock.Operation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Breakable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakable</em>' attribute.
	 * @see #setBreakable(boolean)
	 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getOperation_Breakable()
	 * @model
	 * @generated
	 */
	boolean isBreakable();

	/**
	 * Sets the value of the '{@link org.eclipse.vorto.core.api.model.functionblock.Operation#isBreakable <em>Breakable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakable</em>' attribute.
	 * @see #isBreakable()
	 * @generated
	 */
	void setBreakable(boolean value);

	/**
	 * Returns the value of the '<em><b>Presence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence</em>' containment reference.
	 * @see #setPresence(Presence)
	 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getOperation_Presence()
	 * @model containment="true"
	 * @generated
	 */
	Presence getPresence();

	/**
	 * Sets the value of the '{@link org.eclipse.vorto.core.api.model.functionblock.Operation#getPresence <em>Presence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence</em>' containment reference.
	 * @see #getPresence()
	 * @generated
	 */
	void setPresence(Presence value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(boolean)
	 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getOperation_Extension()
	 * @model
	 * @generated
	 */
	boolean isExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.vorto.core.api.model.functionblock.Operation#isExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #isExtension()
	 * @generated
	 */
	void setExtension(boolean value);

} // Operation
