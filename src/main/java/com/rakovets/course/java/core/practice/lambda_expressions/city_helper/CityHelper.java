package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.*;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getListCitiesWithUniqueName(List<String> city) {
        List<String> uniqueCityNames = city.stream()
                .distinct()
                .collect(Collectors.toList());
        return uniqueCityNames;
    }

    public static List<String> getListCityNamesCertainLength(List<String> city, int lengthName) {
        List<String> listCityNamesCertainLength = city.stream()
                .distinct()
                .filter(x -> x.length() >= lengthName)
                .collect(Collectors.toList());
        return listCityNamesCertainLength;
    }

    public static List<String> getListCityNamesStartingOnCertainLetter(List<String> city, char letter) {
        List<String> listCityNamesStartingOnCertainLetter = city.stream()
                .distinct()
                .filter(x -> Objects.equals(x.charAt(0), letter))
                .collect(Collectors.toList());
        return listCityNamesStartingOnCertainLetter;
    }

    public static Map<String, Long> getAmountConsumed(List<String> city) {
        Map<String, Long> nameWithAmount = city.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        return nameWithAmount;
    }
}
