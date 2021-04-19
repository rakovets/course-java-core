package com.rakovets.course.java.core.practice.decision_making_statements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Symbol-switcher")
class Task11Test {
    static Stream<Arguments> provideArguments() {
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
    @MethodSource("provideArguments")
    void test(char symbol, String expected) {
        String actual = Task11.getSymbolType(symbol);

        assertEquals(expected, actual);
    }
}
