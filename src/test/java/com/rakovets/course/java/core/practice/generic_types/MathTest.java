package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.rakovets.course.java.core.practice.generic_types.Math.getMaxIndexInArray;

class MathTest {

    //task-1 test

    static Stream<Arguments> provideArgumentsForGetMaxMethod() {
        return Stream.of(
                Arguments.of(65, 45, 64, 65),
                Arguments.of(34.2, 29.1, 34.2, 30.7),
                Arguments.of(2, 2, -1, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxMethod")
    <T extends Number> void getMaxNumbers(T expected, T x, T y, T z) {

        T actual = Math.getMax(x, y, z);

        Assertions.assertEquals(expected, actual);
    }

    //task-2 test

    static Stream<Arguments> provideArgumentsForgetMinMethod() {
        return Stream.of(
                Arguments.of(2, 45, 2, 65, 78, 2),
                Arguments.of(29.1, 29.1, 34.2, 30.7, 29.1, 56),
                Arguments.of(-29.1, -29.1, 34.2, 30.7, 29.1, 56)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForgetMinMethod")
    <T extends Number> void getMin(T expected, T a, T b, T c, T d, T e) {

        T actual = Math.getMin(a, b, c, d, e);

        Assertions.assertEquals(expected, actual);
    }

    //task-3 test

    static Stream<Arguments> provideArgumentsForGetAverageInArrayMethod() {
        return Stream.of(
                Arguments.of(2, new Integer[] {1, 2, 3}),
                Arguments.of(3.675, new Double[] {1.4, 2.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAverageInArrayMethod")
    <T extends Number> void getAverageInArray(double expected, T[] array) {

        double actual = Math.getAverageInArray(array);

        Assertions.assertEquals(expected, actual);
    }

    //task-4 test

    static Stream<Arguments> provideArgumentsForGetMaxIndexInArrayMethod() {
        return Stream.of(
                Arguments.of(3, new Integer[] {1, 2, 3}),
                Arguments.of(8.5, new Double[] {1.4, 8.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxIndexInArrayMethod")
    <T extends Number> void getMaxOfArray(double expected, T[] array) {

        double actual = getMaxIndexInArray(array);

        Assertions.assertEquals(expected, actual);
    }

    //task-5 test

    static Stream<Arguments> provideArgumentsForGetMinIndexInArrayMethod() {
        return Stream.of(
                Arguments.of(1, new Integer[] {1, 2, 3}),
                Arguments.of(1.4, new Double[] {1.4, 8.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinIndexInArrayMethod")
    <T extends Number> void getMinOfArray(double expected, T[] array) {

        double actual = Math.getMinIndexInArray(array);

        Assertions.assertEquals(expected, actual);
    }

    //task-6 test

    static Stream<Arguments> provideArgumentsForSortArrayMethod() {
        return Stream.of(
                Arguments.of(new Integer[] {1, 2, 3}, new Integer[] {1, 2, 3}),
                Arguments.of(new Double[] {1.4, 3.6, 7.2, 8.5}, new Double[] {1.4, 8.5, 3.6, 7.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSortArrayMethod")
    <T extends Number> void sortArray(T[] expected, T[] array) {

        T[] actual = Math.sortArray(array);

        Assertions.assertArrayEquals(expected, actual);
    }

    //task-7 test

    static Stream<Arguments> provideArgumentsForBinarySearchMethod() {
        return Stream.of(
                Arguments.of(-1, null, new Integer[] {1, 2, 3, 4, 5, 6}),
                Arguments.of(2, 3.1, new Double[] {1.1, 2.1, 3.1, 4.1, 5.1, 6.1}),
                Arguments.of(6, 7L, new Long[] {1L, 2L, 3L, 4L, 5L, 6L, 7L }),
                Arguments.of(-1, 7, new Integer[] {1, 2, 3, 4, 5, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForBinarySearchMethod")
    <T extends Number> void binarySearch(int expectedNumber, T key, T[] array) {

        int actualNumber = Math.binarySearch(key, array);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}
