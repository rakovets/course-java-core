package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestMath {
    static Stream<Arguments> provideArgumentsMax() {
        return Stream.of(
                Arguments.of(9.0, 5.0, 4.0),
                Arguments.of(15, 7, 8),
                Arguments.of(150L, 4L, 3d),
                Arguments.of(15d, 4d, 0),
                Arguments.of(3.0, 1f, 2.99)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsMax")
    public void testMax(double expected, double a, double b) {
        Number actual = Math.getMaxArgument(a, b, expected);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsMax")
    public void testMaxLong(double expected, double a, double b) {
        Number actual = Math.getMaxArgumentUseArray(a, expected, b);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsMin() {
        return Stream.of(
                Arguments.of(9.0, 15.0, 14.0, 13.0, 17.f),
                Arguments.of(1, 7, 8, 5, 3),
                Arguments.of(5L, 14L, 33d, 43f, 67),
                Arguments.of(0, 4d, 0.1, 12, 4f),
                Arguments.of(3.0, 10f, 12.99, 56, 12d)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsMin")
    public void testMin(double expected, double a, double b, double c, double d) {
        Number actual = Math.getMinArgumentUseArray(a, b, expected, c, d);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageDouble() {
        Double[] array = new Double[]{1.0, 2.0, 3.0};

        float actual = Math.getAverageArray(array);
        float expected = 2f;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageInteger() {
        Integer[] array = new Integer[]{15, 25, 35};

        double actual = Math.getAverageArray(array);
        double expected = 25.0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageFloat() {
        Float[] array = new Float[]{150f, 0f, 450f};

        double actual = Math.getAverageArray(array);
        double expected = 200f;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxArrayDouble() {
        Double[] array = new Double[]{1.0, 2.0, 3.0};

        double actual = Math.getMaxArray(array);
        double expected = 3.0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxArrayInteger() {
        Integer[] array = new Integer[]{10, 20, 30};

        double actual = Math.getMaxArray(array);
        double expected = 30;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxArrayLong() {
        Long[] array = new Long[]{100000L, 200000L, 30000L};

        double actual = Math.getMaxArray(array);
        double expected = 200000.0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinArray() {
        Double[] array = new Double[]{1.0, 2.0, 3.0};

        Double actual = Math.getMinArray(array);
        Double expected = 1.0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinArrayDouble() {
        Double[] array = new Double[]{1.0, 2.0, 3.0};

        Double actual = Math.getMinArray(array);
        Double expected = 1.0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinArrayInteger() {
        Integer[] array = new Integer[]{100, 200, 300};

        double actual = Math.getMinArray(array);
        double expected = 100;

        Assertions.assertEquals(expected, actual);
    }
}
