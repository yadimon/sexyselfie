package org.wahlzeit.model.sexyselfie;

import org.wahlzeit.utils.EnumValue;

public enum SexyselfieKind implements EnumValue {
	/** user never entered anything */
	UNDEFINED(0),
	FACEONLY(1),
	/** only part of body */
	BODYPART(2),
	/** whole body */
	WHOLEBODY(3),
	OTHER(4);
	
	/**
	 * 
	 */
	private static SexyselfieKind[] allValues = {
		UNDEFINED, FACEONLY, BODYPART, WHOLEBODY, OTHER
	};
    /**
     * string representations of photokind for all values
     */
	private static final String[] valueNames = {
		"undefined", "face only", "body part", "whole body", "other"
	};
	/**
	 * holder for the value
	 */
	private int value;

	/**
	 * constructor for each enum value
	 */
	private SexyselfieKind(int myValue) {
		value = myValue;
	}
	
	/**
	 * @methodtype conversion
	 */
	public static SexyselfieKind getFromInt(int myValue) throws IllegalArgumentException {
		assertIsValidKindAsInt(myValue);
		return allValues[myValue];
	}
	
    /**
     * asserts that int representation is valid, must be between 0 and 4
     * @param myValue int representation of photokind
     * @throws IllegalArgumentException
     */
	protected static void assertIsValidKindAsInt(int myValue) throws IllegalArgumentException {
		if ((myValue < 0) || (myValue > 4)) {
			throw new IllegalArgumentException("invalid SexyselfieKind int: " + myValue);
		}
	}
	
    /**
     * get photo kind by name
     * @param myKind string representation
     * @return suitable value object or exception
     * @throws IllegalArgumentException if wrong string passed
     * @methodtype conversion
     */
	public static SexyselfieKind getFromString(String myKind) throws IllegalArgumentException {
		for (SexyselfieKind photoKind : SexyselfieKind.values()) {
			if (valueNames[photoKind.asInt()].equals(myKind)) {
				return photoKind;
			}
		}

		throw new IllegalArgumentException("invalid photo kind string: " + myKind);
	}
			
	/**
	 * int representation
	 */
	public int asInt() {
		return value;
	}
	
	/**
	 * string representation
	 */
	public String asString() {
		return valueNames[value];
	}

    /**
     * @return all values of this enum
     */
	public SexyselfieKind[] getAllValues() {
		return allValues;
	}

    /**
     * @return name of this type of enum
     */
	public String getTypeName() {
		return "Kind";
	}

    /**
     * @return true if current value is <code>UNDEFINED</code>
     */
	public boolean isUndefined() {
		return (this == UNDEFINED);
	}

    /**
     * @return true if current value is <code>FACEONLY</code>
     */
	public boolean isFaceOnly() {
		return (this == FACEONLY);
	}

    /**
     * @return true if current value is <code>BODYPART</code>
     */
	public boolean isBodyPart() {
		return (this == BODYPART);
	}

    /**
     * @return true if current value is <code>WHOLEBODY</code>
     */
	public boolean isWholeBody() {
		return (this == WHOLEBODY);
	}

    /**
     * @return true if current value is <code>OTHER</code>
     */
	public boolean isOther() {
		return (this == OTHER);
	}
	
}
