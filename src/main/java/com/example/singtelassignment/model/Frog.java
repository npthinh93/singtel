package com.example.singtelassignment.model;

public class Frog extends Animal implements SwimAnimal, WalkAnimal {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
