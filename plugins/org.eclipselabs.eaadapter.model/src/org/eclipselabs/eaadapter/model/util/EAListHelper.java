/**
 * 
 */
package org.eclipselabs.eaadapter.model.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipselabs.eaadapter.model.EAConnector;
import org.eclipselabs.eaadapter.model.EARepository;
import org.eclipselabs.eaadapter.model.abstracthierachy.EABaseClass;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAMovableElement;
import org.eclipselabs.eaadapter.model.abstracthierachy.EAVersiondElement;
import org.sparx.Collection;


/**
 * @author paphko
 *
 */
public class EAListHelper {
	
	static void didAdd(int index, Object newObject, Collection<?> collection, InternalEObject owner) {

		// check type
		if (newObject instanceof EABaseClass) {
			EABaseClass eaObject = (EABaseClass) newObject;
		
			/* 
			 * if the container of newObject is set, then we have detected a movement!
			 * moving object are only allowed for connectors, elements and packages (EAMovableElement).
			 * container objects are only of type EAVersiondElement.
			 * in this case we have to suppress the deletion in the old collection.
			 */
			EObject container = eaObject.eContainer();
			if (eaObject instanceof EAMovableElement && container != null && container instanceof EAVersiondElement && !container.equals(owner)) {
				// hmm.. we have to find the list which contains our object...
				for (EReference ref : container.eClass().getEAllContainments()) {
					Object o = container.eGet(ref); 
					// assume that our element is in an EList!
					if (o != null && o instanceof EList && ((EList<?>)o).contains(eaObject)) {
						@SuppressWarnings("unchecked")
						EList<? extends EABaseClass> otherList = (EList<? extends EABaseClass>)o;
						
						// now lets remove it from this list
						if (otherList instanceof ISilentEAList) {
							ISilentEAList silentList = (ISilentEAList) otherList;
							silentList.setSilentOperation(true);
							otherList.remove(eaObject);
							silentList.setSilentOperation(false);
							
							// and now lets update the parent of the ea object
							((EAMovableElement)eaObject).setNewParent((EAVersiondElement)owner);
						}
						break;
					}
				}
			} else {
				// no movement, this is a normal add of an element
				
				EARepository repository = owner instanceof EARepository ? (EARepository)owner : ((EABaseClass)owner).getRepository();
				
				// check if we need to create a new ea object
				if (repository == null || !repository.getReadonlyEaLink()) {
					// if ealink does not exist, create a new one
					if (!eaObject.initializeAdapter(collection)) {
					}
					
					/*
					 * special case for connectors: 
					 * if a new connector is created, both the collection addition must be performed and the supplier must be set!
					 * calling setNewParent does the job
					 */ 
					if (eaObject instanceof EAConnector) {
						((EAMovableElement)eaObject).setNewParent((EAVersiondElement)owner);
					}
				}
				
				// set repository object
				if (eaObject.getRepository() == null) {
					if (repository != null) {
						eaObject.setRepository(repository);
					}
				}
			}
		}
	}


	static void didChange(Collection<?> collection) {
		// ignore...
	}
	
	
	static void didClear(int size, Object[] oldObjects, Collection<?> collection) {
	}

	
	static void didMove(int index, Object movedObject, int oldIndex, Collection<?> collection) {
	}

	
	static void didRemove(int index, Object oldObject, Collection<?> collection) {

		// cast oldObject to emf object
		if (oldObject instanceof EABaseClass) {
			EABaseClass eaObject = (EABaseClass) oldObject;
			if (eaObject.getRepository() != null && !eaObject.getRepository().getReadonlyEaLink()) {
				if (eaObject.deleteAdapter(collection))
					collection.Refresh();
			}
		}
	}

	
	static void didSet(int index, Object newObject, Object oldObject, Collection<?> collection) {
	}

}
