package com.example.demo.controllers;

import com.example.demo.model.dto.BookDTO;
import com.example.demo.model.service.BookServiceModel;
import com.example.demo.service.impl.BookServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BookController {
    private final BookServiceImpl bookService;
    private final ModelMapper modelMapper;

    public BookController(BookServiceImpl bookService, ModelMapper modelMapper) {
        this.bookService = bookService;
        this.modelMapper = modelMapper;
    }

    @GetMapping(value = "/books" , produces = "application/json")
    public List<BookServiceModel> getAllBooks() {
        return this.bookService.getBooks();
    }

    @PostMapping(value = "/books")
    public BookServiceModel addBook(@RequestBody BookDTO bookDTO){
        return this.bookService.addBook(this.modelMapper.map(bookDTO, BookServiceModel.class));
    }

    @GetMapping(value = "/books/{id}")
    public BookServiceModel getBookById(@PathVariable  Long id) {
        return this.bookService.getBookById(id);
    }
}
