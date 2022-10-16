package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPair {
    static Stream<Arguments> provideArgumentsGetSwapped() {
        return Stream.of(
                Arguments.of("Java", 123, "123, Java")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetSwapped")
    public void testIsPresent(String firstObject, int secondObject, String expected) {
        Pair<String, Integer> pair = new Pair<>(firstObject, secondObject);
        String actual = pair.getSwapped().toString();

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsSwap() {
        return Stream.of(
                Arguments.of(2022, "November", "November, 2022")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsSwap")
    public void testIsPresent(int firstObject, String secondObject, String expected) {
        Pair<Integer, String> pair = new Pair<>(firstObject, secondObject);
        String actual = Pair.swap(pair).toString();

        assertEquals(expected, actual);
    }
}
