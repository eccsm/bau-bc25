package com.ndbs.service;

import com.ndbs.model.Order;
import com.ndbs.model.OrderStatusObserver;

public class EmailNotificationService implements OrderStatusObserver {
    @Override
    public void update(Order order) {
        System.out.println("Email Notification: Order " + order.getOrderId() +
                " is now " + order.getStatus());
    }
}
