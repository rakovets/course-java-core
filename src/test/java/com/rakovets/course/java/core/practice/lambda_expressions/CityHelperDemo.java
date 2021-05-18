package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Annapolis", "Bloomington", "Indianapolis", "Columbia", "Memphis", "Bloomington", "Indianapolis",
                "Annapolis"));
        System.out.println(CityHelper.getUniqueName(cities));
        System.out.println(CityHelper.getNameLongerNumberSymbols(cities, 10));
        System.out.println(CityHelper.getCityStartingGivenLetter(cities, "A"));
        System.out.println(CityHelper.getAmountSpecificName(cities, "Indianapolis"));
    }
}
