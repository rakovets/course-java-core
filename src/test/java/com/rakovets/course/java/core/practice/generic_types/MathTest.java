package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    static Stream<Arguments> provideArgumentsForGetMaxOfThreeNumbersMethod() {
        return Stream.of(
                Arguments.of(65, 45, 64, 65),
                Arguments.of(34.2, 29.1, 34.2, 30.7),
                Arguments.of(2, 2, -1, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxOfThreeNumbersMethod")
    <T extends Number> void getMaxOfThreeNumbers(T expected, T x, T y, T z) {

        T actual = Math.getMaxOfThreeNumbers(x, y, z);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForgetMinOfFiveNumbersMethod() {
        return Stream.of(
                Arguments.of(2, 45, 2, 65, 78, 2),
                Arguments.of(29.1, 29.1, 34.2, 30.7, 29.1, 56),
                Arguments.of(-29.1, -29.1, 34.2, 30.7, 29.1, 56)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForgetMinOfFiveNumbersMethod")
    <T extends Number> void getMinOfFiveNumbers(T expected, T a, T b, T c, T d, T e) {

        T actual = Math.getMinOfFiveNumbers(a, b, c, d, e);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetAverageMethod() {
        return Stream.of(
                Arguments.of(2, new Integer[] {1, 2, 3}),
                Arguments.of(3.675, new Double[] {1.4, 2.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAverageMethod")
    <T extends Number> void getAverage(double expected, T[] myArray) {

        double actual = Math.getAverage(myArray);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMaxOfArrayMethod() {
        return Stream.of(
                Arguments.of(3, new Integer[] {1, 2, 3}),
                Arguments.of(8.5, new Double[] {1.4, 8.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxOfArrayMethod")
    <T extends Number> void getMaxOfArray(T expected, T[] myArray) {

        T actual = Math.getMaxOfArray(myArray);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMinOfArrayMethod() {
        return Stream.of(
                Arguments.of(1, new Integer[] {1, 2, 3}),
                Arguments.of(1.4, new Double[] {1.4, 8.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinOfArrayMethod")
    <T extends Number> void getMinOfArray(T expected, T[] myArray) {

        T actual = Math.getMinOfArray(myArray);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSortArrayMethod() {
        return Stream.of(
                Arguments.of(new Integer[] {1, 2, 3}, new Integer[] {1, 2, 3}),
                Arguments.of(new Double[] {1.4, 3.6, 7.2, 8.5}, new Double[] {1.4, 8.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSortArrayMethod")
    <T extends Number> void sortArray(T[] expected, T[] myArray) {

        T[] actual = Math.sortArray(myArray);

        Assertions.assertArrayEquals(expected, actual);
    }
}
