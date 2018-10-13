package org.fundacionjala.coding.dennis;

/**
 *
 */
final class Main {

    public static final int THREE = 3;

    /**
     *
     */
    private Main() {
    }

    /**
     *
     * @param args Main.
     */
    public static void main(final String[] args) {
        Customer customer = new Customer("Dennis");
        customer.addRental(new Rental(new MovieNewRelease("First Man"), 2));
        customer.addRental(new Rental(new MovieRegular("Frost Vs Nixon"), 2));
        customer.addRental(new Rental(new MovieChildren("UP"), 2));
        customer.addRental(new Rental(new MovieNewRelease("The favourite"), THREE));
        customer.statement();
        System.out.println("Bolsa tama�o: ".concat(Integer.toString(customer.capacityRentalElements())));
        System.out.println("Elementos en bolsa: ".concat(Integer.toString(customer.numRentalElements())));
    }
}
