package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestAtm {
    static Stream<Arguments> provideArgumentsForAtm() {
        return Stream.of(
                Arguments.of(10, 20, 30, 800, true),
                Arguments.of(2, 8, 3, 5000, false),
                Arguments.of(0, 0, 0, 22, false),
                Arguments.of(10, 20, 31, 45, true));
    }

    @ParameterizedTest(name = "Have money?: {4}")
    @MethodSource("provideArgumentsForAtm")
    void test(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100, int amount, boolean expected) {
        Atm atm = new Atm(numberBanknotes20, numberBanknotes50, numberBanknotes100);

        boolean actual = atm.isPossibleIssue(amount);
        Assertions.assertEquals(expected, actual);
    }
}
