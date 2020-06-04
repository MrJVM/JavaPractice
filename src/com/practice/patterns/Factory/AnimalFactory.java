package com.practice.patterns.Factory;

public class AnimalFactory {
    

    public Animal getAnimal(AnimalsTypes animalType) {

        if(animalType == null) return null;

        switch(animalType){
            case DOG: 
                return new Dog();
            case CAT:
                return new Cat();
            default:
                return null;
        }

    }
}