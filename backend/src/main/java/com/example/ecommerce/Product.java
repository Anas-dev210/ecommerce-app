package com.example.ecommerce;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    public Product() {}
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}
