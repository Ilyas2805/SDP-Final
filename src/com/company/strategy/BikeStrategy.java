package com.company.strategy;

public class BikeStrategy implements DeliveryStrategy{
    @Override
    public void ApproximateDeliveryTime() {
        System.out.println("Delivery using bike");
        System.out.println("Delivery time: 30-45 min");
    }
}
