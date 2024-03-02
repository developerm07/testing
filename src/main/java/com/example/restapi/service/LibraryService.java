package com.example.restapi.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.entities.Book;
import com.example.restapi.entities.Library;
import com.example.restapi.repository.LibraryRepo;

@Service
public class LibraryService {

	@Autowired
	private LibraryRepo libraryRepository;
	
	public Library save(@Valid Library library) {
		return libraryRepository.save(library);
	}

	public List<Book> findByLibraryName(String name) {
		return libraryRepository.findByLibraryName(name);
	}

	public List<Library> findAll() {
		return libraryRepository.findAll();
	}
	
}
