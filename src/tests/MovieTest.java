package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Movie;

class MovieTest {

    @Test
    void setPriceCodeTest() {
        Movie movie = new Movie("movie 1", 1);
        Movie movie2 = new Movie("movie 2", 0);
        movie.setPriceCode(0);
        Assertions.assertEquals(0, movie.getPriceCode());
        movie2.setPriceCode(2);
        Assertions.assertEquals(2, movie2.getPriceCode());
    }

    @Test
    void getTitleTest() {
        Movie movie = new Movie("movie 1", 1);
        Assertions.assertEquals("movie 1", movie.getTitle());
    }

}
