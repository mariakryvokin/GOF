package decorator;

public class PizzaBasicDecorator implements Pizza {

    private Pizza pizza;

    public PizzaBasicDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }



}
