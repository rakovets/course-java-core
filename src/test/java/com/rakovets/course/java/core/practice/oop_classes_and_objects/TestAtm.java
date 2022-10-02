package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestAtm {
    Atm atm = new Atm(10, 15, 10);

    static Stream<Arguments> provideArgumentsForIsPossibleIssue() {
        return Stream.of(
                Arguments.of(470, true),
                Arguments.of(640, true),
                Arguments.of(-470, false),
                Arguments.of(235, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPossibleIssue")
    void testIsPossibleIssue(int amount, boolean expected) {
        boolean actual = atm.isPossibleIssue(amount);
        Assertions.assertEquals(expected, actual);
    }
}
