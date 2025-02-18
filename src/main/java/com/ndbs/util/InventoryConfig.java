package com.ndbs.util;

import com.ndbs.model.Order;

public class InventoryConfig {

    // For demonstration, we'll say "sapIntegration" returns a success message.
    public static String reserveInventorySAP(Order order) {
        // In reality, you'd connect to SAP via an API or library
        return "SAP integration: Reserved inventory for order " + order.getOrderId();
    }

    public static String releaseInventorySAP(Order order) {
        // For rolling back
        return "SAP integration: Released inventory for order " + order.getOrderId();
    }
}

