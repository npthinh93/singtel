package com.example.singtelassignment.model;

public class ButterflyContext {
    private MetamorphosisState metamorphosisState;

    public ButterflyContext(MetamorphosisState metamorphosisState) {
        super();
        this.metamorphosisState = metamorphosisState;
        if (metamorphosisState == null) {
            this.metamorphosisState = Caterpillar.instance();
        }
    }

    public MetamorphosisState getMetamorphosisState() {
        return metamorphosisState;
    }

    public void setMetamorphosisState(MetamorphosisState metamorphosisState) {
        this.metamorphosisState = metamorphosisState;
    }

    public void update() {
        metamorphosisState.metamorphosis(this);
    }
}
