package decoratorPattern.decorators;

import decoratorPattern.components.Drink;

public abstract class Decorator extends Drink {

    public abstract String getDescription();

    public double calculateTax(Drink drink){
        return drink.calculatePrice()*(1+0.2);
    }

}
