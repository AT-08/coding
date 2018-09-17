

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    
    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        int daysRentered=0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        System.out.println("Rental Record for " + getName());
        
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            daysRentered=each.getDaysRented();
            thisAmount = each.getMovie().calculateAmount(daysRentered);
            System.out.println(each.getMovie().getTitle()+"\t"+"\t"+thisAmount);
            // add frequent renter points
            frequentRenterPoints++;
            frequentRenterPoints=frequentRenterPoints+each.getMovie().getFrequentPoints(daysRentered);
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }
}
