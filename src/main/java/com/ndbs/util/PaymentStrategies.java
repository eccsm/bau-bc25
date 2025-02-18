package com.ndbs.util;

import com.ndbs.model.Order;

public class PaymentStrategies {
    public static class CryptoPayment implements PaymentStrategy {
        @Override
        public String pay(Order order) throws Exception {
            return "";
        }
    }

    public static class PayPalPayment implements PaymentStrategy {
        @Override
        public String pay(Order order) {
            // Real-world logic to process PayPal payment...
            return "Processed PayPal payment for order " + order.getOrderId();
        }
    }

    public static class AlipayPayment implements PaymentStrategy {
        @Override
        public String pay(Order order) {
            // Real-world logic to process Alipay payment...
            return "Processed Alipay payment for order " + order.getOrderId();
        }
    }

}
