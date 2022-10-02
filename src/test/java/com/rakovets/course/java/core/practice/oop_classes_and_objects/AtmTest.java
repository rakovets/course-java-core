package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtmTest {
    static Stream<Arguments> provideArgumentsGetPerimeter() {
        return Stream.of(
                Arguments.of(1, 1, 1, 5, 6, 6, 6),
                Arguments.of(1, 0, 0, 10, 11, 10, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetPerimeter")
    void testGetPerimeter(int numberBanknotes20,int numberBanknotes50, int numberBanknotes100,
                          int number, int expected20, int expected50, int expected100) {

        Atm atm = new Atm(numberBanknotes20, numberBanknotes50, numberBanknotes100);

        int actual20 = atm.addBanknotes20(number);
        int actual50 = atm.addBanknotes50(number);
        int actual100 = atm.addBanknotes100(number);

        assertEquals(expected20, actual20);
        assertEquals(expected50, actual50);
        assertEquals(expected100, actual100);
    }
}
