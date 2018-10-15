package org.fundacionjala.coding.abel;


import java.util.ArrayList;
import java.util.List;

public final class Customer {
    private String name;
    private List<Movie> movies = new ArrayList<>();

    Customer(final String name) {
        this.name = name;
    }

    void addMovie(final Movie movie) {
        movies.add(movie);
    }

    String getName() {
        return name;
    }

    List<Movie> getMovies() {
        return movies;
    }
}