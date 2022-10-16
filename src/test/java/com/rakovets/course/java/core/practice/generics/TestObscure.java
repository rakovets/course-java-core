package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestObscure {
    static Stream<Arguments> provideArgumentsForIsPresent() {
        return Stream.of(
                Arguments.of("", true),
                Arguments.of(null, false),
                Arguments.of("WoW", true)
        );
    }

    @ParameterizedTest(name = "Result: {1}.")
    @MethodSource("provideArgumentsForIsPresent")
    void test(String id, Boolean expected) {
        Obscure<String> obscure = new Obscure<>(id);

        Boolean actual = obscure.isPresent();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsEmpty() {
        return Stream.of(
                Arguments.of("12", false),
                Arguments.of(null, true),
                Arguments.of("0", false)
        );
    }

    @ParameterizedTest(name = "Result of method working: {1}")
    @MethodSource("provideArgumentsForIsEmpty")
    void testIsEmpty(String id, Boolean expected) {
        Obscure<String> obscure = new Obscure<>(id);

        Boolean actual = obscure.isEmpty();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElse() {
        return Stream.of(
                Arguments.of("", "1919", ""),
                Arguments.of(null, "1919", "1919"),
                Arguments.of(null, null, null)
        );
    }

    @ParameterizedTest(name = "The result of the method 'orElse': {2}.")
    @MethodSource("provideArgumentsForOrElse")
    void testOrElse(String id, String t, String expected) {
        Obscure<String> obscure = new Obscure<>(id);

        String actual = obscure.orElse(t);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElseThrow() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("null", "null")
        );
    }

    @ParameterizedTest(name = "The result of the method 'orElseThrow': {1}.")
    @MethodSource("provideArgumentsForOrElseThrow")
    void testOrElseThrow(String id, String expected) throws NullPointerException {
        Obscure<String> obscure = new Obscure<>(id);

        String actual = obscure.orElseThrow(new NullPointerException());

        Assertions.assertEquals(expected, actual);
    }
}
