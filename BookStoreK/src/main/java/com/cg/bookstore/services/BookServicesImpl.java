package com.cg.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.daoservices.BookDAO;
import com.cg.bookstore.daoservices.CustomerDAO;
import com.cg.bookstore.exceptions.CustomerNotFoundException;
@Component("bookServices")
public class BookServicesImpl implements BookServices {
	@Autowired
	CustomerDAO customerDAO;
	@Autowired
	BookDAO bookDAO;
	@Override
	public Customer registerCustomer(Customer customer) {
		 return customerDAO.save(customer);
	}
	@Override
	public Customer getCustomer(String emailAddress) throws CustomerNotFoundException {
		return customerDAO.findById(emailAddress).orElseThrow(()-> new CustomerNotFoundException("Invalid Email ID"));
	}
	@Override
	public List<Customer> getAllCustomer() {
		return customerDAO.findAll();
	}
	@Override
	public Customer deleteCustomer(String emailAddress) throws CustomerNotFoundException {
		Customer customer=customerDAO.findById(emailAddress).orElseThrow(()-> new CustomerNotFoundException("Invalid Email ID"));
		//customerDAO.deleteById(emailAddress);
		customerDAO.delete(customer);
		return customerDAO.save(customer);
	}
	@Override
	public Customer editCustomerDetails(String emailAddress, String password) throws CustomerNotFoundException {
		Customer customer=customerDAO.findById(emailAddress).orElseThrow(()-> new CustomerNotFoundException("Invalid Email ID"));
		if(!customer.getAddress().isEmpty())
			customer.setAddress(customer.getAddress());
		if(!customer.getCity().isEmpty())
			customer.setCity(customer.getCity());
		if(!(customer.getFullName().isEmpty()))
			customer.setFullName(customer.getFullName());
		if(!customer.getZipCode().isEmpty())
			customer.setZipCode(customer.getZipCode());
		if(!customer.getCountry().isEmpty())
			customer.setCountry(customer.getCountry());
		if(!customer.getPhoneNumber().isEmpty())
			customer.setPhoneNumber(customer.getPhoneNumber());
		if(!customer.getPassword().isEmpty())
			customer.setPassword(customer.getPassword());
		if(!customer.getConfirmPassword().isEmpty())
			customer.setConfirmPassword(customer.getConfirmPassword());
		return customerDAO.save(customer);
	}
	@Override
	public boolean deleteCustomerDetails(String emailAddress) {
		customerDAO.deleteById(emailAddress);
		return false;
	}
}
