package com.company.decorator.concreteDecorators.sauces;

import com.company.decorator.baseDecorator.AddDecoratorCombo;
import com.company.decorator.component.IComponentCombo;

public class Ketchup extends AddDecoratorCombo {
    public Ketchup(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costKetchup(){
        return 100;
    }

    @Override
    public int cost() {
        return super.cost() + costKetchup();
    }
}
