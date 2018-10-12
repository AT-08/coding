package org.fundacionjala.coding.abel;


public class Customer {
    private String name;
    private Rental rental;

    public Customer(final String name) {
        this.name = name;
    }

    public String getCustomerName() {
        return this.name;
    }

    public void createRental(int daysRented) {
        rental = new Rental(daysRented);
    }


    public void addMovie(final Movie movie) {
        rental.addMovie(movie);
    }
}