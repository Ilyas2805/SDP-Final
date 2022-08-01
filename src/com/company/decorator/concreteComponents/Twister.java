package com.company.decorator.concreteComponents;

import com.company.decorator.component.IComponentCombo;

public class Twister implements IComponentCombo {
    @Override
    public int cost() {
        return 1000;
    }

    @Override
    public String getNotification() {
        return "Twister was bought";
    }

}
