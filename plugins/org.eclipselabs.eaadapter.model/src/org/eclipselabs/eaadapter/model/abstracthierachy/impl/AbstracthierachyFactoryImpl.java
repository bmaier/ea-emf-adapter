/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.abstracthierachy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyFactory;
import org.eclipselabs.eaadapter.model.abstracthierachy.AbstracthierachyPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstracthierachyFactoryImpl extends EFactoryImpl implements AbstracthierachyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstracthierachyFactory init() {
		try {
			AbstracthierachyFactory theAbstracthierachyFactory = (AbstracthierachyFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.eclipselabs.eaadapter.model.abstracthierachy"); 
			if (theAbstracthierachyFactory != null) {
				return theAbstracthierachyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstracthierachyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstracthierachyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstracthierachyPackage getAbstracthierachyPackage() {
		return (AbstracthierachyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstracthierachyPackage getPackage() {
		return AbstracthierachyPackage.eINSTANCE;
	}

} //AbstracthierachyFactoryImpl
