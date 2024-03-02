package com.example.restapi.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private Integer bookId;
	@Column(name = "book_name", nullable = false)
	private String bookName;
	@Column(name = "book_author", nullable = false)
	private String bookAuthor;
	@Column(name = "book_price", nullable = false)
	private String bookPrice;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Library.class)
	Set<Library> libraryList = new HashSet<Library>();
	
	public Book() {
		
	}

	public Book(Integer bookId, String bookName, String bookAuthor, String bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Set<Library> getLibraryList() {
		return libraryList;
	}

	public void setLibraryList(Set<Library> libraryList) {
		this.libraryList = libraryList;
	}

	
}
