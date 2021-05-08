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
@DisplayName("Minimal penalty points")
@SuppressWarnings("unused")
class Task01Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(1, 2, 1),
                Arguments.of(2, 1, 1),
                Arguments.of(-3, 2, -3),
                Arguments.of(2, -3, -3),
                Arguments.of(-5, -4, -5),
                Arguments.of(0, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void getMinPenaltyPointsTest(int firstPlayerPenaltyPoints, int secondPlayerPenaltyPoints, int expected) {
        int actual = Task01.getMinPenaltyPoints(firstPlayerPenaltyPoints, secondPlayerPenaltyPoints);

        assertEquals(expected, actual);
    }
}
