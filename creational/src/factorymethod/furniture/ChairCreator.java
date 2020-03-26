package factorymethod.furniture;


import factorymethod.furniture.products.Chair;
import factorymethod.furniture.products.FurnitureProduct;

public class ChairCreator extends FurnitureFactory {

    @Override
    public FurnitureProduct createFurniture() {
        return new Chair();
    }
}
