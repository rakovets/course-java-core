package com.rakovets.course.java.core.practice.lambda_expressions.tasks;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public List<String> getUniqueCities(Collection<String> collection) {
        return collection.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getCitiesNameLongerThan(Collection<String> collection, int nameLength) {
        return collection.stream()
                .filter(x -> x.length() > nameLength)
                .collect(Collectors.toList());
    }

    public List<String> getCitiesNameStartingWithLetter(Collection<String> collection, char firstLetter) {
        return collection.stream()
                .filter(x -> x.charAt(0) == firstLetter)
                .collect(Collectors.toList());
    }

    public int countCity(Collection<String> collection, String city) {
        return (int) collection.stream()
                .filter(x -> x.equals(city))
                .count();
    }
}
