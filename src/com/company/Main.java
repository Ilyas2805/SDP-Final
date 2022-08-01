package com.company;

import com.company.abstractFactory.*;
import com.company.bridge.*;
import com.company.decorator.component.IComponentCombo;
import com.company.decorator.concreteComponents.BigTasty;
import com.company.decorator.concreteComponents.Twister;
import com.company.decorator.concreteComponents.Whopper;
import com.company.decorator.concreteDecorators.drinks.BigCola;
import com.company.decorator.concreteDecorators.drinks.MediumCola;
import com.company.decorator.concreteDecorators.drinks.MiniCola;
import com.company.decorator.concreteDecorators.sauces.Ketchup;
import com.company.decorator.concreteDecorators.sauces.Mayonnaise;
import com.company.decorator.concreteDecorators.sauces.Tartar;
import com.company.decorator.concreteDecorators.snacks.Fries;
import com.company.decorator.concreteDecorators.snacks.Nuggets;
import com.company.observer.Client;
import com.company.observer.Publisher;
import com.company.strategy.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ComboFactory comboFactory;
        int price = 0;
        System.out.println("#####  Fastfood Restaurant  #####");
        System.out.println();
        System.out.println("Please choose one of special combos:");
        System.out.println("1. Hot Dog Combo -> Hot dog, Nuggets, Coffee");
        System.out.println("2. Burger Combo -> Burger, Fries, Soda");
        System.out.println();
        System.out.println("Enter option 1-2:");
        int option1 = sc.nextInt();
        if (option1 == 1){
            comboFactory = FactoryProducer.getFactory("Hot Dog combo");
            FastFood fastFood = comboFactory.makeFastFood();
            Snacks snacks = comboFactory.makeSnacks();
            Drinks drinks = comboFactory.makeDrinks();
            price = comboFactory.showPrice();
            System.out.println();
            System.out.println("Cost of special combo: "+price);
        }
        else if (option1 == 2){
            comboFactory = FactoryProducer.getFactory("Burger combo");
            FastFood fastFood = comboFactory.makeFastFood();
            Snacks snacks = comboFactory.makeSnacks();
            Drinks drinks = comboFactory.makeDrinks();
            price = comboFactory.showPrice();
            System.out.println();
            System.out.println("Cost of special combo: "+price);
        }
        else
            System.out.println("Cost of special combo: "+ price);

        System.out.println("#################################");

        System.out.println("Please, choose a simple combo:");
        System.out.println("1. Big Tasty Combo");
        System.out.println("2. Increased Big Tasty Combo");
        System.out.println("3. Whopper Combo");
        System.out.println("4. Increased Whopper Combo");
        System.out.println("5. Twister Combo");
        System.out.println("6. Increased Twister Combo");
        System.out.println();

        System.out.println("Enter option 0-6:");
        int option2 = sc.nextInt();
        if(option2 == 1){
            getBigTasty(price);
        }
        else if(option2 == 2){
            getIncreasedBigTasty(price);
        }
        else if(option2 == 3){
            getWhopper(price);
        }
        else if(option2 == 4){
            getIncreasedWhopper(price);
        }
        else if(option2 == 5){
            getTwister(price);
        }
        else if(option2 == 6){
            getIncreasedTwister(price);
        }

        System.out.println("#################################");

        System.out.println("We have a great news for you! You can get a free gift");
        System.out.println("Please choose what you want for gift:");
        System.out.println("1. Mug");
        System.out.println("2. Glass");
        System.out.println("Choose color:");
        System.out.println("1. Red");
        System.out.println("2. Blue");
        System.out.println("3. Green");
        System.out.println("Example of input 11,12,21...");
        Gift gift;
        int option3 = sc.nextInt();
        if (option3 == 11){
            gift = new Mug(new RedColor());
        }
        else if (option3 == 12){
            gift = new Mug(new BlueColor());
        }
        else if (option3 == 13){
            gift = new Mug(new GreenColor());
        }
        else if (option3 == 21){
            gift = new Glass(new RedColor());
        }
        else if (option3 == 22){
            gift = new Glass(new BlueColor());
        }
        else
            gift = new Glass(new GreenColor());
        System.out.print("Here's your gift -> ");
        gift.color.fillColor();
        gift.search();

        System.out.println("#################################");

        Scanner sc2 = new Scanner(System.in);
        Publisher publisher = new Publisher();
        publisher.addOrder(1);
        publisher.addOrder(2);
        publisher.addOrder(3);

        Client Ilyas = new Client("Ilyas, your order: 2");

        publisher.registerClient(Ilyas);

        publisher.addOrder(4);

        System.out.println("If you see your order number, pLease enter your order number to delete:");
        int orderNum = sc2.nextInt();
        publisher.removeOrder(orderNum-1);
        publisher.removeClient(Ilyas);
        System.out.println("Thank you for ordering from us");
        publisher.notifyAllClients();

        System.out.println("#################################");

        DeliveryCompany deliveryCompany = null;
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
            deliveryCompany.display();
            deliveryCompany.performCalculations();
        }
        else
            return;
    }


    public static void getBigTasty(int price){
        IComponentCombo bigTastyCombo = new Tartar(new MediumCola(new Fries(new BigTasty())));
        System.out.println("Components: 1.Big Tasty Burger...1200\n" +
                "2.Medium Cola...400\n" +
                "3.Fries...300\n" +
                "4.Tartar...100\n");
        System.out.println("Total cost: " + (bigTastyCombo.cost() + price));
    }

    public static void getIncreasedBigTasty(int price){
        IComponentCombo increasedBigTastyCombo = new Ketchup(new Nuggets(new BigCola(new BigTasty())));
        System.out.println("Components: 1.Big Tasty Burger...1200\n" +
                "2.Big Cola...600\n" +
                "3.Nuggets...500\n" +
                "4.Ketchup...100\n");
        System.out.println("Total cost: " + (increasedBigTastyCombo.cost() + price));
    }

    public static void getWhopper(int price){
        IComponentCombo whopperCombo = new Mayonnaise(new Fries(new MiniCola(new Whopper())));
        System.out.println("Components: 1.Whopper Burger...1100\n" +
                "2.Mini Cola...250\n" +
                "3.Fries...300\n" +
                "4.Mayonnaise...100\n");
        System.out.println("Total cost: " + (whopperCombo.cost() + price));
    }

    public static void getIncreasedWhopper(int price){
        IComponentCombo increasedWhopperCombo = new Mayonnaise(new Nuggets(new BigCola(new Whopper())));
        System.out.println("Components: 1.Whopper Burger...1100\n" +
                "2.Big Cola...600\n" +
                "3.Nuggets...500\n" +
                "4.Mayonnaise...100\n");
        System.out.println("Total cost: " + (increasedWhopperCombo.cost() + price));
    }

    public static void getTwister(int price){
        IComponentCombo twisterCombo = new Tartar(new Fries(new MiniCola(new Twister())));
        System.out.println("Components: 1.Twister...1000\n" +
                "2.Mini Cola...250\n" +
                "3.Fries...300\n" +
                "4.Tartar...100\n");
        System.out.println("Total cost: " + (twisterCombo.cost() + price));
    }

    public static void getIncreasedTwister(int price){
        IComponentCombo increasedTwisterCombo = new Tartar(new Nuggets(new MediumCola(new Twister())));
        System.out.println("Components: 1.Twister...1000\n" +
                "2.Medium Cola...400\n" +
                "3.Nuggets...500\n" +
                "4.Tartar...100\n");
        System.out.println("Total cost: " + (increasedTwisterCombo.cost() + price));
    }
}
