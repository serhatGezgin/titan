/**
 */
package org.yazgel.oop.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.yazgel.oop.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.yazgel.oop.OopPackage
 * @generated
 */
public class OopSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OopPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OopSwitch() {
		if (modelPackage == null) {
			modelPackage = OopPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OopPackage.OMODEL: {
				OModel oModel = (OModel)theEObject;
				T result = caseOModel(oModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OPACKAGE: {
				OPackage oPackage = (OPackage)theEObject;
				T result = caseOPackage(oPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OCLASS: {
				OClass oClass = (OClass)theEObject;
				T result = caseOClass(oClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OFEATURE: {
				OFeature oFeature = (OFeature)theEObject;
				T result = caseOFeature(oFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OREFERENCE: {
				OReference oReference = (OReference)theEObject;
				T result = caseOReference(oReference);
				if (result == null) result = caseOFeature(oReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.ODATA_TYPE: {
				ODataType oDataType = (ODataType)theEObject;
				T result = caseODataType(oDataType);
				if (result == null) result = caseOFeature(oDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OMETHOD: {
				OMethod oMethod = (OMethod)theEObject;
				T result = caseOMethod(oMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OCONSTRUCTOR: {
				OConstructor oConstructor = (OConstructor)theEObject;
				T result = caseOConstructor(oConstructor);
				if (result == null) result = caseOMethod(oConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OPARAMETER: {
				OParameter oParameter = (OParameter)theEObject;
				T result = caseOParameter(oParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OLOOP: {
				OLoop oLoop = (OLoop)theEObject;
				T result = caseOLoop(oLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OFOR: {
				OFor oFor = (OFor)theEObject;
				T result = caseOFor(oFor);
				if (result == null) result = caseOLoop(oFor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OSTATEMENT: {
				OStatement oStatement = (OStatement)theEObject;
				T result = caseOStatement(oStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.ORETURN_STATEMENT: {
				OReturnStatement oReturnStatement = (OReturnStatement)theEObject;
				T result = caseOReturnStatement(oReturnStatement);
				if (result == null) result = caseOStatement(oReturnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OVARRIABLE_CREATE_STATEMENT: {
				OVarriableCreateStatement oVarriableCreateStatement = (OVarriableCreateStatement)theEObject;
				T result = caseOVarriableCreateStatement(oVarriableCreateStatement);
				if (result == null) result = caseOStatement(oVarriableCreateStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OopPackage.OMETHOD_CALL_STATEMENT: {
				OMethodCallStatement oMethodCallStatement = (OMethodCallStatement)theEObject;
				T result = caseOMethodCallStatement(oMethodCallStatement);
				if (result == null) result = caseOStatement(oMethodCallStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOModel(OModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPackage(OPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOClass(OClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OFeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OFeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOFeature(OFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOReference(OReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODataType(ODataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMethod(OMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OConstructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OConstructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOConstructor(OConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOParameter(OParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OLoop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OLoop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOLoop(OLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OFor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OFor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOFor(OFor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OStatement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OStatement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOStatement(OStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OReturn Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OReturn Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOReturnStatement(OReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OVarriable Create Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OVarriable Create Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOVarriableCreateStatement(OVarriableCreateStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OMethod Call Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OMethod Call Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMethodCallStatement(OMethodCallStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OopSwitch
