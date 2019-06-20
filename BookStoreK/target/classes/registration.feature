Feature: Registration Feature
  this feature helps Customer to register

  Scenario: Customer is trying to register using invalid set of details
    Given Customer is accessing Registration Page on Browser
    
    When Customer is trying to submit data withoud entering 'emailAddress'
    Then 'emailAddress should not be empty ' alert message should display
    
    When Customer is trying to submit request without entering 'Password'
    Then 'Password should not be empty / length be between 7 to 12' alert message should display
		
		
		When Customer is trying to submit request without entering 'address'
		Then 'User address must have alphanumeric characters only' alert message should display
		
		When Customer is trying to submit request without selecting valid 'country'
		Then 'Select your country from the list' alert message should display
		
		When Customer is trying to submit request without selecting valid 'zipCode'
		Then 'Zip code must have numeric characters only' alert message should display
		
		When Customer is trying to submit request without selecting valid 'fullName'
		Then 'You have entered an invalid email address' alert message should display
		
		When Customer is trying to submit request without selecting valid 'city'
		Then 'Please select city' alert message should display
		
		When Customer is trying to submit request without selecting valid 'confirmPassword'
		Then 'Password should not be empty / length be between 7 to 12' alert message should display
		
  Scenario: Customer is trying to register using valid set of details
  	Given Customer is accessing Registration Page on Browser
  	When Customer is trying to submit request after entering valid set of information
  	Then 'Your registration with bookstore has successfully done plz check your registered email address to activate your account'