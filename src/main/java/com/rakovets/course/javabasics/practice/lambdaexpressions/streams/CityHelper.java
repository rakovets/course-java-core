package com.rakovets.course.javabasics.practice.lambdaexpressions.streams;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {

    public static List<String> getDistinctCities(List<String> cities) {
        return cities.stream().distinct().collect(Collectors.toList());
    }

    public static List<String> getDistinctCitiesMoreSixSymblos(List<String> cities) {
        return cities.stream().distinct().filter(i -> i.length() > 6).collect(Collectors.toList());
    }

    public static List<String> getDistinctCitiesStartWith(List<String> cities, char ch) {
        return cities.stream().distinct().filter(i -> i.startsWith(String.valueOf(ch))).collect(Collectors.toList());
    }

}
