package com.detroitlabs.swapi.Service;

import com.detroitlabs.swapi.Model.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieServiceTest {

    private MovieService movieService;

    @Before
    public void create() {
        movieService = new MovieService();
    }

    @Test
    public void fetchMovie() {
        Movie movie = movieService.fetchMovie();
        String expectedReult = "The Empire Strikes Back";
        String resultOfMethodCall = movie.getTitle();

        assertEquals(expectedReult, resultOfMethodCall);
    }

    @Test
    public void fetchCharacter() {
    }

    @Test
    public void fetchHomeWorld() {
    }
}