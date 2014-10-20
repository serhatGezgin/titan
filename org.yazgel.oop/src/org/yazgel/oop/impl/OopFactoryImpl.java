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
			case OopPackage.OCLASS_IMPORT: return createOClassImport();
			case OopPackage.OCLASS_IMPLEMENT: return createOClassImplement();
			case OopPackage.OREFERENCE_MULTI: return createOReferenceMulti();
			case OopPackage.OREFERENCE_SINGLE: return createOReferenceSingle();
			case OopPackage.ODATA_TYPE_SINGLE: return createODataTypeSingle();
			case OopPackage.ODATA_TYPE_MULTI: return createODataTypeMulti();
			case OopPackage.OMETHOD: return createOMethod();
			case OopPackage.OCONSTRUCTOR: return createOConstructor();
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OopPackage.ODATA_TYPES:
				return createODataTypesFromString(eDataType, initialValue);
			case OopPackage.MULTI_OFEATURE_TYPES:
				return createMultiOFeatureTypesFromString(eDataType, initialValue);
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
			case OopPackage.MULTI_OFEATURE_TYPES:
				return convertMultiOFeatureTypesToString(eDataType, instanceValue);
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
	public OClassImport createOClassImport() {
		OClassImportImpl oClassImport = new OClassImportImpl();
		return oClassImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OClassImplement createOClassImplement() {
		OClassImplementImpl oClassImplement = new OClassImplementImpl();
		return oClassImplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OReferenceMulti createOReferenceMulti() {
		OReferenceMultiImpl oReferenceMulti = new OReferenceMultiImpl();
		return oReferenceMulti;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OReferenceSingle createOReferenceSingle() {
		OReferenceSingleImpl oReferenceSingle = new OReferenceSingleImpl();
		return oReferenceSingle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODataTypeSingle createODataTypeSingle() {
		ODataTypeSingleImpl oDataTypeSingle = new ODataTypeSingleImpl();
		return oDataTypeSingle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODataTypeMulti createODataTypeMulti() {
		ODataTypeMultiImpl oDataTypeMulti = new ODataTypeMultiImpl();
		return oDataTypeMulti;
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
	public OStatement createOStatement() {
		OStatementImpl oStatement = new OStatementImpl();
		return oStatement;
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
	public MultiOFeatureTypes createMultiOFeatureTypesFromString(EDataType eDataType, String initialValue) {
		MultiOFeatureTypes result = MultiOFeatureTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiOFeatureTypesToString(EDataType eDataType, Object instanceValue) {
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
