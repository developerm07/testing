package com.example.restapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.entities.Book;
import com.example.restapi.service.BookService;

@RestController
@RequestMapping("/api")
public class SpecificEndpoint {
	@Autowired
	private BookService bookService;
	
	@PostMapping("/book")
	public Book insertBook(@Valid @RequestBody Book bookDetails) {
		 try{
			 return bookService.save(bookDetails);
		}catch(Exception e) {
			return new Book();
		}
	}

}
