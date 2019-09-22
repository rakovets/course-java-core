package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task04Test extends ConsoleTest {
    static Stream<Arguments> provideWeekdays() {
        return Stream.of(
                Arguments.of("1", "monday"),
                Arguments.of("2", "tuesday"),
                Arguments.of("3", "wednesday"),
                Arguments.of("4", "thursday"),
                Arguments.of("5", "friday"),
                Arguments.of("6", "saturday"),
                Arguments.of("7", "sunday")
        );
    }

    @ParameterizedTest(name = "Weekday number: {0}")
    @MethodSource("provideWeekdays")
    @DisplayName("Weekday converter")
    void test(String input, String expected) {
        Task04.main(new String[]{input});
        assertEquals(getConsoleContent(), expected);
    }
}