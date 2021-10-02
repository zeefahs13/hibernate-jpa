package com.springjpa.main.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Guardian {
	
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianEmail() {
		return guardianEmail;
	}
	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}
	private String guardianName;
	private String guardianEmail;

	
	

}
