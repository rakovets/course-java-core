package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class TestCityHelperUtility {
    Utility utility = new Utility();

    static Stream<Arguments> provideArgumentsGetUniqueCities() {
        return Stream.of(
                Arguments.of(List.of("Paris", "Warsaw", "Paris"), "[Warsaw, Paris]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetUniqueCities")
    void testGetUniqueCities(List<String> cities, String expected) {
        Set<String> actual = utility.getUniqueCities(cities);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsGetUniqueCitiesWithLengthMoreThan6Letters() {
        return Stream.of(
                Arguments.of(List.of("Paris", "Warsaw", "Vancouver"), "[Vancouver]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetUniqueCitiesWithLengthMoreThan6Letters")
    void testGetUniqueCitiesWithLengthMoreThan6Letters(List<String> cities, String expected) {
        Set<String> actual = utility.getUniqueCitiesWithLengthMoreThan6Letters(cities);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsGetUniqueCitiesStartWithSetLetter() {
        return Stream.of(
                Arguments.of(List.of("Paris", "Warsaw", "Vancouver"), "W", "[Warsaw]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetUniqueCitiesStartWithSetLetter")
    void testGetUniqueCitiesStartWithSetLetter(List<String> cities, String setLetter, String expected) {
        Set<String> actual = utility.getUniqueCitiesStartWithSetLetter(cities, setLetter);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsGetCountSetCityFromList() {
        return Stream.of(
                Arguments.of(List.of("Paris", "Warsaw", "Warsaw"), "Warsaw", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetCountSetCityFromList")
    void testGetCountSetCityFromList(List<String> cities, String setCity, long expected) {
        long actual = utility.getCountSetCityFromList(cities, setCity);

        Assertions.assertEquals(expected, actual);
    }
}
