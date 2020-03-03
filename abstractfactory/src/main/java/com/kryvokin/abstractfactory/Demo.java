package com.kryvokin.abstractfactory;

import com.kryvokin.abstractfactory.furniturefactory.ModernFactory;
import com.kryvokin.abstractfactory.furniturefactory.VintageFactory;
import com.kryvokin.abstractfactory.furnitureproducts.sofa.Sofa;

public class Demo {

    public static void main(String[] args) {
        Catalog moderCatalog = new Catalog(new ModernFactory());
        System.out.println(moderCatalog.createChair().getStyle());

        Catalog vintageCatalog = new Catalog(new VintageFactory());
        Sofa vintageSofa = vintageCatalog.createModerOrthopedicSofa();
        System.out.println(vintageSofa.isOrthopedic());
    }
}
