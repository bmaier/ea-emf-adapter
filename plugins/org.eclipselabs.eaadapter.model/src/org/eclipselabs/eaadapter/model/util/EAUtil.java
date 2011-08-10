/**
 * 
 */
package org.eclipselabs.eaadapter.model.util;

import java.io.File;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipselabs.eaadapter.model.EAConnector;
import org.eclipselabs.eaadapter.model.EAPackage;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.EamodelFactory;
import org.eclipselabs.eaadapter.model.EamodelPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;
import org.eclipselabs.eaadapter.model.abstracthierachy.EANamedElement;


/**
 * <div class='userdoc'>
 * Helper class for the EA models.
 * </div>
 */
public class EAUtil {


	/**
	 * <div class='userdoc'>
	 * This map contains all attributes, sorted by their parent classes, which need to be transformed if they are mapped from the analysis- to the design-model.
	 * </div> 
	 */
	public static final Map<String, Set<String>> analyseToDesignMappings = new HashMap<String, Set<String>>();
	
	static {
		// set only containing name attribute
		Set<String> nameAttribute = new HashSet<String>();
		nameAttribute.add(AbstracthierachyPackage.Literals.EA_NAMED_ELEMENT__NAME.getName());

		// set containing name and type attributes
		Set<String> typeAttributes = new HashSet<String>();
		typeAttributes.add(AbstracthierachyPackage.Literals.EA_NAMED_ELEMENT__NAME.getName());
		typeAttributes.add(AbstracthierachyPackage.Literals.EA_TYPED_ELEMENT__TYPE.getName());

		// set containing all connector relevant attributes
		Set<String> connectorAttributes = new HashSet<String>();
		connectorAttributes.add(AbstracthierachyPackage.Literals.EA_NAMED_ELEMENT__NAME.getName());
		connectorAttributes.add(EamodelPackage.Literals.EA_CONNECTOR__CLIENT_ROLE.getName());
		connectorAttributes.add(EamodelPackage.Literals.EA_CONNECTOR__SUPPLIER_ROLE.getName());

		// set parameter attributes
		Set<String> parameterAttributes = new HashSet<String>();
		parameterAttributes.add(AbstracthierachyPackage.Literals.EA_NAMED_ELEMENT__NAME.getName());
		parameterAttributes.add(EamodelPackage.Literals.EA_PARAMETER__TYPE.getName());
		
		// add mappings
		analyseToDesignMappings.put(EamodelPackage.Literals.EA_ATTRIBUTE.getName(), typeAttributes);
		analyseToDesignMappings.put(EamodelPackage.Literals.EA_ELEMENT.getName(), typeAttributes);
		analyseToDesignMappings.put(EamodelPackage.Literals.EA_METHOD.getName(), typeAttributes);
		analyseToDesignMappings.put(EamodelPackage.Literals.EA_PARAMETER.getName(), parameterAttributes);
		analyseToDesignMappings.put(EamodelPackage.Literals.EA_CONNECTOR.getName(), connectorAttributes);
		analyseToDesignMappings.put(EamodelPackage.Literals.EA_PACKAGE.getName(), nameAttribute);
	}

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
	 * <li>"Views.Logical_View.Analyse.AWK, Views.Logical_View.Design.de.telekom.awk"</li>
	 * </ul>
	 * </div>
	 * @param structures
	 * @param models
	 * @param recursive
	 */
	@SuppressWarnings({ "rawtypes" })
	public static void loadPackages(String structures, EList models) {
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
	 * Map analysis string to design string, if necessary.
	 * </div>
	 * @param value	value to map.
	 * @param type	the type which contains the attribute.
	 * @param attribute	the attribute which holds the value.
	 * @return	the design value.
	 */
	public static String mapAnalysisStringToDesign(String value, String type, String attribute) {
		Set<String> attributes = analyseToDesignMappings.get(type);
		if (attributes != null && attributes.contains(attribute)) {
			return mapAnalysisStringToDesign(value);
		}
		return value;
	}
	
	/**
	 * <div class='userdoc'>
	 * Convert a name from the analysis model to a safe name for the design model.<br>
	 * The logic is taken from the VB-Scripts EaTools.<br>  
	 * Examples: 
	 * <ul><li>"kunden-id" -&gt; "KundenId"
	 *   <li>"K_Übergröße" -&gt; "Uebergroesse"
	 *   <li>"T_Schlüssel8" -&gt; "Schluessel8"
	 * </ul>
	 * </div>
	 * @param analysisString
	 * @return
	 */
	public static String mapAnalysisStringToDesign(String analysisString) {
		analysisString = analysisString.trim();
		if (analysisString.startsWith("T_") || analysisString.startsWith("K_"))
			analysisString = analysisString.substring(2);
		if (analysisString.endsWith(",null"))
			analysisString = analysisString.substring(0, analysisString.length() - 5);
		
		String designName = "";
		int length = analysisString.length();
		int position = 1; 
		for (int i = 0; i < length; i++) {
			String designChar = String.valueOf(analysisString.charAt(i));
			switch (analysisString.charAt(i)) {
			case 'Ä': designChar = "Ae"; break;
			case 'Ö': designChar = "Oe"; break;
			case 'Ü': designChar = "Ue"; break;
			case 'ä': designChar = "ae"; break;
			case 'ö': designChar = "oe"; break;
			case 'ü': designChar = "ue"; break;
			case 'ß': designChar = "ss"; break;
			case ',': designChar = "_"; break;
			case '_': 
			case '-': 
			case '<': 
			case '>': 
				designChar = "";
				position = 0;
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				position = 1;
				break;
			}
			if (position++ == 1)
				if (designChar.length() > 1)
					designName += designChar.substring(0, 1).toUpperCase() + designChar.substring(1).toLowerCase();
				else designName += designChar.toUpperCase();
			else designName += designChar.toLowerCase();
		}
		return designName;
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
	 * Return an image for the given object.<br> 
	 * If object is a classifier, the image of that classifier is returned.<br>
	 * If it is an unknown type, null is returned.
	 * </div>
	 * @param object
	 * @return
	 */
	public static Object getImageFor(Object object) {
		String className = object instanceof EClassifier ? ((EClassifier)object).getName() : object.getClass().getSimpleName();
		if (className.endsWith("Impl"))
			className = className.substring(0, className.length() - 4);
		className += ".gif";
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(
		         "org.eclipselabs.eaadapter.model",
		         "icons/" + className);
		return imageDescriptor == null ? null : imageDescriptor.createImage();		
	}
	
	/**
	 * <div class='userdoc'>
	 * Build label for a connector instance.<br>
	 * The label contains connector name and roles as well as supplier and client names.
	 * </div>
	 * @param connector
	 * @return
	 */
	public static String getConnectorLabel(EAConnector connector) {
		// initialize some variables
		String label = connector.getName();
		String supplierRole = connector.getSupplier_role();
		String clientRole = connector.getClient_role();
		String client = connector.getClient() == null ? "<null>" : connector.getClient().getName();
		String supplier = connector.getSupplier() == null ? "<null>" : connector.getSupplier().getName();
		
		// some names, if set
		label = label != null && label.length() > 0 ? "(" + label + ") " : "";
		supplier += supplierRole != null && supplierRole.length() > 0 ? "." + supplierRole : "";
		client += clientRole != null && clientRole.length() > 0 ? "." + clientRole : "";
		
		// get client and supplier names and direction
		label += supplier;
		label += connector.getDirection() == null ? "  -?-  " :
			connector.getDirection().equals("Unspecified") ? "  --  " :
				connector.getDirection().equals("Bi-Directional") ? "  <->  " :
					connector.getDirection().equals("Source -> Destination") ? "  ->  " :
						connector.getDirection().equals("Destination -> Source") ? "  <-  " :
							"  -?-  ";
		label += client;
		
		return label;
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
		
		
		String[]tests = new String[]{
				"blub",
				"kunden-id",
				"ächtß",
				"12345-oder_67890",
				"T_KlöDEckel-Über_8DRUCK-idßchenÄr-dOUBLE",
				"T_Zeichen<255>",
				"T_Zeichen<255>,null"
		};
		for (String test : tests) {
			System.out.println(test  + " -> " + mapAnalysisStringToDesign(test));
		}
		
		tests = new String[]{
				"blub",
				"org.eclipselabs.eaadapter.test",
				"bla,blub",
				" blau, bim ",
				"de.bla.ding, gubbel",
				" aha , grunz.blau   ",
				"urks.de,de.ea,aha,de.blub.ea.model"
		};
		for (String test : tests) {
			System.out.println("\n]]] " + test);
			loadPackages(test, null);
		}
	}

	/**
	 * Some dummy object to keep generated code intact!
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
	
	public static Logger getLogger(Class<?> class1) {
		return new Logger();
	}
}
