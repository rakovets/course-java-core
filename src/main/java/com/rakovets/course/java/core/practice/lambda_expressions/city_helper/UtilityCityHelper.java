package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.List;
import java.util.stream.Collectors;

public class UtilityCityHelper {
    private final List<String> cities;

    public UtilityCityHelper(List<String> cities) {
        this.cities = cities;
    }

    public List<String> getUniqueCities() {
        return cities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getCityNameMoreThenSix() {
        return cities.stream()
                .distinct()
                .filter(city -> city.length() > 6)
                .collect(Collectors.toList());
    }

    public List<String> getCityByLetter(String letter) {
        return cities.stream()
                .distinct()
                .filter(word -> word.startsWith(letter))
                .collect(Collectors.toList());
    }

    public long getNumberOfOneCity(String city) {
        return cities.stream()
                .filter(word -> word.equals(city))
                .count();
    }
}
