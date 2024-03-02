package com.example.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.entities.Book;
import com.example.restapi.entities.Library;
import com.example.restapi.exception.BookNotFoundException;
import com.example.restapi.service.BookService;
import com.example.restapi.service.LibraryService;

@RestController
@RequestMapping("/api/v1")
public class LibraryController {

	@Autowired
	private BookService bookService;

	@Autowired
	private LibraryService libraryService;
	
	
	@GetMapping("/hi") 
	public String sayHello(){
		return "Hello";
	}

	@PostMapping("/library")
	public Library insertLibrary(@Valid @RequestBody Library library) {
			return libraryService.save(library);
	}

	// Get books by Id
	@GetMapping("/library/{name}")
	public ResponseEntity<List<Book>> getBookByLibrary(@PathVariable(value = "name") String name)
			throws BookNotFoundException {
		List<Book> book = libraryService.findByLibraryName(name);
		return ResponseEntity.ok().body(book);
	}

	// Get all books
	@GetMapping("/library")
	public List<String> getAllLibraries() {
		List<Library> lib= libraryService.findAll();
		List<String> libNames= new ArrayList<String>();
		for(Library libs:lib) {
			libNames.add(libs.getLibraryName());
		}
		return libNames;
	}

	// Insert books first
	@PostMapping("/book")
	public Book insertBook(@Valid @RequestBody Book bookDetails) {
		return bookService.save(bookDetails);
	}

}
