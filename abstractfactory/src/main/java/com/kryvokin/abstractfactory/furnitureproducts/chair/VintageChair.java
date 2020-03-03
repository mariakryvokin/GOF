package com.kryvokin.abstractfactory.furnitureproducts.chair;

public class VintageChair implements Chair {

    private final String style = "Vintage";

    @Override
    public String getStyle() {
        return style;
    }
}
