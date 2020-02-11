package com.example.singtelassignment.model;

public class Bird extends Animal implements SkyAnimal, SingAnimal {

    @Override
    public void sing() {
        System.out.println("I am singing");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
