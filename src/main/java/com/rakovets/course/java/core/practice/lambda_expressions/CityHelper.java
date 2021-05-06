package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {

    public static List<String> getUniqueCities(Collection<String> listOfCities) {
        return listOfCities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getCitiesWhitNameLength(Collection<String> listOfCities, int numberOfSymbols) {
        return listOfCities.stream()
                .filter(p -> p.length() == numberOfSymbols)
                .collect(Collectors.toList());
    }

    public static List<String> getCitiesBeginningWhitLetter(List<String> cityList, String letter) {
       return cityList.stream()
                .filter(p -> p.startsWith(letter))
                .collect(Collectors.toList());
    }

    public static long getNumberOfCitiesUsage(List<String> cityList, String cityName) {
       return cityList.stream()
               .filter(p -> p.equals(cityName))
               .count();

    }
}
