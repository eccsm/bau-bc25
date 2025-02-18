package com.ndbs.model;

// Represents an Order in the system
public class Order {
    private final String orderId;
    private final double amount;
    private boolean paid;
    private boolean inventoryReserved;
    private boolean notified;
    private String paymentMethod;
    private String deliveryCompany;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
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
}

