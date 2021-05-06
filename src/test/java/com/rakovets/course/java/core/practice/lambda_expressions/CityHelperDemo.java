package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("New York");
        cityList.add("Minsk");
        cityList.add("Brest");
        cityList.add("Paris");
        cityList.add("Moscow");
        cityList.add("Minsk");
        cityList.add("Brest");
        cityList.add("Mogilev");
        cityList.add("Pinsk");
        System.out.println(CityHelper.getUniqueNameCities(cityList).toString());
        System.out.println(CityHelper.getCitiesLengthNames(cityList, 6).toString());
        System.out.println(CityHelper.getCitiesFirstLetter(cityList, "M"));
        String minsk = "Minsk";
        System.out.println(minsk + " " + CityHelper.getNumberOfCitiesName(cityList, minsk));
    }
}
