package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PairTest {
    static Stream<Arguments> provideArgumentsGetSwapped() {
        return Stream.of(
                Arguments.of("Hanna", "Kavaliova", "Kavaliova Hanna"),
                Arguments.of("123", "Kavaliova", "Kavaliova 123")

        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetSwapped")
    void testGetSwapped(String firstType, String secondType, String expected) {
        Pair<String, String> pair = new Pair<>(firstType, secondType);
        Pair pair1 = pair.getSwapped();
        String actual = pair1.getFirstType() + " " + pair1.getSecondType();

        Assertions.assertEquals(expected, actual);
    }
}
