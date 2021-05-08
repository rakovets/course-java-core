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
@DisplayName("Coordinate rounder")
@SuppressWarnings("unused")
class Task03Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(0.1f, 0),
                Arguments.of(111.5f, 112),
                Arguments.of(15.0f, 15),
                Arguments.of(11.2f, 11),
                Arguments.of(-22.9f, -23),
                Arguments.of(-15.0f, -15),
                Arguments.of(-11.2f, -11)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void roundCoordinateValueTest(float coordinateValue, long expected) {
        long actual = Task03.roundCoordinateValue(coordinateValue);

        assertEquals(expected, actual);
    }
}
