package com.kryvokin.abstractfactory;

import com.kryvokin.abstractfactory.furniturefactory.FurnitureFactory;
import com.kryvokin.abstractfactory.furnitureproducts.chair.Chair;
import com.kryvokin.abstractfactory.furnitureproducts.sofa.Sofa;

public class Catalog {

    private FurnitureFactory furnitureFactory;

    public Catalog(FurnitureFactory furnitureFactory){
        this.furnitureFactory = furnitureFactory;
    }

    public Sofa createModerOrthopedicSofa(){
        return furnitureFactory.createSofa(true);
    }

    public  Chair createChair(){
        return furnitureFactory.createChair();
    }

}
