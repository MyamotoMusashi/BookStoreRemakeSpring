package com.example.demo.model.entity;

import com.example.demo.model.service.BookServiceModel;

public class OrderItem {
    public Long id;
    public BookServiceModel book;
    public Integer quantity;
    public Double totalPrice;
}
