package com.company.abstractFactory;

public class MainAbstract {
    public static void main(String[] args) {
        ComboFactory comboFactory = FactoryProducer.getFactory("Hot Dog combo");
        FastFood fastFood = comboFactory.makeFastFood();
        Snacks snacks = comboFactory.makeSnacks();
        Drinks drinks = comboFactory.makeDrinks();
        int price = comboFactory.showPrice();
        System.out.println("Price: "+price);
    }
}
