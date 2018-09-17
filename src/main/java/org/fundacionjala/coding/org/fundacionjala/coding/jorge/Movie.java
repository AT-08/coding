package org.fundacionjala.coding.org.fundacionjala.coding.jorge;

public abstract class Movie {
    private String _title;
    private PriceCode _priceCode;
    private int frequentRenterPoints;
    public Movie(String title) {
        _title = title;
    }

    public PriceCode getPriceCode() {
        return get_priceCode();
    }

    public void setPriceCode(PriceCode arg) {
        set_priceCode(arg);
    }

    public String getTitle() {
        return _title;
    }

    public PriceCode get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(PriceCode _priceCode) {
        this._priceCode = _priceCode;
    }

    public int getFrequentPoints(int nDays)
    {
        return this.frequentRenterPoints;
    }

    public abstract double calculateAmount(int nDays);

    public void setFrequentPoints() {
        frequentRenterPoints++;
    }

}
