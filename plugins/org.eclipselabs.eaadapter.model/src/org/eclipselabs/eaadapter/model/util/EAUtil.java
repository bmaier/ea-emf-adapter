/**
 * 
 */
package org.eclipselabs.eaadapter.model.util;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass;
import org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement;


/**
 * <div class='userdoc'>
 * Helper class for the EA models.
 * </div>
 */
public class EAUtil {

	/**
	 * <div class='userdoc'>
	 * This iterates over all attributes and collections of an EObject (EClass-Instance).
	 * The attributes and collections are obtained via the EMF reflection methods.
	 * If <b>recursive</b> is set, <i>iterateOverEClass</i> is called on each contained EObject.
	 * If <b>out</b> is not null, all objects and attributes are written into that {@link StringBuffer}, otherwise there is no output at all.
	 * Note: If <b>out</b> is set, the iteration is slowed down a bit. Use it only for debugging purposes.
	 * </div> 
	 * @param eObject
	 * @param out
	 * @param recursive
	 */
	public static void iterateOverEClass(EObject eObject, StringBuffer out, boolean recursive) {
		try {
			EClass eClass = eObject.eClass();
			if (out != null)
				out.append("====================> CLASSNAME: " + eClass.getName());
			for (EAttribute attr : eObject.eClass().getEAllAttributes()) {
				if (out != null)
					out.append(",  " + attr.getName() + " = " + eObject.eGet(attr));
				else eObject.eGet(attr);
			}
			if (out != null)
				out.append("\n");
			if (recursive) {
				for (EReference ref : eObject.eClass().getEAllContainments()) {
					Object obj = eObject.eGet(ref);
					if (obj instanceof EList) {
						@SuppressWarnings("unchecked") EList<EObject> list = (EList<EObject>)obj;
						for (EObject o : list) {
							iterateOverEClass(o, out, recursive);
						}
					} else if (obj instanceof EObject) {
						iterateOverEClass((EObject)obj, out, recursive);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	/**
//	 * Simply iterates over all subpackages, recursively.
//	 * @param packages
//	 */
//	private static void loadPackagesRecursive(EList packages) {
//		for (Iterator iterator = packages.iterator(); iterator.hasNext();) {
//			EAPackage subPackage = (EAPackage) iterator.next();
//			loadPackagesRecursive(subPackage.getPackages());
//		}
//	}

	/**
	 * <div class='userdoc'>
	 * This iterates over the package hierarchy of the EA model to load a comma separated list of packages.<br>
	 * <b>models</b> is the root collection of packages, <b>structures</b> is a list of packages to iterate over.<br>
	 * If <recursive</b> is set, all (!) sub-packages of the packages in <b>structures</b> will be loaded as well.
	 * Note: If the model is big, this can take a long time! 
	 * Examples for <b>structures</b>:<ul>
	 * <li>"Views.Logical_View.Analyse"</li>
	 * <li>"Views.Logical_View.Analyse, Views.Logical_View.Design"</li>
	 * <li>"Views.Logical_View.Analyse.SubAnalyse, Views.Logical_View.Design.my.implementation"</li>
	 * </ul>
	 * </div>
	 * @param structures
	 * @param models
	 * @param recursive
	 */
	@SuppressWarnings({ "rawtypes" })
	public static List<EAPackage> loadPackages(String structures, EList models) {
		final List<EAPackage> result = new ArrayList<EAPackage>();
 		// map for references to resolve
		Map<EObject, EReference> refs = new LinkedHashMap<EObject, EReference>();
		String[] packages = structures.split(",");
 		// iterate over all packages
		for (String p : packages) {
			String[] sp = p.trim().split("\\."); // escape dot for regular expression
			EList packageList = models;
			// iterate over package-path to reach the actual package
			for (int i = 0; i < sp.length; i++) {
				String s = sp[i].trim();
				if (s.length() > 0) {
					// if packageList == null, give some debug output
					if (packageList != null) {
						// look for the next package of the package-path
						fp: for (Iterator iterator = packageList.iterator(); iterator.hasNext();) {
							EAPackage trace = (EAPackage) iterator.next();
							if (trace.getName().equals(s)) {
								result.add(trace);
								// we got it; fetch subpackages only if we did not reach the end of the path
								if (i < sp.length - 1) {
									packageList = trace.getPackages();
								} else {
									// fetch complete package hierarchy of the package at the end of the path
									loadGuids(trace, refs);
								}
								break fp;
							}
						}
					} 
				}
			}
		}

		// references must be resolved _after_ the whole tree is cached
		for (EObject eObject : refs.keySet()) {
			Object o = eObject.eGet(refs.get(eObject));
			if (o instanceof EANamedElement) {
				EANamedElement eaElement = (EANamedElement) o;
				eaElement.eIsProxy();
			}
		}
		return result;
	}
	
	/**
	 * <div class='userdoc'>
	 * Iterate over all containments of the given object and, if it exists, call the getter of the attribute named 'guid'.
	 * </div>
	 * @param eObject
	 */
	public static void loadGuids(EObject eObject, Map<EObject, EReference> refs) {
		try {
			EClass eClass = eObject.eClass();
			// cache guid for id lookup
			for (EAttribute attr : eClass.getEAllAttributes()) {
				if (attr.getName().equals("guid")) {
					eObject.eGet(attr);
					break;
				}
			}
			// cache references for cross-reference map
			for (EReference ref : eClass.getEAllReferences()) {
				if (!ref.isContainment() && !ref.isContainer() && !ref.getName().equals("repository"))
					refs.put(eObject, ref);
			}
			// do this recursively
			for (EReference ref : eObject.eClass().getEAllContainments()) {
				Object obj = eObject.eGet(ref);
				if (obj instanceof EList) {
					@SuppressWarnings("unchecked") EList<EObject> list = (EList<EObject>)obj;
					for (EObject o : list) {
						loadGuids(o, refs);
					}
				} else if (obj instanceof EObject) {
					loadGuids((EObject)obj, refs);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * <div class='userdoc'>
	 * Resolves an element identified by the given path within the given container.<br>
	 * The algorithm aborts, if more than one element with a name of the path fragment is found.<br>
	 * Examples:
	 * <ul><li>path = "Views.Logical_View.Analyse"
	 * <li>path = "Views.Logical_View.Design.Adressbuch.K_Person.Telefon_Geschäftlich"</li>
	 * </ul>
	 * </div>
	 * @param path
	 * @param eaContainer
	 * @return the element, if it was found. null otherwise
	 */
	public static EObject resolveElement(String path, EList<?> eaContainer) {
		String[] pathElements = path.split("\\.", 2); // escape dot for regular expression
		
		// look for a child named pathElement
		for (Object o : eaContainer) {
			if (o instanceof EANamedElement) {
				EANamedElement eaElement = (EANamedElement) o;
				if (pathElements[0].equals(eaElement.getName())) {
					eaElement.getGuid(); // resolve guid
					// did we reach the end or do we have to go on recursively?
					if (pathElements.length > 1) {
						// check all containments
						for (EReference ref : eaElement.eClass().getEAllContainments()) {
							Object obj = eaElement.eGet(ref);
							if (obj instanceof EList) {
								@SuppressWarnings("unchecked") 
								EList<EANamedElement> list = (EList<EANamedElement>)obj;
								EObject result = resolveElement(pathElements[1], list); 
								if (result != null)
									return result;
							} else if (obj instanceof EANamedElement) {
								if (((EANamedElement)obj).getName().equals(pathElements[1])) {
									((EANamedElement)obj).getGuid(); // resolve guid
									return (EObject)obj;
								} else return null;
							}
						}
						return null;
					} else return eaElement;
				}
			}
		}
		return null;
	}
	
	/**
	 * <div class='userdoc'>
	 * Perform a breadth first search to find the package with the given guid.<br>
	 * If it does not exist, null is returned.
	 * </div>
	 * @param guid
	 * @param repository
	 * @return
	 */
	public static EAPackage resolvePackage(String guid, EARepository repository) {
		// create queue and initilize it with all root packages
		Queue<EAPackage> queue = new LinkedList<EAPackage>();
		queue.addAll(repository.getModels());
		
		// now, lets walk through the queue
		while (!queue.isEmpty()) {
			EAPackage pack = queue.poll();
			if (pack.getGuid().equals(guid))
				return pack;
			Collection<EAPackage> packages = pack.getPackages();
			queue.addAll(packages);
		}
		
		return null;
	}
	
	
	/**
	 * <div class='userdoc'>
	 * Create a non-deep copy of an element.<br>
	 * Non-deep means that _only_ attributes are copied!
	 * For a copy including references and containments use {@link EcoreUtil}.copy.<br>
	 * </div> 
	 * @param element
	 * @return a copy.
	 */
	public static EANamedElement copyElement(EANamedElement element) {
		EClass eClass = element.eClass();
		// create a new instance
		EANamedElement copyElement = (EANamedElement)EamodelFactory.eINSTANCE.create(eClass);
		copyElement.setName("copyElement");
		// transfer all attributes
		for (EAttribute eAttribute : eClass.getEAllAttributes()) {
			if (!eAttribute.isVolatile() && !eAttribute.getName().equals("eaLink") && eAttribute.isChangeable()) {
				Object value = element.eGet(eAttribute);
				copyElement.eSet(eAttribute, value);
			}
		}
		return copyElement;
	}
	
	
	/**
	 * <div class='userdoc'>
	 * Check if a specific attribute of a given element has a specific value.<br>
	 * Do a recursive search, if <code>recursive = true</code>; e.g. <code>containsAttribute</code> will be called on element.eContainer, if it is an EANamedElement.
	 * </div>
	 * @param element	The element which contains the attribute.
	 * @param attributeName	The name of the attribute which is checked.
	 * @param attributeValue	The value the attribute value is compared with. 
	 * @param recursive	If set, the parent elements will be checked as well.
	 * @return	true, if the attribute has the given value, false if the attribute cannot be found or if the value differs.
	 */
	public static boolean containsAttribute(EANamedElement element, String attributeName, Object attributeValue, boolean recursive) {
		if (element == null) 
			return false;
		for (EAttribute att : element.eClass().getEAllAttributes()) {
			if (att.getName().equals(attributeName)) {
				
				// same values?
				if (attributeValue == null) {
					if (element.eGet(att) == null)
						return true;
				} else if (attributeValue.equals(element.eGet(att))) {
					return true;
				}
				
				// resursive search?
				if (recursive && element.eContainer() != null && element.eContainer() instanceof EANamedElement)
					return containsAttribute((EANamedElement)element.eContainer(), attributeName, attributeValue, recursive);
				break;
			}
		}
		return false;
	}
	
	/**
	 * <div class='userdoc'>
	 * Returns the full path within the model.<br>
	 * Examples:
	 * <ul><li>an attribute of a class in the package p1: Models.Logical_View.p1.Anyclass.Anyattribute
	 * <li>a subpackage: Models.Logical_View.p1.Subpackage.Subsubpackage
	 * </ul>
	 * </div>
	 * @param eaElement
	 * @return
	 */
	public static String getFullName(EANamedElement eaElement) {
		if (eaElement.eContainer() != null && eaElement.eContainer() instanceof EANamedElement) {
			EANamedElement container = (EANamedElement) eaElement.eContainer();
			return getFullName(container) + "." + eaElement.getName();
		} else return eaElement.getName();
	}
	
	/**
	 * <div class='userdoc'>
	 * Try to find the file specified in <code>aPath</code>.<br>
	 * Supported are absolute path, relative path and java url.<br>
	 * Note that if this method is called from eclipse, the relative path begins in the eclipse root directory.<br>
	 * Examples:
	 * <ul><li><code>c:\project\model.ext</code></li>
	 * <li><code>..\project\model.ext</code></li>
	 * <li><code>file:/c:/project/model.ext</code></li>
	 * <li><code>platform:/resource/project/model.ext</code></li>
	 * </ul>
	 * </div>
	 * @param aPath
	 * @return If the file is found, a {@link URI} pointing to that file is returned, otherwise <code>null</code> is returned. 
	 */
	public static URI getFileURI(String aPath) {
		if (aPath != null && aPath.length() > 0) {
			// is it a file?
			try {
				URI aUri = URI.createFileURI(aPath);
				if (getFileFromURI(aUri) != null)
					return aUri;
			} catch (Exception e) { }
			// perhaps it already is a URI?
			try {
				URI aUri = URI.createURI(aPath);
				if (aUri.toFileString() != null && new File(aUri.toFileString()).exists()) {
					return aUri;
				} else {
					// check if file exists - convert it to a file-url
					URL url = new URL(aUri.toString());
					if (new File(FileLocator.toFileURL(url).getFile()).exists())
						return aUri;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	/**
	 * <div class='userdoc'>
	 * Returns a path of the given uri with the format of the <code>java.io.File</code>.
	 * @return The absolut path, if it exists. <code>null</code> otherwise.
	 * </div>
	 */
	public static String getFileFromURI(URI uri) {
		if (uri == null) return null;

		// perhaps it already is a file-formatted uri?
		if (uri.toFileString() != null) {
			if (new File(uri.toFileString()).exists())
				return uri.toFileString();
		}
		
		// lets try to format it to a file uri
		try {
			URL url = new URL(uri.toString());
			File file = new File(FileLocator.toFileURL(url).getFile()); 
			if (file.exists())
				return file.getAbsolutePath();
		} catch (Exception e) {}
		return null;
	}

	/**
	 * Transitively find the parent of type <code>container</code> of <code>element</code>. If <code>element</code> is
	 * already of type <code>container</code>, the element will be returned.
	 * 
	 * @param element
	 *            An arbitrary {@link EObject}.
	 * @param container
	 *            The parent type we are looking for.
	 * @return The parent of <code>element</code> of type <code>container</code> or <code>null</code>, if none is found.
	 */
	public static <T extends EObject> T getContainerOfType(EObject element, EClass container) {
		if (element == null || container == null)
			return null;
		if (container.isInstance(element)) {
			@SuppressWarnings("unchecked")
			T t = (T) element;
			return t;
		}
		return getContainerOfType(element.eContainer(), container);
	}
	
	/**
	 * <div class='userdoc'>
	 * Only for testing purposes of the methods of this class.
	 * </div>
	 */
	public static void main(String[] args) {
		
		String[]files = new String[] {
				"file:/c:/boot.ini",
				"c:\\boot.ini",
				"c:/boot.ini",
				"platform:/plugin/org.eclipse.emf.codegen.ecore/about.html"
		};
		for (String file : files) {
			System.out.println(file + "  -->  " + getFileURI(file));
		}
	}

	/**
	 * For internal use only!
	 * 
	 * Some dummy logger to keep generated code intact!
	 * 
	 * Reason: original code had some proprietary logger.
	 */
	public static class Logger {
		public void error(String s) {
			System.out.println("ERROR: " + s);
		}

		public void error(String string, Exception e) { 
			System.out.println("ERROR: " + string);
		}

		public void warn(String string) { 
			System.out.println("WARNING: " + string);
		}
	}
	
	/**
	 * For internal use only.
	 */
	public static Logger getLogger(Class<?> class1) {
		return new Logger();
	}

	/**
	 * Get element of the specified type and the given identifier.
	 * This is a type-specific identifier!
	 * If you want to retrieve an element based on its globally unique identifier (guid), use
	 * {@link EAUtil#findElementWithGuid(EARepository, String, boolean)}.
	 * 
	 * @param p
	 * @param id
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T findElementWithId(EABaseClass p, int id, Class<T> clazz) {
		if (clazz.isInstance(p) && p.getId() == id)
			return (T)p;
		for (EReference ref : p.eClass().getEAllContainments()) {
			final Object obj = p.eGet(ref);
			if (obj instanceof EList) {
				EList<EObject> list = (EList<EObject>)obj;
				for (EObject o : list) {
					if (o instanceof EABaseClass) {
						final T e = findElementWithId((EABaseClass) o, id, clazz);
						if (e != null)
							return e;
					}
				}
			} else if (obj instanceof EABaseClass) {
				final T e = findElementWithId((EABaseClass) obj, id, clazz);
				if (e != null)
					return e;
			}
		}
		return null;
	}
	
	/**
	 * Find the element with the given GUID in the specified resource.
	 * If the element is already indexed, it is returned immediately.
	 * If the element cannot be found and <code>intensiveLoad</code> is set,
	 * all contents of the resource is loaded. Else, <code>null</code> is returned.
	 * 
	 * @param resource
	 * @param guid
	 * @param intensiveLoad
	 * @return 
	 */
	public static EABaseClass findElementWithGuid(EARepository repository, String guid, boolean intensiveLoad) {
		final Resource resource = repository.eResource();
		final EObject obj = resource.getEObject(guid);
		if (obj instanceof EABaseClass)
			return (EABaseClass) obj;
		if (obj == null && intensiveLoad) {
			final HashMap<EObject, EReference> refs = new HashMap<EObject, EReference>();
			for (EAPackage p : repository.getModels()) {
				loadGuids(p, refs);
				final EObject o = resource.getEObject(guid);
				if (o instanceof EABaseClass)
					return (EABaseClass) o;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static <T> List<T> filterElements(EABaseClass element, IElementFilter filter) {
		final List<T> result = new ArrayList<T>();
		for (TreeIterator<EObject> iter = element.eAllContents(); iter.hasNext(); ) {
			final EObject obj = iter.next();
			if (obj instanceof EABaseClass) {
				if (filter.accept((EABaseClass) obj))
					result.add((T) obj);
			}
		}
		return result;
	}
	
	public static interface IElementFilter {
		boolean accept(EABaseClass obj);
	}
}
