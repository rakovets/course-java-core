package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Minsk", "Minsk", "Moscow", "Vilnius", "New-York");

        System.out.println(CityHelper.getUniqueCities(cities));
        System.out.println(CityHelper.getIfWordsLengthMoreThanSixCharacters(cities));
        System.out.println(CityHelper.getIfWordsStartWithGivenLetter(cities, "M"));
        System.out.println(CityHelper.getCountGivenWordBeenUsed(cities, "Minsk"));
    }
}
