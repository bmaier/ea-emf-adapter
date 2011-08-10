/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipse.emf.common.util.EList;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAStereotypedElement;
import org.sparx.Diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagram#getSwimlanes <em>Swimlanes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagram#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagram#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagram#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagram#getDiagramLinks <em>Diagram Links</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagram#getDiagramObjects <em>Diagram Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagram()
 * @model
 * @generated
 */
public interface EADiagram extends EAOwnedElement, EAStereotypedElement {
	/**
	 * Returns the value of the '<em><b>Swimlanes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swimlanes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swimlanes</em>' attribute.
	 * @see #setSwimlanes(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagram_Swimlanes()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getSwimlanes();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagram#getSwimlanes <em>Swimlanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swimlanes</em>' attribute.
	 * @see #getSwimlanes()
	 * @generated
	 */
	void setSwimlanes(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagram_Type()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" changeable="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAPackage#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(EAPackage)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagram_Package()
	 * @see org.eclipselabs.eaadapter.model.EAPackage#getDiagrams
	 * @model opposite="diagrams"
	 * @generated
	 */
	EAPackage getPackage();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagram#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(EAPackage value);

	/**
	 * Returns the value of the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ea Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ea Link</em>' attribute.
	 * @see #setEaLink(Diagram)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagram_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_Diagram" transient="true"
	 * @generated
	 */
	Diagram getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagram#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(Diagram value);

	/**
	 * Returns the value of the '<em><b>Diagram Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EADiagramLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Links</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagram_DiagramLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<EADiagramLink> getDiagramLinks();

	/**
	 * Returns the value of the '<em><b>Diagram Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EADiagramObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Objects</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagram_DiagramObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EADiagramObject> getDiagramObjects();

} // EADiagram