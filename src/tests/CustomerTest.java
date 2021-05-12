package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Customer;
import main.Movie;
import main.Rental;

class CustomerTest {

    @Test
    void addRentalTest() {
        Customer customer = new Customer("Test");
        Movie movie = new Movie("movie 1", 0);
        Rental rental = new Rental(movie, 30);
        customer.addRental(rental);
        Assertions.assertEquals(1, customer.rentals.size());
    }

    @Test
    void statementTest() {
        String result;

        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);

        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);

        Customer c1 = new Customer("joe");

        c1.addRental(r1);
        c1.addRental(r2);

        result = "Rental Record for joe\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tmovie1\t\t10\t30.0\n" +
                "\tmovie2\t\t5\t4.5\n" +
                "Amount owed is 34.5\n" +
                "You earned 3 frequent renter points";

        Assertions.assertEquals( result , c1.statement()) ;
    }

}
