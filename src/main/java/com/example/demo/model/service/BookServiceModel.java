package com.example.demo.model.service;

import java.util.List;

public class BookServiceModel {
    private Long id;
    private String title;
    private List<String> authors;
    private Double price;
    private String summary;
    private String coverUrl;

    public BookServiceModel(){};

    public BookServiceModel(Long id, String title, List<String> authors, Double price, String summary, String coverUrl) {
        this.setId(id);
        this.setTitle(title);
        this.setAuthors(authors);
        this.setPrice(price);
        this.setSummary(summary);
        this.setCoverUrl(coverUrl);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
