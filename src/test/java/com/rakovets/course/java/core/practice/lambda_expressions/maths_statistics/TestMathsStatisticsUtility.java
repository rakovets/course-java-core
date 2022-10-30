package com.rakovets.course.java.core.practice.lambda_expressions.maths_statistics;

import com.rakovets.course.java.core.practice.lambda_expressions.maths_statistics.Utility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestMathsStatisticsUtility {
    Utility utility = new Utility();

    static Stream<Arguments> provideArgumentsCountEvenNumber() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 3}, 2),
                Arguments.of(new int[]{0, -1, 2, -3}, 2),
                Arguments.of(new int[]{0, 0, 0, 0}, 4),
                Arguments.of(new int[]{1, 3, 5, 7}, 0),
                Arguments.of(new int[]{0, 2, -4, 6}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCountEvenNumber")
    void testCountEvenNumber(int[] array, long expected) {
        long actual = utility.countEvenNumber(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsCountOddNumber() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 3}, 2),
                Arguments.of(new int[]{0, -1, 2, -3}, 2),
                Arguments.of(new int[]{0, 0, 0, 0}, 0),
                Arguments.of(new int[]{1, 3, 5, 7}, 4),
                Arguments.of(new int[]{0, 1, -3, 7}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCountOddNumber")
    void testCountOddNumber(int[] array, long expected) {
        long actual = utility.countOddNumber(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsCountNumbersEqualZero() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 3}, 1),
                Arguments.of(new int[]{0, -1, 2, -3}, 1),
                Arguments.of(new int[]{0, 0, 0, 0}, 4),
                Arguments.of(new int[]{1, 3, 5, 7}, 0),
                Arguments.of(new int[]{0, 1, -3, 7}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCountNumbersEqualZero")
    void testCountNumbersEqualZero(int[] array, long expected) {
        long actual = utility.countNumbersEqualZero(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsСountNumbersEqualSetValue() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 3}, 1, 1),
                Arguments.of(new int[]{0, -1, 2, -1}, -1, 2),
                Arguments.of(new int[]{0, 0, 0, 0}, 0, 4),
                Arguments.of(new int[]{0, 1, -3, 7}, -3, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsСountNumbersEqualSetValue")
    void testСountNumbersEqualSetValue(int[] array, int setValue, long expected) {
        long actual = utility.countNumbersEqualSetValue(array, setValue);

        Assertions.assertEquals(expected, actual);
    }
}
