/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipse.emf.common.util.EList;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAClassifierIDLong;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAOwnedElement;
import org.sparx.Element;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * An Element can, for instance,  be a class, an interface or a UML Note.<br>
 * <br><br><i>For detailled documentation see <a href='http://www.sparxsystems.com.au/EAUserGuide/index.html' target='_blank'>EA User Guide</a>!</i>
 * 
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getClassifierType <em>Classifier Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getGenlinks <em>Genlinks</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getGenfile <em>Genfile</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getGentype <em>Gentype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getStereotypeEx <em>Stereotype Ex</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getTablespace <em>Tablespace</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getParentID <em>Parent ID</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAElement#getPackageID <em>Package ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement()
 * @model
 * @generated
 */
public interface EAElement extends EAClassifierIDLong, EAOwnedElement {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * This attribute is stored as a String type in the EA, not as a boolean - whyever!!!
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Abstract()
	 * @model default="0" dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Name</em>' attribute.
	 * @see #setClassifierName(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_ClassifierName()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getClassifierName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getClassifierName <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Name</em>' attribute.
	 * @see #getClassifierName()
	 * @generated
	 */
	void setClassifierName(String value);

	/**
	 * Returns the value of the '<em><b>Classifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Type</em>' attribute.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_ClassifierType()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" changeable="false"
	 * @generated
	 */
	String getClassifierType();

	/**
	 * Returns the value of the '<em><b>Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complexity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complexity</em>' attribute.
	 * @see #setComplexity(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Complexity()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getComplexity();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getComplexity <em>Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complexity</em>' attribute.
	 * @see #getComplexity()
	 * @generated
	 */
	void setComplexity(String value);

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Difficulty()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getDifficulty();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(String value);

	/**
	 * Returns the value of the '<em><b>Extension Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Points</em>' attribute.
	 * @see #setExtensionPoints(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_ExtensionPoints()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getExtensionPoints();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getExtensionPoints <em>Extension Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Points</em>' attribute.
	 * @see #getExtensionPoints()
	 * @generated
	 */
	void setExtensionPoints(String value);

	/**
	 * Returns the value of the '<em><b>Genlinks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genlinks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genlinks</em>' attribute.
	 * @see #setGenlinks(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Genlinks()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getGenlinks();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getGenlinks <em>Genlinks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genlinks</em>' attribute.
	 * @see #getGenlinks()
	 * @generated
	 */
	void setGenlinks(String value);

	/**
	 * Returns the value of the '<em><b>Genfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genfile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genfile</em>' attribute.
	 * @see #setGenfile(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Genfile()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getGenfile();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getGenfile <em>Genfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genfile</em>' attribute.
	 * @see #getGenfile()
	 * @generated
	 */
	void setGenfile(String value);

	/**
	 * Returns the value of the '<em><b>Gentype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gentype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gentype</em>' attribute.
	 * @see #setGentype(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Gentype()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getGentype();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getGentype <em>Gentype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gentype</em>' attribute.
	 * @see #getGentype()
	 * @generated
	 */
	void setGentype(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Multiplicity()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Phase()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getPhase();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Priority()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Property Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Type</em>' attribute.
	 * @see #setPropertyType(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_PropertyType()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getPropertyType();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getPropertyType <em>Property Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Type</em>' attribute.
	 * @see #getPropertyType()
	 * @generated
	 */
	void setPropertyType(Integer value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Status()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Stereotype Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype Ex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype Ex</em>' attribute.
	 * @see #setStereotypeEx(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_StereotypeEx()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getStereotypeEx();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getStereotypeEx <em>Stereotype Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype Ex</em>' attribute.
	 * @see #getStereotypeEx()
	 * @generated
	 */
	void setStereotypeEx(String value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Subtype()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer"
	 * @generated
	 */
	Integer getSubtype();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(Integer value);

	/**
	 * Returns the value of the '<em><b>Tablespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tablespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablespace</em>' attribute.
	 * @see #setTablespace(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Tablespace()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" volatile="true"
	 * @generated
	 */
	String getTablespace();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getTablespace <em>Tablespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tablespace</em>' attribute.
	 * @see #getTablespace()
	 * @generated
	 */
	void setTablespace(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Tag()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(EAElement)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Element()
	 * @see org.eclipselabs.eaadapter.model.EAElement#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	EAElement getElement();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EAElement value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAPackage#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * The parent package.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(EAPackage)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Package()
	 * @see org.eclipselabs.eaadapter.model.EAPackage#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	EAPackage getPackage();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(EAPackage value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAAttribute}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAAttribute#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Attributes()
	 * @see org.eclipselabs.eaadapter.model.EAAttribute#getElement
	 * @model opposite="element" containment="true"
	 * @generated
	 */
	EList<EAAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAConnector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Elements()
	 * @see org.eclipselabs.eaadapter.model.EAElement#getElement
	 * @model opposite="element" containment="true"
	 * @generated
	 */
	EList<EAElement> getElements();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAMethod}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAMethod#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_Methods()
	 * @see org.eclipselabs.eaadapter.model.EAMethod#getElement
	 * @model opposite="element" containment="true"
	 * @generated
	 */
	EList<EAMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EATaggedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Values</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_TaggedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<EATaggedValue> getTaggedValues();

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
	 * @see #setEaLink(Element)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_Element" transient="true"
	 * @generated
	 */
	Element getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(Element value);

	/**
	 * Returns the value of the '<em><b>Parent ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent ID</em>' attribute.
	 * @see #setParentID(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_ParentID()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer" volatile="true"
	 * @generated
	 */
	Integer getParentID();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getParentID <em>Parent ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent ID</em>' attribute.
	 * @see #getParentID()
	 * @generated
	 */
	void setParentID(Integer value);

	/**
	 * Returns the value of the '<em><b>Package ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package ID</em>' attribute.
	 * @see #setPackageID(Integer)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAElement_PackageID()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Integer" volatile="true"
	 * @generated
	 */
	Integer getPackageID();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAElement#getPackageID <em>Package ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package ID</em>' attribute.
	 * @see #getPackageID()
	 * @generated
	 */
	void setPackageID(Integer value);

} // EAElement