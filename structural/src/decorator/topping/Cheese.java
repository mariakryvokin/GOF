package decorator.topping;

public class Cheese implements Topping {

    private String name;
    private  double price;

    public Cheese(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
