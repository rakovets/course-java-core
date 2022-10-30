package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.city_helper.City;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class TestCities {
    static Stream<Arguments> provideFromGetUniqueCities() {
        return Stream.of(Arguments.of(List.of("Minsk", "Gomel", "Svetlogorsk", "Barcelona", "Pinsk",
                        "Mozyr", "Loev", "Loev", "Gomel", "Minsk", "Mozyr", "Pinsk"),
                List.of("Minsk", "Gomel", "Svetlogorsk", "Barcelona", "Pinsk", "Mozyr", "Loev")));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetUniqueCities")
    public void getUniqueCities(List<String> list, List<String> expected) {
        City city = new City(list);

        List<String> actual = city.getUniqueCities(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetCitiesMoreSixSymbol() {
        return Stream.of(Arguments.of(List.of("Minsk", "Gomel", "Svetlogorsk", "Barcelona", "Pinsk"),
                List.of("Svetlogorsk", "Barcelona")));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetCitiesMoreSixSymbol")
    public void getCitiesMoreSixSymbol(List<String> list, List<String> expected) {
        City city = new City(list);

        List<String> actual = city.getCitiesMoreSixSymbol(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetCitiesStartingWithTheLetter() {
        return Stream.of(Arguments.of(List.of("Minsk", "Gomel", "Svetlogorsk", "Barcelona", "Pinsk", "Borisov"), "B",
                List.of("Barcelona", "Borisov")));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetCitiesStartingWithTheLetter")
    public void getCitiesStartingWithTheLetter(List<String> list, String letter, List<String> expected) {
        City city = new City(list);

        List<String> actual = city.getCitiesStartingWithTheLetter(list, letter);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetAmountCityIntoList() {
        return Stream.of(Arguments.of(List.of("Minsk", "Gomel", "Svetlogorsk", "Barcelona", "Pinsk", "Borisov", "Barcelona")
                , "Barcelona", 2));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetAmountCityIntoList")
    public void getAmountCityIntoList(List<String> list, String town, long expected) {
        City city = new City(list);

        Long actual = city.getAmountCityIntoList(list, town);

        Assertions.assertEquals(expected, actual);
    }
}
