package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Minsk", "Gomel", "Minsk", "Grodno", "Gomel", "Brest", "Vitebsk",
                "Minsk"));
        System.out.println(CityHelper.getUniqueCity(cities));
        System.out.println(CityHelper.getCityWithCertainCountSymbols(cities, 4));
        System.out.println(CityHelper.getCityByFirstSymbol(cities, "M"));
        System.out.println(CityHelper.getAmountOfSameWords(cities, "Minsk"));
    }
}
