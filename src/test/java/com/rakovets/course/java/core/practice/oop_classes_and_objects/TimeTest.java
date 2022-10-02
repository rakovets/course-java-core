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
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(11416, 11416),
                Arguments.of(9000, 9000),
                Arguments.of(7000, 7000)
        );
    }

    @ParameterizedTest(name = "Total seconds: {0}")
    @MethodSource("provideArguments")
    @DisplayName("Total seconds")
    void totalSecondsTestViaIntTotalSeconds(int totalSeconds, int expected) {
        Time test = new Time(totalSeconds);
        int actual = test.getTotalSeconds();

        assertEquals(expected, actual);
    }
}
