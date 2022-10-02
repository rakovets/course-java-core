package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestAtm {
    Atm amountAtm = new Atm(20, 10, 5);
    static Stream<Arguments> provideArgumentsIsPossibleIssue() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(500, true),
                Arguments.of(0, false),
                Arguments.of(10000, false),
                Arguments.of(-999, false),
                Arguments.of(1, false),
                Arguments.of(30, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsIsPossibleIssue")
    void testIsPossibleIssue(Integer amount, Boolean expected) {
        boolean actual = amountAtm.isPossibleIssue(amount);
        Assertions.assertEquals(expected, actual);
    }
}
