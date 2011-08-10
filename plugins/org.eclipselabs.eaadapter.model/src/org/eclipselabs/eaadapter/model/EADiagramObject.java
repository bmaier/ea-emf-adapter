/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass;
import org.sparx.DiagramObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramObject#getBottom <em>Bottom</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramObject#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramObject#getElementID <em>Element ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramObject#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramObject#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramObject#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramObject#getTop <em>Top</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramObject#getEaLink <em>Ea Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramObject()
 * @model
 * @generated
 */
public interface EADiagramObject extends EABaseClass {
	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' attribute.
	 * @see #setBottom(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramObject_Bottom()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getBottom();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getBottom <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' attribute.
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(Integer value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #isSetElement()
	 * @see #unsetElement()
	 * @see #setElement(EAElement)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramObject_Element()
	 * @model unsettable="true"
	 * @generated
	 */
	EAElement getElement();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #isSetElement()
	 * @see #unsetElement()
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EAElement value);

	/**
	 * Unsets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElement()
	 * @see #getElement()
	 * @see #setElement(EAElement)
	 * @generated
	 */
	void unsetElement();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getElement <em>Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Element</em>' reference is set.
	 * @see #unsetElement()
	 * @see #getElement()
	 * @see #setElement(EAElement)
	 * @generated
	 */
	boolean isSetElement();

	/**
	 * Returns the value of the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element ID</em>' attribute.
	 * @see #setElementID(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramObject_ElementID()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getElementID();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getElementID <em>Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element ID</em>' attribute.
	 * @see #getElementID()
	 * @generated
	 */
	void setElementID(Integer value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramObject_Left()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getLeft();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Integer value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramObject_Right()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getRight();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Integer value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramObject_Sequence()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getSequence();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(Integer value);

	/**
	 * Returns the value of the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' attribute.
	 * @see #setTop(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramObject_Top()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getTop();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getTop <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' attribute.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(Integer value);

	/**
	 * Returns the value of the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ea Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ea Link</em>' attribute.
	 * @see #setEaLink(DiagramObject)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramObject_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_DiagramObject" transient="true"
	 * @generated
	 */
	DiagramObject getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramObject#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(DiagramObject value);

} // EADiagramObject