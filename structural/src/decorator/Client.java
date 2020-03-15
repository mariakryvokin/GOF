package decorator;

import decorator.topping.BasicTopping;
import decorator.topping.Cheese;
import decorator.topping.Sauce;

public class Client {

    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza(new BasicTopping());
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getPrice());
        Pizza pizzaWithCheese = new CheeseDecorator(basicPizza, new Cheese("Tasty", 1d));
        System.out.println(pizzaWithCheese.getDescription());
        System.out.println(pizzaWithCheese.getPrice());
        Pizza pizzaWithCheeseAndSauce = new SauceDecorator(pizzaWithCheese, new Sauce("Yammy", 2d));
        System.out.println(pizzaWithCheeseAndSauce.getDescription());
        System.out.println(pizzaWithCheeseAndSauce.getPrice());



    }
}
