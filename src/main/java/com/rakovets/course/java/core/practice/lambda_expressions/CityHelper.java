package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CityHelper {
    private String[] arrayOfCities;

    public CityHelper(String[] arrayOfCities) {
        this.arrayOfCities = arrayOfCities;
    }

    public Set<String> getUniqueCities(String[] arrayOfCities) {
        return Arrays.stream(arrayOfCities)
                .collect(Collectors.toSet());
    }

    public List<String> getLongCityNames(String[] arrayOfCities, int cityNameLength) {
        return Stream.of(arrayOfCities)
                .filter((x) -> x.length() > cityNameLength)
                .collect(Collectors.toList());
    }

    public List<String> getCitiesStartWithLetter(String[] arrayOfCities, char firstLetterCity) {
        return Stream.of(arrayOfCities)
                .filter((x) -> x.charAt(0) == firstLetterCity)
                .collect(Collectors.toList());
    }

    public int getNumberOccurrencesCity(String[] arrayOfCities, String city) {
        return (int) Stream.of(arrayOfCities)
                .filter((x) -> x.equals(city))
                .count();
    }
}
