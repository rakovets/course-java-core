package com.rakovets.course.java.core.practice.lambda_expressions.project_city_helper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoCityHelper {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of(
                "Минск", "Киев", "Одесса", "Харьков", "Изюм", "Херсон", "Варшава",
                "Минск", "Херсон", "Мариуполь", "Гомель", "Мариуполь", "Варшава", "Киев", "Одесса", "Харьков", "Изюм", "Херсон", "Варшава",
                "Минск", "Херсон", "Мариуполь"
        ));
        cities.stream()
                .forEach(x -> System.out.printf("%s, ", x));
        System.out.println();
        List<String> uniqueCities = cities.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println();
        List<String> nameLonger6WordsCities = cities.stream()
                .filter(x-> x.length() > 6)
                .collect(Collectors.toList());

        System.out.println();
        List<String> withSpecifiedFirstWordInNameCities = cities.stream()
                .filter(x-> x.charAt(0) == 'М')
                .distinct()
                .collect(Collectors.toList());

        System.out.println();

        long countOfSpecifiedCity = cities.stream()
                .filter(x-> x == "Минск")
                .count();
    }
}
