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
class Task04Test {
    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(0, null),
                Arguments.of(1, "MONDAY"),
                Arguments.of(2, "TUESDAY"),
                Arguments.of(3, "WEDNESDAY"),
                Arguments.of(4, "THURSDAY"),
                Arguments.of(5, "FRIDAY"),
                Arguments.of(6, "SATURDAY"),
                Arguments.of(7, "SUNDAY"),
                Arguments.of(8, null)
        );
    }

    @ParameterizedTest(name = "Weekday number: {0}")
    @MethodSource("testProvider")
    @DisplayName("Weekday converter")
    void test(int weekday, String expected) {
        assertEquals(expected, Task04.getNameWeekday((byte) weekday));
    }
}
