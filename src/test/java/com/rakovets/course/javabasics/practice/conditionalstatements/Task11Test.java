package com.rakovets.course.javabasics.practice.conditionalstatements;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
class Task11Test extends StandardOutputTest {
    static Stream<Arguments> provideSymbols() {
        return Stream.of(
                Arguments.of('1', "digit"),
                Arguments.of('0', "digit"),
                Arguments.of('О', "cyrillic"),
                Arguments.of('Н', "cyrillic"),
                Arguments.of('O', "latin"),
                Arguments.of('l', "latin"),
                Arguments.of('+', "undefined"),
                Arguments.of('[', "undefined")
        );
    }

    @ParameterizedTest(name = "Symbol: {0}")
    @MethodSource("provideSymbols")
    @DisplayName("Symbol-switcher")
    void test(char symbol, String expected) {
        String actual = Task11.getSymbolType(symbol);

        assertEquals(expected, actual);
    }
}
