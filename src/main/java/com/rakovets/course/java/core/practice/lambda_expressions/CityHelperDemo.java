package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Collection;

public class CityHelperDemo {
    public static void main(String[] args) {
        CityHelper h = new CityHelper();
        Collection<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Minsk");
        cities.add("New York");
        cities.add("New York");
        cities.add("Vitebsk");

        System.out.println(h.getCitiesStartWithSymbol(cities, 'M', 0));
    }
}
