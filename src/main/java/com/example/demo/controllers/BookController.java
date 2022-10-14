package com.example.demo.controllers;

import com.example.demo.entities.Book;
import com.example.demo.repositories.BookRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(value = "/books" , produces = "application/json")
    public List<Book> getAllBooks() {
        return this.bookRepository.getBooks();
    }

    @GetMapping(value = "/books/{id}")
    public Book getBookById(@PathVariable  Integer id) {
        return this.bookRepository.getBookById(id);
    }
}
