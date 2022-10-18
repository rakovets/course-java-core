package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathTest {
    static Stream<Arguments> provideArgumentsForGetMinValue() {
        return Stream.of(
                Arguments.of(new Object[]{5, 8, 2}, 2),
                Arguments.of(new Object[]{3, 3, 5}, 3),
                Arguments.of(new Object[]{2, 9, 5}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinValue")
    public void checkGetMinNumber(Object[] obj, Integer expected) {
        Object actual = Math.getMinValue(obj);

        Assertions.assertEquals(expected, actual);
        }


    static Stream<Arguments> provideArgumentsForGetMaxValue() {
        return Stream.of(
                Arguments.of(new Object[]{5, 8, 2}, 8),
                Arguments.of(new Object[]{3, 4, 5}, 5),
                Arguments.of(new Object[]{2, 9, 5}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxValue")
    public void checkGetMax(Object[] obj, Integer expected) {
        Object actual = Math.getMaxValue(obj);

        Assertions.assertEquals(expected, actual);
    }
}
