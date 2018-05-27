package statePattern.context;

import statePattern.states.MeasuringStates;

public class MeasuringStation {

    private MeasuringStates currentState;
    private String name;

    public MeasuringStation(String name) {
        this.name = name;
    }

    public void setState(MeasuringStates nextState) {
        this.currentState = nextState;
    }

    public void getCar() {
        currentState.requestCar();
    }

    public void startMeasurment() {
        currentState.measureCar();
    }

    public void forwardCar()  {
        currentState.releaseCar();
    }

    @Override
    public String toString() {
        return "MeasuringStation{" +
                "name='" + name + '\'' +
                '}';
    }
}
