package statePattern.states;

import statePattern.context.MeasuringStation;

public class CarMeasured implements MeasuringStates {

    private MeasuringStation measuringStation;

    public CarMeasured(MeasuringStation measuringStation) {
        this.measuringStation = measuringStation;
    }

    @Override
    public void requestCar() {
        System.out.println("--Station already occupied--");
    }

    @Override
    public void measureCar() {
        System.out.println("--Car already measured. No need to measure again.--");
    }

    @Override
    public void releaseCar() {
        System.out.println("**...takes some time to put car back in line**");
        measuringStation.setState(new CarNotInPlace(measuringStation));
    }
}
