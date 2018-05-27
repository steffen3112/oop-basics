package statePattern.states;

import statePattern.context.MeasuringStation;

public class CarInPlace implements MeasuringStates {

    private MeasuringStation measuringStation;

    public CarInPlace(MeasuringStation measuringStation) {
        this.measuringStation = measuringStation;
    }

    @Override
    public void requestCar() {
        System.out.println("--Not possible. Car already requested.--");
    }

    @Override
    public void measureCar() {
        System.out.println("**Starting to measure Car**");
        measuringStation.setState(new CarMeasured(measuringStation));

    }

    @Override
    public void releaseCar() {
        System.out.println("--Not possible. First inspect the car!--");
    }
}
