package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getUniqueCities(List<String> cities) {
       return cities.stream()
               .distinct()
               .collect(Collectors.toList());
    }

    public static List<String> getCitiesLongerThatNSymbols(List<String> cities,int N) {
        return cities.stream()
                .filter(citiesName -> citiesName.length() > N)
                .collect(Collectors.toList());
    }

    public static List<String> getCitiesStartingWithLetters (List<String>cities,String Letter){
        return  cities.stream()
                 .filter(citiesName -> citiesName.startsWith(Letter))
                 .collect(Collectors.toList());
    }

    public static long getRepeatWordsInListCount (List<String> cities,String city) {
        return  cities.stream()
                .filter(citiesName -> citiesName.equals(city))
                .count();
    }
}
