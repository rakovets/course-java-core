package com.rakovets.course.java.core.practice.operators;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Playing Time")
class Task06Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(1, "0 0:0:1"),
                Arguments.of(61, "0 0:1:1"),
                Arguments.of(3661, "0 1:1:1"),
                Arguments.of(86401, "1 0:0:1"),
                Arguments.of(914701, "10 14:5:1")
        );
    }

    @MethodSource("provideArguments")
    @ParameterizedTest(name = "Cargo: {0}. Carrying capacity: {1}")
    void test(int playingTimeInSeconds, String expected) {
        String actual = Task06.getPlayingTime(playingTimeInSeconds);

        assertEquals(expected, actual);
    }
}
