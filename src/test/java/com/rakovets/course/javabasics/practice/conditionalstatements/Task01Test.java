package com.rakovets.course.javabasics.practice.conditionalstatements;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task01Test extends StandardOutputTest {
    static Stream<Arguments> positionPlayersProvider() {
        return Stream.of(
                Arguments.of("1", "true"),
                Arguments.of("5", "true"),
                Arguments.of("6", "false"),
                Arguments.of("13", "false")
        );
    }

    @ParameterizedTest(name = "Position player: {0}")
    @MethodSource("positionPlayersProvider")
    @DisplayName("Position player")
    void test(String position, String expected) {
        Task01.main(new String[]{position});
        assertEquals(expected, getStandardOutputContent());
    }
}
