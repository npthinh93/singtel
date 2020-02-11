package com.example.singtelassignment.model;

import java.util.stream.Stream;

public class SolutionService {

    public long countAnimalCanFly(Animal[] animals) {
        return Stream.of(animals).filter(animal -> animal instanceof FlyAnimal).count();

    }

    public long countAnimalCanWalk(Animal[] animals) {
        return Stream.of(animals).filter(animal -> animal instanceof WalkAnimal).count();
    }

    public long countAnimalCanSing(Animal[] animals) {
        return Stream.of(animals).filter(animal -> animal instanceof SingAnimal).count();
    }

    public long countAnimalCanSwim(Animal[] animals) {
        return Stream.of(animals).filter(animal -> animal instanceof SwimAnimal).count();
    }
}
