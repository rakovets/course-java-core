package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task11Test extends ConsoleTest {
    static Stream<Arguments> provideSymbols() {
        return Stream.of(
                Arguments.of("1", "digit"),
                Arguments.of("0", "digit"),
                Arguments.of("О", "cyrillic"),
                Arguments.of("Н", "cyrillic"),
                Arguments.of("O", "latin"),
                Arguments.of("l", "latin"),
                Arguments.of("+", "undefined"),
                Arguments.of("[", "undefined")
        );
    }

    @ParameterizedTest(name = "Symbol: {0}")
    @MethodSource("provideSymbols")
    @DisplayName("Symbol-switcher")
    void test(String input, String expected) {
        Task11.main(new String[]{input});
        assertEquals(getConsoleContent(), expected);
    }
}