package com.kryvokin.abstractfactory.furnitureproducts.sofa;

public class VintageSofa implements Sofa {

    private boolean isOrthopedic;

    public VintageSofa(boolean isOrthopedic) {
        this.isOrthopedic = isOrthopedic;
    }

    @Override
    public boolean isOrthopedic() {
        return isOrthopedic;
    }

}
