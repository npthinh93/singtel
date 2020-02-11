package com.example.singtelassignment.model;

public class Bird extends Animal implements FlyAnimal, SingAnimal, WalkAnimal {

    @Override
    public void sing() {
        System.out.println("I am singing");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
