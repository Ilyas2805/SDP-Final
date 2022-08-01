package com.company.strategy;

public abstract class DeliveryCompany {
    private DeliveryStrategy delivery;

    public DeliveryCompany(DeliveryStrategy delivery){
        this.delivery = delivery;
    }

    public void performCalculations(){
        this.delivery.ApproximateDeliveryTime();
    }

    public void setDeliveryStrategy(DeliveryStrategy delivery) {
        this.delivery = delivery;
    }
    public abstract void display();
}
