package com.cg.Customer.aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.Customer.response.CustomerResponse;
import com.cg.bookstore.exceptions.CustomerNotFoundException;

@ControllerAdvice
public class CustomerExceptionAspect {
	@ExceptionHandler(CustomerNotFoundException.class)
public ResponseEntity<CustomerResponse> handleCustomerDetailsNotFoundException(Exception e) {
		CustomerResponse response=new CustomerResponse(e.getMessage(),HttpStatus.EXPECTATION_FAILED.value());
	return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
}
}
