package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class MathsStatisticsTest {
    static Stream<Arguments> EvenNumbers() {
        return Stream.of(
                Arguments.of(List.of(0, 0, 0, 5, 6, 7, 2, 1, 9, 4, 3, 3, 4, 6, 5, 8, 8, 6, 7, 3, 2, 2, 1, 3, 0, 8, 7, 4, 6, 7), 17),
                Arguments.of(List.of(9, 4, 3, 2, 2, 8, 1, 5, 4, 5, 4, 7, 1, 8, 5, 7, 9, 6, 9, 4, 0, 2, 8, 1, 1, 6, 1, 9, 3, 6), 14)
        );
    }

    @ParameterizedTest
    @MethodSource("EvenNumbers")
    public void getEvenNumbersList(List<Integer> list, long expected) {
        MathsStatistics math = new MathsStatistics();

        long actual = math.getEvenNumbers(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> OddNumbers() {
        return Stream.of(
                Arguments.of(List.of(0, 0, 0, 5, 6, 7, 2, 1, 9, 4, 3, 3, 4, 6, 5, 8, 8, 6, 7, 3, 2, 2, 1, 3, 0, 8, 7, 4, 6, 7), 13),
                Arguments.of(List.of(9, 4, 3, 2, 2, 8, 1, 5, 4, 5, 4, 7, 1, 8, 5, 7, 9, 6, 9, 4, 0, 2, 8, 1, 1, 6, 1, 9, 3, 6), 16)
        );
    }

    @ParameterizedTest
    @MethodSource("OddNumbers")
    public void getOddNumbersList(List<Integer> list, long expected) {
        MathsStatistics math = new MathsStatistics();

        long actual = math.getOddNumbers(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> NumbersNull() {
        return Stream.of(
                Arguments.of(List.of(0, 0, 0, 5, 6, 7, 2, 1, 9, 4, 3, 3, 4, 6, 5, 8, 8, 6, 7, 3, 2, 2, 1, 3, 0, 8, 7, 4, 6, 7), 4),
                Arguments.of(List.of(9, 4, 3, 2, 2, 8, 1, 5, 4, 5, 4, 7, 1, 8, 5, 7, 9, 6, 9, 4, 0, 2, 8, 1, 1, 6, 1, 9, 3, 6), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("NumbersNull")
    public void getNumbersNullList(List<Integer> list, long expected) {
        MathsStatistics math = new MathsStatistics();

        long actual = math.getNumbersNull(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> Numbers() {
        return Stream.of(
                Arguments.of(List.of(0, 0, 0, 5, 6, 7, 2, 1, 9, 4, 3, 3, 4, 6, 5, 8, 8, 6, 7, 3, 2, 2, 1, 3, 0, 8, 7, 4, 6, 7), 3),
                Arguments.of(List.of(9, 4, 3, 2, 2, 8, 1, 5, 4, 5, 4, 7, 1, 8, 5, 7, 9, 6, 9, 4, 0, 2, 8, 1, 1, 6, 1, 9, 3, 6), 3)
        );
    }

    @ParameterizedTest
    @MethodSource("Numbers")
    public void getNumbersList(List<Integer> list, long expected) {
        MathsStatistics math = new MathsStatistics();

        long actual = math.getNumbers(list, 2);

        Assertions.assertEquals(expected, actual);
    }
}
