package com.detroitlabs.swapi.Controller;

import com.detroitlabs.swapi.Model.Character;
import com.detroitlabs.swapi.Model.Movie;
import com.detroitlabs.swapi.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieController {

    @Autowired
    MovieService movieService;

    @RequestMapping("/")
    public String fetchMovie(ModelMap modelMap) {
        Movie singleMovie = movieService.fetchMovie();
        List<String> charactersURLS = movieService.fetchMovie().getCharacters();
        List<Character> characters = new ArrayList<>();
        for (String characterURL: charactersURLS) {
            Character newCharacter = movieService.fetchCharacter(characterURL);

            characters.add(newCharacter);
        }

        modelMap.put("characters", characters);
        modelMap.put("singleMovie", singleMovie);
        return "index";
    }



}
