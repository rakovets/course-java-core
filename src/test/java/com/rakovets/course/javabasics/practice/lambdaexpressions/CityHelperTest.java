package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CityHelperTest {
    public static void main(String[] args) {
        ArrayList<String> listOfCity = new ArrayList<>();
        listOfCity.add("Minsk");
        listOfCity.add("Tokyo");
        listOfCity.add("Rome");
        listOfCity.add("Moscow");
        listOfCity.add("Kiev");
        listOfCity.add("Moscow");
        listOfCity.add("Minsk");
        listOfCity.add("minsk");
        listOfCity.add("Singapore");

        CityHelper cityHelper = new CityHelper();
        System.out.println(cityHelper.getUniqueCities(listOfCity).toString());
        System.out.println(cityHelper.getCitiesWithMoreThanSixSymbols(listOfCity).toString());
        System.out.println(cityHelper.getCitiesStartingWithSomeLetter(listOfCity,new String("K")));
        System.out.println(cityHelper.getRepeatedCities(listOfCity).toString());
    }
}
