package com.cg.bookstore.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Order {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO) private int index; private
	 * String orderedBy; private int bookCopies; private double totalAmount; private
	 * String recipientName; private String recipientPhone; private String shipTo;
	 * private String orderStatus; private String orderDate;
	 * 
	 * //@OneToMany
	 *///private List<Books> books;

	/*
	 * @OneToMany private List<Books> book;
	 */
	@Id
	@GeneratedValue(generator = "cust1", strategy = GenerationType.SEQUENCE)
	//@SequenceGenerator(name = "cust1", sequenceName = "Ord1", initialValue = 1, allocationSize = 1)
	private int orderId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Customer")
	private Customer customer;

	@OneToMany
	private List<Books> book;


	private String orderedStatus;

	private String streetAddress;

	private String city;

	private String zipCode;

	private String country;

	private String paymentMethod;


	public Order() {}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public List<Books> getBook() {
		return book;
	}


	public void setBook(List<Books> book) {
		this.book = book;
	}


	public String getOrderedStatus() {
		return orderedStatus;
	}


	public void setOrderedStatus(String orderedStatus) {
		this.orderedStatus = orderedStatus;
	}


	public String getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}






}
