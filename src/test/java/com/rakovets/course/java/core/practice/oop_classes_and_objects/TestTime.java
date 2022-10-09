package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestTime {
    static Stream<Arguments> provideArgumentsForTime() {
        return Stream.of(
                Arguments.of(10, 20, 30, 37230),
                Arguments.of(2, 8, 3, 7683),
                Arguments.of(0, 0, 0, 0),
                Arguments.of(10, 20, 31, 37231));
    }

    @ParameterizedTest(name = "Total second: {3}")
    @MethodSource("provideArgumentsForTime")
    void test(int hours, int minutes, int seconds, int expected) {
        Time time = new Time(hours, minutes, seconds);

        int actual = time.getTotalSeconds();
        Assertions.assertEquals(expected, actual);
    }
}
