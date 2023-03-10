package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    private List<Order> orderList;

    public OrderRepo() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrderById(int id) {
        for (Order order : orderList) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orderList);
    }
}
