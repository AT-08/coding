package org.fundacionjala.coding.abel;

import java.util.ArrayList;
import java.util.List;

public class Rental {

    private List<Movie> movieList = new ArrayList<>();

    private int daysRented;

    public Rental(final int daysRented) {
        this.daysRented = daysRented;
    }

    public void addMovie(final Movie movie) {
        movie.setDaysRented(daysRented);
        this.movieList.add(movie);
    }

    public double calculateCharge() {
        double charge = 0;

        for (Movie item : this.movieList) {
            charge += item.getPrice();
        }

        return charge;
    }

    public int calculateRenterPoints() {
        int renterPoints = 0;

        for (Movie item : this.movieList) {
            renterPoints += item.getRenterPoints();
        }

        return renterPoints;
    }

}