package com.rakovets.course.javabasics.practice.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Generator rows of table (improve)")
class Task07Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(13, 20, 5, 143.35),
                Arguments.of(20, 42, 4, 553.42),
                Arguments.of(5, 10, 10, 57.18),
                Arguments.of(1, 20, 1, 1918.62),
                Arguments.of(0, 20, 5, 0.00)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(int startDistance, int finishDistance, int dailyProgress, double expected) {
        double actual = Task07.calculateTotalDistance(startDistance, finishDistance, dailyProgress);

        assertEquals(expected, actual);
    }
}
