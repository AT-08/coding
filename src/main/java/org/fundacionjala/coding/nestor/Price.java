package org.fundacionjala.coding.nestor;

public abstract class Price {
    abstract MovieCode getPriceCode();
    abstract double getCharge(int daysRented);
}
