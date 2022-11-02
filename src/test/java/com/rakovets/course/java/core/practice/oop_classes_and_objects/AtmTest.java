package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtmTest {
    static Stream<Arguments> provideArgumentsAddBanknotes20() {
        return Stream.of(
                Arguments.of(1, 2, 3, 5, 6),
                Arguments.of(1, 10, 11, 11, 12)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsAddBanknotes20")
    void testAddBanknotes20(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100, int number,
                            int expected20) {
        Atm atm = new Atm(numberBanknotes20, numberBanknotes50, numberBanknotes100);
        int actual20 = atm.addBanknotes20(number);
        assertEquals(expected20, actual20);
    }
    static Stream<Arguments> provideArgumentsAddBanknotes50() {
        return Stream.of(
                Arguments.of(1, 2, 3, 5, 7),
                Arguments.of(0, 4, 5, 9, 13)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsAddBanknotes50")
    void testAddBanknotes50(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100,
                            int number, int expected50) {
        Atm atm = new Atm(numberBanknotes20, numberBanknotes50, numberBanknotes100);
        int actual50 = atm.addBanknotes50(number);
        assertEquals(expected50, actual50);
    }
    static Stream<Arguments> provideArgumentsAddBanknotes100() {
        return Stream.of(
                Arguments.of(1, 2, 3, 5, 8),
                Arguments.of(3, 5, 0, 5, 5)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsAddBanknotes100")
    void testAddBanknotes100(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100, int number,
                             int expected100) {
        Atm atm = new Atm(numberBanknotes20, numberBanknotes50, numberBanknotes100);
        int actual100 = atm.addBanknotes100(number);
        assertEquals(expected100, actual100);
    }
}
