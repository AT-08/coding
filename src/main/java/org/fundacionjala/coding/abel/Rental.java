package org.fundacionjala.coding.abel;

public final class Rental {
    private Customer customer;
    private String bill;
    private double totalAmount;
    private int totalFRP;

    Rental(final Customer customer) {
        this.customer = customer;
        totalAmount = 0;
        totalFRP = 0;
        calculateFrequentRenterPoints();
        calculateAmount();
        makeBill();
    }

    private void calculateAmount() {
        for (Movie movie : customer.getMovies()) {
            totalAmount += movie.getCharge();
        }
    }

    double getTotalAmount() {
        return totalAmount;
    }
  private void calculateFrequentRenterPoints() {
        for (Movie movie : customer.getMovies()) {
            totalFRP += movie.getFrequentRenterPoints();
        }
    }

    private void makeBill() {
        StringBuilder builder = new StringBuilder(String.format("Rental Record for: %s %n", customer.getName()));
        for (Movie movie : customer.getMovies()) {
            builder.append(String.format("\t%s\t", movie.getTitle()));
            builder.append(String.format("%s %n", String.valueOf(movie.getCharge())));
        }
        builder.append(String.format("Amount owed is %s %n", String.valueOf(getTotalAmount())));
        builder.append(String.format("You earned %s frequent renter points %n", String.valueOf(getTotalFRP())));
        this.bill = builder.toString();
    }

    public String getBill() {
        return bill;
    }

    int getTotalFRP() {
        return totalFRP;
    }
}