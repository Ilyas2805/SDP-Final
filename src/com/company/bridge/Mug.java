package com.company.bridge;

public class Mug extends Gift{

    public Mug(Color color){
        super(color);
    }

    @Override
    public void search() {
        System.out.println("mug");
    }
}
