package com.ndbs.service;

import com.ndbs.model.Order;
import com.ndbs.step.InventoryStep;
import com.ndbs.step.NotificationStep;
import com.ndbs.step.PaymentStep;
import com.ndbs.util.PaymentStrategies;
import com.ndbs.util.PaymentStrategy;
import com.ndbs.util.SagaConfig;

public class OrderSaga {
    private final PaymentStrategy paymentStrategy = new PaymentStrategies.PayPalPayment();
    private final PaymentStep paymentStep = new PaymentStep(paymentStrategy);
    private final InventoryStep inventoryStep = new InventoryStep();
    private final NotificationStep notificationStep = new NotificationStep();


    public void processOrder(Order order) {
        SagaConfig config = SagaConfig.getInstance();
        config.log("Starting Saga for order: " + order.getOrderId());



        try {
            paymentStep.execute(order);
            inventoryStep.execute(order);
            notificationStep.execute(order);

            config.log("Saga completed successfully for order: " + order.getOrderId());
        } catch (Exception e) {
            config.log("Saga failed: " + e.getMessage() + " for order: " + order.getOrderId());
            compensate(order);
        }
    }

    private void compensate(Order order) {
        // In real code, you'd track which steps succeeded and roll them back in reverse
        paymentStep.compensate(order);
        inventoryStep.compensate(order);
        notificationStep.compensate(order);

        SagaConfig.getInstance().log("Compensation completed for order: " + order.getOrderId());
    }


    public static void main(String[] args) {
        Order order = new Order("ORDER-456", 199.99);
        OrderSaga saga = new OrderSaga();
        saga.processOrder(order);

        System.out.println("Paid? " + order.isPaid());
        System.out.println("Inventory reserved? " + order.isInventoryReserved());
        System.out.println("Notified? " + order.isNotified());
    }


}



