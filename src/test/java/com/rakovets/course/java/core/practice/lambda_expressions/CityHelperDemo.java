package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("Brest", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk", "Minsk", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk"));

        System.out.println("All cities in array - " + CityHelper.getCities(cities));
        System.out.println("Unique cities in array - " + CityHelper.getUniqueCities(cities));
        System.out.println("City name more than 6 characters - " + CityHelper.getCitiesLogerThenSix(cities));
        System.out.println("City name start with letter 'M' - " + CityHelper.getCitiesStartLetter(cities, 'M'));
        System.out.println("Number of used Minsk in the list - " + CityHelper.getCountCity(cities, "Minsk"));
    }
}
