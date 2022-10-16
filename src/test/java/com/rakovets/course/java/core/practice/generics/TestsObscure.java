package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsObscure {
    static Stream<Arguments> provideArgumentsIsPresent() {
        return Stream.of(
                Arguments.of("Java", true),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsIsPresent")
    public void testIsPresent(String object, boolean expected) {
        Obscure<String> obscure = new Obscure<>(object);

        boolean actual = obscure.isPresent(object);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsIsEmpty() {
        return Stream.of(
                Arguments.of("Java", false),
                Arguments.of(null, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsIsEmpty")
    public void testIsEmpty(String object, boolean expected) {
        Obscure<String> obscure = new Obscure<>(object);

        boolean actual = obscure.isEmpty(object);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsOrElse() {
        return Stream.of(
                Arguments.of("Java", "Hello", "Java"),
                Arguments.of(null, "Hello", "Hello")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsOrElse")
    public void testOrElse(String object, String defaultObject, String expected) {
        Obscure<String> obscure = new Obscure<>(object);

        String actual = obscure.orElse(defaultObject);

        assertEquals(expected, actual);
    }
}
