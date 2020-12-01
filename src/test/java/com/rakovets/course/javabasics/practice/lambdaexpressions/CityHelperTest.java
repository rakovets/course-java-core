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
        listOfCity.add("Moscoww");
        listOfCity.add("Minsk");
        listOfCity.add("minsk");

        CityHelper cityHelper = new CityHelper();
        cityHelper.getUniqueCities(listOfCity);
        cityHelper.getCitiesWithMoreThanSixSymbols(listOfCity);
        cityHelper.getCitiesStartingWithSomeLetter(listOfCity,new String("K"));
        System.out.println(cityHelper.getRepeatedCities(listOfCity).toString());
    }
}
