package com.detroitlabs.swapi.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {

    private String name;
    private String birthYear;
    private String gender;
    private String desc = "This an a description";
    //private Homeworld homeworld;

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", gender='" + gender + '\'' +
                //", homeworld=" + homeworld +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }

    @JsonProperty("birth_year")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    //    public Homeworld getHomeworld() {
//        return homeworld;
//    }
//
//    public void setHomeworld(Homeworld homeworld) {
//        this.homeworld = homeworld;
//    }
}
