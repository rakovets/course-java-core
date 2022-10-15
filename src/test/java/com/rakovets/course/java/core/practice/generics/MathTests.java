package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTests {
    static Stream<Arguments> provideArgumentsGetMaxValueArray() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3}, 3),
                Arguments.of(new Integer[]{3, 1, 5, 7}, 7),
                Arguments.of(new Integer[]{6, 2}, 6)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetMaxValueArray")
    void testGetMaxValueArray(Integer[] array, int expected) {
        int actual = Math.getMaxValueArray(array);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetMinValueArray() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3}, 1),
                Arguments.of(new Integer[]{3, 2, 5, 7}, 2),
                Arguments.of(new Integer[]{6, 0}, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetMinValueArray")
    void testGetMinValueArray(Integer[] array, int expected) {
        int actual = Math.getMinValueArray(array);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetArrayAverage() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3}, 2.0),
                Arguments.of(new Integer[]{3, 2, 5, 7}, 4.25),
                Arguments.of(new Integer[]{6, 0}, 3.0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetArrayAverage")
    void testGetArrayAverage(Integer[] array, double expected) {
        double actual = Math.getArrayAverage(array);

        assertEquals(expected, actual);
    }
}
