package com.company.facade;

public class BigChaevie implements Chaevie{
    public BigChaevie(){

    }
    @Override
    public void displaySeller() {
        System.out.println("Rich man");
    }

    @Override
    public void price() {
        System.out.println("5000 tg");
    }
}
