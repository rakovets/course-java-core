package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;

public final class CityHelper {
    private final List<String> cities;

    public CityHelper(List<String> cities) {
        this.cities = cities;
    }

    public List<String> getUniqueCities() {
        return cities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getNameCityLength(int length) {
        return cities.stream()
                .filter(city -> city.length() > length)
                .collect(Collectors.toList());
    }

    public List<String> getNameFirstLetter(final char firstLetter) {
        return cities.stream()
                .filter(city -> city.charAt(0) == firstLetter)
                .collect(Collectors.toList());
    }

    public long getCountNameCity(final String cityName) {
        return cities.stream()
                .filter(city -> city.equals(cityName)).count();
    }
}
