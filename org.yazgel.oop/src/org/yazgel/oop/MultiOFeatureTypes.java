/**
 */
package org.yazgel.oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multi OFeature Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.yazgel.oop.OopPackage#getMultiOFeatureTypes()
 * @model
 * @generated
 */
public enum MultiOFeatureTypes implements Enumerator {
	/**
	 * The '<em><b>Array List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY_LIST(0, "ArrayList", "ArrayList"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(1, "List", "List"),

	/**
	 * The '<em><b>Tree Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREE_SET_VALUE
	 * @generated
	 * @ordered
	 */
	TREE_SET(2, "TreeSet", "TreeSet"),

	/**
	 * The '<em><b>Array</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY(3, "Array", "Array"),

	/**
	 * The '<em><b>Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(4, "Set", "Set");

	/**
	 * The '<em><b>Array List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Array List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARRAY_LIST
	 * @model name="ArrayList"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_LIST_VALUE = 0;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model name="List"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 1;

	/**
	 * The '<em><b>Tree Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tree Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREE_SET
	 * @model name="TreeSet"
	 * @generated
	 * @ordered
	 */
	public static final int TREE_SET_VALUE = 2;

	/**
	 * The '<em><b>Array</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Array</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARRAY
	 * @model name="Array"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_VALUE = 3;

	/**
	 * The '<em><b>Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model name="Set"
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 4;

	/**
	 * An array of all the '<em><b>Multi OFeature Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultiOFeatureTypes[] VALUES_ARRAY =
		new MultiOFeatureTypes[] {
			ARRAY_LIST,
			LIST,
			TREE_SET,
			ARRAY,
			SET,
		};

	/**
	 * A public read-only list of all the '<em><b>Multi OFeature Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MultiOFeatureTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multi OFeature Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultiOFeatureTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultiOFeatureTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multi OFeature Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultiOFeatureTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultiOFeatureTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multi OFeature Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultiOFeatureTypes get(int value) {
		switch (value) {
			case ARRAY_LIST_VALUE: return ARRAY_LIST;
			case LIST_VALUE: return LIST;
			case TREE_SET_VALUE: return TREE_SET;
			case ARRAY_VALUE: return ARRAY;
			case SET_VALUE: return SET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultiOFeatureTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MultiOFeatureTypes
