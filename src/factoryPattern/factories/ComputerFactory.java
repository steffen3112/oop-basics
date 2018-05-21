package factoryPattern.factories;

import factoryPattern.helper.Context;
import factoryPattern.helper.ContextReader;
import factoryPattern.products.Computer;

public abstract class ComputerFactory {

    Context context = new ContextReader();

    public abstract Computer createComputer();

    protected String myReader(){
        return context.getContext();
    }
}
