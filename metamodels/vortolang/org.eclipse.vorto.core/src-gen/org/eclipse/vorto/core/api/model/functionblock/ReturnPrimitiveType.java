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

import org.eclipse.vorto.core.api.model.datatype.ConstraintRule;
import org.eclipse.vorto.core.api.model.datatype.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.ReturnPrimitiveType#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.ReturnPrimitiveType#getConstraintRule <em>Constraint Rule</em>}</li>
 * </ul>
 *
 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getReturnPrimitiveType()
 * @model
 * @generated
 */
public interface ReturnPrimitiveType extends ReturnType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2017 Bosch Software Innovations GmbH and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nand Eclipse Distribution License v1.0 which accompany this distribution.\n \nThe Eclipse Public License is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nThe Eclipse Distribution License is available at\nhttp://www.eclipse.org/org/documents/edl-v10.php.\n\nContributors:\nBosch Software Innovations GmbH - Please refer to git log\n\n*******************************************************************************\ngenerated by Functionblock.genmodel"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.vorto.core.api.model.datatype.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see org.eclipse.vorto.core.api.model.datatype.PrimitiveType
	 * @see #setReturnType(PrimitiveType)
	 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getReturnPrimitiveType_ReturnType()
	 * @model
	 * @generated
	 */
	PrimitiveType getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.vorto.core.api.model.functionblock.ReturnPrimitiveType#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see org.eclipse.vorto.core.api.model.datatype.PrimitiveType
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Constraint Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Rule</em>' containment reference.
	 * @see #setConstraintRule(ConstraintRule)
	 * @see org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage#getReturnPrimitiveType_ConstraintRule()
	 * @model containment="true"
	 * @generated
	 */
	ConstraintRule getConstraintRule();

	/**
	 * Sets the value of the '{@link org.eclipse.vorto.core.api.model.functionblock.ReturnPrimitiveType#getConstraintRule <em>Constraint Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Rule</em>' containment reference.
	 * @see #getConstraintRule()
	 * @generated
	 */
	void setConstraintRule(ConstraintRule value);

} // ReturnPrimitiveType
