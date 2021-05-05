package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class CitiDemo {
    public static void main(String[] args) {
        List list = new ArrayList(List.of("Minsk",
                "Minsk",
                "Grodno",
                "Kiev",
                "Stambul",
                "Moscow"));
        System.out.println(CityHelper.showUnicCities(list));
        System.out.println(CityHelper.showUnicCitiesBiggerThan(list,5));
        System.out.println(CityHelper.showUnicCitiesWhichNameStartWith(list,"M"));
        System.out.println(CityHelper.showQuantityOfCities(list,"kiev"));

    }
}
