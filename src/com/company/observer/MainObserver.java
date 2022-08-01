package com.company.observer;

import java.util.Scanner;

public class MainObserver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Publisher publisher = new Publisher();
        publisher.addOrder(1);
        publisher.addOrder(2);
        publisher.addOrder(3);

        Client Ilyas = new Client("Ilyas, your order: 2");

        publisher.registerClient(Ilyas);

        publisher.addOrder(4);
        publisher.addOrder(5);

        System.out.println("If you see your order number, pLease enter your order number to delete:");
        int orderNum = sc.nextInt();
        publisher.removeOrder(orderNum-1);
        publisher.removeClient(Ilyas);
        System.out.println("Thank you for ordering from us, goodbye");
        publisher.notifyAllClients();
    }
}
