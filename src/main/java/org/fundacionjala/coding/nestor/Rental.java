package org.fundacionjala.coding.nestor;

import java.util.ArrayList;
import java.util.List;

public class Rental {
    private List<Movie> movieList = new ArrayList<>();
    private int daysRented;
    private int frequentRenterPoints;

    public Rental(int daysRented) {
        this.daysRented = daysRented;
        this.frequentRenterPoints = 0;
    }

    public void addMovie(Movie movie) {
        this.movieList.add(movie);
    }

    public double getCharge() {
        double charge = 0;

        for (Movie item : this.movieList) {
            charge += item.getPrice(this.daysRented);
            if (item.getMovieType() == MovieType.NEW_RELEASE && daysRented > 1) {
                frequentRenterPoints++;
            }
            frequentRenterPoints++;
        }

        return charge;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }


}