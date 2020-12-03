package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.List;
import java.util.stream.Collectors;

public class CitiesFilterUtil {

    public static List<String> getDistinctCitiesInList(List<String> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getCitiesLessThan6LettersNames(List<String> list) {
        return list.stream().
                filter(city -> city.length() > 6).
                collect(Collectors.toList());
    }

    public static List<String> getCitiesNamesStartedWithLetter(List<String> list, char letter) {
        return list.stream().
                distinct().
                filter(city -> city.charAt(0) == letter).
                collect(Collectors.toList());
    }

    public static long countDistinctCity(List<String> list, String city) {
        return list.stream().
                filter(cities -> cities.equals(city)).
                count();
    }
}
