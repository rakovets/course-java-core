package com.rakovets.course.java.core.practice.decision_making_statements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Color HP")
class Task03Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(0, 346, null),
                Arguments.of(1, 6432, "RED"),
                Arguments.of(99, 400, "RED"),
                Arguments.of(50, 200, "ORANGE"),
                Arguments.of(99, 200, "ORANGE"),
                Arguments.of(50, 100, "YELLOW"),
                Arguments.of(149, 200, "YELLOW"),
                Arguments.of(75, 100, "GREEN"),
                Arguments.of(1001, 1001, "GREEN"),
                Arguments.of(101, 100, null)
        );
    }

    @ParameterizedTest(name = "Current HP: {0}")
    @MethodSource("provideArguments")
    void test(int currentHealthPoint, int maxHealthPoint, String expected) {
        assertEquals(expected, Task03.getColorHealthPoint(currentHealthPoint, maxHealthPoint));
    }
}
