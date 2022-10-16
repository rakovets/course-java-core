package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestMath {
    static Stream<Arguments> provideArgumentsForGetMaxValue() {
        return Stream.of(
                Arguments.of(1, 2, 3, 3),
                Arguments.of(0.12, 0.25, 3.5, 3.5)
        );
    }

    @ParameterizedTest(name = "GetMaxValue")
    @MethodSource("provideArgumentsForGetMaxValue")
    <T extends Number> void testGetMaxValue(T first, T second, T third, Number expected) {
        Number actual = Math.getMaxValue(first, second, third);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMinValue() {
        return Stream.of(
                Arguments.of(1, 2, 3, 4, 5, 1),
                Arguments.of(0.12, 0.25, 3.5, 6.5, -1.0, -1.0)
        );
    }

    @ParameterizedTest(name = "GetMinValue")
    @MethodSource("provideArgumentsForGetMinValue")
    <T extends Number> void testGetMinValue(T first, T second, T third, T fourth, T fifth, Number expected) {
        Number actual = Math.getMinValue(first, second, third,fourth,fifth);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetAverageValue() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3}, 2),
                Arguments.of(new Double[]{1.0, 2.0, 3.0}, 2.0)
        );
    }

    @ParameterizedTest(name = "GetAverageValue")
    @MethodSource("provideArgumentsForGetAverageValue")
    <T extends Number> void testGetAverageValue(T[] array, double expected) {
        double actual = Math.getAverageValue(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMaxArrayValue() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3}, 3),
                Arguments.of(new Double[]{1.0, 2.0, 3.0}, 3.0)
        );
    }

    @ParameterizedTest(name = "GetMaxArrayValue")
    @MethodSource("provideArgumentsForGetMaxArrayValue")
    <T extends Number> void testGetMaxArrayValue(T[] array, T expected) {
        T actual = Math.getMaxArrayValue(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMinArrayValue() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3}, 1),
                Arguments.of(new Double[]{1.0, 2.0, 3.0}, 1.0)
        );
    }

    @ParameterizedTest(name = "GetMinArrayValue")
    @MethodSource("provideArgumentsForGetMinArrayValue")
    <T extends Number> void testGetMinArrayValue(T[] array, T expected) {
        T actual = Math.getMinArrayValue(array);

        Assertions.assertEquals(expected, actual);
    }
}
