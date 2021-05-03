package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("New York");
        cityList.add("Minsk");
        cityList.add("Brest");
        cityList.add("Dubai");
        cityList.add("New York");
        cityList.add("Minsk");
        cityList.add("Brest");
        cityList.add("Dubai");
        System.out.println(CityHelper.getUniqueCities(cityList).toString());
        System.out.println(CityHelper.getCitiesWhitNameLength(cityList, 5).toString());
        System.out.println(CityHelper.getCitiesBeginningWhitLetter(cityList, "M"));
        String minsk = "Minsk";
        System.out.println(minsk + " " + CityHelper.getNumberOfCitiesUsage(cityList, minsk));
    }
}
