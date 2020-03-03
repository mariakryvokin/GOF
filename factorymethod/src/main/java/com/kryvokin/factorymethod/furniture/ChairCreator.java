package com.kryvokin.factorymethod.furniture;

import com.kryvokin.factorymethod.furniture.products.Chair;
import com.kryvokin.factorymethod.furniture.products.FurnitureProduct;
import org.springframework.stereotype.Component;

@Component
public class ChairCreator implements FurnitureFactory {

    @Override
    public FurnitureProduct createFurniture() {
        return new Chair();
    }
}
