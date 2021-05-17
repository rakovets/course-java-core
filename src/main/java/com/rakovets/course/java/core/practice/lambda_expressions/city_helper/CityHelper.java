package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.Collection;

public class CityHelper {
    public static void getUniqueCities(Collection<String> cities) {
        cities.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void getIfWordsLengthMoreThanSixCharacters(Collection<String> cities) {
        cities.stream()
                .filter(s -> s.length() > 6)
                .forEach(System.out::println);
    }

    public static void getIfWordsStartWithGivenLetter(Collection<String> cities, String givenLetter) {
        cities.stream()
                .filter(s -> s.startsWith(givenLetter))
                .forEach(System.out::println);
    }

    public static long getCountGivenWordBeenUsed(Collection<String> cities, String givenWord) {
        return cities.stream()
                .filter(s -> s.equals(givenWord))
                .count();
    }
}
