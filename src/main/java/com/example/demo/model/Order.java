package com.example.demo.model;

import com.example.demo.model.entity.Author;
import com.example.demo.model.service.BookServiceModel;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public Integer id;
    public String dateCreated;
    public ShippingInformation shippingInformation;
    public Double totalPrice;
    public List<OrderItem> itemsOrdered;
    public Integer userId;
    public OrderStatus status;

    public Order(Integer id, Integer userId, List<OrderItem> itemsOrdered){
        this.id = id;
        this.dateCreated = "10-03-2022";
        this.shippingInformation = new ShippingInformation("laino", "laino2", "bulgaria", "sofia", "8700");
        this.itemsOrdered = itemsOrdered;
        this.totalPrice = this.calculateTotalPrice();
        this.userId = userId;
        this.status = OrderStatus.NotProcessed;
    }

    public Double calculateTotalPrice() {
        Double totalPrice = 0.00;
        for (OrderItem orderItem: this.itemsOrdered) {
            totalPrice = totalPrice + orderItem.totalPrice;
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateCreated='" + dateCreated + '\'' +
                ", shippingInformation=" + shippingInformation +
                ", totalPrice=" + totalPrice +
                ", itemsOrdered=" + itemsOrdered +
                ", userId=" + userId + '}';
    }
}
