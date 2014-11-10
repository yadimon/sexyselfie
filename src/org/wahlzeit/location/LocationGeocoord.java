package org.wahlzeit.location;

/**
 * @author Dmitry Gorelenkov
 */
public final class LocationGeocoord extends AbstractLocation {
	final int latitude;
	final int longitude;
	
	/**
	 * Geographic location by latitude and longitude
	 * @param lat
	 * @param lon
	 */
	public LocationGeocoord(int lat, int lon) {
		this.latitude = lat;
		this.longitude = lon;
	}
	
	/**
	 * @see org.wahlzeit.location.Location#asString()
	 */
	@Override
	public String asString() {
		return "lat: " + latitude + ", lon: " + longitude;
	}
	
	/**
	 * @see org.wahlzeit.location.Location#isEqual(Location)
	 */
	@Override
	public boolean isEqual(Location obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocationGeocoord other = (LocationGeocoord) obj;
		if (latitude != other.latitude)
			return false;
		if (longitude != other.longitude)
			return false;
		return true;
	}
	
	/**
	 * @methodtype get
	 * @return latitude
	 */
	public int getLatitude() {
		return latitude;
	}
	
	/**
	 * @methodtype get
	 * @return longitude
	 */
	public int getLongitude() {
		return longitude;
	}

}
