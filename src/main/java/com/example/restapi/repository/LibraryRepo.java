package com.example.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restapi.entities.Book;
import com.example.restapi.entities.Library;

@Repository
public interface LibraryRepo extends JpaRepository<Library, Integer> {

	List<Book> findByLibraryName(String libraryName);
	
	
}
