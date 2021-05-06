package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.*;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getListCitiesWithUniqueName(List<String> city) {
        List<String> uniqueCityNames = new ArrayList<>();
        city.stream().distinct().forEach(x -> uniqueCityNames.add(x));
        return uniqueCityNames;
    }

    public static List<String> getListCityNamesCertainLength(List<String> city, int lengthName) {
        List<String> listCityNamesCertainLength = new ArrayList<>();
        city.stream().filter(x -> x.length() >= lengthName).forEach(x -> listCityNamesCertainLength.add(x));
        return listCityNamesCertainLength;
    }

    public static List<String> getListCityNamesStartingOnCertainLetter(List<String> city, char letter) {
        List<String> uniqueCityNames = getListCitiesWithUniqueName(city);
        List<String> listCityNamesStartingOnCertainLetter = new ArrayList<>();
        uniqueCityNames.stream().filter(x -> Objects.equals(x.charAt(0), letter)).forEach(x -> listCityNamesStartingOnCertainLetter.add(x));
        return listCityNamesStartingOnCertainLetter;
    }

    public static Map<String, Long> getAmountConsumed(List<String> city) {
        Map<String, Long> nameWithAmount = city.stream().collect(
                Collectors.groupingBy(x -> x, Collectors.counting()));
        return nameWithAmount;
    }
}




