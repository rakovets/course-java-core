package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task07Test extends ConsoleTest {
    static Stream<Arguments> provideYears() {
        return Stream.of(
                Arguments.of("1", "not a leap year"),
                Arguments.of("4", "leap year"),
                Arguments.of("400", "not a leap year"),
                Arguments.of("2400", "not a leap year"),
                Arguments.of("2019", "not a leap year")
        );
    }

    @ParameterizedTest(name = "Year: {0}")
    @MethodSource("provideYears")
    @DisplayName("Leap-year")
    void test(String input, String expected) {
        Task07.main(new String[]{input});
        assertEquals(getConsoleContent(), expected);
    }
}