package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ObscureTest {
    static Stream<Arguments> provideArgumentsForGet() {
        return Stream.of(
                Arguments.of(new Obscure<Integer>(555), 555),
                Arguments.of(new Obscure<Double>(1.1), 1.1),
                Arguments.of(new Obscure<String>("Hello, java"), "Hello, java"),
                Arguments.of(new Obscure<Integer>(null), null),
                Arguments.of(new Obscure<Double>(null), null),
                Arguments.of(new Obscure<String>(null), null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGet")
    <T> void testGet(Obscure<T> obscure, T expected) {
        T actual = obscure.get();

        Assertions.assertEquals(expected, actual);
    }


}

