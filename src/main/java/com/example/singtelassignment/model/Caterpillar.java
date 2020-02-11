package com.example.singtelassignment.model;

public class Caterpillar implements WalkAnimal, MetamorphosisState {
    private static Caterpillar instance = new Caterpillar();

    private Caterpillar() {
    }

    public static Caterpillar instance() {
        return instance;
    }

    @Override
    public void metamorphosis(ButterflyContext butterflyContext) {
        butterflyContext.setMetamorphosisState(Butterfly.instance());
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
