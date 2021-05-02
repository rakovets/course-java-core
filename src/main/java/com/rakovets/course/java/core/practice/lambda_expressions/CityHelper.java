package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getUniqueCity(Collection<String> cityList) {
        return cityList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getCityWithCertainCountSymbols(Collection<String> cityList, int amountSymbols) {
        return cityList.stream()
                .filter(cityName -> cityName.length() > amountSymbols)
                .collect(Collectors.toList());
    }

    public static List<String> getCityByFirstSymbol(Collection<String> cityList, String symbol) {
        return cityList.stream()
                .filter(startSymbol -> startSymbol.startsWith(symbol))
                .collect(Collectors.toList());
    }

    public static int getAmountOfSameWords(Collection<String> cityList, String city) {
        return (int)cityList.stream()
                .filter(word -> word.equalsIgnoreCase(city))
                .count();
    }
}
