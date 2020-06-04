package com.practice.patterns.Command;

public class BuyStock implements Order{
    
    private Stock stock;

    public BuyStock(Stock s) {
        stock = s;
    }

    @Override
    public void execute() {
        stock.buy();

    }

}