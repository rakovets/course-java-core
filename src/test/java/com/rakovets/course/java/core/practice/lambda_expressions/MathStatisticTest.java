package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.maths_statistics.MathsStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class MathStatisticTest {
    MathsStatistics statistics = new MathsStatistics();

    static Stream<Arguments> ProvideArgumentsForGetListRandomNumbers() {
        return Stream.of(
                Arguments.of(10, 0, 0, List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)),
                Arguments.of(7, 1, 1, List.of(1, 1, 1, 1, 1, 1, 1)),
                Arguments.of(5, 5, 5, List.of(5, 5, 5, 5, 5))
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForGetListRandomNumbers")
    void testGetListRandomNumbers(int size, int leftBorder, int rightBorder, List<Integer> expected) {
        List<Integer> actual = statistics.getListRandomNumbers(size, leftBorder, rightBorder);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForCountingAmountEvenNumbers() {
        return Stream.of(
                Arguments.of(List.of(4, 9, 5, 2, 7, 1, 0, 7, 10, 0), 5),
                Arguments.of(List.of(6, 2, 4, 0, 10, 7, 9, 7, 6, 0), 7),
                Arguments.of(List.of(4, 2, 2, 0, 8, 8, 3, 2, 9, 2), 8)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForCountingAmountEvenNumbers")
    void testCountingAmountEvenNumbers(List<Integer> listNumbers, long expected) {
        long actual = statistics.countingAmountEvenNumbers(listNumbers);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForCountingAmountOddNumbers() {
        return Stream.of(
                Arguments.of(List.of(4, 8, 6, 0, 10, 10, 2, 1, 6, 8), 1),
                Arguments.of(List.of(3, 1, 9, 0, 8, 2, 3, 4, 0, 1), 5),
                Arguments.of(List.of(6, 9, 7, 6, 1, 0, 5, 9, 1, 5), 7)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForCountingAmountOddNumbers")
    void testCountingAmountOddNumbers(List<Integer> listNumbers, long expected) {
        long actual = statistics.countingAmountOddNumbers(listNumbers);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForCountingAmountNumbersEqualZero() {
        return Stream.of(
                Arguments.of(List.of(10, 3, 8, 1, 2, 7, 8, 6, 6, 0), 1),
                Arguments.of(List.of(2, 0, 2, 0, 6, 8, 1, 10, 10, 5), 2),
                Arguments.of(List.of(2, 1, 1, 5, 6, 9, 2, 10, 1, 6), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForCountingAmountNumbersEqualZero")
    void testCountingAmountNumbersEqualZero(List<Integer> listNumbers, long expected) {
        long actual = statistics.countingAmountNumbersEqualZero(listNumbers);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForCountingAmountGivenNumbers() {
        return Stream.of(
                Arguments.of(List.of(3, 7, 2, 5, 0, 3, 2, 4, 3, 0), 7, 1),
                Arguments.of(List.of(10, 1, 3, 1, 6, 4, 9, 6, 9, 10), 5, 0),
                Arguments.of(List.of(4, 2, 6, 10, 3, 10, 1, 2, 6, 5), 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForCountingAmountGivenNumbers")
    void testCountingAmountGivenNumbers(List<Integer> listNumbers, int number, long expected) {
        long actual = statistics.countingAmountGivenNumbers(listNumbers, number);

        Assertions.assertEquals(expected, actual);
    }
}
