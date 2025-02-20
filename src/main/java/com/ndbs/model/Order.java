package com.ndbs.model;

import java.util.ArrayList;
import java.util.List;

// Represents an Order in the system
public class Order implements OrderStatusSubject {
    private final String orderId;
    private final double amount;
    private boolean paid;
    private boolean inventoryReserved;
    private boolean notified;
    private String paymentMethod;
    private String deliveryCompany;
    private final List<OrderStatusObserver> observers = new ArrayList<>();
    private String status;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = "Created";
    }

    // Getters and setters
    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isInventoryReserved() {
        return inventoryReserved;
    }

    public void setInventoryReserved(boolean inventoryReserved) {
        this.inventoryReserved = inventoryReserved;
    }

    public boolean isNotified() {
        return notified;
    }

    public void setNotified(boolean notified) {
        this.notified = notified;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    @Override
    public void attach(OrderStatusObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(OrderStatusObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (OrderStatusObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getStatus() {
        return status;
    }
}

