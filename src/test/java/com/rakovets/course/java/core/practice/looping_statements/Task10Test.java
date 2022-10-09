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
@DisplayName("Prime numbers")
class Task10Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(1, 1, 0),
                Arguments.of(1, 2, 1),
                Arguments.of(1, 10, 4),
                Arguments.of(10, 20, 4),
                Arguments.of(1, 50, 15),
                Arguments.of(50, 120, 15),
                Arguments.of(1, 1_000_000, 78_492)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(int startNumber, int finishNumber, int expected) {
        int actual = Task10.countPrimeNumber(startNumber, finishNumber);

        assertEquals(expected, actual);
    }
}
