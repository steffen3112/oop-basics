package decoratorPattern;

import decoratorPattern.components.Coffee;
import decoratorPattern.components.Drink;
import decoratorPattern.decorators.ChocolateDecorator;
import decoratorPattern.decorators.Decorator;
import decoratorPattern.decorators.MilkDecorator;

public class Client {

    public static void main(String[] args){

        /*
         * As you can see, for the Client it can become very verbose to create all the decorators.
         * This issue can be solved by the factory or builder pattern
         */
        Drink myCoffee = new Coffee();
        System.out.println("Plain Coffe, please pay: " + myCoffee.calculatePrice() + "€");

        Drink myDecoratedCoffeeWithMilk = new MilkDecorator(new Coffee());
        double decoratedPrice1 = myDecoratedCoffeeWithMilk.calculatePrice();
        System.out.println("Coffee with milk, pay: " + decoratedPrice1 + "€");

        double decoratedPriceWithTax = ((Decorator) myDecoratedCoffeeWithMilk).calculateTax(myDecoratedCoffeeWithMilk);
        System.out.println("Coffee with milk, bill + tax: " + decoratedPriceWithTax + "€");

        Drink myDecoratedCoffeWithChocolate = new ChocolateDecorator(myDecoratedCoffeeWithMilk);
        double decoratedPrice2 = myDecoratedCoffeWithChocolate.calculatePrice();
        System.out.println("Coffee with milk and chocolate, pay: " + decoratedPrice2 + "€");

        //Coffe with Double chocolate
        Drink myDoubleChocolateCoffee = new ChocolateDecorator(new ChocolateDecorator(new Coffee()));
        System.out.println("Double Chocolate-Coffee Price: " + myDoubleChocolateCoffee.calculatePrice());
    }
}
