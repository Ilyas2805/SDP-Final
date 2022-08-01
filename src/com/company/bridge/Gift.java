package com.company.bridge;

public abstract class Gift {
    public Color color;

    public Gift(Color color){
        this.color = color;
    }
    public abstract void search();
}
