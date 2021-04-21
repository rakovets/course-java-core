package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


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

}
