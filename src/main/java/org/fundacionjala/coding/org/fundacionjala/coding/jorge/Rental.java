package org.fundacionjala.coding.org.fundacionjala.coding.jorge;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(MovieNewRelease movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Rental(MovieRegular movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Rental(MovieChildren movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
}
