package com.example.singtelassignment.model;

public class Cat extends Animal implements SoundAnimal{
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
