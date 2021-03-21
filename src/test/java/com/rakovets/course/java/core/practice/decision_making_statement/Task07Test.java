package com.rakovets.course.java.core.practice.decision_making_statement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Leap-year")
class Task07Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(1, false),
                Arguments.of(4, true),
                Arguments.of(100, false),
                Arguments.of(2400, true),
                Arguments.of(2019, false)
        );
    }

    @ParameterizedTest(name = "Year: {0}")
    @MethodSource("provideArguments")
    void test(int year, boolean expected) {
        boolean actual = Task07.isLeapYear(year);

        Assertions.assertEquals(expected, actual);
    }
}
