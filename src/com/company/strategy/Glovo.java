package com.company.strategy;

public class Glovo extends DeliveryCompany {
    public Glovo() {
        super(new CarStrategy());
    }

    @Override
    public void display() {
        System.out.println("You selected a Glovo delivery");
    }
}
