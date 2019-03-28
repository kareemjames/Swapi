package com.detroitlabs.swapi.Service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieService {

    public Movie fetchMovie() {

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject("https://swapi.co/api/films/5", Movie.class);
    }

}
