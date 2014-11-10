package org.wahlzeit.location;

/**
 * @author Dmitry Gorelenkov
 */
public final class Location3d extends AbstractLocation {
	final int x;
	final int y;
	final int z;
	
	/**
	 * Location by x, y , z coordinates
	 * @param x
	 * @param y
	 * @param z
	 * @methodtype constructor
	 */
	public Location3d(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * @see org.wahlzeit.location.Location#asString()
	 */
	@Override
	public String asString() {
		return "[x: " + x + ", y: " + y + ", z: " + z + "]";
	}
	
	/**
	 * @see org.wahlzeit.location.Location#isEqual()
	 */
	@Override
	public boolean isEqual(Location loc) {
		if (this == loc)
			return true;
		if (loc == null)
			return false;
		if (getClass() != loc.getClass())
			return false;
		Location3d other = (Location3d) loc;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		if (z != other.z)
			return false;
		return true;
	}
	
	/**
	 * @methodtype get
	 * @return x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @methodtype get
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * @methodtype get
	 * @return z
	 */
	public int getZ() {
		return z;
	}

}
