package factoryPattern;

import factoryPattern.factories.ComputerFactory;
import factoryPattern.factories.GamingPcFactory;
import factoryPattern.helper.Context;
import factoryPattern.helper.ContextReader;
import factoryPattern.products.Computer;

public class Client {

    public static void main(String[] args){

        ComputerFactory myFactory = new GamingPcFactory();
        Computer myComputer = myFactory.createComputer();
        myComputer.play();

    }

}
