package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Moscow");
        cities.add("Seul");
        cities.add("Minsk");
        cities.add("Limassol");
        cities.add("Paris");
        cities.add("Limassol");
        cities.add("lisbon");
        cities.add("Dubai");
        cities.add("Seul");

        System.out.println("List of unique city names:");
        List<String> uniqueCityNames = CityHelper.getListCitiesWithUniqueName(cities);
        print(uniqueCityNames);

        System.out.println("\nList of city names with certain length:");
        int lengthName = 6;
        List<String> listCityNamesCertainLength = CityHelper.getListCityNamesCertainLength(cities, lengthName);
        print(listCityNamesCertainLength);

        System.out.println("\nList of city names starting with a specific letter:");
        char letter = 'M';
        System.out.println("Specific letter is " + letter + ":");
        List<String> listCityNamesStartingOnCertainLetter = CityHelper.getListCityNamesStartingOnCertainLetter(cities, letter);
        print(listCityNamesStartingOnCertainLetter);

        System.out.println("\nList of cities names with amount of use:");
        Map<String, Long> nameWithAmount = CityHelper.getAmountConsumed(cities);
        Set<Map.Entry<String, Long>> name = nameWithAmount.entrySet();
        name.stream().forEach(x -> System.out.println(x.getKey() + " - " + x.getValue()));
    }

    public static void print(List<String> list) {
        list.stream().forEach(x -> System.out.println(x));
    }
}
