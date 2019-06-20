package com.cg.bookstore.pagebean;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPageBean {
	@FindBy(how=How.NAME,name="phoneNumber")
	private WebElement phoneNumber;
	@FindBy(how=How.NAME,name="password")
	private WebElement password;
	@FindBy(how=How.NAME,name="confirmPassword")
	private WebElement confirmPassword;
	@FindBy(how=How.NAME,name="address")
	private WebElement address;
	@FindBy(how=How.NAME,name="country")
	private WebElement country;
	@FindBy(how=How.NAME,name="zipCode")
	private WebElement zip;
	@FindBy(how=How.NAME,name="email")
	private WebElement email;

	@FindBy(how=How.NAME,name="city")
	private List<WebElement> city;

	@FindBy(how=How.NAME,name="fullName")
	private WebElement fullName;

	@FindBy(how=How.NAME,name="submit")
	private WebElement submitBtn;
}
