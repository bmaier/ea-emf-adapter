/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipselabs.eaadapter.model.abstracthierachy.EATaggedElement;
import org.sparx.MethodTag;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Method Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * A Tagged Value.
 * <br><br><i>For detailled documentation see <a href='http://www.sparxsystems.com.au/EAUserGuide/index.html' target='_blank'>EA User Guide</a>!</i>
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EAMethodTag#getEaLink <em>Ea Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethodTag()
 * @model
 * @generated
 */
public interface EAMethodTag extends EATaggedElement {
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
	 * @see #setEaLink(MethodTag)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEAMethodTag_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_MethodTag" transient="true"
	 * @generated
	 */
	MethodTag getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EAMethodTag#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(MethodTag value);

} // EAMethodTag