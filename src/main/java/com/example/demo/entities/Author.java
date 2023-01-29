package com.example.demo.entities;

import java.util.List;

public class Author {
    private Integer id;
    private String name;
    private String description;
    private String pictureUrl;
    private List<Book> bookList;

    public Author() {}

    public Author(Integer id,String name, String description, String pictureUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.pictureUrl = pictureUrl;
    }
}
