package interfacebased;

public class Client {

    public static void main(String[] args) {
        Builder carBuilder = new CarBuilder();
        Director director = new Director();
        director.createBMWCar(carBuilder);
        System.out.println(((CarBuilder) carBuilder).getProduct().getModel());

        Builder manualBuilder = new CarBuilder();
        director.createBMWCarManual(manualBuilder);
        System.out.println(((CarBuilder) manualBuilder).getProduct().getModel());
    }
}
