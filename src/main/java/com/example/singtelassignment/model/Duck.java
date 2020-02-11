package com.example.singtelassignment.model;

public class Duck extends Animal implements SwimAnimal, SoundAnimal {
    @Override
    public void sound() {
        System.out.println("Quack, quack");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
