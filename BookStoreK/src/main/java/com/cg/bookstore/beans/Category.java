package com.cg.bookstore.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Category {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO) private int index; private
	 * String categoryName; // @OneToMany(mappedBy = "category",cascade =
	 * CascadeType.ALL) // private Map<Integer, Books> books=new HashMap<Integer,
	 * Books>(); // @ManyToOne // private Books books;
	 * 
	 * @OneToMany(mappedBy = "category") private List<Books> book;
	 * 
	 * public Category() { }
	 */


	@Id
	private int categoryId;

	private String categoryName;

	@OneToMany(mappedBy = "category", targetEntity = Books.class)
	private List<Books> book;

	public Category() {	}

	public Category(int categoryId, String categoryName, List<Books> book) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.book = book;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Books> getBook() {
		return book;
	}

	public void setBook(List<Books> book) {
		this.book = book;
	}


}
