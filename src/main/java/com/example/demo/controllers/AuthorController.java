package com.example.demo.controllers;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.repositories.AuthorRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @GetMapping(value = "/authors" , produces = "application/json")
    public List<Author> getAllBooks() {
        return this.authorRepository.getAuthors();
    }
}
