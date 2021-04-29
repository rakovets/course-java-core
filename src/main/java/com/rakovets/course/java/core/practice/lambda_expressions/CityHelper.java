package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getUnicCities (List<String> list){
    return list.stream().distinct().collect(Collectors.toList());
    }

    public static List<String> getCitiesBiggerThan (List<String> list, int amountsimbols){
        Predicate<String> predicate = cityName -> cityName.length() > amountsimbols;
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
