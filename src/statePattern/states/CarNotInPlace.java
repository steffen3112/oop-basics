package statePattern.states;

import statePattern.context.MeasuringStation;

public class CarNotInPlace implements MeasuringStates {

    private MeasuringStation measuringStation;

    public CarNotInPlace(MeasuringStation measuringStation) {
        this.measuringStation = measuringStation;
    }

    @Override
    public void requestCar() {
        System.out.println("**...immediatly requesting a car. Waiting for free station**");
        measuringStation.setState(new CarInPlace(measuringStation));
    }

    @Override
    public void measureCar() {
        System.out.println("--Car already on way back. No measuring possible anymore--");
    }

    @Override
    public void releaseCar() {
        System.out.println("--Car already back in line.--");
    }
}
