package com.company.abstractFactory;

public interface ComboFactory {

    FastFood makeFastFood();
    Snacks makeSnacks();
    Drinks makeDrinks();
    public int showPrice();
}
