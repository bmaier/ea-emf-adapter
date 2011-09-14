/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.impl;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.Filter;
import org.eclipselabs.eaadapter.model.util.EAObjectContainmentEList;
import org.eclipselabs.eaadapter.model.util.EAUtil;
import org.sparx.EnumXMIType;
import org.sparx.Repository;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getModels <em>Models</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getEaLink <em>Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getCaching <em>Caching</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getReadonlyEaLink <em>Readonly Ea Link</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getPrefetchCompleteModel <em>Prefetch Complete Model</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getPrefetchPackageGuids <em>Prefetch Package Guids</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#getPersistentModels <em>Persistent Models</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#isPrefetchingEnabled <em>Prefetching Enabled</em>}</li>
 *   <li>{@link org.eclipselabs.eaadapter.model.impl.EARepositoryImpl#isShowWindow <em>Show Window</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("rawtypes")
public class EARepositoryImpl extends EObjectImpl implements EARepository {
	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackage> models = null;

	/**
	 * The default value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final Repository EA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEaLink() <em>Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaLink()
	 * @generated
	 * @ordered
	 */
	protected Repository eaLink = EA_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaching() <em>Caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaching()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CACHING_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCaching() <em>Caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaching()
	 * @generated
	 * @ordered
	 */
	protected Boolean caching = CACHING_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadonlyEaLink() <em>Readonly Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadonlyEaLink()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean READONLY_EA_LINK_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getReadonlyEaLink() <em>Readonly Ea Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadonlyEaLink()
	 * @generated
	 * @ordered
	 */
	protected Boolean readonlyEaLink = READONLY_EA_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagrams() <em>Diagrams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DIAGRAMS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected Boolean diagrams = DIAGRAMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefetchCompleteModel() <em>Prefetch Complete Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchCompleteModel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PREFETCH_COMPLETE_MODEL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPrefetchCompleteModel() <em>Prefetch Complete Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchCompleteModel()
	 * @generated
	 * @ordered
	 */
	protected Boolean prefetchCompleteModel = PREFETCH_COMPLETE_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefetchPackageGuids() <em>Prefetch Package Guids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchPackageGuids()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFETCH_PACKAGE_GUIDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefetchPackageGuids() <em>Prefetch Package Guids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchPackageGuids()
	 * @generated
	 * @ordered
	 */
	protected String prefetchPackageGuids = PREFETCH_PACKAGE_GUIDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filter = null;

	/**
	 * The cached value of the '{@link #getPersistentModels() <em>Persistent Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentModels()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackage> persistentModels = null;

	/**
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrefetchingEnabled() <em>Prefetching Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrefetchingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREFETCHING_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrefetchingEnabled() <em>Prefetching Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrefetchingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean prefetchingEnabled = PREFETCHING_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowWindow() <em>Show Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowWindow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_WINDOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowWindow() <em>Show Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowWindow()
	 * @generated
	 * @ordered
	 */
	protected boolean showWindow = SHOW_WINDOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EARepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EamodelPackage.Literals.EA_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAPackage> getModels() {
		if (models == null) {
			try {
				// open ea model
				if (!openFile())
					throw new Exception("Cannot open Enterprise Architect. Make sure it is installed and the eap-file exists: " + file);
				if (eaLink != null) {
					// Use EA-List to monitor changes in the list
					models = new EAObjectContainmentEList<EAPackage>(EAPackage.class, this, EamodelPackage.EA_REPOSITORY__MODELS, eaLink.GetModels());
					// fill list with ea objects
					ArrayList<EAPackage> coll = new ArrayList<EAPackage>();
					for (org.sparx.Package eaCollElement : eaLink.GetModels()) {

						// create emf wrapper object
						EAPackage collElement = EamodelFactory.eINSTANCE.createEAPackage();
						collElement.setEaLink(eaCollElement);
						collElement.setRepository(this);
						collElement.getGuid(); // resolve guid as key of the emf collection
						coll.add(collElement);
					}
					if (!coll.isEmpty())
						models.addAll(coll);

					// check if we need to prefetch anything
					if (prefetchingEnabled)
						prefetch();
				}
			} catch (Exception e) {
				if (eaLink == null)
					EAUtil.getLogger(getClass()).error("EA Link is null!", e);
				else EAUtil.getLogger(getClass()).error("Perhaps EA has produced an error: " + eaLink.GetLastError(), e);
				if (models == null)
					models = new BasicEList<EAPackage>();
			}
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getEaLink() {
		// return value
		return eaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEaLink(Repository newEaLink) {
		Repository oldEaLink = eaLink;
		eaLink = newEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__EA_LINK, oldEaLink, eaLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		// return value
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		// return value
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		// return value
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCaching() {
		// return value
		return caching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaching(Boolean newCaching) {
		Boolean oldCaching = caching;
		caching = newCaching;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__CACHING, oldCaching, caching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReadonlyEaLink() {
		// return value
		return readonlyEaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonlyEaLink(Boolean newReadonlyEaLink) {
		Boolean oldReadonlyEaLink = readonlyEaLink;
		readonlyEaLink = newReadonlyEaLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__READONLY_EA_LINK, oldReadonlyEaLink, readonlyEaLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDiagrams() {
		// return value
		return diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagrams(Boolean newDiagrams) {
		Boolean oldDiagrams = diagrams;
		diagrams = newDiagrams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__DIAGRAMS, oldDiagrams, diagrams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPrefetchCompleteModel() {
		// return value
		return prefetchCompleteModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefetchCompleteModel(Boolean newPrefetchCompleteModel) {
		Boolean oldPrefetchCompleteModel = prefetchCompleteModel;
		prefetchCompleteModel = newPrefetchCompleteModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__PREFETCH_COMPLETE_MODEL, oldPrefetchCompleteModel, prefetchCompleteModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefetchPackageGuids() {
		// return value
		return prefetchPackageGuids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefetchPackageGuids(String newPrefetchPackageGuids) {
		String oldPrefetchPackageGuids = prefetchPackageGuids;
		prefetchPackageGuids = newPrefetchPackageGuids;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__PREFETCH_PACKAGE_GUIDS, oldPrefetchPackageGuids, prefetchPackageGuids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<Filter>(Filter.class, this, EamodelPackage.EA_REPOSITORY__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAPackage> getPersistentModels() {
		if (persistentModels == null) {
			persistentModels = new EObjectContainmentEList.Unsettable<EAPackage>(EAPackage.class, this, EamodelPackage.EA_REPOSITORY__PERSISTENT_MODELS);
		}
		return persistentModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPersistentModels() {
		if (persistentModels != null) ((InternalEList.Unsettable)persistentModels).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPersistentModels() {
		return persistentModels != null && ((InternalEList.Unsettable)persistentModels).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistent() {
		// return value
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrefetchingEnabled() {
		// return value
		return prefetchingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefetchingEnabled(boolean newPrefetchingEnabled) {
		boolean oldPrefetchingEnabled = prefetchingEnabled;
		prefetchingEnabled = newPrefetchingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__PREFETCHING_ENABLED, oldPrefetchingEnabled, prefetchingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowWindow() {
		// return value
		return showWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowWindow(boolean newShowWindow) {
		boolean oldShowWindow = showWindow;
		showWindow = newShowWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EamodelPackage.EA_REPOSITORY__SHOW_WINDOW, oldShowWindow, showWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean openFile() {
		// check if file exists
		String modelFile = EAUtil.getFileFromURI(EAUtil.getFileURI(getFile()));
		if (modelFile == null || modelFile.length() == 0) {
			return false;
		}
		
		// already open & valid?
		if (eaLink != null && checkEaLink(modelFile))
			return true;
			
		// same file already open?
		final WeakReference<Repository> weakLink = repositories.get(modelFile);
		if (weakLink != null)
			eaLink = weakLink.get();
		if (eaLink != null && checkEaLink(modelFile))
			return true;
			
		// cleaning up memory if EA was closed 
		System.gc();
		System.runFinalization();
		
		// try to open model from file
		try {
		
			// no valid ea link found, so lets create a new repository instance
			eaLink = new Repository();
			boolean success = false;
			if (user != null && password != null && user.length() > 0) {
				success = eaLink.OpenFile2(modelFile, user, password);
			} else success = eaLink.OpenFile(modelFile);
			
			// if repository is successfully opened, save it in the repository map
			if (success) {
				final WeakReference<Repository> weakEaLink = new WeakReference<Repository>(eaLink);
				repositories.put(modelFile, weakEaLink);
				final int show = isShowWindow() ? 1 : 0;
				eaLink.ShowWindow(show);
			} else {
				eaLink = null;
			}
			return success;
		} catch (Exception e) {
		
			// if another thread tries to use this ea-link, a lot of exceptions are thrown!
			// to avoid dozens of stacktraces, just a '$' is printed to System.err. 
			if (e.getMessage().equals("Unknown exception thrown") && e.getStackTrace()[0].getMethodName().equals("comConstructor"))
				System.err.print("$");
			else e.printStackTrace();
			eaLink = null;
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void closeFile() {
		// if already closed, quit
		if (eaLink == null) return;
		
		// close ea
		try {
			eaLink.CloseFile();
			eaLink.Exit();
		} catch (Exception e) {
			System.err.println("Error while closing file:" + e.getMessage());
			e.printStackTrace();
		}
		eaLink = null;
		models = null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void prefetch() {
		if (prefetchCompleteModel) {
			EAUtil.iterateOverEClass(this, null, true);
		} else {
			if (models == null) 
				throw new UnsupportedOperationException("Cannot prefetch models if model collection is not yet initialized! Call getModels() to initialize this collections. Note: if prefetchingEnalbled is set to true, then prefetching is performed automatically."); 
			if (getPrefetchPackageGuids() != null && getPrefetchPackageGuids().trim().length() > 0) {
				final List<EAPackage> packages = EAUtil.loadPackages(getPrefetchPackageGuids().trim(), models);
				for (EAPackage p : packages) {
					EAUtil.iterateOverEClass(p, null, true);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String exportXMI(String packageGuid, String xmiType, boolean diagrams, int diagramFormat, boolean formattedXML, boolean useDTD, String filename) {
		for (EnumXMIType type : EnumXMIType.values()) {
			if (type.name().toLowerCase().equals(xmiType.toLowerCase())) {
				final String result = eaLink.GetProjectInterface().ExportPackageXMIEx(packageGuid, type,
						diagrams ? 1 : 0, diagramFormat, formattedXML ? 1 : 0, useDTD ? 1 : 0, filename, 0);
				return result;
			}
		}
		throw new IllegalArgumentException("XMI type not found: " + xmiType + ". Available options: " + 
				Arrays.toString(EnumXMIType.values()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EamodelPackage.EA_REPOSITORY__MODELS:
				return ((InternalEList)getModels()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_REPOSITORY__FILTER:
				return ((InternalEList)getFilter()).basicRemove(otherEnd, msgs);
			case EamodelPackage.EA_REPOSITORY__PERSISTENT_MODELS:
				return ((InternalEList)getPersistentModels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EamodelPackage.EA_REPOSITORY__MODELS:
				return getModels();
			case EamodelPackage.EA_REPOSITORY__EA_LINK:
				return getEaLink();
			case EamodelPackage.EA_REPOSITORY__FILE:
				return getFile();
			case EamodelPackage.EA_REPOSITORY__USER:
				return getUser();
			case EamodelPackage.EA_REPOSITORY__PASSWORD:
				return getPassword();
			case EamodelPackage.EA_REPOSITORY__CACHING:
				return getCaching();
			case EamodelPackage.EA_REPOSITORY__READONLY_EA_LINK:
				return getReadonlyEaLink();
			case EamodelPackage.EA_REPOSITORY__DIAGRAMS:
				return getDiagrams();
			case EamodelPackage.EA_REPOSITORY__PREFETCH_COMPLETE_MODEL:
				return getPrefetchCompleteModel();
			case EamodelPackage.EA_REPOSITORY__PREFETCH_PACKAGE_GUIDS:
				return getPrefetchPackageGuids();
			case EamodelPackage.EA_REPOSITORY__FILTER:
				return getFilter();
			case EamodelPackage.EA_REPOSITORY__PERSISTENT_MODELS:
				return getPersistentModels();
			case EamodelPackage.EA_REPOSITORY__PERSISTENT:
				return isPersistent() ? Boolean.TRUE : Boolean.FALSE;
			case EamodelPackage.EA_REPOSITORY__PREFETCHING_ENABLED:
				return isPrefetchingEnabled() ? Boolean.TRUE : Boolean.FALSE;
			case EamodelPackage.EA_REPOSITORY__SHOW_WINDOW:
				return isShowWindow() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EamodelPackage.EA_REPOSITORY__MODELS:
				getModels().clear();
				getModels().addAll((Collection)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__EA_LINK:
				setEaLink((Repository)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__FILE:
				setFile((String)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__USER:
				setUser((String)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__PASSWORD:
				setPassword((String)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__CACHING:
				setCaching((Boolean)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__READONLY_EA_LINK:
				setReadonlyEaLink((Boolean)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__DIAGRAMS:
				setDiagrams((Boolean)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__PREFETCH_COMPLETE_MODEL:
				setPrefetchCompleteModel((Boolean)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__PREFETCH_PACKAGE_GUIDS:
				setPrefetchPackageGuids((String)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__PERSISTENT_MODELS:
				getPersistentModels().clear();
				getPersistentModels().addAll((Collection)newValue);
				return;
			case EamodelPackage.EA_REPOSITORY__PERSISTENT:
				setPersistent(((Boolean)newValue).booleanValue());
				return;
			case EamodelPackage.EA_REPOSITORY__PREFETCHING_ENABLED:
				setPrefetchingEnabled(((Boolean)newValue).booleanValue());
				return;
			case EamodelPackage.EA_REPOSITORY__SHOW_WINDOW:
				setShowWindow(((Boolean)newValue).booleanValue());
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
			case EamodelPackage.EA_REPOSITORY__MODELS:
				getModels().clear();
				return;
			case EamodelPackage.EA_REPOSITORY__EA_LINK:
				setEaLink(EA_LINK_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__USER:
				setUser(USER_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__CACHING:
				setCaching(CACHING_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__READONLY_EA_LINK:
				setReadonlyEaLink(READONLY_EA_LINK_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__DIAGRAMS:
				setDiagrams(DIAGRAMS_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__PREFETCH_COMPLETE_MODEL:
				setPrefetchCompleteModel(PREFETCH_COMPLETE_MODEL_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__PREFETCH_PACKAGE_GUIDS:
				setPrefetchPackageGuids(PREFETCH_PACKAGE_GUIDS_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__FILTER:
				getFilter().clear();
				return;
			case EamodelPackage.EA_REPOSITORY__PERSISTENT_MODELS:
				unsetPersistentModels();
				return;
			case EamodelPackage.EA_REPOSITORY__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__PREFETCHING_ENABLED:
				setPrefetchingEnabled(PREFETCHING_ENABLED_EDEFAULT);
				return;
			case EamodelPackage.EA_REPOSITORY__SHOW_WINDOW:
				setShowWindow(SHOW_WINDOW_EDEFAULT);
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
			case EamodelPackage.EA_REPOSITORY__MODELS:
				return models != null && !models.isEmpty();
			case EamodelPackage.EA_REPOSITORY__EA_LINK:
				return EA_LINK_EDEFAULT == null ? eaLink != null : !EA_LINK_EDEFAULT.equals(eaLink);
			case EamodelPackage.EA_REPOSITORY__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case EamodelPackage.EA_REPOSITORY__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case EamodelPackage.EA_REPOSITORY__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case EamodelPackage.EA_REPOSITORY__CACHING:
				return CACHING_EDEFAULT == null ? caching != null : !CACHING_EDEFAULT.equals(caching);
			case EamodelPackage.EA_REPOSITORY__READONLY_EA_LINK:
				return READONLY_EA_LINK_EDEFAULT == null ? readonlyEaLink != null : !READONLY_EA_LINK_EDEFAULT.equals(readonlyEaLink);
			case EamodelPackage.EA_REPOSITORY__DIAGRAMS:
				return DIAGRAMS_EDEFAULT == null ? diagrams != null : !DIAGRAMS_EDEFAULT.equals(diagrams);
			case EamodelPackage.EA_REPOSITORY__PREFETCH_COMPLETE_MODEL:
				return PREFETCH_COMPLETE_MODEL_EDEFAULT == null ? prefetchCompleteModel != null : !PREFETCH_COMPLETE_MODEL_EDEFAULT.equals(prefetchCompleteModel);
			case EamodelPackage.EA_REPOSITORY__PREFETCH_PACKAGE_GUIDS:
				return PREFETCH_PACKAGE_GUIDS_EDEFAULT == null ? prefetchPackageGuids != null : !PREFETCH_PACKAGE_GUIDS_EDEFAULT.equals(prefetchPackageGuids);
			case EamodelPackage.EA_REPOSITORY__FILTER:
				return filter != null && !filter.isEmpty();
			case EamodelPackage.EA_REPOSITORY__PERSISTENT_MODELS:
				return isSetPersistentModels();
			case EamodelPackage.EA_REPOSITORY__PERSISTENT:
				return persistent != PERSISTENT_EDEFAULT;
			case EamodelPackage.EA_REPOSITORY__PREFETCHING_ENABLED:
				return prefetchingEnabled != PREFETCHING_ENABLED_EDEFAULT;
			case EamodelPackage.EA_REPOSITORY__SHOW_WINDOW:
				return showWindow != SHOW_WINDOW_EDEFAULT;
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
		result.append(" (eaLink: ");
		result.append(getEaLink());
		result.append(", file: ");
		result.append(getFile());
		result.append(", user: ");
		result.append(getUser());
		result.append(", password: ");
		result.append(getPassword());
		result.append(", caching: ");
		result.append(getCaching());
		result.append(", readonlyEaLink: ");
		result.append(getReadonlyEaLink());
		result.append(", diagrams: ");
		result.append(getDiagrams());
		result.append(", prefetchCompleteModel: ");
		result.append(getPrefetchCompleteModel());
		result.append(", prefetchPackageGuids: ");
		result.append(getPrefetchPackageGuids());
		result.append(", persistent: ");
		result.append(isPersistent());
		result.append(", prefetchingEnabled: ");
		result.append(isPrefetchingEnabled());
		result.append(", showWindow: ");
		result.append(isShowWindow());
		result.append(')');
		return result.toString();
	}

	/**
	 * A map of repositories, categorized by filenames.
	 * This ensures only one EA instance for each eap-file.
	 * 
	 * @generated
	 */
	transient private static Map<String,WeakReference<Repository>> repositories = new HashMap<String,WeakReference<Repository>>();

	/**
	 * If eaLink is not null but EA was closed for other reasons, eaLink points to an invalid place.
	 * So lets check the link.
	 * 
	 * @generated
	 */
	private boolean checkEaLink(String modelFile) {
		try {
			// check if we can access the repository
			if (eaLink.GetModels().iterator() == null) {
				// failed... lets remove it from the repository map
				repositories.remove(modelFile);
				eaLink = null;
			}
			eaLink.GetModels().iterator().hasNext();
			return true;
		} catch (Exception e) {
			// failed... lets remove it from the repository map
			repositories.remove(modelFile);
			eaLink = null;
			return false;
		}
	}
	
} //EARepositoryImpl