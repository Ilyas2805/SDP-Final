package com.company.strategy;

public class Wolt extends DeliveryCompany{

    public Wolt(){
        super(new WalkingStrategy());
    }
    @Override
    public void display() {
        System.out.println("You selected a Wolt delivery");
    }
}
