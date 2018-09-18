package org.fundacionjala.coding.nestor;

/**
 * This abstract Movie Class allow implement get Price depends on Movie Type
 */

public abstract class Movie {
    private String title;
    private MovieType movieType;

    public Movie(String title, MovieType movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    public String getTitle() {
        return title;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public abstract double getPrice(int daysRented);
}
