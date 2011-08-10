/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.Filter;
import org.eclipselabs.eaadapter.model.datatypes.FilterAttribute;
import org.eclipselabs.eaadapter.model.datatypes.FilterClass;
import org.eclipselabs.eaadapter.model.datatypes.FilterType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.FilterImpl#getFilterClass <em>Filter Class</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.FilterImpl#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.FilterImpl#getFilterAttribute <em>Filter Attribute</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.FilterImpl#getFilterExpression <em>Filter Expression</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.FilterImpl#getNegate <em>Negate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterImpl extends EObjectImpl implements Filter {
	/**
	 * The default value of the '{@link #getFilterClass() <em>Filter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterClass()
	 * @generated
	 * @ordered
	 */
	protected static final FilterClass FILTER_CLASS_EDEFAULT = FilterClass.ALL;

	/**
	 * The cached value of the '{@link #getFilterClass() <em>Filter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterClass()
	 * @generated
	 * @ordered
	 */
	protected FilterClass filterClass = FILTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected static final FilterType FILTER_TYPE_EDEFAULT = FilterType.CONTAINS_STRING_LITERAL;

	/**
	 * The cached value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected FilterType filterType = FILTER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterAttribute() <em>Filter Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final FilterAttribute FILTER_ATTRIBUTE_EDEFAULT = FilterAttribute.STEREOTYPE;

	/**
	 * The cached value of the '{@link #getFilterAttribute() <em>Filter Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterAttribute()
	 * @generated
	 * @ordered
	 */
	protected FilterAttribute filterAttribute = FILTER_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterExpression() <em>Filter Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EXPRESSION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFilterExpression() <em>Filter Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterExpression()
	 * @generated
	 * @ordered
	 */
	protected String filterExpression = FILTER_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegate() <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEGATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getNegate() <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegate()
	 * @generated
	 * @ordered
	 */
	protected Boolean negate = NEGATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterClass getFilterClass() {
		// return value
		return filterClass;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterClass(FilterClass newFilterClass) {
		FilterClass oldFilterClass = filterClass;
		filterClass = newFilterClass == null ? FILTER_CLASS_EDEFAULT : newFilterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.FILTER__FILTER_CLASS, oldFilterClass, filterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getFilterType() {
		// return value
		return filterType;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterType(FilterType newFilterType) {
		FilterType oldFilterType = filterType;
		filterType = newFilterType == null ? FILTER_TYPE_EDEFAULT : newFilterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.FILTER__FILTER_TYPE, oldFilterType, filterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterAttribute getFilterAttribute() {
		// return value
		return filterAttribute;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterAttribute(FilterAttribute newFilterAttribute) {
		FilterAttribute oldFilterAttribute = filterAttribute;
		filterAttribute = newFilterAttribute == null ? FILTER_ATTRIBUTE_EDEFAULT : newFilterAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.FILTER__FILTER_ATTRIBUTE, oldFilterAttribute, filterAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterExpression() {
		// return value
		return filterExpression;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterExpression(String newFilterExpression) {
		String oldFilterExpression = filterExpression;
		filterExpression = newFilterExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.FILTER__FILTER_EXPRESSION, oldFilterExpression, filterExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNegate() {
		// return value
		return negate;
	}

	/**
	 * Setter for an attribute which encapsulates an attribute in the EA model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegate(Boolean newNegate) {
		Boolean oldNegate = negate;
		negate = newNegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.FILTER__NEGATE, oldNegate, negate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EamodelPackage.FILTER__FILTER_CLASS:
				return getFilterClass();
			case EamodelPackage.FILTER__FILTER_TYPE:
				return getFilterType();
			case EamodelPackage.FILTER__FILTER_ATTRIBUTE:
				return getFilterAttribute();
			case EamodelPackage.FILTER__FILTER_EXPRESSION:
				return getFilterExpression();
			case EamodelPackage.FILTER__NEGATE:
				return getNegate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EamodelPackage.FILTER__FILTER_CLASS:
				setFilterClass((FilterClass)newValue);
				return;
			case EamodelPackage.FILTER__FILTER_TYPE:
				setFilterType((FilterType)newValue);
				return;
			case EamodelPackage.FILTER__FILTER_ATTRIBUTE:
				setFilterAttribute((FilterAttribute)newValue);
				return;
			case EamodelPackage.FILTER__FILTER_EXPRESSION:
				setFilterExpression((String)newValue);
				return;
			case EamodelPackage.FILTER__NEGATE:
				setNegate((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case EamodelPackage.FILTER__FILTER_CLASS:
				setFilterClass(FILTER_CLASS_EDEFAULT);
				return;
			case EamodelPackage.FILTER__FILTER_TYPE:
				setFilterType(FILTER_TYPE_EDEFAULT);
				return;
			case EamodelPackage.FILTER__FILTER_ATTRIBUTE:
				setFilterAttribute(FILTER_ATTRIBUTE_EDEFAULT);
				return;
			case EamodelPackage.FILTER__FILTER_EXPRESSION:
				setFilterExpression(FILTER_EXPRESSION_EDEFAULT);
				return;
			case EamodelPackage.FILTER__NEGATE:
				setNegate(NEGATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EamodelPackage.FILTER__FILTER_CLASS:
				return filterClass != FILTER_CLASS_EDEFAULT;
			case EamodelPackage.FILTER__FILTER_TYPE:
				return filterType != FILTER_TYPE_EDEFAULT;
			case EamodelPackage.FILTER__FILTER_ATTRIBUTE:
				return filterAttribute != FILTER_ATTRIBUTE_EDEFAULT;
			case EamodelPackage.FILTER__FILTER_EXPRESSION:
				return FILTER_EXPRESSION_EDEFAULT == null ? filterExpression != null : !FILTER_EXPRESSION_EDEFAULT.equals(filterExpression);
			case EamodelPackage.FILTER__NEGATE:
				return NEGATE_EDEFAULT == null ? negate != null : !NEGATE_EDEFAULT.equals(negate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (filterClass: ");
		result.append(getFilterClass());
		result.append(", filterType: ");
		result.append(getFilterType());
		result.append(", filterAttribute: ");
		result.append(getFilterAttribute());
		result.append(", filterExpression: ");
		result.append(getFilterExpression());
		result.append(", negate: ");
		result.append(getNegate());
		result.append(')');
		return result.toString();
	}

} //FilterImpl