package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.function.Predicate;

public class CityUtilDemo {

    public static void main(String[] args) {
        List<String> listOfCities = List.of("Minsk", "Madrid", "Lisbon", "Paris", "Brest", "Minsk", "Nicaragua");

        Predicate<String> uniqueCities = (str) -> listOfCities.stream().filter((city) -> city.equals(str)).count() == 1;
        Predicate<String> lengthMoreThanSix = (str) -> str.length() > 6;
        Predicate<String> startWith = (str) -> str.startsWith("B");

        System.out.println(CityUtil.getCities(listOfCities, uniqueCities));
        System.out.println(CityUtil.getCities(listOfCities, lengthMoreThanSix));
        System.out.println(CityUtil.getCities(listOfCities, startWith));
        System.out.println("Repetitions of specified city: " + CityUtil.getCityCount(listOfCities, "Minsk"));
    }
}
