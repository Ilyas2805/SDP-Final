package com.company.strategy;

public class WalkingStrategy implements DeliveryStrategy{
    @Override
    public void ApproximateDeliveryTime() {
        System.out.println("Delivery on foot");
        System.out.println("Delivery time: 60-90 min");
    }
}
