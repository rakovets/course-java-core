package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.List;
import java.util.stream.Collectors;

public class City {
    public List<String> getUniqueCities(List<String> cities) {
        return cities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getCitiesGreaterThanGivenNumberOfCharacters(List<String> cities, Integer amountLetters) {
        return cities.stream()
                .filter(x -> x.length() > amountLetters)
                .collect(Collectors.toList());
    }

    public List<String> getCitiesStartingWithTheLetter(List<String> cities, String letter) {
        return cities.stream()
                .filter(x -> x.startsWith(letter))
                .collect(Collectors.toList());
    }

    public Long getAmountCityIntoList(List<String> list, String town) {
        return list.stream()
                .filter(x -> x.contains(town))
                .count();
    }
}
