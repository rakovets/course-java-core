package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsStatisticsTests {
    static Stream<Arguments> provideArgumentsGetCountNumberOfEven() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5), 2),
                Arguments.of(List.of(0, 1, 1, 2, 1), 1),
                Arguments.of(List.of(2, 2, 2, 2, 2), 5)
        );
    }

    @MethodSource("provideArgumentsGetCountNumberOfEven")
    @ParameterizedTest()
    void testGetCountNumberOfEven(List<Integer> listOfNumbers, int expected) {
        MathsStatistics mathsStatistics = new MathsStatistics(listOfNumbers);

        int actual = mathsStatistics.getCountNumberOfEven(listOfNumbers);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetCountNumberOfOdd() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5), 3),
                Arguments.of(List.of(0, 1, 1, 2, 1), 3),
                Arguments.of(List.of(2, 2, 2, 2, 2), 0)
        );
    }

    @MethodSource("provideArgumentsGetCountNumberOfOdd")
    @ParameterizedTest()
    void testGetCountNumberOfOdd(List<Integer> listOfNumbers, int expected) {
        MathsStatistics mathsStatistics = new MathsStatistics(listOfNumbers);

        int actual = mathsStatistics.getCountNumberOfOdd(listOfNumbers);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetCountZero() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5), 0),
                Arguments.of(List.of(0, 1, 1, 2, 1), 1),
                Arguments.of(List.of(2, 0, 0, 0, 0), 4)
        );
    }

    @MethodSource("provideArgumentsGetCountZero")
    @ParameterizedTest()
    void testGetCountZero(List<Integer> listOfNumbers, int expected) {
        MathsStatistics mathsStatistics = new MathsStatistics(listOfNumbers);

        int actual = mathsStatistics.getCountZero(listOfNumbers);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetCountNumberOfMatches() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5), 1, 1),
                Arguments.of(List.of(0, 1, 1, 2, 1), 1, 3),
                Arguments.of(List.of(2, 2, 2, 2, 2), 5, 0)
        );
    }

    @MethodSource("provideArgumentsGetCountNumberOfMatches")
    @ParameterizedTest()
    void testGetCountNumberOfMatches(List<Integer> listOfNumbers, int givenNumber, int expected) {
        MathsStatistics mathsStatistics = new MathsStatistics(listOfNumbers);

        int actual = mathsStatistics.getCountNumberOfMatches(listOfNumbers, givenNumber);

        assertEquals(expected, actual);
    }
}
