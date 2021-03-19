package com.rakovets.course.java.core.practice.operators;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Distance")
class Task04Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(2000, 662.0),
                Arguments.of(250, 82.75),
                Arguments.of(0, 0.0)
        );
    }

    @MethodSource("provideArguments")
    @ParameterizedTest(name = "Cargo: {0}. Carrying capacity: {1}")
    void test(int milliseconds, double expected) {
        double actual = Task04.getDistance(milliseconds);

        assertEquals(expected, actual);
    }
}
