package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {

    public static List<String> distinctCity(Collection<String> collection) {
        return collection.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> lengthCity(Collection<String> collection,int length) {
        return collection.stream()
                .filter(city -> city.length() > length)
                .collect(Collectors.toList());
    }

    public static List<String> startWithLetter(Collection<String> collection,String letter) {
        return collection.stream()
                .filter(city -> city.startsWith(letter))
                .collect(Collectors.toList());
    }

    public static long countCityReiteration(Collection<String> collection,String city) {
        return collection.stream()
                .filter(city::equals)
                .count();
    }
}
