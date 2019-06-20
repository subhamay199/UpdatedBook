package com.cg.bookstore.services;

import java.util.List;

import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.exceptions.CustomerNotFoundException;

public interface BookServices {
	Customer registerCustomer(Customer customer);
	Customer getCustomer(String emailAddress) throws CustomerNotFoundException;
	List<Customer> getAllCustomer();
	Customer deleteCustomer(String emailAddress) throws CustomerNotFoundException;
	Customer editCustomerDetails(String emailAddress,String password) throws CustomerNotFoundException;
	boolean deleteCustomerDetails(String emailAddress);
}
