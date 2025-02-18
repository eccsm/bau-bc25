package com.ndbs.util;

import com.ndbs.model.Order;

public class PaymentConfig {

    public static String processPayment(Order order) {
        String method = order.getPaymentMethod();
        return switch (method.toUpperCase()) {
            case "CRYPTO" -> "Processed CRYPTO payment for order " + order.getOrderId();
            case "ALIPAY" -> "Processed Alipay payment for order " + order.getOrderId();
            case "PAYPAL" -> "Processed PayPal payment for order " + order.getOrderId();
            case "SWAP" -> "Processed SWAP payment for order " + order.getOrderId();
            case "CHIPPIN" -> "Processed Chippin payment for order " + order.getOrderId();
            default -> "Unknown payment method for order " + order.getOrderId();
        };
    }
}

