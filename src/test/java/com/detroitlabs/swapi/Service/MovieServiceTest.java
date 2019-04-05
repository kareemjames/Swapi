package com.detroitlabs.swapi.Service;

import com.detroitlabs.swapi.Model.HomeWorld;
import com.detroitlabs.swapi.Model.Movie;
import com.detroitlabs.swapi.Model.Character;
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
        String expectedResult = "The Empire Strikes Back";
        String resultOfMethodCall = movie.getTitle();

        assertEquals(expectedResult, resultOfMethodCall);
    }

    @Test
    public void fetchCharacter() {
        Character character = movieService.fetchCharacter("https://swapi.co/api/people/1/");
        String expectedResult = "Luke Skywalker";
        String resultOfMethodCall = character.getName();

        assertEquals(expectedResult, resultOfMethodCall);
    }

    @Test
    public void fetchHomeWorld() {
        HomeWorld homeWorld = movieService.fetchHomeWorld("https://swapi.co/api/planets/1/");
        String expectedResult = "Tatooine";
        String resultOfMethodCall = homeWorld.getName();

        assertEquals(expectedResult, resultOfMethodCall);
    }
}