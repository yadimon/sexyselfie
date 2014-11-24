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
	 * @methodtype conversion
	 */
	public static SexyselfieKind getFromInt(int myValue) throws IllegalArgumentException {
		assertIsValidGenderAsInt(myValue);
		return allValues[myValue];
	}

	/**
	 * 
	 */
	protected static void assertIsValidGenderAsInt(int myValue) throws IllegalArgumentException {
		if ((myValue < 0) || (myValue > 4)) {
			throw new IllegalArgumentException("invalid SexyselfieKind int: " + myValue);
		}
	}
	
	/**
	 * 
	 */
	private static final String[] valueNames = {
		"undefined", "male", "female", "other"
	};
	
	/**
	 * @methodtype conversion
	 */
	public static SexyselfieKind getFromString(String myKind) throws IllegalArgumentException {
		for (SexyselfieKind photoKind : SexyselfieKind.values()) {
			if (valueNames[photoKind.asInt()].equals(myKind)) {
				return photoKind;
			}
		}
		
		throw new IllegalArgumentException("invalid Gender string: " + myKind);
	}
	
	/**
	 * 
	 */
	private int value;
	
	/**
	 * 
	 */
	private SexyselfieKind(int myValue) {
		value = myValue;
	}
			
	/**
	 * 
	 */
	public int asInt() {
		return value;
	}
	
	/**
	 * 
	 */
	public String asString() {
		return valueNames[value];
	}
	
	/**
	 * 
	 */
	public SexyselfieKind[] getAllValues() {
		return allValues;
	}
	
	/**
	 * 
	 */
	public String getTypeName() {
		return "Kind";
	}
		
	/**
	 * 
	 */
	public boolean isUndefined() {
		return (this == UNDEFINED);
	}
	
	/**
	 * 
	 */
	public boolean isFaceOnly() {
		return (this == FACEONLY);
	}
	
	/**
	 * 
	 */
	public boolean isBodyPart() {
		return (this == BODYPART);
	}
	
	/**
	 * 
	 */
	public boolean isWholeBody() {
		return (this == WHOLEBODY);
	}
	
	/**
	 * 
	 */
	public boolean isOther() {
		return (this == OTHER);
	}
	
}
