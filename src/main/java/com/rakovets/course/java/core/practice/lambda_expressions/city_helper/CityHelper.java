package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CityHelper {
    static String LITERAL = "M";
    static String CITY = "Gomel";
    // получение уникальных городов
    public static String getUniqueCities(List<String> cities) {
        Set<String> hashCities = new HashSet<>();
        for (String element : cities) {
            hashCities.add(element);
        }
        return hashCities.toString();
    }
    // с названием, которое длиннее шесть символов
    public static List<String> getSpecificCities(List<String> cities) {
        return cities.stream()
                .filter(str -> str.length() > 6)
                .collect(Collectors.toList());
    }
    // начинающихся на заданную букву
    public static List<String> getCitiesStartNameM(List<String> cities) {
        return cities.stream()
                .filter(str -> str.startsWith(LITERAL))
                .collect(Collectors.toList());
    }
    /** получение количества употребления конкретного города в списке*/
    public static long getCountRepeatCities(List<String> cities) {
        return cities.stream()
                .filter(str -> str.equals(CITY))
                .count();
    }
}
