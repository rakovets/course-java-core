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
@DisplayName("Rover trip distance")
@SuppressWarnings("unused")
class Task05Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(256, 3, 13.58),
                Arguments.of(3, 1, 0.48),
                Arguments.of(-100, 5, -3.18)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void getTripDistanceTest(int encoderDegrees, int tireRadius, double expected) {
        double actual = Task05.getTripDistance(encoderDegrees, tireRadius);

        assertEquals(expected, actual);
    }
}
