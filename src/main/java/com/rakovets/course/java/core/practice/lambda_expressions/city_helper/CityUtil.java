package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class CityUtil {

    public static Collection<String> getUniqueCity(Collection<String> city) {
        return city.stream()
                .filter(String -> Collections.frequency(city, String) == 1)
                .collect(Collectors.toList());
    }

    public static Collection<String> getParameterSizeCity(Collection<String> city, int sizeCity) {
        return city.stream()
                .filter(l -> l.length() >= sizeCity)
                .collect(Collectors.toList());
    }

    public static Collection<String> getCityWithFirstCharacter(Collection<String> city, char symbol) {
        return city.stream()
                .filter(l -> l.charAt(0) == symbol)
                .collect(Collectors.toList());
    }

    public static long getAmountCity(Collection<String> listCity, String city) {
        return listCity.stream()
                .filter(l -> l.equals(city))
                .count();
    }
}
