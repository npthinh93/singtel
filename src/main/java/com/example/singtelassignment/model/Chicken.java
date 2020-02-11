package com.example.singtelassignment.model;

public class Chicken extends Animal implements SoundAnimal {
    @Override
    public void sound() {
        System.out.println("Cluck, cluck");
    }
}
