package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.city_helper.UtilityCityHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class CityHelperTest {
    static Stream<Arguments> provideArgumentsForUniqueCities() {
        return Stream.of(
                Arguments.of(List.of("Minsk", "Minsk", "Moskow", "Vitebsk", "Grodno", "Moskow"),
                        List.of("Minsk", "Moskow", "Vitebsk", "Grodno")),
                Arguments.of(List.of("New-York", "Riga", "Paris", "Riga", "Rimini", "Rome", "New-York"),
                        List.of("New-York", "Riga", "Paris", "Rimini", "Rome"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForUniqueCities")
    public void getUniqueCities(List<String> cities, List<String> expected) {
        UtilityCityHelper utility = new UtilityCityHelper(cities);

        List<String> actual = utility.getUniqueCities();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCityNameMoreThenSix() {
        return Stream.of(
                Arguments.of(List.of("Minsk", "Minsk", "Moskow", "Vitebsk", "Grodno", "Moskow"),
                        List.of("Vitebsk")),
                Arguments.of(List.of("New-York", "Riga", "Paris", "Riga", "Rimini", "Rome", "New-York"),
                        List.of("New-York"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCityNameMoreThenSix")
    public void getCityNameMoreThenSix(List<String> cities, List<String> expected) {
        UtilityCityHelper utility = new UtilityCityHelper(cities);

        List<String> actual = utility.getCityNameMoreThenSix();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCityByLetter() {
        return Stream.of(
                Arguments.of(List.of("Minsk", "Minsk", "Moskow", "Vitebsk", "Grodno", "Moskow"), "M",
                        List.of("Minsk", "Moskow")),
                Arguments.of(List.of("New-York", "Riga", "Paris", "Riga", "Rimini", "Rome", "New-York"), "R",
                        List.of("Riga", "Rimini", "Rome"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCityByLetter")
    public void getCityByLetter(List<String> cities, String letter, List<String> expected) {
        UtilityCityHelper utility = new UtilityCityHelper(cities);

        List<String> actual = utility.getCityByLetter(letter);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForNumberOfOneCity() {
        return Stream.of(
                Arguments.of(List.of("Minsk", "Minsk", "Moskow", "Vitebsk", "Grodno", "Moskow"), "Grodno", 1),
                Arguments.of(List.of("New-York", "Riga", "Paris", "Riga", "Rimini", "Rome", "New-York"), "Riga", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForNumberOfOneCity")
    public void getNumberOfOneCity(List<String> cities, String city, long expected) {
        UtilityCityHelper utility = new UtilityCityHelper(cities);

        long actual = utility.getNumberOfOneCity(city);

        Assertions.assertEquals(expected, actual);
    }
}
