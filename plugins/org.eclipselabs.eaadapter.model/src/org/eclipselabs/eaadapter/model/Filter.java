/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.eaadapter.model.datatypes.FilterAttribute;
import org.eclipselabs.eaadapter.model.datatypes.FilterClass;
import org.eclipselabs.eaadapter.model.datatypes.FilterType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * A filter can be used to reduce the adapter elements in EMF.<br>
 * Example: A filter can remove all model elements with a specific stereotype, for example the stereotype "-X".<br>
 * If the filter is applied to all classes, each model element with the stereotype "-X" <i>and its children</i> will not be transferred to the EMF model.<br>
 * <br>
 * This makes the model much more consice and speeds up the access because less elements are transferred.
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.Filter#getFilterClass <em>Filter Class</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.Filter#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.Filter#getFilterAttribute <em>Filter Attribute</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.Filter#getFilterExpression <em>Filter Expression</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.Filter#getNegate <em>Negate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter Class</b></em>' attribute.
	 * The default value is <code>"All"</code>.
	 * The literals are from the enumeration {@link org.eclipselabs.eaadapter.model.datatypes.FilterClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Defines the class this filter should be applied to.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Class</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterClass
	 * @see #setFilterClass(FilterClass)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getFilter_FilterClass()
	 * @model default="All"
	 * @generated
	 */
	FilterClass getFilterClass();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.Filter#getFilterClass <em>Filter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Class</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterClass
	 * @see #getFilterClass()
	 * @generated
	 */
	void setFilterClass(FilterClass value);

	/**
	 * Returns the value of the '<em><b>Filter Type</b></em>' attribute.
	 * The default value is <code>"ContainsStringLiteral"</code>.
	 * The literals are from the enumeration {@link org.eclipselabs.eaadapter.model.datatypes.FilterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Defines the way this filter is applied:
	 * <ul>
	 * <li><code>EqualsStringLiteral</code> - The filter expression must be <i>equal</i> to the filtered attribute.
	 * <li><code>EqualsStringLiteral</code> - The filter expression must be <i>contained</i> to the filtered attribute.
	 * <li><code>EqualsStringLiteral</code> - The filter expression must <i>match</i> (as a regular expression) to the filtered attribute.
	 * </ul>
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Type</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterType
	 * @see #setFilterType(FilterType)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getFilter_FilterType()
	 * @model default="ContainsStringLiteral"
	 * @generated
	 */
	FilterType getFilterType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.Filter#getFilterType <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Type</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterType
	 * @see #getFilterType()
	 * @generated
	 */
	void setFilterType(FilterType value);

	/**
	 * Returns the value of the '<em><b>Filter Attribute</b></em>' attribute.
	 * The default value is <code>"stereotype"</code>.
	 * The literals are from the enumeration {@link org.eclipselabs.eaadapter.model.datatypes.FilterAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * What attribute should be filtered?<br>
	 * Examples are <code>name</code> and <code>stereotype</code>.<br>
	 * <br>
	 * If you need to filter more attributes, add them to the enumeration <code>FilterAttribute</code> in ea.ecore and adjust the template <i>filterContainments.javajet</i>.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Attribute</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterAttribute
	 * @see #setFilterAttribute(FilterAttribute)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getFilter_FilterAttribute()
	 * @model default="stereotype"
	 * @generated
	 */
	FilterAttribute getFilterAttribute();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.Filter#getFilterAttribute <em>Filter Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Attribute</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.datatypes.FilterAttribute
	 * @see #getFilterAttribute()
	 * @generated
	 */
	void setFilterAttribute(FilterAttribute value);

	/**
	 * Returns the value of the '<em><b>Filter Expression</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * The filter expression.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Expression</em>' attribute.
	 * @see #setFilterExpression(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getFilter_FilterExpression()
	 * @model default="" dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getFilterExpression();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.Filter#getFilterExpression <em>Filter Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Expression</em>' attribute.
	 * @see #getFilterExpression()
	 * @generated
	 */
	void setFilterExpression(String value);

	/**
	 * Returns the value of the '<em><b>Negate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * A filter can be negative. Only elements which match the filter expression are shown.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negate</em>' attribute.
	 * @see #setNegate(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getFilter_Negate()
	 * @model default="false" dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getNegate();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.Filter#getNegate <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negate</em>' attribute.
	 * @see #getNegate()
	 * @generated
	 */
	void setNegate(Boolean value);

} // Filter