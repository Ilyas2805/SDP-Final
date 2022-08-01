package com.company.decorator.concreteDecorators.drinks;

import com.company.decorator.baseDecorator.AddDecoratorCombo;
import com.company.decorator.component.IComponentCombo;

public class MediumCola extends AddDecoratorCombo {
    public MediumCola(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costMediumCola(){return 400;}

    @Override
    public int cost() {
        return super.cost() + costMediumCola();
    }
}
