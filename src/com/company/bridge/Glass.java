package com.company.bridge;

public class Glass extends Gift{

    public Glass(Color color){
        super(color);
    }
    @Override
    public void search() {
        System.out.println("glass");
    }
}
