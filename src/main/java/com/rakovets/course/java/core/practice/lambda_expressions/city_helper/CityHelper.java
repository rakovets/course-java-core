package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CityHelper {
    public static List<String> getUniqueCities(Collection<String> cities) {
        return cities.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getIfWordsLengthMoreThanSixCharacters(Collection<String> cities) {
        return cities.stream()
                .filter(s -> s.length() > 6)
                .collect(Collectors.toList());
    }

    public static List<String> getIfWordsStartWithGivenLetter(Collection<String> cities, String givenLetter) {
        return cities.stream()
                .filter(s -> s.startsWith(givenLetter))
                .collect(Collectors.toList());
    }

    public static long getCountGivenWordBeenUsed(Collection<String> cities, String givenWord) {
        return cities.stream()
                .filter(s -> s.equals(givenWord))
                .count();
    }
}
