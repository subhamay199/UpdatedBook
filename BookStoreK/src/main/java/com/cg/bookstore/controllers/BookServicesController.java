package com.cg.bookstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.exceptions.CustomerNotFoundException;
import com.cg.bookstore.services.BookServices;


@Controller
public class BookServicesController {
	@Autowired
	BookServices customerServices;
@RequestMapping(value={"/sayHello"},method=RequestMethod.GET)
public ResponseEntity<String> sayHello(){
	return new ResponseEntity<String>("Hello",HttpStatus.OK);
}
@RequestMapping(value={"/getCustomer/{emailAddress}"},method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,
headers="Accept=application/json")
public ResponseEntity<Customer> getCustomerDetailsPathParam(@PathVariable(value="emailAddress")String emailAddress) throws CustomerNotFoundException{
	Customer customer=customerServices.getCustomer(emailAddress);
	return new ResponseEntity<Customer>(customer,HttpStatus.OK);
}
//@RequestMapping(value={"/deleteCustomer/{emailAddress}"},method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE,
//headers="Accept=application/json")
//public ResponseEntity<Customer> deleteCustomerDetailsPathParam(@PathVariable(value="emailAddress")String emailAddress) throws CustomerNotFoundException{
//	Customer customer=customerServices.deleteCustomer(emailAddress);
//	return new ResponseEntity<Customer>(customer,HttpStatus.OK);
//}
@RequestMapping(value={"/getAllCustomer"},method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,
headers="Accept=application/json")
public ResponseEntity<List<Customer>> getCustomerDetailsPathParam() {
		return new ResponseEntity<List<Customer>>(customerServices.getAllCustomer(),HttpStatus.OK);
}
@RequestMapping(value={"/registerCustomer"},method=RequestMethod.POST,consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public ResponseEntity<String> acceptCustomerDetails(@ModelAttribute Customer customer) throws CustomerNotFoundException{
	customer=customerServices.registerCustomer(customer);
	return new ResponseEntity<>("customer details successfully added EmailAddress"+customer.getEmailAddress(),HttpStatus.OK);
}
//@RequestMapping(value={"/deleteCustomer"},method=RequestMethod.DELETE)//,produces=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//public ResponseEntity<String> removeCustomerDetails(@RequestParam String emailAddress) throws CustomerNotFoundException{
//	customerServices.deleteCustomer(emailAddress);
//	return new ResponseEntity<>("customer details successfully deleted EmailAddress",HttpStatus.OK);
//}
@RequestMapping(value={"/UpdateCustomer"},method=RequestMethod.PUT,produces=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public ResponseEntity<String> updateCustomerDetails(@RequestParam String emailAddress,String password) throws CustomerNotFoundException{
	Customer customer=customerServices.editCustomerDetails(emailAddress, password);
	return new ResponseEntity<>("customer details successfully added EmailAddress"+customer.getEmailAddress(),HttpStatus.OK);
}
@GetMapping("/getCustomerDetails")
public Customer getCustomerDetails(@RequestParam String emailAddress) throws CustomerNotFoundException{
	System.out.println(customerServices.getCustomer(emailAddress));
    return customerServices.getCustomer(emailAddress);
}

@DeleteMapping("/deleteCustomerDetails")
public ResponseEntity<String> removeCustomerDetails(@RequestParam String emailAddress) throws CustomerNotFoundException{
	customerServices.deleteCustomerDetails(emailAddress);
	return new ResponseEntity<>("Customer details successfully removed ",HttpStatus.OK);
}
}
