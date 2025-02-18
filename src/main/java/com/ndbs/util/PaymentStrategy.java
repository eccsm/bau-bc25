package com.ndbs.util;

import com.ndbs.model.Order;

public interface PaymentStrategy {
    String pay(Order order) throws Exception;
}

