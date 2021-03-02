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
@DisplayName("Weight")
class Task05Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(176, 90, 24),
                Arguments.of(158, 34, -14),
                Arguments.of(180, 70, 0)
        );
    }

    @MethodSource("provideArguments")
    @ParameterizedTest(name = "Cargo: {0}. Carrying capacity: {1}")
    void test(int height, int weight, int expected) {
        int actual = Task05.calculateDeviationStandardWeight(height, weight);

        assertEquals(expected, actual);
    }
}
