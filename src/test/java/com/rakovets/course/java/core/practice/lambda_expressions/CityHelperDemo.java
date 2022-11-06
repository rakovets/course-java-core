package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        final List<String> CITIES = Arrays.asList
                ("Minsk", "Gomel", "Brest", "Minsk", "Mogilev", "Vitebsk", "Gomel");

        CityHelper help = new CityHelper();

        System.out.println("Unique " + help.getUniqueCities(CITIES));
        System.out.println("Cities list longer than 6 chars: " + help.getCitiesNamesMoreThan6(CITIES));
        System.out.println("Cities list starts from M: " + help.getCitiesWithFirstLetter(CITIES, 'M'));
        System.out.println("Minsk repeats " + help.getNumberCityInList(CITIES, "Minsk"));
    }
}
