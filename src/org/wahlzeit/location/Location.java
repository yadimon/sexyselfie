package org.wahlzeit.location;
/**
 * Representation of a location in the world
 * @author Dmitry Gorelenkov
 *
 */
public interface Location {
	public String asString();
	public boolean isEqual(Location loc);
}
