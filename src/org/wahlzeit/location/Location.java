package org.wahlzeit.location;
/**
 * Representation of a location in the world
 * @author Dmitry Gorelenkov
 *
 */
public interface Location {
	/**
	 * represents the location as string
	 * @methodtype conversion
	 */
	public String asString();
	
	/**
	 * tests if the location is equal to other location
	 * @methodtype boolean-query
	 */
	public boolean isEqual(Location loc);
}
