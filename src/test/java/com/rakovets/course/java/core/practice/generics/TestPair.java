package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestPair {
    static Stream<Arguments> provideArgumentsForGetSwapped() {
        return Stream.of(
                Arguments.of("Yes", "No", "No", "Yes")

        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetSwapped")
    void testGetSwapped(String orNotAtHome, String atHome, String expected1, String expected2) {
        Pair<String, String> pair = new Pair<>(orNotAtHome, atHome);

        Pair answer = pair.getSwapped();
        String actualFirst = (String) answer.getAtHome();
        String actualSecond = (String) answer.getOrNotAtHome();

        Assertions.assertEquals(expected1, actualFirst);
        Assertions.assertEquals(expected2, actualSecond);
    }
}
