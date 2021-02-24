package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import com.rakovets.course.java.core.practice.lambda_expressions.city_helper.CityHelper;

import java.util.ArrayList;
import java.util.List;

public class DemoCityHelper {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Gomel");
        cities.add("Brest");
        cities.add("Grodno");
        cities.add("Mogilev");
        cities.add("Minsk");
        cities.add("Vitebsk");
        cities.add("Minsk");
        cities.add("Gomel");
        cities.add("Vitebsk");

        System.out.println(CityHelper.getUniqueCities(cities));
        System.out.println(CityHelper.getSpecificCities(cities));
        System.out.println(CityHelper.getCitiesStartNameM(cities));
        System.out.println(CityHelper.getCountRepeatCities(cities));
    }

}
