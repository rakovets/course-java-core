package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;

public final class CityHelper {
    List<String> cities;

    public CityHelper(List<String> cities) {
        this.cities = cities;
    }

    public List<String> getUniqueCities() {
        return cities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getNameCityLength() {
        return cities.stream()
                .filter(city -> city.length() > 6)
                .collect(Collectors.toList());
    }

    public List<String> getNameFirstLetter(final char firstLetter) {
        return cities.stream()
                .filter(city -> city.charAt(0) == firstLetter)
                .collect(Collectors.toList());
    }

    public long getCountNameCity(final String city) {
        return cities.stream()
                .filter(c -> c.equals(city)).count();
    }
}
