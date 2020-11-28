package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;

public class CityHelper {
    private static String[] cities = {"Minsk", "Brest", "Grodno", "Vitebsk", "Gomel", "Mogilev", "Minsk", "Minsk", "Brest", "Vitebsk"};

    public static String[] getAll() {
        return cities;
    }

    public static Object[] getUnique() {
        return Arrays.stream(cities).distinct().toArray();
    }

    public static Object[] getLong() {
        return Arrays.stream(cities)
                .filter(s -> s.length() > 6)
                .toArray();
    }

    public static Object[] getWithFirstLetter(char letter) {
        return Arrays.stream(cities)
                .filter(s -> s.charAt(0) == letter)
                .toArray();
    }

    public static long getAmount(String city) {
        return Arrays.stream(cities)
                .filter(city::equals)
                .count();
    }
}
