package org.fundacionjala.coding.rodrigo.movierefactor;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for customer.
 */
public final class Customer {
    private String name;
    private List<Movie> movies;

    /**
     * Constructor.
     *
     * @param name Input name.
     */
    Customer(final String name) {
        this.name = name;
        movies = new ArrayList<>();
    }

    /**
     * Add movie.
     *
     * @param movie input movie.
     */
    void addMovie(final Movie movie) {
        movies.add(movie);
    }

    /**
     * Getter.
     *
     * @return name.
     */
    String getName() {
        return name;
    }

    /**
     * Getter.
     *
     * @return Get the list.
     */
    List<Movie> getMovies() {
        return movies;
    }
}
