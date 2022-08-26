package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public List<String> getCities(List<String> cities) {
        return new ArrayList<>(cities);
    }

    public List<String> getUniqueCities(List<String> cities) {
        return cities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getCitiesLogerThenSix(List<String> cities) {
        return cities.stream()
                .distinct()
                .filter(s -> s.length() > 6)
                .collect(Collectors.toList());
    }

    public List<String> getCitiesStartLetter(List<String> cities, char letter) {
        return cities.stream()
                .distinct()
                .filter(s -> s.charAt(0) == letter)
                .collect(Collectors.toList());
    }

    public long getCountCity(List<String> cities, String city) {
        return cities.stream()
                .filter(city::equals)
                .count();
    }
}
