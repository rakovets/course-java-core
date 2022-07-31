package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        CityHelper cityHelper = new CityHelper();
        List<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Minsk");
        cities.add("Grodno");
        cities.add("Grodno");
        cities.add("Minsk");
        cities.add("Minsk");
        cities.add("Vitebsk");
        cities.add("Brest");
        cities.add("Brest");
        cities.add("Gomel");

        System.out.println(cityHelper.getUniqueCities(cities));

        System.out.println(cityHelper.getCitiesNameLongerThan(cities, 5));
        System.out.println(cityHelper.getCitiesNameStartingWithLetter(cities, 'G'));
        System.out.println(cityHelper.countCity(cities, "Grodno"));
    }

}
