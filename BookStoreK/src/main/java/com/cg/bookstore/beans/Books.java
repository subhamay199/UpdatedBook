package com.cg.bookstore.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Books {
	/*
	 * @Id private int index; private int isbn; private String title; private String
	 * author; private double price; private String publishDate; private String
	 * bookImage; private String description;
	 * 
	 * @ManyToOne(fetch = FetchType.LAZY) //@JoinColumn(name = "Category") private
	 * Category category; //@OneToMany(mappedBy="account",cascade=CascadeType.ALL)
	 * //private Map<String, Category> categorys = new HashMap<String, Category>();
	 * 
	 * //@ManyToOne //private Category category;
	 * 
	 * @OneToOne private Review review; public Books() {}
	 */
	@Id
	@GeneratedValue(generator = "cust1", strategy = GenerationType.SEQUENCE)
//	@SequenceGenerator(name = "cust1", sequenceName = "boo1", initialValue = 1, allocationSize = 1)
	private int bookId;

	private String title;

	private String author;

	private String description;
	
	private int isbn;

	private double price;

	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private String publishDate;

	private int qunatity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Category")
	private Category category;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getisbn_number() {
		return isbn;
	}

	public void setiSBN_number(int iSBN_number) {
		this.isbn = iSBN_number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public int getQunatity() {
		return qunatity;
	}

	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
