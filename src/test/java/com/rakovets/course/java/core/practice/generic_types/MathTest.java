package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    static Stream<Arguments> findMaxNumber3() {
        return Stream.of(
                Arguments.of(13.0, 5, 9, 13),
                Arguments.of(5.4, 1.3, 5.4, 0.9)
        );
    }

    @ParameterizedTest
    @MethodSource("findMaxNumber3")
    <T extends Number> void getMaxNumber3(T expectedNumber, T first, T second, T third) {
        double actualNumber = Math.getMaxNumber3(first, second, third);
        Assertions.assertEquals(expectedNumber, actualNumber);

    }

    static Stream<Arguments> findMinNumber5() {
        return Stream.of(
                Arguments.of(5.0, 10, 23, 44.6, 5, 7L),
                Arguments.of(-3.0, 12, 1.4, 56f, 1L, -3)
        );
    }

    @ParameterizedTest
    @MethodSource("findMinNumber5")
    <T extends Number> void getMinNumber5(T expectedNumber, T first, T second, T third, T fourth, T fifth) {
        double actualNumber = Math.getMinNumber5(first, second, third, fourth, fifth);
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    static Stream<Arguments> Average() {
        return Stream.of(
                Arguments.of(5.0, new Integer[]{5, 5, 5} ),
                Arguments.of(10.0, new Double[]{10.0, 10.0, 10.0})
        );
    }

    @ParameterizedTest
    @MethodSource("Average")
    <T extends Number> void getArithmeticMean(T expectedArithmeticMean, T[] sum) {
        double actualNumber = Math.getArithmeticMean(sum);
        Assertions.assertEquals(expectedArithmeticMean, actualNumber);
    }

    static Stream<Arguments> MaxNumber() {
        return Stream.of(
                Arguments.of(5, new Integer[]{3, 4, 5} ),
                Arguments.of(10.0, new Double[]{8.0, 9.0, 10.0})
        );
    }

    @ParameterizedTest
    @MethodSource("MaxNumber")
    <T extends Number> void getMaxArray(T expectedMax, T [] sum) {
        T actualMaxNumber = Math.getMaxArray(sum);
        Assertions.assertEquals(expectedMax, actualMaxNumber);
    }

    static Stream<Arguments> MinNumber() {
        return Stream.of(
                Arguments.of(3, new Integer[]{3, 4, 5} ),
                Arguments.of(8.0, new Double[]{8.0, 9.0, 10.0})
        );
    }

    @ParameterizedTest
    @MethodSource("MinNumber")
    <T extends Number> void getMinArray(T expected, T [] sum) {
        T actualMinNumber = Math.getMinArray(sum);
        Assertions.assertEquals(expected, actualMinNumber);
    }
}
