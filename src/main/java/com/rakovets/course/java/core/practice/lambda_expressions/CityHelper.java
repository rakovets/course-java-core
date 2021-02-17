package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;

public abstract class CityHelper {

    public static List<String> getUniqueCity(List<String> citiesList) {
        return citiesList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getLongCityName(List<String> citiesList, int size) {
        return citiesList.stream()
                .filter(s -> s.length() > size)
                .collect(Collectors.toList());
    }

    public static List<String> getSpecificChar(List<String> citiesList, char x) {
        return citiesList.stream()
                .filter(s -> s.startsWith(String.valueOf(x)))
                .collect(Collectors.toList());
    }

    public static int getCityCount(List<String> citiesList, String city) {
        return (int) citiesList.stream()
                .filter(s -> s.equals(city))
                .count();
    }
}
