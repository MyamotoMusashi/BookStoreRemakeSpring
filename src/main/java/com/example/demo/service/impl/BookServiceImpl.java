package com.example.demo.service.impl;

import com.example.demo.model.entity.Author;
import com.example.demo.model.entity.Book;
import com.example.demo.model.service.BookServiceModel;
import com.example.demo.repositories.BookRepository;
import com.example.demo.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;
    private final AuthorServiceImpl authorService;

    public BookServiceImpl(BookRepository bookRepository, ModelMapper modelMapper, AuthorServiceImpl authorService) {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
        this.authorService = authorService;
    }

    @Override
    public List<BookServiceModel> getBooks() {
        return this.bookRepository.findAll()
                .stream()
                .map(book -> this.modelMapper.map(book, BookServiceModel.class))
                .toList();
    }

    @Override
    public BookServiceModel getBookById(Long id) {
        return this.modelMapper.map(this.bookRepository.findById(id), BookServiceModel.class);
    }

    @Override
    public BookServiceModel addBook(BookServiceModel book) {
        Book bookEntity = this.modelMapper.map(book, Book.class);
        bookEntity.setAuthor(this.authorService.getAuthorsByListOfNames(book.getAuthors()));

        BookServiceModel addedBook = this.modelMapper.map(this.bookRepository.save(bookEntity), BookServiceModel.class);
        return addedBook;
    }
}
