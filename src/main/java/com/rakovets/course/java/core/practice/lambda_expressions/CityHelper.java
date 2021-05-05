package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CityHelper {
    public static Collection<String> showUnicCities (Collection<String> list){
    return list.stream().distinct().collect(Collectors.toList());
    }

    public static Collection<String> showUnicCitiesBiggerThan (Collection<String> list, int amountsimbols){
        Predicate<String> predicate = cityName -> cityName.length() > amountsimbols;
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    public static Collection<String> showUnicCitiesWhichNameStartWith (Collection<String> list, String sym){
        return list.stream().filter(firstSymbol -> firstSymbol.startsWith(sym)).collect(Collectors.toList());
    }

    public static long showQuantityOfCities (Collection<String> list, String city){
        long quantity = list.stream().filter(name -> name.equalsIgnoreCase(city)).count();
        return quantity;
    }
}
