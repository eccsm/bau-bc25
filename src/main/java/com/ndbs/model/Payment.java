package com.ndbs.model;

// Represents a Payment transaction
public class Payment {
    private String transactionId;
    private double amount;
    private boolean success;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    // Getters and setters
    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

