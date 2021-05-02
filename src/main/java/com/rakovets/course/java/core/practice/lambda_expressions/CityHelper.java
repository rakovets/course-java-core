package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getCities(List<String> cities) {
        return cities.stream().distinct()
                .collect(Collectors.toList());
    }

    public static List<String> longThen(List<String> cities, int length) {
        return cities.stream().filter(city -> city.length() > length)
                .collect(Collectors.toList());
    }

    public static List<String> startWith(List<String> cities, char letter) {
        return cities.stream().filter(city -> city.charAt(0) == letter)
                .collect(Collectors.toList());
    }

    public static int countOfaCity(List<String> cities, String city) {
        return (int) cities.stream().filter(anyCity -> anyCity.equals(city)).count();
    }
}
