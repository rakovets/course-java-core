package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class MathsStatisticsTest {
    static Stream<Arguments> provideArgumentsForGetEvenNumbers() {
        return Stream.of(
                Arguments.of(List.of(100,101,102,103,104,105,106,107,108,109,110), 6),
                Arguments.of(List.of(234,235,236,234,234,238,240,251,252), 7),
                Arguments.of(List.of(501,510,512,550,570,571,572,572,574,578,590),9)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetEvenNumbers")
    public void getEven(List<Integer> numbers, long expected) {
        MathsStatistics mathsStatistics = new MathsStatistics();
        long actual = mathsStatistics.getEvenNumbers(numbers);
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForOddNumbers() {
        return Stream.of(
                Arguments.of(List.of(100,101,102,103,104,105,106,107,108,109,110), 5),
                Arguments.of(List.of(234,235,236,234,234,238,240,251,252), 2),
                Arguments.of(List.of(501,510,512,550,570,571,572,572,574,578,590), 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOddNumbers")
    public void getOdd(List<Integer> numbers, long expected) {
        MathsStatistics mathsStatistics = new MathsStatistics();
        long actual = mathsStatistics.getOddNumbers(numbers);
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForZero() {
        return Stream.of(
                Arguments.of(List.of(0,1,0,2,0,3,0,4,0,5), 5),
                Arguments.of(List.of(7,6,5,0,4,3,2,0,1,0), 3),
                Arguments.of(List.of(10,11,15,18,19,20), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForZero")
    public void getZero(List<Integer> numbers, long expected) {
        MathsStatistics mathsStatistics = new MathsStatistics();
        long actual = mathsStatistics.getZero(numbers);
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForEqualValue() {
        return Stream.of(
                Arguments.of(List.of(100,101,100,102,103,100,104,105,106,100,107), 4),
                Arguments.of(List.of(100,100,100,103,105,107,100,100), 5),
                Arguments.of(List.of(105,107,109,110,111,112), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForEqualValue")
    public void getEqualZero(List<Integer> numbers, long expected) {
        MathsStatistics mathsStatistics = new MathsStatistics();
        long actual = mathsStatistics.equalValue(numbers,100);
        Assertions.assertEquals(actual, expected);
    }
}
