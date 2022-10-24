package com.example.demo.entities;

public class OrderItem {
    public String id;
    public Book book;
    public Integer quantity;
    public Double totalPrice;

    public OrderItem(Book book, Integer quantity) {
        this.book = book;
        this.quantity = quantity;
        this.totalPrice = this.book.price * this.quantity;
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
