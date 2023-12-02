package com.company.models;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private List<Bicycle> orderedBicycles;
    private LocalDateTime orderDate;
    private OrderStatus status;

    public Order(List<Bicycle> orderedBicycles, LocalDateTime orderDate, OrderStatus status) {
        this.orderedBicycles = orderedBicycles;
        this.orderDate = orderDate;
        this.status = status;
    }

    public List<Bicycle> getOrderedBicycles() {
        return orderedBicycles;
    }

    public void setOrderedBicycles(List<Bicycle> orderedBicycles) {
        this.orderedBicycles = orderedBicycles;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addBicycleToOrder(Bicycle bicycle) {
        orderedBicycles.add(bicycle);
    }

    public enum OrderStatus {
        PENDING,
        PROCESSING,
        SHIPPED,
        DELIVERED
    }
}

