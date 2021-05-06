package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CityHelper {
    public static List<String> getUniqueNameCities(Collection<String> city) {
        List<String> uniqueCitiesNames = new ArrayList<>();
        city.stream()
                .distinct()
                .forEach(x -> uniqueCitiesNames.add(x));
        return uniqueCitiesNames;
    }

    public static List<String> getCitiesLengthNames(Collection<String> city, int lengthName) {
        List<String> cityLengthNames = new ArrayList<>();
        city.stream()
                .filter(p -> p.length() >= lengthName)
                .forEach(p -> cityLengthNames.add(p));
        return cityLengthNames;
    }

    public static List<String> getCitiesFirstLetter(List<String> cityList, String letter) {
        List<String> citiesFirstLetter = new ArrayList<>();
        cityList.stream()
                .filter(p -> p.startsWith(letter))
                .forEach(p -> citiesFirstLetter.add(p));
        return citiesFirstLetter;
    }

    public static long getNumberOfCitiesName(List<String> cityList, String cityName) {
        long numberCityName = cityList.stream()
                .filter(p -> p.equals(cityName))
                .count();
        return numberCityName;
    }
}
