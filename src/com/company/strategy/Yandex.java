package com.company.strategy;

public class Yandex extends DeliveryCompany{
    public Yandex(){
        super(new BikeStrategy());
    }
    @Override
    public void display() {
        System.out.println("You selected a Yandex delivery");
    }
}
