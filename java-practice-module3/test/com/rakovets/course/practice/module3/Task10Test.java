package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task10Test extends ConsoleTest {
    static Stream<Arguments> fuelReservesProvider() {
        return Stream.of(
                Arguments.of(new String[]{"1", "2", "3"}, "1"),
                Arguments.of(new String[]{"2", "1", "3"}, "2"),
                Arguments.of(new String[]{"3", "2", "1"}, "3"),
                Arguments.of(new String[]{"1", "1", "100"}, "1 2"),
                Arguments.of(new String[]{"586", "0", "0"}, "2 3"),
                Arguments.of(new String[]{"10", "12", "10"}, "1 3"),
                Arguments.of(new String[]{"0", "0", "0"}, "1 2 3")
        );
    }

    @ParameterizedTest(name = "Fuel reserves: {0}")
    @MethodSource("fuelReservesProvider")
    @DisplayName("Fuel reserves")
    void test(String[] fuelReserves, String expected) {
        Task10.main(fuelReserves);
        assertEquals(getConsoleContent(), expected);
    }
}