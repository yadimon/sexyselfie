/**
 * 
 */
package org.wahlzeit.model.sexyselfie;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.wahlzeit.model.Gender;
import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoId;

/**
 * @author Dmitry Gorelenkov
 *
 */
public class SexyselfiePhoto extends Photo {
	private Gender gender = Gender.UNDEFINED;
	private SexyselfieKind kindOf = SexyselfieKind.UNDEFINED;
	
	
	/**
	 * Creates Sexyselfie as decorator for created photo object
	 * @param photo created photo object
	 */
	public SexyselfiePhoto(Photo photo) {
		super(photo.getId());
	}
	
	public SexyselfiePhoto(){
		super();
	}
	
	public SexyselfiePhoto(PhotoId myId) {
		super(myId);
	}

	public SexyselfiePhoto(ResultSet rset) throws SQLException {
		super(rset);
	}

	public SexyselfieKind getKindOf() {
		return kindOf;
	}

	public void setKindOf(SexyselfieKind kindOf) {
		this.kindOf = kindOf;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
