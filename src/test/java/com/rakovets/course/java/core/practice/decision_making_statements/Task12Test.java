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
@DisplayName("Zodiac")
class Task12Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(20, 1, "Goat"),
                Arguments.of(19, 2, "Water-bearer"),
                Arguments.of(20, 3, "Fish"),
                Arguments.of(20, 4, "Ram"),
                Arguments.of(20, 5, "Bull"),
                Arguments.of(21, 6, "Twins"),
                Arguments.of(22, 7, "Crab"),
                Arguments.of(22, 8, "Lion"),
                Arguments.of(21, 9, "Maiden"),
                Arguments.of(22, 10, "Scales"),
                Arguments.of(22, 11, "Scorpion"),
                Arguments.of(21, 12, "Archer"),
                Arguments.of(21, 1, "Water-bearer"),
                Arguments.of(20, 2, "Fish"),
                Arguments.of(21, 3, "Ram"),
                Arguments.of(21, 4, "Bull"),
                Arguments.of(21, 5, "Twins"),
                Arguments.of(22, 6, "Crab"),
                Arguments.of(23, 7, "Lion"),
                Arguments.of(23, 8, "Maiden"),
                Arguments.of(22, 9, "Scales"),
                Arguments.of(23, 10, "Scorpion"),
                Arguments.of(23, 11, "Archer"),
                Arguments.of(22, 12, "Goat")
        );
    }

    @ParameterizedTest(name = "Birthday: {0}")
    @MethodSource("provideArguments")
    void test(int day, int month, String expected) {
        String actual = Task12.getZodiacSign(day, month);
        assertEquals(expected, actual);
    }
}
