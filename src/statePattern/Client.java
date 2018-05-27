package statePattern;

import statePattern.context.MeasuringStation;
import statePattern.states.CarInPlace;
import statePattern.states.MeasuringStates;

public class Client {

    public static void main(String[] args) {

        int x = 0;

        //Context Object
        MeasuringStation myMeasuringStation = new MeasuringStation("VA 2300");
        System.out.println(myMeasuringStation.toString());

        //Set intial State Objects
        MeasuringStates carInPlace = new CarInPlace(myMeasuringStation);
        myMeasuringStation.setState(carInPlace);

        //state transitions
        do {
            myMeasuringStation.startMeasurment();
            myMeasuringStation.forwardCar();
            myMeasuringStation.getCar();
            x++;
        } while (x < 10);

        //wrong state transitions
        myMeasuringStation.getCar();
        myMeasuringStation.forwardCar();

        //
        myMeasuringStation.startMeasurment();
        myMeasuringStation.getCar();
        myMeasuringStation.startMeasurment();
        myMeasuringStation.forwardCar();


    }
}
