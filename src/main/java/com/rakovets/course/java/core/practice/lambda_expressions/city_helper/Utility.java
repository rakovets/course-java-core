package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Utility {
    public List<String> getUniqueCities(List<String> cities) {
        return cities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getUniqueCitiesWithLengthMoreThan6Letters(List<String> cities) {
        return cities.stream()
                .distinct()
                .filter(city -> city.length() > 6)
                .collect(Collectors.toList());
    }

    public List<String> getUniqueCitiesStartWithSetLetter(List<String> cities, String setLetter) {
        return cities.stream()
                .distinct()
                .filter(word -> word.startsWith(setLetter))
                .collect(Collectors.toList());
    }

    public long getCountSetCityFromList(List<String> cities, String setCity) {
        return cities.stream()
                .filter(s -> s.equals(setCity))
                .count();
    }
}
