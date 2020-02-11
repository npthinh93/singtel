package com.example.singtelassignment.model;

public class Parrot extends Animal implements SoundAnimal {
    private Animal animalWith;

    public Parrot() {
    }

    public Parrot(Animal animalWith) {
        this.animalWith = animalWith;
    }

    @Override
    public void sound() {
        if (this.animalWith instanceof SoundAnimal) {
            SoundAnimal soundAnimal = (SoundAnimal) this.animalWith;
            soundAnimal.sound();
        }
    }
}
