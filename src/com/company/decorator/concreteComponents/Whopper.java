package com.company.decorator.concreteComponents;

import com.company.decorator.component.IComponentCombo;

public class Whopper implements IComponentCombo {
    @Override
    public int cost() {
        return 1100;
    }

    @Override
    public String getNotification() {
        return "Whopper Burger was bought";
    }

}
