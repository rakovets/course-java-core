package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class CitiDemo {
    public static void main(String[] args) {
        List list = new ArrayList(List.of("Minsk",
                "Minsk",
                "Grodno",
                "Kiev",
                "Stambul"));
        System.out.println(CityHelper.getUnicCities(list));
        System.out.println(CityHelper.getCitiesBiggerThan(list,5));

    }
}
