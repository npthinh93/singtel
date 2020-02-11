package com.example.singtelassignment.model;

public class Dog extends Animal implements SoundAnimal {
    @Override
    public void sound() {
        System.out.println("Woof, woof");
    }
}
