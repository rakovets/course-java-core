package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utility {
    public Set<String> getUniqueCities(List<String> cities) {
        Set<String> uniqueCities = new HashSet<>();
        cities.stream().forEach(s -> uniqueCities.add(s));
        return uniqueCities;
    }

    public Set<String> getUniqueCitiesWithLengthMoreThan6Letters(List<String> cities) {
        Set<String> uniqueCities = new HashSet<>();
        cities.stream().filter(s -> s.length() > 6).forEach(s -> uniqueCities.add(s));
        return uniqueCities;
    }

    public Set<String> getUniqueCitiesStartWithSetLetter(List<String> cities, String setLetter) {
        Set<String> uniqueCities = new HashSet<>();
        cities.stream().filter(s -> s.startsWith(setLetter)).forEach(s -> uniqueCities.add(s));
        return uniqueCities;
    }

    public long getCountSetCityFromList(List<String> cities, String setCity) {
        return cities.stream().filter(s -> s.equals(setCity)).count();
    }
}
