package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMath {
    static Stream<Arguments> provideArgumentsGetMaxFromArray() {
        return Stream.of(
                Arguments.of(new Number[]{0, 2, -3}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetMaxFromArray")
    public void testGetMaxFromArray(Number[] array, Number expected) {
        Number actual = Math.getMaxFromArray(array);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetMinFromArray() {
        return Stream.of(
                Arguments.of(new Number[]{0.0, 7.0, -3.0}, -3.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetMinFromArray")
    public void testGetMinFromArray(Number[] array, Number expected) {
        Number actual = Math.getMinFromArray(array);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetArithmeticMeanFromArray() {
        return Stream.of(
                Arguments.of(new Number[]{19.0, 0.0, -7.0}, 4.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetArithmeticMeanFromArray")
    public void testGetArithmeticMeanFromArray(Number[] array, Number expected) {
        Number actual = Math.getArithmeticMeanFromArray(array);

        assertEquals(expected, actual);
    }
}
