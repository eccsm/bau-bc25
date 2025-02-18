package com.ndbs.step;

import com.ndbs.model.Order;
import com.ndbs.util.PaymentStrategy;
import com.ndbs.util.SagaConfig;

public class PaymentStep {

    private final PaymentStrategy paymentStrategy;

    // Constructor Injection
    public PaymentStep(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void execute(Order order) throws Exception {
        // Retrieve the single config instance
        SagaConfig config = SagaConfig.getInstance();
        config.log("PaymentStep - Processing payment for order: " + order.getOrderId());

        // Use the payment strategy
        String result = paymentStrategy.pay(order);

        // Possibly interpret the result (e.g., success/failure)
        if (!result.startsWith("Processed")) {
            throw new Exception("Payment failed!");
        }

        // Mark order as paid
        order.setPaid(true);
        config.log("PaymentStep - " + result);
    }

    public void compensate(Order order) {
        SagaConfig.getInstance().log("PaymentStep - Rolling back payment for order: " + order.getOrderId());
        order.setPaid(false);
    }
}
