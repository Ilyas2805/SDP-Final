package com.company.strategy;

import java.util.Scanner;

public class MainStrategy {
    public static void main(String[] args) {
        DeliveryCompany deliveryCompany = null;
        //deliveryCompany.display();
        //deliveryCompany.performCalculations();
        //System.out.println();
        //deliveryCompany.setDeliveryStrategy(new CarStrategy());
        //deliveryCompany.performCalculations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a delivery company:");
        System.out.println("1. Glovo");
        System.out.println("2. Yandex");
        System.out.println("3. Wolt");
        int option4 = scanner.nextInt();
        if (option4 == 1){
            deliveryCompany = new Glovo();
        }
        else if (option4 == 2){
            deliveryCompany = new Yandex();
        }
        else if (option4 == 3){
            deliveryCompany= new Wolt();
        }
        else
            System.out.println("Company not found");

        deliveryCompany.display();
        deliveryCompany.performCalculations();

        System.out.println("Choose one option:");
        System.out.println("1. Change delivery strategy");
        System.out.println("2. Finish");
        int option5 = scanner.nextInt();
        if (option5 == 1){
            System.out.println("Choose delivery strategy:");
            System.out.println("1. Car strategy");
            System.out.println("2. Bike strategy");
            System.out.println("3. Walking strategy");
            int option6 = scanner.nextInt();
            if (option6 == 1){
                deliveryCompany.setDeliveryStrategy(new CarStrategy());
            }
            else if (option6 == 2){
                deliveryCompany.setDeliveryStrategy(new BikeStrategy());
            }
            else if (option6 == 3){
                deliveryCompany.setDeliveryStrategy(new WalkingStrategy());
            }
            else
                return;
        }
        else
            return;
    }
}
