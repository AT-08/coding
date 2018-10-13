package org.fundacionjala.coding.dennis;

/**
 *
 */
public enum PriceCode {
    CHILDRENS(1.5f),
    REGULAR(2.0f),
    NEW_RELEASE(3.0f);
    private final float prCd;

    /**
     *
     * @param prCd price code.
     */
    PriceCode(float prCd) {
        this.prCd = prCd;
    }

    /**
     *
     * @return price code.
     */
    public float getValue() {
        return this.prCd;
    }
}
