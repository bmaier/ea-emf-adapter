/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipse.emf.common.util.EList;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAModifiableElement;
import org.sparx.Attribute;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * An attribute of the element.
 * <br><br><i>For more detailled documentation see <a href='http://www.sparxsystems.com.au/EAUserGuide/index.html' target='_blank'>EA User Guide</a>!</i>
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getContainment <em>Containment</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getAllowDuplicates <em>Allow Duplicates</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getScale <em>Scale</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAAttribute#getTaggedValues <em>Tagged Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute()
 * @model
 * @generated
 */
public interface EAAttribute extends EAModifiableElement, EAClassifierIDLong {
	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_Containment()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getContainment();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #getContainment()
	 * @generated
	 */
	void setContainment(String value);

	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #setIsCollection(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_IsCollection()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsCollection();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #getIsCollection()
	 * @generated
	 */
	void setIsCollection(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_IsOrdered()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsOrdered();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #getIsOrdered()
	 * @generated
	 */
	void setIsOrdered(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Duplicates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #setAllowDuplicates(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_AllowDuplicates()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getAllowDuplicates();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getAllowDuplicates <em>Allow Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Duplicates</em>' attribute.
	 * @see #getAllowDuplicates()
	 * @generated
	 */
	void setAllowDuplicates(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_IsDerived()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getIsDerived();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_Container()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getContainer();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_Scale()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getScale();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(String value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_Precision()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getPrecision();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_Length()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_LowerBound()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getLowerBound();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_UpperBound()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_Default()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(EAElement)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_Element()
	 * @see org.eclipselabs.eaadapter.model.EAElement#getAttributes
	 * @model opposite="attributes"
	 * @generated
	 */
	EAElement getElement();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EAElement value);

	/**
	 * Returns the value of the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * DO NOT TOUCH THIS! This attributed is used as a link to the Enterprise Architect and is managed internally only!
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ea Link</em>' attribute.
	 * @see #setEaLink(Attribute)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_Attribute" transient="true"
	 * @generated
	 */
	Attribute getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAAttribute#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(Attribute value);

	/**
	 * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAAttributeTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Values</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAAttribute_TaggedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAAttributeTag> getTaggedValues();

} // EAAttribute