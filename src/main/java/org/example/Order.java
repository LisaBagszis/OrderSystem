package org.example;

import java.util.List;

public class Order {
    private int id;
    private List<Integer> productIds;

    public Order(int id, List<Integer> productIds) {
        this.id = id;
        this.productIds = productIds;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getProductIds() {
        return productIds;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "id=" + id +
                ", produktIds=" + productIds +
                '}';
    }
}
