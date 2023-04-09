package com.example.demo.service;

import com.example.demo.model.entity.Author;
import com.example.demo.model.service.AuthorServiceModel;

import java.util.List;

public interface AuthorService {
    public List<AuthorServiceModel> getAuthors();
    public List<Author> getAuthorsByListOfNames(List<String> authors);
    public AuthorServiceModel getAuthorById(Long id);
    public AuthorServiceModel addAuthor(AuthorServiceModel author);
}
