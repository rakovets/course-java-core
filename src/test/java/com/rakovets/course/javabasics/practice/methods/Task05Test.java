package com.rakovets.course.javabasics.practice.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 * @version 1.0
 */
class Task05Test {
    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(0, null),
                Arguments.of(1, "JANUARY"),
                Arguments.of(2, "FEBRUARY"),
                Arguments.of(3, "MARCH"),
                Arguments.of(4, "APRIL"),
                Arguments.of(5, "MAY"),
                Arguments.of(6, "JUNE"),
                Arguments.of(7, "JULY"),
                Arguments.of(8, "AUGUST"),
                Arguments.of(9, "SEPTEMBER"),
                Arguments.of(10, "OCTOBER"),
                Arguments.of(11, "NOVEMBER"),
                Arguments.of(12, "DECEMBER"),
                Arguments.of(13, null)
        );
    }

    @ParameterizedTest(name = "Month number: {0}")
    @MethodSource("testProvider")
    @DisplayName("Month converter")
    void test(int monthNumber, String expected) {
        assertEquals(expected, Task05.getNameMonth((byte) monthNumber));
    }
}
