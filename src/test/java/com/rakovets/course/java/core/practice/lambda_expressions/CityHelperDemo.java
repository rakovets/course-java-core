package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        CityHelper city = new CityHelper();

        List<String> cities = new ArrayList<>(Arrays.asList("Brest", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk", "Minsk", "Vitebsk", "Gomel", "Grodno", "Mogilev", "Minsk"));

        System.out.println("All cities in array - " + city.getCities(cities));
        System.out.println("Unique cities in array - " + city.getUniqueCities(cities));
        System.out.println("City name more than 6 characters - " + city.getCitiesLogerThenSix(cities));
        System.out.println("City name start with letter 'M' - " + city.getCitiesStartLetter(cities, 'M'));
        System.out.println("Number of used Minsk in the list - " + city.getCountCity(cities, "Minsk"));
    }
}
