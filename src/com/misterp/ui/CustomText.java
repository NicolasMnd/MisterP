package com.misterp.ui;

public class CustomText extends GraphicalUnit {

    private final String text;

    public CustomText(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

}
