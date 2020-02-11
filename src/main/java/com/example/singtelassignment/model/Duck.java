package com.example.singtelassignment.model;

public class Duck extends BirdAbstraction implements UnderWaterAnimal {
    @Override
    public void sound() {
        System.out.println("Quack, quack");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
