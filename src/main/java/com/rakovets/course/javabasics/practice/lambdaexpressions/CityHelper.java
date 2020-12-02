package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CityHelper {

    public List<String> getUniqueCities(ArrayList<String> listCity) {
        return listCity.stream()
                 .distinct()
                 .collect(Collectors.toList());
    }
    public List<String> getCitiesWithMoreThanSixSymbols(ArrayList<String> listCity) {
       return listCity.stream()
                .filter(city -> city.length() > 6)
                .collect(Collectors.toList());
    }
    public List<String> getCitiesStartingWithSomeLetter(ArrayList<String> listCity, String letter) {
       return listCity.stream()
                .filter(city -> city.startsWith(letter))
                .collect(Collectors.toList());
    }
    public Map<String, Long> getRepeatedCities(ArrayList<String> listCity) {
        return listCity.stream().
                map(String::toLowerCase)
                .collect(Collectors.groupingBy(city -> city, Collectors.counting()));
    }
}
