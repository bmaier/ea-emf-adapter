/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass;
import org.sparx.DiagramLink;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Diagram Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramLink#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramLink#getConnectorID <em>Connector ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramLink#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramLink#getIsHidden <em>Is Hidden</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramLink#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramLink#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EADiagramLink#getEaLink <em>Ea Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramLink()
 * @model
 * @generated
 */
public interface EADiagramLink extends EABaseClass {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #isSetConnector()
	 * @see #unsetConnector()
	 * @see #setConnector(EAConnector)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramLink_Connector()
	 * @model unsettable="true"
	 * @generated
	 */
	EAConnector getConnector();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #isSetConnector()
	 * @see #unsetConnector()
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(EAConnector value);

	/**
	 * Unsets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnector()
	 * @see #getConnector()
	 * @see #setConnector(EAConnector)
	 * @generated
	 */
	void unsetConnector();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getConnector <em>Connector</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connector</em>' reference is set.
	 * @see #unsetConnector()
	 * @see #getConnector()
	 * @see #setConnector(EAConnector)
	 * @generated
	 */
	boolean isSetConnector();

	/**
	 * Returns the value of the '<em><b>Connector ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector ID</em>' attribute.
	 * @see #setConnectorID(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramLink_ConnectorID()
	 * @model
	 * @generated
	 */
	Integer getConnectorID();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getConnectorID <em>Connector ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector ID</em>' attribute.
	 * @see #getConnectorID()
	 * @generated
	 */
	void setConnectorID(Integer value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramLink_Geometry()
	 * @model
	 * @generated
	 */
	String getGeometry();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getGeometry <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' attribute.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(String value);

	/**
	 * Returns the value of the '<em><b>Is Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Hidden</em>' attribute.
	 * @see #setIsHidden(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramLink_IsHidden()
	 * @model
	 * @generated
	 */
	Boolean getIsHidden();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getIsHidden <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Hidden</em>' attribute.
	 * @see #getIsHidden()
	 * @generated
	 */
	void setIsHidden(Boolean value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramLink_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramLink_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Ea Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ea Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ea Link</em>' attribute.
	 * @see #setEaLink(DiagramLink)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEADiagramLink_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_DiagramLink" transient="true"
	 * @generated
	 */
	DiagramLink getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EADiagramLink#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(DiagramLink value);

} // EADiagramLink