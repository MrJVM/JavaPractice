package com.practice.patterns.Strategy;

public class Context {

    private StrategyPattern strategyPattern;

    public Context(StrategyPattern sPattern){
        strategyPattern = sPattern;
    }

    public int operation(int x, int y){
        
        return strategyPattern.operation(x, y);
    }
    
}