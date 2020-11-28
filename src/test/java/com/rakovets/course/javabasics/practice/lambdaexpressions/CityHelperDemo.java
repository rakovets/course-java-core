package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;

public class CityHelperDemo {
    public static void main(String[] args) {
        System.out.println("All cities: " + Arrays.asList(CityHelper.getAll()));
        System.out.println("Unique cities: " + Arrays.asList(CityHelper.getUnique()));
        System.out.println("Cities more 6 letters: " + Arrays.asList(CityHelper.getLong()));
        char letter = 'M';
        System.out.println("Cities starts with letter " + letter + ": " + Arrays.asList(CityHelper.getWithFirstLetter(letter)));
        String city = "Minsk";
        System.out.println("Amount of " + city + ": " + CityHelper.getAmount(city));
    }
}
