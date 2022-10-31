package com.rakovets.course.java.core.practice.lambda_expressions;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class UtilityCityHelperTest {
    static Stream<Arguments> provideArsForGetUniqueCities() {
        return Stream.of(
                Arguments.of(List.of("Istanbul", "Bursa", "Ankara", "Ankara", "Bursa", "Trabzon", "Rize", "Trabzon"),
                        List.of("Istanbul", "Bursa", "Ankara", "Trabzon", "Rize"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArsForGetUniqueCities")
    public void getUniqueCities(List<String> cities, List<String> expected) {
        UtilityCityHelper utilityCityHelper = new UtilityCityHelper(cities);
        List<String> actual = utilityCityHelper.getUniqueCities();
        Assertions.assertEquals(expected, actual);

    }

    static Stream<Arguments> provideArsForTheLongestNames() {
        return Stream.of(
                Arguments.of(List.of("Istanbul", "Bursa", "Ankara", "Ankara", "Bursa", "Trabzon", "Rize", "Trabzon"),
                        List.of("Istanbul", "Trabzon"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArsForTheLongestNames")
    public void getTheLongestCities(List<String> cities, List<String> expected) {
        UtilityCityHelper utilityCityHelper = new UtilityCityHelper(cities);
        List<String> actual = utilityCityHelper.theLongestNames();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgsForStartWithChosenLetter() {
        return Stream.of(
                Arguments.of(List.of("Istanbul", "Bursa", "Ankara", "Ankara", "Bursa", "Trabzon", "Rize", "Trabzon", "Antalya", "Alanya"),
                        List.of("Ankara", "Antalya", "Alanya"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForStartWithChosenLetter")
    public void getCitiesByFirstLetter(List<String> cities, List<String> expected) {
        UtilityCityHelper utilityCityHelper = new UtilityCityHelper(cities);
        List<String> actual = utilityCityHelper.startWithChosenWord("A");
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgsForCountName() {
        return Stream.of(
                Arguments.of(List.of("Istanbul", "Bursa", "Ankara", "Ankara", "Bursa", "Trabzon", "Rize", "Trabzon", "Antalya", "Alanya"), 2
                ));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForCountName")
    public void getCountName(List<String> cities, long expected) {
        UtilityCityHelper utilityCityHelper = new UtilityCityHelper(cities);
        long actual = utilityCityHelper.countName("Ankara");
        Assertions.assertEquals(expected, actual);
    }
}
