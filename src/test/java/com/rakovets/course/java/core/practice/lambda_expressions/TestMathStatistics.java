package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.math_statistics.MathStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMathStatistics {
    MathStatistics mathStatistics = new MathStatistics();

    public static void main(String[] args) {
        MathStatistics mathStatistics1 = new MathStatistics();
        List<Integer> list = mathStatistics1.getListOfRandomNumbers(10);
        System.out.println(list);
    }

    static Stream<Arguments> provideArgumentsForCountEvenNumbers() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(125, 254, 115, 879, 38, 0, 14, 444)), 5),
                Arguments.of(new ArrayList<>(List.of(78, 778, 100, 1, 17, 10, 25, 7)), 4),
                Arguments.of(new ArrayList<>(List.of(125, 255, 115, 879, 37, 1, 11, 441)), 0)
        );
    }

    @ParameterizedTest(name = "countEvenNumbers")
    @MethodSource("provideArgumentsForCountEvenNumbers")
    void testCountEvenNumbers(List<Integer> randomNumbers, long expected) {
        long actual = mathStatistics.countEvenNumbers(randomNumbers);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCountOddNumbers() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(125, 254, 115, 879, 38, 0, 14, 444)), 3),
                Arguments.of(new ArrayList<>(List.of(78, 778, 100, 1, 17, 10, 25, 7)), 4),
                Arguments.of(new ArrayList<>(List.of(125, 255, 115, 879, 37, 1, 11, 441)), 8)
        );
    }

    @ParameterizedTest(name = "countOddNumbers")
    @MethodSource("provideArgumentsForCountOddNumbers")
    void testCountOddNumbers(List<Integer> randomNumbers, long expected) {
        long actual = mathStatistics.countOddNumbers(randomNumbers);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCountNullNumbers() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(125, 254, 115, 879, 38, 0, 14, 444)), 1),
                Arguments.of(new ArrayList<>(List.of(78, 778, 100, 1, 17, 10, 25, 7)), 0),
                Arguments.of(new ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0)), 8)
        );
    }

    @ParameterizedTest(name = "countNullNumbers")
    @MethodSource("provideArgumentsForCountNullNumbers")
    void testCountNullNumbers(List<Integer> randomNumbers, long expected) {
        long actual = mathStatistics.countNullNumbers(randomNumbers);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCountSpecificNumbers() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(125, 254, 115, 879, 38, 0, 14, 444)), 111, 0),
                Arguments.of(new ArrayList<>(List.of(78, 778, 10, 1, 17, 10, 25, 7)), 10, 2),
                Arguments.of(new ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0)), 0, 8)
        );
    }

    @ParameterizedTest(name = "countSpecificNumbers")
    @MethodSource("provideArgumentsForCountSpecificNumbers")
    void testCountSpecificNumbers(List<Integer> randomNumbers, int specificNumber, long expected) {
        long actual = mathStatistics.countSpecificNumbers(randomNumbers, specificNumber);

        Assertions.assertEquals(expected, actual);
    }
}
