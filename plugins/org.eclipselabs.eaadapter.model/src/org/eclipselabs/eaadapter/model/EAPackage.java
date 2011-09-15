/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipse.emf.common.util.EList;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAAbstractPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * A package in EA is a container for other elements.<br>
 * A package can, for instance, be a UML package.
 * <br><br><i>For detailled documentation see <a href='http://www.sparxsystems.com.au/EAUserGuide/index.html' target='_blank'>EA User Guide</a>!</i>
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAPackage#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAPackage#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAPackage#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAPackage#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAPackage#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAPackage#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAPackage()
 * @model
 * @generated
 */
public interface EAPackage extends EAAbstractPackage {
	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EADiagram}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EADiagram#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAPackage_Diagrams()
	 * @see org.eclipselabs.eaadapter.model.EADiagram#getPackage
	 * @model opposite="package" containment="true" volatile="true"
	 * @generated
	 */
	EList<EADiagram> getDiagrams();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAElement#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Set of contained elements.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAPackage_Elements()
	 * @see org.eclipselabs.eaadapter.model.EAElement#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<EAElement> getElements();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAPackage}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAPackage#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Subpackages of this package.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAPackage_Packages()
	 * @see org.eclipselabs.eaadapter.model.EAPackage#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<EAPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.eaadapter.model.EAPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * The parent package.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(EAPackage)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAPackage_Package()
	 * @see org.eclipselabs.eaadapter.model.EAPackage#getPackages
	 * @model opposite="packages" transient="false"
	 * @generated
	 */
	EAPackage getPackage();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAPackage#getPackage <em>Package</em>}' container reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DO NOT TOUCH THIS! This attributed is used as a link to the Enterprise Architect and is managed internally only!
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ea Link</em>' attribute.
	 * @see #setEaLink(org.sparx.Package)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAPackage_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_Package" transient="true"
	 * @generated
	 */
	org.sparx.Package getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAPackage#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(org.sparx.Package value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * The stereotype attribute is part of an object of type <code>EAElement</code> which is referenced by each package.<br>
	 * This object causes a lot of trouble because it has the same <i>guid</i> as the package, so a wrapper getter and setter are generated by the code generation templates.<br>
	 * As a consequence, the stereotype attribute can be used as a usual attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see #setStereotype(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAPackage_Stereotype()
	 * @model
	 * @generated
	 */
	String getStereotype();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAPackage#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(String value);

} // EAPackage