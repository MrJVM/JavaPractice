package com.practice.patterns.Command;

public class SellStock implements Order{

    private Stock stock;

    public SellStock(Stock s){
        stock = s;
    }

    @Override
    public void execute() {
        stock.buy();

    }
    

}