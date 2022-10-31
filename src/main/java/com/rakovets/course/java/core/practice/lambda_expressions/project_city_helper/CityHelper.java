package com.rakovets.course.java.core.practice.lambda_expressions.project_city_helper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public ArrayList<String> getUniqueCities(List<String> citiesList) {
        return citiesList.stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<String> getCitiesWithSpecifiedLengthOfName(List<String> citiesList, int nameLength) {
        return citiesList.stream()
                .distinct()
                .filter(x-> x.length() > nameLength)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<String> getCitiesWithSpecifiedFirstLetterInName(List<String> citiesList, char firstLetterInName) {
        return citiesList.stream()
                .distinct()
                .filter(x-> x.charAt(0) == firstLetterInName)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public long getCitiesWithSpecifiedName(List<String> citiesList, String specifiedName) {
        long count = citiesList.stream()
                .filter(x-> x == specifiedName)
                .count();
        return count > 0 ? count : -1;
    }
}
