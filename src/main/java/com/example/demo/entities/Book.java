package com.example.demo.entities;

import org.springframework.context.annotation.Bean;

public class Book {
    public Integer id;
    public String title;
    public String author;
    public Double price;
    public String summary;
    public String coverUrl;

    public Book(Integer id, String title, String author, Double price, String summary, String coverUrl) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.summary = summary;
        this.coverUrl = coverUrl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
