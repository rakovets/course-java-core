package com.rakovets.course.java.core.practice.lambda_expressions.test;

import com.rakovets.course.java.core.practice.lambda_expressions.city_helper.CityUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class CityUtilTest {
    public static Stream<Arguments> provideArgumentsForGetUniqueCity() {
        return Stream.of(
                Arguments.of(Arrays.asList("Gomel", "Gomel", "Minsk", "Mosk"), Arrays.asList("Minsk", "Mosk")),
                Arguments.of(Collections.emptyList(), Collections.emptyList()),
                Arguments.of(Collections.singletonList("Piter"), Collections.singletonList("Piter")),
                Arguments.of(Arrays.asList("Borispol", "Borispol"), Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetUniqueCity")
    void getUniqueCityText(Collection<String> rowData, Collection<String> expected) {
        Collection<String> actual = CityUtil.getUniqueCity(rowData);

        Assertions.assertEquals(actual, expected);
    }

    public static Stream<Arguments> provideArgumentsForGetParameterSizeCity() {
        return Stream.of(
                Arguments.of(Arrays.asList("Antananarivy", "Gomel", "Los-Angels", "Piter"),
                        Arrays.asList("Antananarivy", "Los-Angels"), 6),
                Arguments.of(Arrays.asList("Antananarivy", "Gomel", "Los-Angels", "Piter"),
                        Collections.emptyList(), 13),
                Arguments.of(Arrays.asList("Antananarivy", "Gomel", "Los-Angels", "Piter"),
                        Collections.emptyList(), 20)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetParameterSizeCity")
    void getParameterSizeCityTest(Collection<String> rowData, Collection<String> expected, int size) {
        Collection<String> actual = CityUtil.getParameterSizeCity(rowData, size);

        Assertions.assertEquals(actual, expected);
    }

    public static Stream<Arguments> provideArgumentsForGetCityWithFirstCharacter() {
        return Stream.of(
                Arguments.of(Arrays.asList("Gomel", "Moskow", "Grodno", "gomel"),
                        Arrays.asList("Gomel", "Grodno"), 'G'),
                Arguments.of(Arrays.asList("Gomel", "Moskow", "Grodno", "gomel"),
                        Collections.emptyList(), 'P')
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetCityWithFirstCharacter")
    void getCityWithFirstCharacterTest(Collection<String> rowData, Collection<String> expected, char startSymbol) {
        Collection<String> actual = CityUtil.getCityWithFirstCharacter(rowData, startSymbol);

        Assertions.assertEquals(actual, expected);
    }

    public static Stream<Arguments> provideArgumentsForGetAmountCity() {
        return Stream.of(
                Arguments.of(Arrays.asList("Gomel", "Gomel", "Gomel"), "Gomel", 3),
                Arguments.of(Arrays.asList("Gomel", "Gomel", "Gomel"), "gomel", 0),
                Arguments.of(Arrays.asList("Gomel", "Piter", "Moskow"), "Piter", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAmountCity")
    void getAmountCityTest(Collection<String> rowData, String city, long expected) {
        long actual = CityUtil.getAmountCity(rowData, city);

        Assertions.assertEquals(actual, expected);
    }
}
