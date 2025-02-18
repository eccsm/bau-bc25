package com.ndbs.util;

import com.ndbs.model.Order;

public class DeliveryConfig {

    public static String arrangeDelivery(Order order) {
        String company = order.getDeliveryCompany();
        return switch (company.toUpperCase()) {
            case "DHL" -> "DHL assigned to order " + order.getOrderId();
            case "FEDEX" -> "FedEx assigned to order " + order.getOrderId();
            case "UPS" -> "UPS assigned to order " + order.getOrderId();
            default -> "Unknown delivery service for order " + order.getOrderId();
        };
    }
}

