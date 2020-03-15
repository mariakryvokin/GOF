package decorator;

import decorator.topping.BasicTopping;
import decorator.topping.Topping;

public class BasicPizza implements Pizza{

    private Topping toping;

    public BasicPizza(BasicTopping basicToping) {
        this.toping = basicToping;
    }

    @Override
    public String getDescription() {
        return "Basic pizza with " + toping.getName();
    }

    @Override
    public double getPrice() {
        return 4d + toping.getPrice();
    }

}
