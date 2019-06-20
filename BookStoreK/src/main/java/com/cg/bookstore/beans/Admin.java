package com.cg.bookstore.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	private int adminId;

	private String adminName;
	private String email;

	private String password;

	public Admin() {}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", email=" + email + ", password=" + password
				+ "]";
	}
	

}
