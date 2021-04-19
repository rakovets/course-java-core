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
@DisplayName("Smart running tracker")
class Task06Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(13, 20, 5, 150.51),
                Arguments.of(2000, 4200, 4, 57556.16),
                Arguments.of(50, 100, 10, 628.97),
                Arguments.of(100, 2000, 1, 193780.77),
                Arguments.of(0, 20, 5, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(int startDistance, int finishDistance, double dailyProgress, double expected) {
        double actual = Task06.calculateTotalDistance(startDistance, finishDistance, dailyProgress);

        assertEquals(expected, actual);
    }
}
