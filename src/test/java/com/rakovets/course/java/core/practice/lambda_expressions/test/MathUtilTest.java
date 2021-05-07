package com.rakovets.course.java.core.practice.lambda_expressions.test;

import com.rakovets.course.java.core.practice.lambda_expressions.math_statistics.MathUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class MathUtilTest {
    public static Stream<Arguments> provideArgumentsForFindOddNumbers() {
        return Stream.of(
                Arguments.of(Arrays.asList(5, 7, 11, 12, 4, 8, 5, 22), 4),
                Arguments.of(Arrays.asList(2, 4, 8), 3),
                Arguments.of(Arrays.asList(1, 3, 5, 21, 221), 0),
                Arguments.of(Collections.emptyList(), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFindOddNumbers")
    void findOddNumbersTest(Collection<Integer> rowCollection, int expected) {
        long actual = MathUtil.findOddNumbers(rowCollection);

        Assertions.assertEquals(actual, expected);
    }

    public static Stream<Arguments> provideArgumentsForFindNoOddNumbers() {
        return Stream.of(
                Arguments.of(Arrays.asList(5, 7, 11, 12, 4, 8, 5, 22), 4),
                Arguments.of(Arrays.asList(2, 4, 8), 0),
                Arguments.of(Arrays.asList(1, 3, 5, 21, 221), 5),
                Arguments.of(Collections.emptyList(), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFindNoOddNumbers")
    void findNoOddNumbersTest(Collection<Integer> rowCollection, long expected) {
        long actual = MathUtil.findNoOddNumbers(rowCollection);

        Assertions.assertEquals(actual, expected);
    }

    public static Stream<Arguments> provideArgumentsForFindZero() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 8, 22, 105), 0),
                Arguments.of(Arrays.asList(2, 0, 5, 10, 20, 1), 1),
                Arguments.of(Collections.emptyList(), 0),
                Arguments.of(Arrays.asList(-0, -5, -7, 2), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFindZero")
    void findZeroTest(Collection<Integer> rowCollection, long expected) {
        long actual = MathUtil.findZero(rowCollection);

        Assertions.assertEquals(actual, expected);
    }

    public static Stream<Arguments> provideArgumentsForFindNumberEqualsParameter() {
        return Stream.of(
                Arguments.of(Arrays.asList(2, 4, 8, 22, 11, 12, 15, 14, 13), 4, 1),
                Arguments.of(Arrays.asList(2, 4, 8, 22, 11, 12, 15, 4, 4), 4, 3),
                Arguments.of(Arrays.asList(-32, 4, 8, -32, 11, 12, 15, 14, 13), -32, 2),
                Arguments.of(Collections.emptyList(), -2, 0),
                Arguments.of(Arrays.asList(2, 4, 8, -22, 11, -12, 15, -14, 13), -22, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFindNumberEqualsParameter")
    void findNumberEqualsParameterTest(Collection<Integer> rowCollection, int equalParameter, long expected) {
        long actual = MathUtil.findNumberEqualsParameter(rowCollection, equalParameter);

        Assertions.assertEquals(actual, expected);
    }
}
