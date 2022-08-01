package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements IObservable{

    private List<Integer> orders = new ArrayList<>();
    private List<IObserver> clients = new ArrayList<>();

    public void addOrder(int order){
        this.orders.add(order);
        notifyAllClients();
    }
    public void removeOrder(int order){
        this.orders.remove(order);
        notifyAllClients();
    }

    @Override
    public void registerClient(IObserver client) {
        this.clients.add(client);
    }

    @Override
    public void removeClient(IObserver client) {
        this.clients.remove(client);
    }

    @Override
    public void notifyAllClients() {
        for (IObserver client:clients){
            client.update(this.orders);
        }
    }
}
