package org.fundacionjala.coding.nestor;

public class Main {
    public static void main(String[] args) {
        Movie terminator = new RegularMovie("Terminator");
        Movie srek = new ChildrenMovie("Srek");
        Movie frozen = new ChildrenMovie("Frozen");
        Movie goldFather = new RegularMovie("The Gold Father");
        Movie chicago = new RegularMovie("Chicago");
        Movie ralph = new NewReleaseMovie("Ralph breaks the Internet");

        Customer customer = new Customer("Katerina Anzoleaga");
        customer.createRental(3);
        customer.addMovie(terminator);
        customer.addMovie(chicago);
        customer.addMovie(srek);
        customer.addMovie(frozen);
        customer.addMovie(ralph);
        System.out.println(customer.statement());
    }
}
