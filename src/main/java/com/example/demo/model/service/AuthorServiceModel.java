package com.example.demo.model.service;

import java.util.List;

public class AuthorServiceModel {
    private Integer id;
    private String name;
    private String description;
    private String pictureUrl;
    private List<BookServiceModel> bookList;

    public AuthorServiceModel() {}

    public AuthorServiceModel(Integer id, String name, String description, String pictureUrl) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setPictureUrl(pictureUrl);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public List<BookServiceModel> getBookList() {
        return bookList;
    }

    public void setBookList(List<BookServiceModel> bookList) {
        this.bookList = bookList;
    }
}
