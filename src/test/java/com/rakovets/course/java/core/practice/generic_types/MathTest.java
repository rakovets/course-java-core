package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


import java.util.stream.Stream;

public class MathTest {

    static Stream<Arguments> provideArgumentsForGetMaxValueOfThreeNumbers() {
        return Stream.of(
                Arguments.of(5, 1, 5, -743),
                Arguments.of(99.9, 50.0, -100.0, 99.9)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxValueOfThreeNumbers")
    <T extends Number> void getMaxValueOfThreeNumbers(T expectedNumber, T x, T y, T z) {
        //GIVEN

        //WHEN
        T actualNumber = Math.getMaxValueOfThreeNumbers(x, y, z);

        //THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    static Stream<Arguments> provideArgumentsForgetMinValueOfFiveNumbers() {
        return Stream.of(
                Arguments.of(1, 1, 22, 50, 70, 2),
                Arguments.of(44.0, 430.2, 44.1, 44.0, 123.0, 50.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForgetMinValueOfFiveNumbers")
    <T extends Number> void provideArgumentsForgetMinValueOfFiveNumbers(T expectedNumber, T value1, T value2,
                                                                        T value3, T value4, T value5) {
        //GIVEN

        //WHEN
        T actualNumber = Math.getMinValueOfFiveNumbers(value1, value2, value3, value4, value5);

        //THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    static Stream<Arguments> provideArgumentsForgetArrayAverage() {
        return Stream.of(
                Arguments.of(10, new Integer[] {5, 10, 15}),
                Arguments.of(23.5, new Double[] {13.0, 17.0, 21.0, 43.0})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForgetArrayAverage")
    <T extends Number> void getArrayAverage(double expectedDouble, T[] array) {
        //GIVEN

        //WHEN
        double actualDouble = Math.getArrayAverage(array);

        //THEN
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    static Stream<Arguments> provideArgumentsForGetMaxValueFromArray() {
        return Stream.of(
                Arguments.of(4, new Integer[] {1, 2, 3, 4}),
                Arguments.of(11.3, new Double[] {1.3, 2.7, 7.0, 11.3})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxValueFromArray")
    <T extends Number> void getMaxFromArray(T expectedNumber, T[] array) {
        // GIVEN

        // WHEN
        T actualNumber = Math.getMaxValueFromArray(array);

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    static Stream<Arguments> provideArgumentsForGetMinValueFromArray() {
        return Stream.of(
                Arguments.of(1, new Integer[] {1, 2, 3, 4}),
                Arguments.of(1.3, new Double[] {1.3, 2.7, 7.0, 11.3})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinValueFromArray")
    <T extends Number> void getMinFromArray(T expectedNumber, T[] array) {
        // GIVEN

        // WHEN
        T actualNumber = Math.getMinValueFromArray(array);

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    static Stream<Arguments> provideArgumentsForBubbleSort() {
        return Stream.of(
                Arguments.of(new Integer[] {-1, 1, 2, 3, 4}, new Integer[] {1, 2, 3, 4, -1}),
                Arguments.of(new Double[] {-1.2, 1.0, 1.3, 1.5, 10.7, 11.0}, new Double[] {1.5, 10.7, 1.0, 1.3, 11.0, -1.2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForBubbleSort")
    <T extends Number> void bubbleSort(T[] expectedArray, T[] array) {
        // GIVEN

        // WHEN
        T[] actualArray = Math.bubbleSort(array);

        // THEN
        assertArrayEquals(expectedArray, actualArray);
    }

    static Stream<Arguments> provideArgumentsForBinarySearchArray() {
        return Stream.of(
                Arguments.of(4, 4, new Integer[] {-2, 1, 2, 3, 4}),
                Arguments.of(0, -9.8, new Double[] {-9.8, 1.3, 3.5, 4.7, 7.0, 10.0}),
                Arguments.of(2, 78L, new Long[] {-9L, 6L, 78L, 567L, 79587L, }),
                Arguments.of(-1, 0.0, new Double[] {-9.8, 1.3, 3.5, 4.7, 7.0, 10.0}),
                Arguments.of(-1, -5, new Integer[] {-2, 1, 2, 3, 4}),
                Arguments.of(-1, 987L, new Long[] {6L, 78L, 567L})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForBinarySearchArray")
    <T extends Number> void binarySearchArray(int expectedNumber, T elementToSearch, T[] array) {
        // GIVEN

        // WHEN
        int actualNumber = Math.binarySearchArray(array, elementToSearch);

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}
