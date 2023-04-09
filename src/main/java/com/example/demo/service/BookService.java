package com.example.demo.service;

import com.example.demo.model.service.BookServiceModel;

import java.util.List;

public interface BookService {

    public List<BookServiceModel> getBooks();

    public BookServiceModel getBookById(Long id);

    public BookServiceModel addBook(BookServiceModel book);
}
