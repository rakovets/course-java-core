package com.rakovets.course.java.core.practice.lambda_expressions.demo;

import com.rakovets.course.java.core.practice.lambda_expressions.tasks.CityHelper;

import java.util.ArrayList;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        CityHelper cityHelper = new CityHelper();
        List<String> cities = new ArrayList<>();
        cities.add("Zhodino");
        cities.add("Minsk");
        cities.add("Mogilev");
        cities.add("Mogilev");
        cities.add("Zhodino");
        cities.add("Minsk");
        cities.add("Vitebsk");
        cities.add("Gomel");

        System.out.println(cityHelper.getUniqueCities(cities));

        System.out.println(cityHelper.getCitiesNameLongerThan(cities, 5));
        System.out.println(cityHelper.getCitiesNameStartingWithLetter(cities, 'Z'));
        System.out.println(cityHelper.countCity(cities, "Gomel"));
    }
}
