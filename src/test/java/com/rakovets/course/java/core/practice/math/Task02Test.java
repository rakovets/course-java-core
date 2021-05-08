package com.rakovets.course.java.core.practice.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Counter for tiles")
@SuppressWarnings("unused")
class Task02Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(1, 1.0),
                Arguments.of(9, 3.0),
                Arguments.of(3, 1.73),
                Arguments.of(256, 16.0),
                Arguments.of(-5, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void getSideSizeTest(int weight, double expected) {
        double actual = Task02.getSideSize(weight);

        assertEquals(expected, actual);
    }
}
