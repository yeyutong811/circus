package Circus.stuff;

import Circus.Asset;

public abstract class Equipment implements Asset { //implemented by value from interface
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() {
        return purchasePrice;
    }
}
