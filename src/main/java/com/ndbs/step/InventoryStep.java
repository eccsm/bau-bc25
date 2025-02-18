package com.ndbs.step;

import com.ndbs.model.Order;
import com.ndbs.util.SagaConfig;

public class InventoryStep {
    public void execute(Order order) throws Exception {
        SagaConfig.getInstance().log("InventoryStep - Reserving inventory for order: " + order.getOrderId());
        // ... Inventory logic ...
        order.setInventoryReserved(true);
    }

    public void compensate(Order order) {
        SagaConfig.getInstance().log("InventoryStep - Rolling back inventory reservation for order: " + order.getOrderId());
        order.setInventoryReserved(false);
    }
}


