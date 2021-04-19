package com.rakovets.course.java.core.practice.looping_statements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Raid Boss campaign")
class Task04Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(10000, 5.0, 500, -1),
                Arguments.of(10000, 5.0, 917, 17),
                Arguments.of(10000, 5.0, 700, -1),
                Arguments.of(10000, 5.0, 740, 24),
                Arguments.of(10000, -5.0, 1000, 8),
                Arguments.of(10000, 5.0, 1550, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(int healthPoints, double regenerationPercentPerHour, int averageDamagePerHour, int expected) {
        int actual = Task04.calculateRaidTime(healthPoints, regenerationPercentPerHour, averageDamagePerHour);

        assertEquals(expected, actual);
    }
}
