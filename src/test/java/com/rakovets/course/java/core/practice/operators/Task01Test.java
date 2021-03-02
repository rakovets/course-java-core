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
@DisplayName("Full trucks")
class Task01Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(2, 2, 1),
                Arguments.of(9, 1, 9),
                Arguments.of(5, 2, 2),
                Arguments.of(20, 50, 0)
        );
    }

    @MethodSource("provideArguments")
    @ParameterizedTest(name = "Cargo: {0}. Carrying capacity: {1}")
    void test(int cargo, int carryingCapacity, int expected) {
        int actual = Task01.getNumberFullTrucks(cargo, carryingCapacity);

        assertEquals(expected, actual);
    }
}
