package com.practice.patterns.Command;

public class Stock {
    
    private String name = "name";
    private int quantity = 0;

    public void buy() {
        //Do something
        System.out.println("BUY");
    }

    public void sell() {
        System.out.println("SELL");
    }
}