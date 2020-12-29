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
class Task09Test extends StandardOutputTest {
    static Stream<Arguments> provideApartments() {
        return Stream.of(
                Arguments.of(2, 10, 45, 3),
                Arguments.of(9, 4, 169, 5),
                Arguments.of(18, 10, 180, 1),
                Arguments.of(1, 1, 1, 1),
                Arguments.of(10, 5, 11, 1),
                Arguments.of(10, 4, 10, 1)
        );
    }

    @ParameterizedTest(name = "Floors, apartment of floors and number apartment: {0}")
    @MethodSource("provideApartments")
    @DisplayName("Apartment house")
    void test(int numberFloors, int numberApartmentsPerFloor, int apartmentNumber, int expected) {
        int actual = Task09.getPorchNumber(numberFloors, numberApartmentsPerFloor, apartmentNumber);

        assertEquals(expected, actual);
    }
}
