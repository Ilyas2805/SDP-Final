package com.company.decorator.concreteDecorators.drinks;

import com.company.decorator.baseDecorator.AddDecoratorCombo;
import com.company.decorator.component.IComponentCombo;

public class MiniCola extends AddDecoratorCombo {
    public MiniCola(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costMiniCola(){
        return 250;
    }

    @Override
    public int cost() {
        return super.cost() + costMiniCola();
    }
}
