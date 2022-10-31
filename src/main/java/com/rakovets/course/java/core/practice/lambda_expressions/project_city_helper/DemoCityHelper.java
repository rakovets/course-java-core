package com.rakovets.course.java.core.practice.lambda_expressions.project_city_helper;

import java.util.ArrayList;
import java.util.List;

public class DemoCityHelper {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of(
                "Минск", "Киев", "Одесса", "Харьков", "Изюм", "Херсон", "Варшава",
                "Минск", "Херсон", "Мариуполь", "Гомель", "Мариуполь", "Варшава", "Киев", "Одесса", "Харьков", "Изюм", "Херсон", "Варшава",
                "Минск", "Херсон", "Мариуполь"
        ));
        CityHelper cityHelper = new CityHelper();
        ArrayList<String> uniqueCities = cityHelper.getUniqueCities(cities);
        uniqueCities.stream()
                .forEach(x -> System.out.printf("%s ", x));
        System.out.println();

        ArrayList<String> nameLengthCities = cityHelper.getCitiesWithSpecifiedLengthOfName(cities, 6);
        nameLengthCities.stream()
                .forEach(x -> System.out.printf("%s ", x));
        System.out.println();

        ArrayList<String> nameFirstLetterCities = cityHelper.getCitiesWithSpecifiedFirstLetterInName(cities, 'М');
        nameFirstLetterCities.stream()
                .forEach(x -> System.out.printf("%s ", x));
        System.out.println();

        long countWithWithSpecified = cityHelper.getCitiesWithSpecifiedName(cities, "Минск");
        System.out.println(countWithWithSpecified);
    }
}
