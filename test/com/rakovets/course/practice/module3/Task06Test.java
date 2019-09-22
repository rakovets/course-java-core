package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task06Test extends ConsoleTest {
    static Stream<Arguments> killedTanksProvider() {
        return Stream.of(
                Arguments.of(new String[]{"2", "1"}, "Player 1: 700. Player 2: 100"),
                Arguments.of(new String[]{"2", "10"}, "Player 1: 200. Player 2: 1500"),
                Arguments.of(new String[]{"0", "0"}, "Player 1: 0. Player 2: 0"),
                Arguments.of(new String[]{"10", "10"}, "Player 1: 1000. Player 2: 1000")
        );
    }

    @ParameterizedTest(name = "Killed tanks: {0}")
    @MethodSource("killedTanksProvider")
    @DisplayName("Battle City")
    void test(String[] killedTanks, String expected) {
        Task06.main(killedTanks);
        assertEquals(getConsoleContent(), expected);
    }
}