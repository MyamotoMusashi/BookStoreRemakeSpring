package com.example.demo.model;

public class ShippingInformation {
    public String address1;
    public String address2;
    public String country;
    public String city;
    public String zipCode;

    public ShippingInformation(String address1, String address2, String country, String city, String zipCode) {
        this.address1 = address1;
        this.address2 = address2;
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
    }
}
