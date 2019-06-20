package com.cg.bookstore.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cg.bookstore.pagebean.RegistrationPageBean;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinition {
	private WebDriver driver;
	private  RegistrationPageBean pageBean;
	@Given("^Customer is accessing Registration Page on Browser$")
	public void customer_is_accessing_Registration_Page_on_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Customer is trying to submit data withoud entering 'emailAddress'$")
	public void customer_is_trying_to_submit_data_withoud_entering_emailAddress() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'emailAddress should not be empty ' alert message should display$")
	public void emailaddress_should_not_be_empty_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Customer is trying to submit request without entering 'Password'$")
	public void customer_is_trying_to_submit_request_without_entering_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'Password should not be empty / length be between (\\d+) to (\\d+)' alert message should display$")
	public void password_should_not_be_empty_length_be_between_to_alert_message_should_display(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Customer is trying to submit request without entering 'address'$")
	public void customer_is_trying_to_submit_request_without_entering_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'User address must have alphanumeric characters only' alert message should display$")
	public void user_address_must_have_alphanumeric_characters_only_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Customer is trying to submit request without selecting valid 'country'$")
	public void customer_is_trying_to_submit_request_without_selecting_valid_country() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'Select your country from the list' alert message should display$")
	public void select_your_country_from_the_list_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Customer is trying to submit request without selecting valid 'zipCode'$")
	public void customer_is_trying_to_submit_request_without_selecting_valid_zipCode() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'Zip code must have numeric characters only' alert message should display$")
	public void zip_code_must_have_numeric_characters_only_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Customer is trying to submit request without selecting valid 'fullName'$")
	public void customer_is_trying_to_submit_request_without_selecting_valid_fullName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'You have entered an invalid email address' alert message should display$")
	public void you_have_entered_an_invalid_email_address_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Customer is trying to submit request without selecting valid 'city'$")
	public void customer_is_trying_to_submit_request_without_selecting_valid_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'Please select city' alert message should display$")
	public void please_select_city_alert_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Customer is trying to submit request without selecting valid 'confirmPassword'$")
	public void customer_is_trying_to_submit_request_without_selecting_valid_confirmPassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Customer is trying to submit request after entering valid set of information$")
	public void customer_is_trying_to_submit_request_after_entering_valid_set_of_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^'Your registration with bookstore has successfully done plz check your registered email address to activate your account'$")
	public void your_registration_with_bookstore_has_successfully_done_plz_check_your_registered_email_address_to_activate_your_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
