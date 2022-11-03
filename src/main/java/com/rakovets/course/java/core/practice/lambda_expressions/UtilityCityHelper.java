package com.rakovets.course.java.core.practice.lambda_expressions;

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

    public List<String> getTheLongestNames(int nameLength) {
        return cities.stream()
                .distinct()
                .filter(name -> name.length() > nameLength)
                .collect(Collectors.toList());
    }

    public List<String> startWithChosenWord(String firstLetter) {
        return cities.stream()
                .distinct()
                .filter(name -> name.startsWith(firstLetter))
                .collect(Collectors.toList());
    }

    public long countName(String chosenCity) {
        return cities.stream()
                .filter(name -> name.equals(chosenCity))
                .count();
    }
}
