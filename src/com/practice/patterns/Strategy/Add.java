package com.practice.patterns.Strategy;

public class Add implements StrategyPattern {

    @Override
    public int operation(int x, int y) {

        return x + y;
    }
    
}