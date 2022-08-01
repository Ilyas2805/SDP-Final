package com.company.observer;

public interface IObservable {
    void registerClient(IObserver client);
    void removeClient(IObserver client);
    void notifyAllClients();
}
