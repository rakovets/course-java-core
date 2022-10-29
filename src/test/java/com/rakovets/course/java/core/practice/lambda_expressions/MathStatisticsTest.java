package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.math_statistics.Utility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class MathStatisticsTest {
    Utility util = new Utility();
    List<Integer> listExample = util.getRandomList();

    static Stream<Arguments> provideArgumentsForEvenNumbers() {
        return Stream.of(
                Arguments.of(List.of(0, 3, 0, 2, 16, 78, 23, 1, 0, 9, 3, 7, 7, 56, 37, 61), 7),
                Arguments.of(List.of(91, 4, 3, 2, 2, 82, 16, 35, 45, 58, 4, 0, 1, 9, 5, 7), 8)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForEvenNumbers")
    public void getNumberOfEven(List<Integer> list, int expected) {
        int actual = util.numberOfEven(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForNotEvenNumbers() {
        return Stream.of(
                Arguments.of(List.of(0, 3, 0, 2, 16, 78, 23, 1, 0, 9, 3, 7, 7, 56, 37, 61), 9),
                Arguments.of(List.of(91, 4, 3, 2, 2, 82, 16, 35, 45, 58, 4, 0, 1, 9, 5, 7), 8)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForNotEvenNumbers")
    public void getNumberOfNotEven(List<Integer> list, int expected) {
        int actual = util.numberOfNotEven(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForNulls() {
        return Stream.of(
                Arguments.of(List.of(0, 3, 0, 2, 16, 78, 23, 1, 0, 9, 3, 7, 7, 56, 37, 61), 3),
                Arguments.of(List.of(91, 4, 3, 2, 2, 82, 16, 35, 45, 58, 4, 0, 1, 9, 5, 7), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForNulls")
    public void getNumberOfNulls(List<Integer> list, int expected) {
        int actual = util.numberOfNulls(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMyNumber() {
        return Stream.of(
                Arguments.of(List.of(0, 3, 0, 2, 16, 78, 23, 1, 0, 9, 3, 7, 7, 56, 37, 61), 7, 2),
                Arguments.of(List.of(91, 4, 3, 2, 2, 82, 16, 35, 45, 58, 4, 0, 1, 9, 5, 7), 6, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMyNumber")
    public void getNumberOfMyNum(List<Integer> list, int myNum, int expected) {
        int actual = util.numberOfMyNum(list, myNum);

        Assertions.assertEquals(expected, actual);
    }
}
