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
@DisplayName("Material area")
@SuppressWarnings("unused")
class Task04Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(20, 314.16),
                Arguments.of(4, 12.57)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void getMaterialAreaTest(int diameter, double expected) {
        double actual = Task04.getMaterialArea(diameter);

        assertEquals(expected, actual);
    }
}
