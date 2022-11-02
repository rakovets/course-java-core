package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    static Stream<Arguments> provideArgumentsGetTotalSeconds() {
        return Stream.of(
                Arguments.of(1, 1, 1, 3661),
                Arguments.of(1, 0, 0, 3600),
                Arguments.of(5, 2, 3, 18123)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetTotalSeconds")
    void testGetTotalSeconds(int hours, int minutes, int seconds, int expected) {
        Time time = new Time(hours, minutes, seconds);
        int actual = time.getTotalSeconds(hours, minutes, seconds);
        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetAllTime() {
        return Stream.of(
                Arguments.of(1, 3, 5, 1, 3, 5),
                Arguments.of(1, 3, 0, 1, 3, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetAllTime")
    void testGetAllTime(int hours, int minutes, int seconds, int expectedHours, int expectedMinutes,
                        int expectedSeconds) {
        Time time = new Time(hours, minutes, seconds);
        int actualHours = time.getHours();
        int actualMinutes = time.getMinutes();
        int actualSeconds = time.getSeconds();
        assertEquals(expectedHours, actualHours);
        assertEquals(expectedMinutes, actualMinutes);
        assertEquals(expectedSeconds, actualSeconds);
    }
    static Stream<Arguments> provideArgumentsSetSeconds() {
        return Stream.of(
                Arguments.of(60, 57, 57),
                Arguments.of(0, 2, 2)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSetSeconds")
    void testSetSeconds(int seconds, int secondsNew, int expected) {
        Time time = new Time(seconds);
        time.setSeconds(secondsNew);
        int actual = time.getSeconds();
        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsSetMinutes() {
        return Stream.of(
                Arguments.of(1, 5, 5),
                Arguments.of(0, 3, 3)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSetMinutes")
    void testSetMinutes(int minutes, int minutesNew, int expected) {
        Time time = new Time(minutes);
        time.setMinutes(minutesNew);
        int actual = time.getMinutes();
        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsSetHours() {
        return Stream.of(
                Arguments.of(2, 7, 7),
                Arguments.of(0, 8, 8)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSetHours")
    void testSetHours(int minutes, int minutesNew, int expected) {
        Time time = new Time(minutes);
        time.setHours(minutesNew);
        int actual = time.getHours();
        assertEquals(expected, actual);
    }
}
