package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task03Test extends ConsoleTest {
    static Stream<Arguments> healthPointPlayerProvider() {
        return Stream.of(
                Arguments.of("0", "RED"),
                Arguments.of("12", "RED"),
                Arguments.of("25", "ORANGE"),
                Arguments.of("49", "ORANGE"),
                Arguments.of("50", "YELLOW"),
                Arguments.of("57", "YELLOW"),
                Arguments.of("75", "GREEN"),
                Arguments.of("91", "GREEN"),
                Arguments.of("100", "GREEN")
        );
    }

    @ParameterizedTest(name = "HP percentage: {0}")
    @MethodSource("healthPointPlayerProvider")
    @DisplayName("Color HP")
    void test(String position, String expected) {
        Task03.main(new String[]{position});
        assertEquals(getConsoleContent(), expected);
    }
}