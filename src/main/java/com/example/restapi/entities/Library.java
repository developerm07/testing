package com.example.restapi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
@Table(name = "library")
public class Library implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
	@Column(name = "library_id", nullable = false)
    private Integer libraryId;
	@Column(name = "library_name", nullable = false)
	private String libraryName;
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Book.class)
	@JoinTable(name = "JOIN_LIB_BOOK",joinColumns = {@JoinColumn(name="library_id")},
	inverseJoinColumns = {@JoinColumn(name="book_id")})
	private List<Book> listOfBooks=new ArrayList<Book>();
	
	public Library() {
		
	}
	
	public Library(Integer libraryId, String libraryName) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		
	}
	public Integer getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(Integer libraryId) {
		this.libraryId = libraryId;
	}
	
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	
	public List<Book> getListOfBooks() {
		return listOfBooks;
	}
	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	
}
