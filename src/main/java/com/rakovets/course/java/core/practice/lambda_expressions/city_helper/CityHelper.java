package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    /**
     * Searching for unique cities.
     *
     * @param collection list of cities.
     * @return sorted collection.
     */
    public List<String> searchUniqueCity(List<String> collection) {
        return collection.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * Search for cities with a given number of letters.
     *
     * @param collection list of cities.
     * @param length     for search.
     * @return sorted collection.
     */
    public List<String> searchByNameLength(List<String> collection, int length) {
        return collection.stream()
                .filter(p -> p.length() == length)
                .collect(Collectors.toList());
    }

    /**
     * Search for a given letter.
     *
     * @param collection list of cities.
     * @param letter     for search.
     * @return sorted collection.
     */
    public List<String> searchByLetters(List<String> collection, String letter) {
        return collection.stream()
                .filter(p -> p.startsWith(letter))
                .collect(Collectors.toList());
    }

    /**
     * Counts the number of times identical cities are repeated.
     *
     * @param collection list of cities.
     * @param city       for search.
     * @return sorted collection.
     */
    public int searchCityCount(List<String> collection, String city) {
        return Math.toIntExact(collection.stream()
                .filter(p -> p.equals(city))
                .count());
    }
}
