package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task09Test extends ConsoleTest {
    static Stream<Arguments> provideApartments() {
        return Stream.of(
                Arguments.of(new String[]{"2", "10", "45"}, "Porch: 3. Floor: 1"),
                Arguments.of(new String[]{"9", "4", "169"}, "Porch: 4. Floor: 7"),
                Arguments.of(new String[]{"18", "10", "180"}, "Porch: 1. Floor: 18"),
                Arguments.of(new String[]{"1", "1", "1"}, "Porch: 1. Floor: 1"),
                Arguments.of(new String[]{"10", "5", "11"}, "Porch: 1. Floor: 2"),
                Arguments.of(new String[]{"10", "4", "10"}, "Porch: 1. Floor: 1")
        );
    }

    @ParameterizedTest(name = "Floors, apartment of floors and number apartment: {0}")
    @MethodSource("provideApartments")
    @DisplayName("Apartment house")
    void test(String[] killedTanks, String expected) {
        Task09.main(killedTanks);
        assertEquals(getConsoleContent(), expected);
    }
}