package com.ndbs.model;

public interface OrderStatusSubject {
    void attach(OrderStatusObserver observer);
    void detach(OrderStatusObserver observer);
    void notifyObservers();
}

