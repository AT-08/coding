

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("SeniorX");
        customer.addRental(new Rental(new MovieNewRelease("Avengers"), 3));
        customer.addRental(new Rental(new MovieRegular("Wonder Woman"), 2));
        customer.addRental(new Rental(new MovieChildren("Triple X"), 3));
        System.out.println(customer.statement());
    }
}
