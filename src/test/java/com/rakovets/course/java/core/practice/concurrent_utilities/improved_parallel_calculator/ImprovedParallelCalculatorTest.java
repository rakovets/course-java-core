package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ImprovedParallelCalculatorTest {
    ImprovedParallelCalculator calculator = new ImprovedParallelCalculator();
    static RandomGenerator randomGenerator = new RandomGenerator();

    static Stream<Arguments> provideArgumentsForGetMapArraysAndSumArrays() {
        return Stream.of(
                Arguments.of(randomGenerator.getListRandomLengthArraysConsistingOfRandomIntNumbers(
                        1, 5, 5, 5, 5),
                        Map.of("[5, 5, 5, 5, 5]", 25)),
                Arguments.of(randomGenerator.getListRandomLengthArraysConsistingOfRandomIntNumbers(
                                1, 3, 3, 7, 7),
                        Map.of("[7, 7, 7]", 21)),
                Arguments.of(randomGenerator.getListRandomLengthArraysConsistingOfRandomIntNumbers(
                                1, 8, 8, 2, 2),
                        Map.of("[2, 2, 2, 2, 2, 2, 2, 2]", 16))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMapArraysAndSumArrays")
    void testGetMapArraysAndSumArrays(List<int[]> list, Map<String, Integer> expected) {
        Map<String, Integer> actual = calculator.getMapArraysAndSumArrays(list);

        Assertions.assertEquals(expected, actual);
    }
}
