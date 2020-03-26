package factorymethod.furniture;

public class Demo {


    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new SofaCreator();
        System.out.println(furnitureFactory.getName());
        furnitureFactory = new ChairCreator();
        System.out.println(furnitureFactory.getName());

        // static factory method
        furnitureFactory.createFurniture("chair");
        System.out.println(furnitureFactory.getName());
    }

}
