package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathTest {
    static Stream<Arguments> provideArgumentsForMaxNumberMethod() {
        return Stream.of(
                Arguments.of(-1, 2, 6, 6),
                Arguments.of(0, 22, 1, 22),
                Arguments.of(197, 198, 199, 199),
                Arguments.of(-1, -2, -3, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMaxNumberMethod")
    <T>
    void testMaxNumberMethod(T numberOne, T numberTwo, T numberThree, T expected) {
        Math<Integer> math = new Math<Integer>();
        T actual = math.maxNumber(numberOne, numberTwo, numberThree);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMinNumberMethod() {
        return Stream.of(
                Arguments.of(-1, 2, 6, 3, 7, -1),
                Arguments.of(0, 22, 1, 18, 8, 0),
                Arguments.of(197, 198, 199, 196, 195, 195),
                Arguments.of(-1, -2, -3, -4, 5, -4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMinNumberMethod")
    <T>
    void testMinNumberMethod(T numberOne, T numberTwo, T numberThree, T numberFour, T numberFive, T expected) {
        Math<Integer> math = new Math<Integer>();
        T actual = math.minNumber(numberOne, numberTwo, numberThree, numberFour, numberFive);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAverageMethod() {
        return Stream.of(
                Arguments.of(new Integer[]{9, 22, 45, 21, 23, 15, 11, 332}, 59.75),
                Arguments.of(new Integer[]{4, -12, 3, -6, 1}, -2.0),
                Arguments.of(new Integer[]{-1, -5, 2, 5, -1}, 0.0),
                Arguments.of(new Integer[]{0, 0 , 0, 999, 1}, 200.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAverageMethod")
    <T extends Number>
    void testAverageMethod(T[] array, double expected) {
        Math<Integer> math = new Math<Integer>();
        double actual = math.average(array);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMaxNumberInArrayMethod() {
        return Stream.of(
                Arguments.of(new Integer[]{9, 22, 45, 21, 23, 15, 11, 332}, 332),
                Arguments.of(new Integer[]{4, -12, 3, -6, 1}, 4),
                Arguments.of(new Integer[]{-1, -5, 2, 5, -1}, 5),
                Arguments.of(new Integer[]{0, 0 , 0, 999, 1}, 999)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMaxNumberInArrayMethod")
    <T extends Number>
    void testMaxNumberInArrayMethod(T[] array, T expected) {
        Math<Integer> math = new Math<Integer>();
        T actual = math.maxNumberInArray(array);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMinNumberInArrayMethod() {
        return Stream.of(
                Arguments.of(new Integer[]{9, 22, 45, 21, 23, 15, 11, 332}, 9),
                Arguments.of(new Integer[]{4, -12, 3, -6, 1}, -12),
                Arguments.of(new Integer[]{-1, -5, 2, 5, -1}, -5),
                Arguments.of(new Integer[]{0, 0 , 0, 999, 1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMinNumberInArrayMethod")
    <T extends Number>
    void testMinNumberInArrayMethod(T[] array, T expected) {
        Math<Integer> math = new Math<Integer>();
        T actual = math.minNumberInArray(array);
        Assertions.assertEquals(expected, actual);
    }
}
