package com.kryvokin.abstractfactory.furnitureproducts.chair;

public class ModernChair implements  Chair {

    private final String style = "Modern";

    @Override
    public String getStyle() {
        return style;
    }
}
