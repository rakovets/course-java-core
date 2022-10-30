package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class City {
    private List<String> cities;

    public City(List<String> cities) {
        this.cities = cities;
    }

    public List<String> getUniqueCities(List<String> cities) {
        return cities.stream().distinct().collect(Collectors.toList());
    }

    public List<String> getCitiesMoreSixSymbol(List<String> cities) {
        List<String> newList = new ArrayList<>();
        cities.stream().filter(x -> x.length() > 6).forEach(newList::add);
        return newList;
    }

    public List<String> getCitiesStartingWithTheLetter(List<String> cities, String letter) {
        List<String> newList = new ArrayList<>();
        cities.stream().filter(x -> x.startsWith(letter)).forEach(newList::add);
        return newList;
    }

    public Long getAmountCityIntoList(List<String> list, String town) {
        return list.stream().filter(x -> x.contains(town)).count();
    }
}
