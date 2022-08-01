package com.company.bridge;

public class MainBridge {
    public static void main(String[] args) {
        Gift gift = new Glass(new BlueColor());
        gift.color.fillColor();
        gift.search();

        Gift gift1 = new Mug(new RedColor());
        gift1.color.fillColor();
        gift1.search();

    }
}
