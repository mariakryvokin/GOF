package factorymethod.furniture;


import factorymethod.furniture.products.FurnitureProduct;
import factorymethod.furniture.products.Sofa;

public class SofaCreator extends FurnitureFactory {

    @Override
    public FurnitureProduct createFurniture() {
        return new Sofa();
    }
}
