package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public List<String> getUniqueCities(List<String> cities) {
        return cities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getCitiesNamesMoreThan6(List<String> cities) {
        return cities.stream()
                .filter(c -> c.length() > 6)
                .collect(Collectors.toList());
    }

    public List<String> getCitiesWithFirstLetter(List<String> cities, char firstLetter) {
        String ch = String.valueOf(firstLetter);
        return cities.stream()
                .filter(c -> c.substring(0, 1).equalsIgnoreCase(ch))
                .collect(Collectors.toList());
    }

    public long getNumberCityInList(List<String> cities, String city) {
        return cities.stream()
                .filter(c -> c.equalsIgnoreCase(city))
                .count();
    }
}
