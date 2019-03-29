package com.detroitlabs.swapi.Controller;

import com.detroitlabs.swapi.Model.Movie;
import com.detroitlabs.swapi.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

    @Autowired
    MovieService movieService;

    @RequestMapping("/")
    public String fetchMovie(ModelMap modelMap) {
        Movie singleMovie = movieService.fetchMovie();
        modelMap.put("singleMovie", singleMovie);
        return "index";
    }
}
