package com.example.demo.model;

import com.example.demo.model.service.BookServiceModel;

public class OrderItem {
    public String id;
    public BookServiceModel book;
    public Integer quantity;
    public Double totalPrice;

    public OrderItem(BookServiceModel book, Integer quantity) {
        this.book = book;
        this.quantity = quantity;
        this.totalPrice = this.book.getPrice() * this.quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id='" + id + '\'' +
                ", book=" + book +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
