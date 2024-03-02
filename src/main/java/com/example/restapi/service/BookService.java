package com.example.restapi.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.entities.Book;
import com.example.restapi.repository.BookRepo;

@Service
public class BookService {

	@Autowired
	BookRepo bookRepository;
	
	public Book save(@Valid Book bookDetails) {
     	return bookRepository.save(bookDetails);
	}

}
