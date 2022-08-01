package com.company.decorator.concreteDecorators.sauces;

import com.company.decorator.baseDecorator.AddDecoratorCombo;
import com.company.decorator.component.IComponentCombo;

public class Tartar extends AddDecoratorCombo {
    public Tartar(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costTartar(){
        return 100;
    }

    @Override
    public int cost() {
        return super.cost() + costTartar();
    }
}
