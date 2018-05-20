package decoratorPattern.decorators;

import decoratorPattern.components.Drink;

public class MilkDecorator extends Decorator {


    private static final String DESCRIPTION = "Irish Coffee Milk";
    private static final double MILK_PRICE = 0.20;
    public static final double MILK_TAX = 0.2;

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
    public MilkDecorator(Drink drink){
        this.drink = drink;
    }

    //=============================================================
    //~Overrides
    @Override
    public double calculatePrice() {
        System.out.println("dynamic polymorphism for the win!!!!");
        return drink.calculatePrice() + MILK_PRICE*(1+MILK_TAX);
    }
}
