package com.company.decorator.concreteDecorators.snacks;

import com.company.decorator.baseDecorator.AddDecoratorCombo;
import com.company.decorator.component.IComponentCombo;

public class Fries extends AddDecoratorCombo {
    public Fries(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costFries(){
        return 300;
    }

    @Override
    public int cost() {
        return super.cost() + costFries();
    }
}
