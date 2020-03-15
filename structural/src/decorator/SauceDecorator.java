package decorator;

import decorator.topping.Sauce;

public class SauceDecorator extends PizzaBasicDecorator {

    private Sauce sauce;

    public SauceDecorator(Pizza pizza, Sauce sauce) {
        super(pizza);
        this.sauce = sauce;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "  Sauce " + sauce.getName() + " was added";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + sauce.getPrice();
    }

}
