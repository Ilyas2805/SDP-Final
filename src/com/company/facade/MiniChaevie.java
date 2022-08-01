package com.company.facade;

public class MiniChaevie implements Chaevie {
    public MiniChaevie(){

    }
    @Override
    public void displaySeller() {
        System.out.println("Altair");
    }

    @Override
    public void price() {
        System.out.println("Chaevie -> 100tg");
    }
}
