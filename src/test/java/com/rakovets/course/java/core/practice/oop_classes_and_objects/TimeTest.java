package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dzmitry Krasiuk
 */
@DisplayName("Time")
public class TimeTest {
    static Stream<Arguments> provideArguments1() {
        return Stream.of(
                Arguments.of(11416, 11416),
                Arguments.of(9000, 9000),
                Arguments.of(7000, 7000)
        );
    }

    static Stream<Arguments> provideArguments2() {
        return Stream.of(
                Arguments.of(1, 1, 1, 3661),
                Arguments.of(2, 2, 2, 7322),
                Arguments.of(3, 3, 3, 10983)
        );
    }

    @ParameterizedTest(name = "Total seconds: {0}")
    @MethodSource("provideArguments1")
    @DisplayName("Total seconds #1")
    void totalSecondsTestViaIntTotalSeconds(int totalSeconds, int expected) {
        Time test1 = new Time(totalSeconds);
        int actual = test1.getTotalSeconds();

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Total seconds: {0}")
    @MethodSource("provideArguments2")
    @DisplayName("Total seconds #2")
    void totalSecondsTest(int hours, int minutes, int seconds, int expected) {
        Time test2 = new Time(hours, minutes, seconds);
        int actual = test2.getTotalSeconds();

        assertEquals(expected, actual);
    }
}
