package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;

public class CityHelper {
    private String[] cities;

    public CityHelper(String[] cities) {
        this.cities = cities;
    }

    public String[] getAll() {
        return cities;
    }

    public String[] getUnique() {
        return Arrays.stream(cities)
                .distinct()
                .toArray(String[]::new);
    }

    public String[] getLonger(int letters) {
        return Arrays.stream(cities)
                .filter(s -> s.length() > letters)
                .toArray(String[]::new);
    }

    public String[] getWithFirstLetter(char letter) {
        return Arrays.stream(cities)
                .filter(s -> s.charAt(0) == letter)
                .toArray(String[]::new);
    }

    public long getAmount(String city) {
        return Arrays.stream(cities)
                .filter(city::equals)
                .count();
    }
}
