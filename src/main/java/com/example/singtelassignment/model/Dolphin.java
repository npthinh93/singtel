package com.example.singtelassignment.model;

public class Dolphin extends Animal implements SwimAnimal {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
