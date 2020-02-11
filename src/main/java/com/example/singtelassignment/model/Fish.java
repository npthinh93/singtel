package com.example.singtelassignment.model;

public class Fish extends Animal implements SwimAnimal {
    private String size;
    private String color;
    private boolean isEatFish;
    private boolean isJoke;

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEatFish() {
        return isEatFish;
    }

    public void setEatFish(boolean eatFish) {
        isEatFish = eatFish;
    }

    public boolean isJoke() {
        return isJoke;
    }

    public void setJoke(boolean joke) {
        isJoke = joke;
    }
}
