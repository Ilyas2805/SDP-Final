package com.company.decorator.concreteDecorators.sauces;

import com.company.decorator.baseDecorator.AddDecoratorCombo;
import com.company.decorator.component.IComponentCombo;

public class Mayonnaise extends AddDecoratorCombo {
    public Mayonnaise(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costMayonnaise(){
        return 100;
    }

    @Override
    public int cost() {
        return super.cost() + costMayonnaise();
    }
}