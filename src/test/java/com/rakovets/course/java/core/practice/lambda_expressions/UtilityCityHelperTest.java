package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UtilityCityHelperTest {
    UtilityCityHelper utilityCityHelper;

    @BeforeEach
    public void cityNames() {
        List<String> cities = new ArrayList<>();
        utilityCityHelper = new UtilityCityHelper(cities);
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Bursa");
        cities.add("Ankara");
        cities.add("Ankara");
        cities.add("Bursa");
        cities.add("Trabzon");
        cities.add("Rize");
        cities.add("Trabzon");
        cities.add("Antalya");
        cities.add("Alanya");
    }

    static Stream<Arguments> provideArsForGetUniqueCities() {
        return Stream.of(
                Arguments.of(
                        List.of("Istanbul", "Bursa", "Ankara", "Trabzon", "Rize", "Antalya", "Alanya"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArsForGetUniqueCities")
    public void testGetUniqueCities(List<String> expected) {
        List<String> actual = utilityCityHelper.getUniqueCities();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArsForTheLongestNames() {
        return Stream.of(
                Arguments.of( 6,
                        List.of("Istanbul", "Trabzon", "Antalya"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArsForTheLongestNames")
    public void testGetTheLongestCities(int nameLength, List<String> expected) {
        List<String> actual = utilityCityHelper.getTheLongestNames(nameLength);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgsForStartWithChosenLetter() {
        return Stream.of(
                Arguments.of("A",
                        List.of("Ankara", "Antalya", "Alanya"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForStartWithChosenLetter")
    public void testGetCitiesByFirstLetter(String firstLetter, List<String> expected) {
        List<String> actual = utilityCityHelper.startWithChosenWord(firstLetter);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgsForCountName() {
        return Stream.of(
                Arguments.of("Ankara", 2));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForCountName")
    public void testGetCountName(String chosenCity, long expected) {
        long actual = utilityCityHelper.countName(chosenCity);

        Assertions.assertEquals(expected, actual);
    }
}
