package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task02Test extends ConsoleTest {
    static Stream<Arguments> hoursProvider() {
        return Stream.of(
                Arguments.of("0", "Good night"),
                Arguments.of("1", "Good night"),
                Arguments.of("6", "Good morning"),
                Arguments.of("7", "Good morning"),
                Arguments.of("12", "Good day"),
                Arguments.of("13", "Good day"),
                Arguments.of("18", "Good evening"),
                Arguments.of("19", "Good evening")
        );
    }

    @ParameterizedTest(name = "Hour: {0}")
    @MethodSource("hoursProvider")
    @DisplayName("Greeting")
    void test(String input, String expected) {
        Task02.main(new String[]{input});
        assertEquals(getConsoleContent(), expected);
    }
}