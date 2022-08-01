package com.company.decorator.concreteComponents;

import com.company.decorator.component.IComponentCombo;

public class BigTasty implements IComponentCombo {
    @Override
    public int cost() {
        return 1200;
    }

    @Override
    public String getNotification() {
        return "Big Tasty Burger was bought";
    }

}
