package com.rakovets.course.javabasics.practice.conditionalstatements;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author Dmitry Rakovets
 */
class Task07Test extends StandardOutputTest {
    static Stream<Arguments> provideYears() {
        return Stream.of(
                Arguments.of(1, false),
                Arguments.of(4, true),
                Arguments.of(400, false),
                Arguments.of(2400, false),
                Arguments.of(2019, false)
        );
    }

    @ParameterizedTest(name = "Year: {0}")
    @MethodSource("provideYears")
    @DisplayName("Leap-year")
    void test(int year, boolean expected) {
        boolean actual = Task07.isLeapYear(year);

        Assertions.assertEquals(expected, actual);
    }
}
