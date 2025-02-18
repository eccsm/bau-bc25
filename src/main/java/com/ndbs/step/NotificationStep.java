package com.ndbs.step;

import com.ndbs.model.Order;
import com.ndbs.util.SagaConfig;

public class NotificationStep {
    public void execute(Order order) throws Exception {
        SagaConfig.getInstance().log("NotificationStep - Sending notification for order: " + order.getOrderId());
        // ... Notification logic ...
        order.setNotified(true);
    }

    public void compensate(Order order) {
        SagaConfig.getInstance().log("NotificationStep - Rolling back notification for order: " + order.getOrderId());
        order.setNotified(false);
    }
}


