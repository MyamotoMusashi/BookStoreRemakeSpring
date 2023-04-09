package com.example.demo.repositories;

import com.example.demo.model.service.BookServiceModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MyBookRepository {


    public ArrayList<BookServiceModel> bookList = new ArrayList<BookServiceModel>();

    public MyBookRepository() {
    }

    public List<BookServiceModel> getBooks() {
        return this.bookList;
    }

    public BookServiceModel getBookById(Long id) {
        return this.bookList
                .stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
