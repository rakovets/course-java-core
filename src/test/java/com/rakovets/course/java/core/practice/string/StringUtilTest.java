package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class AutoAssuranceWithJUnitStringUtil {
    static Stream<Arguments> task01ProviderArguments() {
        return Stream.of(
                Arguments.of(" privet Andrei ", " privet", " Andrei "),
                Arguments.of(" privet", " privet", ""),
                Arguments.of(" Andrei ", "", " Andrei ")
        );
    }

    @ParameterizedTest
    @MethodSource("task01ProviderArguments")
    void task01(String expectedString, String str1, String str2) {
        // GIVEN

        // WHEN
        String actualString = str1.concat(str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
    static Stream<Arguments> task02ProviderArguments() {
        return Stream.of(
                Arguments.of(0, " privet Andrei ", " "),
                Arguments.of(-1, " privet Andrei ", "W")
        );
    }

    @ParameterizedTest
    @MethodSource("task02ProviderArguments")
    void task02(int expectedString, String task01, String symbol) {
        // GIVEN

        // WHEN
        int actualString = task01.indexOf(symbol);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
    static Stream<Arguments> task03ProviderArguments() {
        return Stream.of(
                Arguments.of(false, " privet", " Andrei "),
                Arguments.of(true, " privet", " privet"),
                Arguments.of(true, " Andrei ", " Andrei ")
        );
    }

    @ParameterizedTest
    @MethodSource("task03ProviderArguments")
    void task03(boolean expectedString, String str1, String str2) {
        // GIVEN

        // WHEN
        boolean actualString = str1.equals(str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
    static Stream<Arguments> task04ProviderArguments() {
        return Stream.of(
                Arguments.of("PRIVET ANDREI", " privet Andrei "),
                Arguments.of("PRIVET", " privet"),
                Arguments.of("ANDREI", " Andrei ")
        );
    }

    @ParameterizedTest
    @MethodSource("task04ProviderArguments")
    void task04(String expectedString, String task01) {
        // GIVEN

        // WHEN
        String actualString = task01.trim().toUpperCase();

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }
}
