/**
 */
package org.yazgel.oop.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.yazgel.oop.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OopFactoryImpl extends EFactoryImpl implements OopFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OopFactory init() {
		try {
			OopFactory theOopFactory = (OopFactory)EPackage.Registry.INSTANCE.getEFactory(OopPackage.eNS_URI);
			if (theOopFactory != null) {
				return theOopFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OopFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OopFactoryImpl() {
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
			case OopPackage.OMODEL: return createOModel();
			case OopPackage.OPACKAGE: return createOPackage();
			case OopPackage.OCLASS: return createOClass();
			case OopPackage.MULTI_OREFERENCE: return createMultiOReference();
			case OopPackage.SINGLE_OREFERENCE: return createSingleOReference();
			case OopPackage.SINGLE_ODATA_TYPE: return createSingleODataType();
			case OopPackage.MULTI_ODATA_TYPE: return createMultiODataType();
			case OopPackage.OMETHOD: return createOMethod();
			case OopPackage.OPARAMETER: return createOParameter();
			case OopPackage.OSTATEMENT: return createOStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OModel createOModel() {
		OModelImpl oModel = new OModelImpl();
		return oModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPackage createOPackage() {
		OPackageImpl oPackage = new OPackageImpl();
		return oPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OClass createOClass() {
		OClassImpl oClass = new OClassImpl();
		return oClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiOReference createMultiOReference() {
		MultiOReferenceImpl multiOReference = new MultiOReferenceImpl();
		return multiOReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOReference createSingleOReference() {
		SingleOReferenceImpl singleOReference = new SingleOReferenceImpl();
		return singleOReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleODataType createSingleODataType() {
		SingleODataTypeImpl singleODataType = new SingleODataTypeImpl();
		return singleODataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiODataType createMultiODataType() {
		MultiODataTypeImpl multiODataType = new MultiODataTypeImpl();
		return multiODataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMethod createOMethod() {
		OMethodImpl oMethod = new OMethodImpl();
		return oMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OParameter createOParameter() {
		OParameterImpl oParameter = new OParameterImpl();
		return oParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OStatement createOStatement() {
		OStatementImpl oStatement = new OStatementImpl();
		return oStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OopPackage getOopPackage() {
		return (OopPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OopPackage getPackage() {
		return OopPackage.eINSTANCE;
	}

} //OopFactoryImpl
