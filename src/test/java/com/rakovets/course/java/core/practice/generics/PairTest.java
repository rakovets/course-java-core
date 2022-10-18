package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PairTest {
    static Stream<Arguments> provideArgumentsForGetSwapped() {
        return Stream.of(
                Arguments.of(new Pair<>("your number",3), "3 your number")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetSwapped")
    public void checkGetSwapped(Pair<Object, Object> pair, String expected) {
        Pair pair1 = pair.getSwapped();
        String actual = pair1.getK() + " " + pair1.getV();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSwap() {
        return Stream.of(
                Arguments.of(new Pair<>(null, "value"), "value null")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSwap")
    public void checkSwap(Pair<Object, Object> pair, String expected) {
        Pair pair1 = Pair.swap(pair);
        String actual = pair1.getK() + " " + pair1.getV();

        Assertions.assertEquals(expected, actual);
    }
}
