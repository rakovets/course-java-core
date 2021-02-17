package com.rakovets.course.java.core.practice.lambda_expressions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public List<String> city;

    public CityHelper(List<String> city) {
        this.city = city;
    }

    public List<String> uniqueCities() {
        return city.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getLongNameCities() {
        return  city.stream()
                .filter(c -> c.length() > 6)
                .collect(Collectors.toList());
    }

    public List<String> entryLettersCities() {
        return  city.stream()
                .filter(c -> c.charAt(0) == 'M')
                .collect(Collectors.toList());
    }

    public int getCountEntriesCities(String cities) {
        return (int) city.stream()
                .filter(cities::equals)
                .count();
    }
}
