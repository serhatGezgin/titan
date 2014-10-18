/**
 */
package org.yazgel.oop.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case OopPackage.OFEATURE: return createOFeature();
			case OopPackage.OREFERENCE: return createOReference();
			case OopPackage.ODATA_TYPE: return createODataType();
			case OopPackage.OMETHOD: return createOMethod();
			case OopPackage.OCONSTRUCTOR: return createOConstructor();
			case OopPackage.OPARAMETER: return createOParameter();
			case OopPackage.OLOOP: return createOLoop();
			case OopPackage.OFOR: return createOFor();
			case OopPackage.OSTATEMENT: return createOStatement();
			case OopPackage.ORETURN_STATEMENT: return createOReturnStatement();
			case OopPackage.OVARRIABLE_CREATE_STATEMENT: return createOVarriableCreateStatement();
			case OopPackage.OMETHOD_CALL_STATEMENT: return createOMethodCallStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OopPackage.ODATA_TYPES:
				return createODataTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OopPackage.ODATA_TYPES:
				return convertODataTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public OFeature createOFeature() {
		OFeatureImpl oFeature = new OFeatureImpl();
		return oFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OReference createOReference() {
		OReferenceImpl oReference = new OReferenceImpl();
		return oReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODataType createODataType() {
		ODataTypeImpl oDataType = new ODataTypeImpl();
		return oDataType;
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
	public OConstructor createOConstructor() {
		OConstructorImpl oConstructor = new OConstructorImpl();
		return oConstructor;
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
	public OLoop createOLoop() {
		OLoopImpl oLoop = new OLoopImpl();
		return oLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OFor createOFor() {
		OForImpl oFor = new OForImpl();
		return oFor;
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
	public OReturnStatement createOReturnStatement() {
		OReturnStatementImpl oReturnStatement = new OReturnStatementImpl();
		return oReturnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVarriableCreateStatement createOVarriableCreateStatement() {
		OVarriableCreateStatementImpl oVarriableCreateStatement = new OVarriableCreateStatementImpl();
		return oVarriableCreateStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMethodCallStatement createOMethodCallStatement() {
		OMethodCallStatementImpl oMethodCallStatement = new OMethodCallStatementImpl();
		return oMethodCallStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODataTypes createODataTypesFromString(EDataType eDataType, String initialValue) {
		ODataTypes result = ODataTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertODataTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
