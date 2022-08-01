package com.company.abstractFactory;

public class HotDogComboFactory implements ComboFactory{

    public HotDogComboFactory(){
        System.out.println("Making a combo named <Hot Dog Combo>");
    }

    public FastFood makeFastFood() {
        System.out.println("Making a fast food -> Hot Dog");
        return new HotDog();
    }

    public Snacks makeSnacks() {
        System.out.println("Making a snack -> Nuggets");
        return new Nuggets();
    }

    public Drinks makeDrinks() {
        System.out.println("Making a drink -> Coffee");
        return new Coffee();
    }

    public int showPrice() {
        return 1100;
    }

}
