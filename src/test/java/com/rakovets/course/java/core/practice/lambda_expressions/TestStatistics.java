package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.statistics.ProjectMathsStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class TestStatistics {
    ProjectMathsStatistics projectMathsStatistics = new ProjectMathsStatistics();

    static Stream<Arguments> provideFromGetEven() {
        return Stream.of(Arguments.of(List.of(2, 2, 5, 6, 8, 1, 0, 99), 5));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetEven")
    public void getTestEven(List<Integer> list, long expected) {
        long actual = projectMathsStatistics.getEven(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetNotEven() {
        return Stream.of(Arguments.of(List.of(2, 2, 5, 6, 8, 1, 0, 99), 3));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetNotEven")
    public void getTestNotEven(List<Integer> list, long expected) {
        long actual = projectMathsStatistics.getNotEven(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetEqualsZero() {
        return Stream.of(Arguments.of(List.of(2, 2, 5, 6, 8, 1, 0, 99), 1));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetEqualsZero")
    public void getTestEqualsZero(List<Integer> list, long expected) {
        long actual = projectMathsStatistics.getEqualsZero(list);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetSomethingValue() {
        return Stream.of(Arguments.of(List.of(2, 2, 5, 6, 8, 1, 0, 99), 2, 2));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetSomethingValue")
    public void getTestSomethingValue(List<Integer> list, long y, long expected) {
        long actual = projectMathsStatistics.getSomethingValue(list, y);

        Assertions.assertEquals(expected, actual);
    }
}
