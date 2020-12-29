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
class Task10Test extends StandardOutputTest {
    static Stream<Arguments> fuelReservesProvider() {
        return Stream.of(
                Arguments.of(1, 2, 3, 1),
                Arguments.of(2, 1, 3, 2),
                Arguments.of(3, 2, 1, 3),
                Arguments.of(1, 1, 100, 1),
                Arguments.of(586, 0, 0, 2),
                Arguments.of(10, 12, 10, 1),
                Arguments.of(0, 0, 0, 1)
        );
    }

    @ParameterizedTest(name = "Fuel reserves: {0}")
    @MethodSource("fuelReservesProvider")
    @DisplayName("Fuel reserves")
    void test(int firstFuelReserves, int secondFuelReserves, int thirdFuelReserves, int expected) {
        int actual = Task10.getNumberStation(firstFuelReserves, secondFuelReserves, thirdFuelReserves);

        assertEquals(expected, actual);
    }
}
