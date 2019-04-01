package com.detroitlabs.swapi.Service;

import com.detroitlabs.swapi.Model.HomeWorld;
import com.detroitlabs.swapi.Model.Movie;
import com.detroitlabs.swapi.Model.Character;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieService {

    public Movie fetchMovie(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.USER_AGENT, "spring");

        ResponseEntity<Movie> response = restTemplate.exchange("https://swapi.co/api/films/2/?format=json",
                HttpMethod.GET, new HttpEntity<>(headers), Movie.class);
        return response.getBody();
    }

    public Character fetchCharacter(String characterURL) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.USER_AGENT, "spring");

        ResponseEntity<Character> response = restTemplate.exchange(characterURL + "?format=json", HttpMethod.GET, new HttpEntity<>(headers), Character.class);
        return response.getBody();
    }


    public HomeWorld fetchHomeWorld(String planetURL) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.USER_AGENT, "spring");

        ResponseEntity<HomeWorld> response = restTemplate.exchange(planetURL + "?format=json", HttpMethod.GET, new HttpEntity<>(headers), HomeWorld.class);
        return response.getBody();
    }

}
