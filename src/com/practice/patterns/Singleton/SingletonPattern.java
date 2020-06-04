package com.practice.patterns.Singleton;

public class SingletonPattern {
    

    private static SingletonPattern singleton = new SingletonPattern(); //Only one will ever be created!

    private SingletonPattern() { //Importanrt the constructor must be private to avoid creating new instances

    }

    public static SingletonPattern getInstance(){
        return singleton;
    }
}