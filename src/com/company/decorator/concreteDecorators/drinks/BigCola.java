package com.company.decorator.concreteDecorators.drinks;

import com.company.decorator.baseDecorator.AddDecoratorCombo;
import com.company.decorator.component.IComponentCombo;

public class BigCola extends AddDecoratorCombo {
    public BigCola(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costBigCola(){
        return 600;
    }

    @Override
    public int cost() {
        return super.cost() + costBigCola();
    }
}
