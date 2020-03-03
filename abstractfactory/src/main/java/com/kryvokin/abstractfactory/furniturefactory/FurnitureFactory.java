package com.kryvokin.abstractfactory.furniturefactory;

import com.kryvokin.abstractfactory.furnitureproducts.chair.Chair;
import com.kryvokin.abstractfactory.furnitureproducts.sofa.Sofa;

public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa(boolean orthopedic);

}
