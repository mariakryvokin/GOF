package com.kryvokin.factorymethod.furniture;

import com.kryvokin.factorymethod.furniture.products.FurnitureProduct;
import org.springframework.stereotype.Component;

@Component
public interface FurnitureFactory {

     default String getName(){
        FurnitureProduct furnitureProduct = createFurniture();
        return furnitureProduct.getName();
    }

    FurnitureProduct createFurniture();
}
