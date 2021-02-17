package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    private List<String> city;

    public CityHelper(List<String> city) {
        this.city = city;
    }

    public List<String> getUniqueCity() {
        return city.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getCityLenghtMoreThan6() {
        return city.stream()
                .filter(e -> e.length() > 6)
                .collect(Collectors.toList());
    }

    public List<String> getCityOfStartChar(char c) {
        return city.stream()
                .filter(e -> e.charAt(0) == c)
                .collect(Collectors.toList());
    }

    public int getCounterOfCity(String str) {
        return (int) city.stream()
                .filter(e -> e.equals(str))
                .count();
    }
}
