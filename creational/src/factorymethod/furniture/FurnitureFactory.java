package factorymethod.furniture;

import factorymethod.furniture.products.Chair;
import factorymethod.furniture.products.FurnitureProduct;
import factorymethod.furniture.products.Sofa;

public abstract class FurnitureFactory {

    public String getName() {
        FurnitureProduct furnitureProduct = createFurniture();
        return furnitureProduct.getName();
    }

    abstract FurnitureProduct createFurniture();

    // static approach

    public FurnitureProduct createFurniture(String className) {
        switch (className){
            case "cair": return new Chair();
            case "sofa": return  new Sofa();
            default: return new Sofa();
        }
    }
}
