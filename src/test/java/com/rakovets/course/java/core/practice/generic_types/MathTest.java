package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    static Stream<Arguments> provideArgumentsForGetMaxOf3numbersMethod() {
        return Stream.of(
                Arguments.of(65, 45, 64, 65),
                Arguments.of(34.2, 29.1, 34.2, 30.7),
                Arguments.of(2, 2, -1, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxOf3numbersMethod")
    void getMinOf5numbers(double expected, Number x, Number y, Number z) {

        double actual = Math.getMaxOf3numbers(x, y, z);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMinOf5numbersMethod() {
        return Stream.of(
                Arguments.of(2, 45, 2, 65, 78, 2),
                Arguments.of(29.1, 29.1, 34.2, 30.7, 29.1, 56),
                Arguments.of(-29.1, -29.1, 34.2, 30.7, 29.1, 56)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinOf5numbersMethod")
    void getMinOf5numbers(double expected, Number a, Number b, Number c, Number d, Number e) {

        double actual = Math.getMinOf5numbers(a, b, c, d, e);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetAverageMethod() {
        return Stream.of(
                Arguments.of(2, new Integer[] {1, 2, 3}),
                Arguments.of(3.675, new Number[] {1.4, 2.5, 3.6, 7.2}),
                Arguments.of(3.675, new Double[] {1.4, 2.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAverageMethod")
    void getAverage(double expected, Number[] myArray) {

        double actual = Math.getAverage(myArray);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMaxOfArrayMethod() {
        return Stream.of(
                Arguments.of(3, new Integer[] {1, 2, 3}),
                Arguments.of(7.2, new Number[] {1.4, 2.5, 3.6, 7.2}),
                Arguments.of(8.5, new Double[] {1.4, 8.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxOfArrayMethod")
    void getMaxOfArray(double expected, Number[] myArray) {

        double actual = Math.getMaxOfArray(myArray);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMinOfArrayMethod() {
        return Stream.of(
                Arguments.of(1, new Integer[] {1, 2, 3}),
                Arguments.of(-2.5, new Number[] {1.4, -2.5, 3.6, 7.2}),
                Arguments.of(1.4, new Double[] {1.4, 8.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinOfArrayMethod")
    void getMinOfArray(double expected, Number[] myArray) {

        double actual = Math.getMinOfArray(myArray);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSortArrayMethod() {
        return Stream.of(
                Arguments.of(new Integer[] {1, 2, 3}, new Integer[] {1, 2, 3}),
                Arguments.of(new Number[] {-2.5, 1.4, 3.6, 7.2}, new Number[] {1.4, -2.5, 3.6, 7.2}),
                Arguments.of(new Double[] {1.4, 3.6, 7.2, 8.5}, new Double[] {1.4, 8.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSortArrayMethod")
    void sortArray(Number[] expected, Number[] myArray) {

        Number[] actual = Math.sortArray(myArray);

        Assertions.assertArrayEquals(expected, actual);
    }
}
