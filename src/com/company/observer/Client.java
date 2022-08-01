package com.company.observer;

import java.util.List;

public class Client implements IObserver{
    String name;

    public Client(String name){
        this.name= name;
    }
    @Override
    public void update(List<Integer> orders) {
        System.out.println("Dear "+ this.name+"\n Here's the list of ready orders \n"+ orders);
    }
}
