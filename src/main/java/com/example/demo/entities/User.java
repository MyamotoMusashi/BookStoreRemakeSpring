package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    public Integer id;
    public String username;
    public String password;
    public String firstName;
    public String lastName;
    public String email;
    public String phone;
    public ShippingInformation shippingInformation;
    public ShippingInformation billingInformation;
    public String role;
    public List<Order> ordersList;

    public User(Integer id,
                String firstName,
                String lastName,
                String email,
                String phone,
                ShippingInformation shippingInformation,
                ShippingInformation billingInformation,
                String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.shippingInformation = shippingInformation;
        this.billingInformation = billingInformation;
        this.role = role;
        this.ordersList = new ArrayList<Order>();
    }

    public User(Integer id,
                String username,
                String password,
                String firstName,
                String lastName,
                String email,
                String phone,
                ShippingInformation shippingInformation,
                ShippingInformation billingInformation,
                String role
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.shippingInformation = shippingInformation;
        this.billingInformation = billingInformation;
        this.role = role;
        this.ordersList = new ArrayList<Order>();
    }

    public User() {}


}
