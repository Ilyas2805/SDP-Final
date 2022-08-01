package com.company.decorator.baseDecorator;

import com.company.abstractFactory.ComboFactory;
import com.company.abstractFactory.FactoryProducer;
import com.company.decorator.component.IComponentCombo;

public class AddDecoratorCombo implements IComponentCombo {
    private IComponentCombo iComponentCombo;

    public AddDecoratorCombo(IComponentCombo iComponentCombo){
        this.iComponentCombo = iComponentCombo;
    }

    @Override
    public int cost() {
        return iComponentCombo.cost();
    }

    @Override
    public String getNotification() {
        return iComponentCombo.getNotification();
    }

}
