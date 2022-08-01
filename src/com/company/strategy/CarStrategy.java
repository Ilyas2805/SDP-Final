package com.company.strategy;

public class CarStrategy implements DeliveryStrategy{
    @Override
    public void ApproximateDeliveryTime() {
        System.out.println("Delivery using car");
        System.out.println("Delivery time: 10-20 min");
    }
}
