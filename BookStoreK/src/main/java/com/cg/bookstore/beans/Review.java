package com.cg.bookstore.beans;

import java.awt.print.Book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Review {
	/*
	 * @Id private int index; private int id; private int rating; private String
	 * headline; private String reviewOn;
	 * 
	 * @OneToOne private Books books;
	 * 
	 * @OneToOne private Customer customer; public Review() {} public Review(int
	 * index, int id, int rating, String headline, String reviewOn, Books books,
	 * Customer customer) { super(); this.index = index; this.id = id; this.rating =
	 * rating; this.headline = headline; this.reviewOn = reviewOn; this.books =
	 * books; this.customer = customer; } public int getIndex() { return index; }
	 * public void setIndex(int index) { this.index = index; } public int getId() {
	 * return id; } public void setId(int id) { this.id = id; } public int
	 * getRating() { return rating; } public void setRating(int rating) {
	 * this.rating = rating; } public String getHeadline() { return headline; }
	 * public void setHeadline(String headline) { this.headline = headline; } public
	 * String getReviewOn() { return reviewOn; } public void setReviewOn(String
	 * reviewOn) { this.reviewOn = reviewOn; } public Books getBooks() { return
	 * books; } public void setBooks(Books books) { this.books = books; } public
	 * Customer getCustomer() { return customer; } public void setCustomer(Customer
	 * customer) { this.customer = customer; }
	 * 
	 * @Override public String toString() { return "Review [index=" + index +
	 * ", id=" + id + ", rating=" + rating + ", headline=" + headline +
	 * ", reviewOn=" + reviewOn + ", books=" + books + ", customer=" + customer +
	 * "]"; }
	 */



	@Id
	@GeneratedValue(generator = "cust1", strategy = GenerationType.SEQUENCE)
	//	@SequenceGenerator(name = "cust1", sequenceName = "revi1", initialValue = 1, allocationSize = 1)
	private int reviewId;

	@Min(1)
	@Max(5)
	private int rating;

	private String headLine;

	private String coment;

	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private String reviewDate;

	@OneToOne
	@JoinColumn(name = "customerId")
	private Customer customer;

	@OneToOne
	@JoinColumn(name = "bookId")
	private Books book;

	public Review() {
		super();
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}



}
