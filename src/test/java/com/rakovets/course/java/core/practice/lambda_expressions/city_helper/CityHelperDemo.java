package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Minsk", "Minsk", "Moscow", "Vilnius", "New-York");

        CityHelper.getUniqueCities(cities);
        CityHelper.getIfWordsLengthMoreThanSixCharacters(cities);
        CityHelper.getIfWordsStartWithGivenLetter(cities, "M");
        System.out.println(CityHelper.getCountGivenWordBeenUsed(cities, "Minsk"));
    }
}
