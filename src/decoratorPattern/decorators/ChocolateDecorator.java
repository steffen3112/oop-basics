package decoratorPattern.decorators;

import decoratorPattern.components.Drink;

public class ChocolateDecorator extends Decorator {

    private  final String DESCRIPTION = "Swedish Chocholate-sauce";
    private static final double CHOCOLATE_PRICE = 0.30;

    //~Instance Fields
    //=============================================================
    Drink drink;

    //~Getters
    //=============================================================
    public String getDescription() {
        return DESCRIPTION;
    }

    //~Constructors
    //=============================================================
    public ChocolateDecorator(Drink drink){
        this.drink = drink;
    }

    //=============================================================
    //~Overrides
    @Override
    public double calculatePrice() {
        System.out.println("putting chocolate to" + drink.getDescription() + this.getDescription());

        return this.drink.calculatePrice() + CHOCOLATE_PRICE;
    }
}
