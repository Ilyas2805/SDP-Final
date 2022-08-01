package com.company.abstractFactory;

public class BurgerComboFactory implements ComboFactory{

    int price;

    public BurgerComboFactory(){
        System.out.println("Making a combo named <Burger Combo>");
    }


    public FastFood makeFastFood() {
        System.out.println("Making a main fast food -> Burger");
        return new Burger();
    }

    public Snacks makeSnacks() {
        System.out.println("Making a snack -> Fries");
        return new Fries();
    }

    public Drinks makeDrinks() {
        System.out.println("Making a drink -> Soda");
        return new Soda();
    }

    public int showPrice() {
        return 1450;
    }
}
