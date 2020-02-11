package com.example.singtelassignment.model;

public class Dog extends Animal implements SoundAnimal {
    private String sound = "Woof, woof";

    @Override
    public void sound() {
        System.out.println("Woof, woof");
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
