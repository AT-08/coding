package org.fundacionjala.coding.nestor;

public class Customer {
    private String name;
    private Rental rental;

    public Customer(String name) {
        this.name = name;
    }

    public void createRental(int daysRented) {
        rental = new Rental(daysRented);
    }

    public void addMovie(Movie movie) {
        rental.addMovie(movie);
    }
    
    public String statement() {
        String result = "Rental Record for " + name + "\n";
        result += "Amount owed is " + String.valueOf(rental.getCharge()) +
                "\n";
        result += "You earned " + String.valueOf(rental.getFrequentRenterPoints())
                +
                " frequent renter points";
        return result;
    }
}
