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
@DisplayName("Raid Boss Monitoring")
class Task03Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(100, 5.0, 10, 162),
                Arguments.of(100, 0.0, 5, 100),
                Arguments.of(100, -5.0, 0, 100),
                Arguments.of(100, -4.0, 6, 78),
                Arguments.of(100, 100.0, 0, 100),
                Arguments.of(100, 25.0, 5, 305)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(int healthPoints, double regenerationPercentFromCurrentHealth, int hoursAfterRespawn, int expected) {
        int actual = Task03.calculateHealthPointsByTime(healthPoints, regenerationPercentFromCurrentHealth, hoursAfterRespawn);

        assertEquals(expected, actual);
    }
}
