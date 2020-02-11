package com.example.singtelassignment.model;

public class Butterfly extends Animal implements FlyAnimal, MetamorphosisState {//Singleton
    private static Butterfly instance = new Butterfly();

    private Butterfly() {
    }

    public static Butterfly instance() {
        return instance;
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void metamorphosis(ButterflyContext butterflyContext) {
        System.out.println("I am Butterfly");
    }
}
