package com.kryvokin.abstractfactory.furniturefactory;

import com.kryvokin.abstractfactory.furnitureproducts.chair.Chair;
import com.kryvokin.abstractfactory.furnitureproducts.chair.ModernChair;
import com.kryvokin.abstractfactory.furnitureproducts.sofa.ModernSofa;
import com.kryvokin.abstractfactory.furnitureproducts.sofa.Sofa;

public class ModernFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa(boolean orthopedic) {
        return new ModernSofa(orthopedic);
    }
}
