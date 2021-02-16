package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;

public abstract class CityHelper {
    public static List<String> getUnique(List<String> cities) {
        return cities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getCitiesLongerSix(List<String> cities) {
        return cities.stream()
                .filter(city -> city.length() > 6)
                .collect(Collectors.toList());
    }

    public static List<String> getCitiesStartsWith(List<String> cities, char letter) {
        return cities.stream()
                .filter(city -> city.charAt(0) == letter)
                .collect(Collectors.toList());
    }

    public static int getCountOfCity(List<String> cities, String cityName) {
        return (int) cities.stream()
                .filter(city -> city.equalsIgnoreCase(cityName))
                .count();
    }
}
