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
@DisplayName("Position player")
class Task01Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(5, 1, true),
                Arguments.of(5, 5, true),
                Arguments.of(5, 6, false),
                Arguments.of(5, 13, false)
        );
    }

    @ParameterizedTest(name = "Top size: {0}. Position player bu damage: {1}")
    @MethodSource("provideArguments")
    void test(int sizeTop, int positionPlayerByDamage, boolean expected) {
        assertEquals(expected, Task01.isTopPlayer(sizeTop, positionPlayerByDamage));
    }
}
