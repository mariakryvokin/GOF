package decorator;

import decorator.topping.Cheese;

public class CheeseDecorator extends PizzaBasicDecorator {

    private Cheese cheese;

    public CheeseDecorator(Pizza pizza, Cheese cheese) {
        super(pizza);
        this.cheese = cheese;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Cheese " + cheese.getName() + " was added";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + cheese.getPrice();
    }

}
