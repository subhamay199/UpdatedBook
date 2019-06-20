package com.cg.bookstore.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String emailAddress;
	private String password;
	private String confirmPassword;
	private String fullName;
	private String phoneNumber;
	private String address;
	private String city;
	private String zipCode;
	private String country;
	public Customer() {
	}
	
	public Customer(String emailAddress, String password, String confirmPassword, String fullName, String phoneNumber,
			String address, String city, String zipCode, String country) {
		super();
		this.emailAddress = emailAddress;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}

	public Customer(String password, String confirmPassword, String fullName, String phoneNumber, String address,
			String city, String zipCode, String country) {
		super();
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Customer [emailAddress=" + emailAddress + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", city=" + city + ", zipCode=" + zipCode + ", country=" + country + "]";
	}
	
}
