package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestMath {
    static Stream<Arguments> provideArgumentsForGetMaxArrayValue() {
        return Stream.of(
                Arguments.of(new Object[]{1, 2, 3}, 3),
                Arguments.of(new Object[]{1, 7, 4}, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxArrayValue")
    void testGetMaxOfParameters(Object[] array, Integer expected) {
        Object actual = Math.getMaxArrayValue(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMinArrayValue() {
        return Stream.of(
                Arguments.of(new Object[]{1, 2, 3}, 1),
                Arguments.of(new Object[]{1, 7, 4}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinArrayValue")
    void testGetMinOfParameters(Object[] array, Integer expected) {
        Object actual = Math.getMinArrayValue(array);

        Assertions.assertEquals(expected, actual);
    }
}
