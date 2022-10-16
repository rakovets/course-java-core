package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PairTest {
    static Stream<Arguments> provideArgumentsForGetSwapped() {
        return Stream.of(
                Arguments.of(new Pair<>(34, "page"), "page 34"),
                Arguments.of(new Pair<>(1, 2), "2 1"),
                Arguments.of(new Pair<>(null, "page"), "page null")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetSwapped")
    void testGetSwapped(Pair<Object, Object> pair, String expected) {
        Pair pairNew = pair.getSwapped();
        String actual = pairNew.getKey() + " " + pairNew.getValue();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSwap() {
        return Stream.of(
                Arguments.of(new Pair<>(34, "page"), "page 34"),
                Arguments.of(new Pair<>(1, 2), "2 1"),
                Arguments.of(new Pair<>(null, "page"), "page null")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSwap")
    void testSwap(Pair<Object, Object> pair, String expected) {
        Pair pairNew = Pair.swap(pair);
        String actual = pairNew.getKey() + " " + pairNew.getValue();

        Assertions.assertEquals(expected, actual);
    }
}
