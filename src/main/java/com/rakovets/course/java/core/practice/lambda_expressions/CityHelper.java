package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    private final List<String> cities;

    public CityHelper(List<String> cities) {
        this.cities = cities;
    }

    public List<String> uniqueName() {
        return cities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> longerName(int size) {
        return cities.stream()
                .filter(s -> s.length() > size)
                .collect(Collectors.toList());
    }

    public List<String> startLetter(char letter) {
        return cities.stream()
                .filter(s -> s.charAt(0) == letter)
                .collect(Collectors.toList());
    }

    public int equalNames(String city) {
        return (int) cities.stream()
                .filter(city::equals)
                .count();
    }
}
