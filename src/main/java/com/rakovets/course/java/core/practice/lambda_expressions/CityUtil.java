package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CityUtil {

    public static List<String> getCities(List<String> cities, Predicate<String> condition) {
        List<String> citiesList = new ArrayList<>();
        for (String city : cities) {
            if (condition.test(city)) {
                citiesList.add(city);
            }
        }
        return citiesList;
    }

    public static long getCityCount(List<String> cities, String city) {
        return cities.stream().filter((str) -> str.equals(city)).count();
    }

}
