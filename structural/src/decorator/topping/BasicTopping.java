package decorator.topping;

public class BasicTopping implements Topping {
    @Override
    public String getName() {
        return "Basic topping ";
    }

    @Override
    public double getPrice() {
        return 4d;
    }
}
