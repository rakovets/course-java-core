package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CityHelper {

    public static List<String> getUniqueCity(List<String> cityList) {
        return cityList.stream().distinct().collect(Collectors.toList());
    }

    public static List<String> getCityWithCertainCountSymbols(List<String> cityList, int amountSymbols) {
        Predicate<String> predicate = cityName -> cityName.length() > amountSymbols;
        return cityList.stream().filter(predicate).collect(Collectors.toList());
    }
}
