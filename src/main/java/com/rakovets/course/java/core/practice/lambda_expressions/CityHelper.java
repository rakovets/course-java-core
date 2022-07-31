package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CityHelper {

    public Set<String> getUniqueCities(List<String> cities) {
        return new HashSet<>(cities);
    }

    public List<String> getCitiesNamesMoreThanXLetters(List<String> cities, int amountLetters) {
        return cities.stream()
                .filter(c -> c.length() > amountLetters)
                .collect(Collectors.toList());
    }

    public List<String> getCitiesWithFirstLetterIgnoreCase(List<String> cities, char firstLetter) {
        String ch = String.valueOf(firstLetter);
        return cities.stream()
                .filter(c -> c.substring(0, 1).equalsIgnoreCase(ch))
                .collect(Collectors.toList());
    }

    public long getFrequencyCityInList(List<String> cities, String city) {
        return cities.stream()
                .filter(c -> c.equalsIgnoreCase(city))
                .count();
    }
}
