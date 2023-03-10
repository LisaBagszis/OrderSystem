package org.example;

import java.util.List;

public class Order {
    private String id;
    private List<Product> products;

    public Order(String id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "id=" + id +
                ", Produkte=" + products +
                '}';
    }
}
