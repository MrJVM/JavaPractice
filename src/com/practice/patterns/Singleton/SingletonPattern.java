package com.practice.patterns.Singleton;

public class SingletonPattern {
    

    private static SingletonPattern singleton = new SingletonPattern(); //Only one will ever be created!

    private SingletonPattern(){

    }

    public static SingletonPattern getInstance(){
        return singleton;
    }
}