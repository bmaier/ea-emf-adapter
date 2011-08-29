/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.sparx.EnumXMIType;
import org.sparx.Repository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <div class='userdoc'>
 * Root object for an EA project.<br>
 * This object takes care of the link between the EMF model and the EA project.
 * <br><br><i>For detailled documentation see <a href='http://www.sparxsystems.com.au/EAUserGuide/index.html' target='_blank'>EA User Guide</a>!</i>
 * </div>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getModels <em>Models</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getCaching <em>Caching</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getReadonlyEaLink <em>Readonly Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getPrefetchCompleteModel <em>Prefetch Complete Model</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getPrefetchPackageGuids <em>Prefetch Package Guids</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#getPersistentModels <em>Persistent Models</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#isPrefetchingEnabled <em>Prefetching Enabled</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.EARepository#isShowWindow <em>Show Window</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository()
 * @model
 * @generated
 */
public interface EARepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Return all root packages of the project. Usually, this is only one package.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_Models()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<EAPackage> getModels();

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
	 * @see #setEaLink(Repository)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_EaLink()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.T_Repository" transient="true"
	 * @generated
	 */
	Repository getEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getEaLink <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Link</em>' attribute.
	 * @see #getEaLink()
	 * @generated
	 */
	void setEaLink(Repository value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Specify the Enterprise Architect project file here.<br>
	 * An absolut path is required!<br>
	 * TODO: Implement support for relative paths and eclipse resource URIs.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_File()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * If the EA project specified in <code>file</code> requires a authorized login, specify user name here.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_User()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * If the EA project specified in <code>file</code> requires a authorized login, specify password here.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_Password()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Caching</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Any value that is read once from the EA will be cached in the corresponding EMF variable.<br><br>
	 * If <code>caching</code> is set to <code>false</code>, any access to an attribute will re-access the EA to ask for the value.
	 * <b>This is a lot slower! You should have a very good reason if you turn this feature off!</b>
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caching</em>' attribute.
	 * @see #setCaching(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_Caching()
	 * @model default="true" dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getCaching();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getCaching <em>Caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caching</em>' attribute.
	 * @see #getCaching()
	 * @generated
	 */
	void setCaching(Boolean value);

	/**
	 * Returns the value of the '<em><b>Readonly Ea Link</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * All changes made in the model are <i>not</i> transferred to the EA!<br>
	 * This should be used in combination to the flag <code>persistent</code> or for testing purposes only.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Readonly Ea Link</em>' attribute.
	 * @see #setReadonlyEaLink(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_ReadonlyEaLink()
	 * @model default="false" dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getReadonlyEaLink();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getReadonlyEaLink <em>Readonly Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly Ea Link</em>' attribute.
	 * @see #getReadonlyEaLink()
	 * @generated
	 */
	void setReadonlyEaLink(Boolean value);

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Not implemented yet!<br>
	 * Idea: Support diagrams in the model.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagrams</em>' attribute.
	 * @see #setDiagrams(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_Diagrams()
	 * @model default="false" dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getDiagrams();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getDiagrams <em>Diagrams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagrams</em>' attribute.
	 * @see #getDiagrams()
	 * @generated
	 */
	void setDiagrams(Boolean value);

	/**
	 * Returns the value of the '<em><b>Prefetch Complete Model</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * If this flag is set to <code>true</code>, the guid's of all elements will be resolved at firs access of the reference <code>models</code>.<br>
	 * <b>Warning:</b> This may take a long time if it is a huge model!<br>
	 * Perhaps using <code>prefetchPackageGuids</code> is a better choice.<br>
	 * <br>
	 * <b>Note: This feature is still under development and may not work correctly!</b>
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefetch Complete Model</em>' attribute.
	 * @see #setPrefetchCompleteModel(Boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_PrefetchCompleteModel()
	 * @model default="false" dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean getPrefetchCompleteModel();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getPrefetchCompleteModel <em>Prefetch Complete Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefetch Complete Model</em>' attribute.
	 * @see #getPrefetchCompleteModel()
	 * @generated
	 */
	void setPrefetchCompleteModel(Boolean value);

	/**
	 * Returns the value of the '<em><b>Prefetch Package Guids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * This attribute may contain a comma-separated list of packages to resolve at the first access of the reference <code>models</code>.<br>
	 * Examples:
	 * <ul>
	 * <li>Views.Logical_View.Analyse
	 * <li>Views.Logical_View.Analyse.AWK, Views.Logical_View.Design
	 * </ul>
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefetch Package Guids</em>' attribute.
	 * @see #setPrefetchPackageGuids(String)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_PrefetchPackageGuids()
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String getPrefetchPackageGuids();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getPrefetchPackageGuids <em>Prefetch Package Guids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefetch Package Guids</em>' attribute.
	 * @see #getPrefetchPackageGuids()
	 * @generated
	 */
	void setPrefetchPackageGuids(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * A filter reduces the set of specified children when a sub-collection is fetched <b>the first time</b>.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilter();

	/**
	 * Returns the value of the '<em><b>Persistent Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.eaadapter.model.EAPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Do not use thie reference! See attribute <code>persistent</code> for details!
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistent Models</em>' containment reference list.
	 * @see #isSetPersistentModels()
	 * @see #unsetPersistentModels()
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_PersistentModels()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	EList<EAPackage> getPersistentModels();

	/**
	 * Unsets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getPersistentModels <em>Persistent Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistentModels()
	 * @see #getPersistentModels()
	 * @generated
	 */
	void unsetPersistentModels();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#getPersistentModels <em>Persistent Models</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistent Models</em>' containment reference list is set.
	 * @see #unsetPersistentModels()
	 * @see #getPersistentModels()
	 * @generated
	 */
	boolean isSetPersistentModels();

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * If this flag is set and the model is saved, the whole model (as it is resolved so far) will be saved into the file.<br>
	 * Note: Saving works, but re-opening the file still fails!
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_Persistent()
	 * @model default="false"
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Prefetching Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * This flag may temporarily used to avoid any prefetching when opening the model the first time.<br>
	 * The falg is <i>transient</i>! So it needs to be set each time the model is opened.<br>
	 * Attention: If no prefetching takes place, a not already visited element cannot be resolved by its guid!
	 * But you can perform the prefetching process manually by calling <code>prefetch()</code>.
	 * </div>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefetching Enabled</em>' attribute.
	 * @see #setPrefetchingEnabled(boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_PrefetchingEnabled()
	 * @model default="false"
	 * @generated
	 */
	boolean isPrefetchingEnabled();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#isPrefetchingEnabled <em>Prefetching Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefetching Enabled</em>' attribute.
	 * @see #isPrefetchingEnabled()
	 * @generated
	 */
	void setPrefetchingEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Window</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Window</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Window</em>' attribute.
	 * @see #setShowWindow(boolean)
	 * @see org.eclipselabs.eaadapter.model.EamodelPackage#getEARepository_ShowWindow()
	 * @model default="false"
	 * @generated
	 */
	boolean isShowWindow();

	/**
	 * Sets the value of the '{@link org.eclipselabs.eaadapter.model.EARepository#isShowWindow <em>Show Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Window</em>' attribute.
	 * @see #isShowWindow()
	 * @generated
	 */
	void setShowWindow(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Open the EA with the file given in the attribute <code>file</code>.<br>
	 * This method is not supposed to be called manually! It is used internally when the reference <code>models</code> is accessed the first time.
	 * </div>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.Boolean"
	 * @generated
	 */
	Boolean openFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * This closes the EA. Please do not call this manually - the behaviour is undefined.
	 * </div>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void closeFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * Manually perform the prefetching of all GUIDs defined by <code>prefetchCompleteModel</code> or <code>prefetchPackageGuids</code>.<br>
	 * For more information, see documentation of the attribute <code>prefetchingEnabled</code>.
	 * </div>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void prefetch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * This closes the EA. Please do not call this manually - the behaviour is undefined.
	 * </div>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void exitEA();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <div class='userdoc'>
	 * <p>Export the given package as XMI into the specified file.</p>
	 * <p>Parameters:
	 * <ul><li><b>packageGuid</b>: The guid of the package that shall be exported.
	 * <li><b>xmiType</b>: The XMI type. Please see {@link EnumXMIType} for available types or check <a href='http://www.sparxsystems.com/enterprise_architect_user_guide/9.0/automation/xmitypeenum.html'>EA Documentation</a>.
	 * <li><b>diagrams</b>: Whether or not to include diagram exports.
	 * <li><b>diagramFormat</b>: Which format to use; check <a href='http://www.sparxsystems.com/enterprise_architect_user_guide/9.0/automation/project_2.html'>EA Documentation</a>.
	 * <li><b>formattedXML</b>: Whether or not the output shall be formatted.
	 * <li><b>useDTD</b>: Whether or not a DTD shall be used.
	 * <li><b>filename</b>: The OS-specific filename for storing the exported XMI.
	 * </ul>
	 * </div>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipselabs.eaadapter.model.datatypes.String" packageGuidDataType="org.eclipselabs.eaadapter.model.datatypes.String" xmiTypeDataType="org.eclipselabs.eaadapter.model.datatypes.String" filenameDataType="org.eclipselabs.eaadapter.model.datatypes.String"
	 * @generated
	 */
	String exportXMI(String packageGuid, String xmiType, boolean diagrams, int diagramFormat, boolean formattedXML, boolean useDTD, String filename);

	
} // EARepository