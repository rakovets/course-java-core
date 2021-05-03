package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CityHelper {

    public static List<String> getUniqueCities(Collection<String> listOfCities) {
        List<String> uniqueCities = new ArrayList<>();
        listOfCities.stream()
                .distinct()
                .forEach(uniqueCities::add);
        return uniqueCities;
    }

    public static List<String> getCitiesWhitNameLength(Collection<String> listOfCities, int numberOfSymbols) {
        List<String> citiesWhitLength = new ArrayList<>();
        listOfCities.stream()
                .filter(p -> p.length() == numberOfSymbols)
                .forEach(citiesWhitLength::add);
        return citiesWhitLength;
    }

    public static List<String> getCitiesBeginningWhitLetter(List<String> cityList, String letter) {
        List<String> citiesBeginningWhitLetter = new ArrayList<>();
        cityList.stream()
                .filter(p -> p.startsWith(letter))
                .forEach(citiesBeginningWhitLetter::add);
        return citiesBeginningWhitLetter;
    }

    public static long getNumberOfCitiesUsage(List<String> cityList, String cityName) {
        long numberOfUsage = cityList.stream()
                                    .filter(p -> p.equals(cityName))
                                    .count();
        return numberOfUsage;
    }
}
