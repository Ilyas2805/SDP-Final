package com.company.decorator;

import com.company.abstractFactory.ComboFactory;
import com.company.abstractFactory.FactoryProducer;
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

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private Scanner sc = new Scanner(System.in);

    public void start(){
        System.out.println("");

        while (true){
            System.out.println("Please, choose a burger:");
            System.out.println("1. Big Tasty");
            System.out.println("2. Increased Big Tasty");
            System.out.println("3. Whopper");
            System.out.println("4. Increased Whopper");
            System.out.println("5. Twister");
            System.out.println("6. Increased Twister");
            System.out.println("0. Exit");
            System.out.println();

            try{
                System.out.println("Enter option 0-6:");
                int option = sc.nextInt();
                if(option == 1){
                    getBigTasty();
                }
                else if(option == 2){
                    getIncreasedBigTasty();
                }
                else if(option == 3){
                    getWhopper();
                }
                else if(option == 4){
                    getIncreasedWhopper();
                }
                else if(option == 5){
                    getTwister();
                }
                else if(option == 6){
                    getIncreasedTwister();
                } else
                    break;

            } catch (InputMismatchException e){
                System.out.println("Input must be integer");
                sc.nextLine();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("#################################");
        }
    }


    public void getBigTasty(){
        IComponentCombo bigTastyCombo = new Tartar(new MediumCola(new Fries(new BigTasty())));
        System.out.println("Components: 1.Big Tasty Burger...1200\n" +
                "2.Medium Cola...400\n" +
                "3.Fries...300\n" +
                "4.Tartar...100\n");
        System.out.println("Total cost: " + bigTastyCombo.cost());
    }

    public void getIncreasedBigTasty(){
        IComponentCombo increasedBigTastyCombo = new Ketchup(new Nuggets(new BigCola(new BigTasty())));
        System.out.println("Components: 1.Big Tasty Burger...1200\n" +
                "2.Big Cola...600\n" +
                "3.Nuggets...500\n" +
                "4.Ketchup...100\n");
        System.out.println("Total cost: " + increasedBigTastyCombo.cost());
    }

    public void getWhopper(){
        IComponentCombo whopperCombo = new Mayonnaise(new Fries(new MiniCola(new Whopper())));
        System.out.println("Components: 1.Whopper Burger...1100\n" +
                "2.Mini Cola...250\n" +
                "3.Fries...300\n" +
                "4.Mayonnaise...100\n");
        System.out.println("Total cost: " + whopperCombo.cost());
    }

    public void getIncreasedWhopper(){
        IComponentCombo increasedWhopperCombo = new Mayonnaise(new Nuggets(new BigCola(new Whopper())));
        System.out.println("Components: 1.Whopper Burger...1100\n" +
                "2.Big Cola...600\n" +
                "3.Nuggets...500\n" +
                "4.Mayonnaise...100\n");
        System.out.println("Total cost: " + increasedWhopperCombo.cost());
    }

    public void getTwister(){
        IComponentCombo twisterCombo = new Tartar(new Fries(new MiniCola(new Twister())));
        System.out.println("Components: 1.Twister...1000\n" +
                "2.Mini Cola...250\n" +
                "3.Fries...300\n" +
                "4.Tartar...100\n");
        System.out.println("Total cost: " + twisterCombo.cost());
    }

    public void getIncreasedTwister(){
        IComponentCombo increasedTwisterCombo = new Tartar(new Nuggets(new MediumCola(new Twister())));
        System.out.println("Components: 1.Twister...1000\n" +
                "2.Medium Cola...400\n" +
                "3.Nuggets...500\n" +
                "4.Tartar...100\n");
        System.out.println("Total cost: " + increasedTwisterCombo.cost());
    }

}
