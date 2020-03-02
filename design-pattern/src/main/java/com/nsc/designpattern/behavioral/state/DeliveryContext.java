package com.nsc.designpattern.behavioral.state;

// context - object whose behaviour changes
public class DeliveryContext {

    private State currentState;

    public DeliveryContext(State currentState) {
        this.currentState = currentState;

        if (currentState == null) {
            this.currentState = Acknowledged.getInstance();
        }
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void updatePackageState() {
        currentState.updateState(this);
    }
}
