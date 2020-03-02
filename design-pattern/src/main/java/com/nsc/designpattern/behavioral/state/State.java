package com.nsc.designpattern.behavioral.state;

/**
 * According to GoF definition, a state allows an object to alter its behavior when its internal state changes
 * <p>
 * State design pattern has following participants
 * 1. State - either interface or abstract
 * 2. ConcreteState
 * 3. Context - is an object whose behaviour changes
 * <p>
 * Eg:
 * TV state (On/Off), Package or Order state, Mobile state (Vibration, Silent, Ring etc..)
 * <p>
 * NOTE: removes if-else block and reduces cyclomatic complexity and helps to follow open close principle
 */
public interface State {
    void updateState(DeliveryContext deliveryContext);
}
