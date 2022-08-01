package com.company.decorator.concreteDecorators.snacks;

import com.company.decorator.baseDecorator.AddDecoratorCombo;
import com.company.decorator.component.IComponentCombo;

public class Nuggets extends AddDecoratorCombo {
    public Nuggets(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costNuggets(){
        return 500;
    }

    @Override
    public int cost() {
        return super.cost() + costNuggets();
    }
}
