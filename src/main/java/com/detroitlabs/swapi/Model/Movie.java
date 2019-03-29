package com.detroitlabs.swapi.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

    private String title;
    private int episodeId;
    private String openingCrawl;
    private String director;
    private String producer;
    private String releaseDate;
    private List<Character> characters;
//    private List<Planet> planets;
//    private List<Starship> starships;
//    private List<Vehicle> vehicles;
//    private List<Specie> species;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", episodeId=" + episodeId +
                ", openingCrawl='" + openingCrawl + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", characters=" + characters +
//                ", planets=" + planets +
//                ", starships=" + starships +
//                ", vehicles=" + vehicles +
//                ", species=" + species +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("episode_id")
    public int getEpisodeId() {
        return episodeId;
    }

    @JsonProperty("episode_id")
    public void setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
    }

    @JsonProperty("opening_crawl")
    public String getOpeningCrawl() {
        return openingCrawl;
    }

    @JsonProperty("opening_crawl")
    public void setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

//    public List<Planet> getPlanets() {
//        return planets;
//    }
//
//    public void setPlanets(List<Planet> planets) {
//        this.planets = planets;
//    }
//
//    public List<Starship> getStarships() {
//        return starships;
//    }
//
//    public void setStarships(List<Starship> starships) {
//        this.starships = starships;
//    }
//
//    public List<Vehicle> getVehicles() {
//        return vehicles;
//    }
//
//    public void setVehicles(List<Vehicle> vehicles) {
//        this.vehicles = vehicles;
//    }
//
//    public List<Specie> getSpecies() {
//        return species;
//    }
//
//    public void setSpecies(List<Specie> species) {
//        this.species = species;
//    }
}
