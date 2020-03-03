package com.kryvokin.factorymethod.furniture;

import com.kryvokin.factorymethod.furniture.products.FurnitureProduct;
import com.kryvokin.factorymethod.furniture.products.Sofa;
import org.springframework.stereotype.Component;

@Component
public class SofaCreator implements FurnitureFactory {

    @Override
    public FurnitureProduct createFurniture() {
        return new Sofa();
    }
}
