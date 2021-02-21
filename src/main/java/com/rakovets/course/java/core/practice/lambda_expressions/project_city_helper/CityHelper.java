package com.rakovets.course.java.core.practice.lambda_expressions.project_city_helper;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getUniqueCity(List<String> cities) {
        return cities.stream().distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getMoreSixCharCity(List<String> cities) {
        return cities.stream().distinct().filter(s -> s.length() > 6)
                .collect(Collectors.toList());
    }

    public static List<String> getBeginCharCity(List<String> cities, char beginChar) {
        return cities.stream().distinct().filter(s -> s.charAt(0) == beginChar)
                .collect(Collectors.toList());
    }

    public static long getCountCity(List<String> cities, String city) {
        return cities.stream().filter(s -> s.equals(city))
                .count();
    }
}
