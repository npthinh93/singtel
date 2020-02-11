package com.example.singtelassignment.model;

public class Rooster extends Animal implements SoundAnimal {
    @Override
    public void sound() {
        System.out.println("Cock-a-doodle-doo");
    }
}
