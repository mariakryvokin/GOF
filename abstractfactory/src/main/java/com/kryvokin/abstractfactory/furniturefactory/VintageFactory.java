package com.kryvokin.abstractfactory.furniturefactory;

import com.kryvokin.abstractfactory.furnitureproducts.chair.Chair;
import com.kryvokin.abstractfactory.furnitureproducts.chair.VintageChair;
import com.kryvokin.abstractfactory.furnitureproducts.sofa.Sofa;
import com.kryvokin.abstractfactory.furnitureproducts.sofa.VintageSofa;

public class VintageFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Sofa createSofa(boolean orthopedic) {
        return new VintageSofa(orthopedic);
    }
}
