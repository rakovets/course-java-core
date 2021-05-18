package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getUniqueName(Collection<String> cityList) {
        return cityList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getNameLongerNumberSymbols(Collection<String> cityList, int amountSymbols) {
        return cityList.stream()
                .filter(cityName -> cityName.length() > amountSymbols)
                .collect(Collectors.toList());
    }

    public static List<String> getCityStartingGivenLetter(Collection<String> cityList, String symbol) {
        return cityList.stream()
                .filter(startSymbol -> startSymbol.startsWith(symbol))
                .collect(Collectors.toList());
    }

    public static int getAmountSpecificName(Collection<String> cityList, String city) {
        return (int)cityList.stream()
                .filter(word -> word.equalsIgnoreCase(city))
                .count();
    }
}
