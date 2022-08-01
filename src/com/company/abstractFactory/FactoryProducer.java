package com.company.abstractFactory;

public class FactoryProducer {
    public static ComboFactory getFactory(String choice){
        if ("Burger Combo".equalsIgnoreCase(choice)){
            return new BurgerComboFactory();
        }
        else if ("Hot Dog Combo".equalsIgnoreCase(choice)){
            return new HotDogComboFactory();
        }
        return null;
    }
}
