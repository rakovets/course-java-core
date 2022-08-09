package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.ArrayList;
import java.util.Collection;

public class CityHelperDemo {
    public static void main(String[] args) {
        CityHelper h = new CityHelper();
        Collection<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Moscow");
        cities.add("Moscow");
        cities.add("New York");
        cities.add("Paris");
        cities.add("Los-Angeles");
        cities.add("Los-Angeles");

        System.out.println("Static cities array for demonstration: " + cities);
        System.out.println("Unique cities are: " + h.getUniqueCities(cities));
        System.out.println("Cities list longer than 6 chars: " + h.getCitiesLimitedByLength(cities, 6));
        System.out.println("Cities list starts from M: " + h.getCitiesStartWithSymbol(cities, 'M', 0));
        System.out.println("Moscow used " + h.cityUsageCounter(cities, "Moscow") + " times");
    }
}
