package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Movie;
import main.Rental;

class RentalTest {

    @Test
    void getDaysRentedTest() {
        Movie movie = new Movie("abc", 2);
        Rental rental = new Rental(movie, 20);
        Assertions.assertEquals(20, rental.getDaysRented());
    }

    @Test
    void getMovieTest() {
        Movie movie = new Movie("abc", 2);
        Rental rental = new Rental(movie, 20);
        Assertions.assertEquals(movie, rental.getMovie());
    }

}
