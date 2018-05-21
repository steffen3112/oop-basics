package factoryPattern.factories;

import factoryPattern.products.Computer;
import factoryPattern.products.GamingPc;

public class GamingPcFactory extends ComputerFactory {

    @Override
    public Computer createComputer() {
        return new GamingPc(myReader());
    }
}
