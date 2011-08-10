/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.eaadapter.model.datatypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Filter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.eaadapter.model.datatypes.DatatypesPackage#getFilterType()
 * @model
 * @generated
 */
public enum FilterType implements Enumerator {
	/**
	 * The '<em><b>Equals String Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_STRING_LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS_STRING_LITERAL(0, "EqualsStringLiteral", "EqualsStringLiteral"),

	/**
	 * The '<em><b>Contains String Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_STRING_LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS_STRING_LITERAL(1, "ContainsStringLiteral", "ContainsStringLiteral"),

	/**
	 * The '<em><b>Regex Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEX_LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	REGEX_LITERAL(2, "RegexLiteral", "RegexLiteral");

	/**
	 * The '<em><b>Equals String Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equals String Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUALS_STRING_LITERAL
	 * @model name="EqualsStringLiteral"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_STRING_LITERAL_VALUE = 0;

	/**
	 * The '<em><b>Contains String Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contains String Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_STRING_LITERAL
	 * @model name="ContainsStringLiteral"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_STRING_LITERAL_VALUE = 1;

	/**
	 * The '<em><b>Regex Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regex Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGEX_LITERAL
	 * @model name="RegexLiteral"
	 * @generated
	 * @ordered
	 */
	public static final int REGEX_LITERAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Filter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FilterType[] VALUES_ARRAY =
		new FilterType[] {
			EQUALS_STRING_LITERAL,
			CONTAINS_STRING_LITERAL,
			REGEX_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Filter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FilterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Filter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FilterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FilterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FilterType get(int value) {
		switch (value) {
			case EQUALS_STRING_LITERAL_VALUE: return EQUALS_STRING_LITERAL;
			case CONTAINS_STRING_LITERAL_VALUE: return CONTAINS_STRING_LITERAL;
			case REGEX_LITERAL_VALUE: return REGEX_LITERAL;
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
	private FilterType(int value, String name, String literal) {
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
	
} //FilterType
