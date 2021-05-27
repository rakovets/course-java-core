package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getUniqueNameCities(List<String> city) {
        return city.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getCitiesLengthNames(List<String> city, int lengthName) {
        return city.stream()
                .filter(cityName -> cityName.length() >= lengthName)
                .collect(Collectors.toList());
    }

    public static List<String> getCitiesFirstLetter(List<String> cityList, String letter) {
        return cityList.stream()
                .filter(cityName -> cityName.startsWith(letter))
                .collect(Collectors.toList());
    }

    public static long getNumberOfCitiesName(List<String> cityList, String cityName) {
        return cityList.stream()
                .filter(p -> p.equals(cityName))
                .count();
    }
}
