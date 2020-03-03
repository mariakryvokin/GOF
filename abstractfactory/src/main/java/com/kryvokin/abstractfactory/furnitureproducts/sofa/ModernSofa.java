package com.kryvokin.abstractfactory.furnitureproducts.sofa;

public class ModernSofa implements Sofa {

    private boolean isOrthopedic;

    public ModernSofa(boolean isOrthopedic) {
        this.isOrthopedic = isOrthopedic;
    }

    @Override
    public boolean isOrthopedic() {
        return isOrthopedic;
    }
}
