package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObscureTests {
    static Stream<Arguments> provideArgumentsIsPresent() {
        return Stream.of(
                Arguments.of("Present", true),
                Arguments.of("", true),
                Arguments.of(null, false)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsIsPresent")
    void getIsPresent(String object, boolean expected) {
        Obscure<String> obscure = new Obscure<>(object);

        boolean actual = obscure.isPresent();

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsIsEmpty() {
        return Stream.of(
                Arguments.of("Empty", false),
                Arguments.of("", false),
                Arguments.of(null, true)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsIsEmpty")
    void getIsEmpty(String object, boolean expected) {
        Obscure<String> obscure = new Obscure<>(object);

        boolean actual = obscure.isEmpty();

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsOrElse() {
        return Stream.of(
                Arguments.of("One", "Two", "One"),
                Arguments.of("", "Two", ""),
                Arguments.of(null, "Two", "Two")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsOrElse")
    void getOrElse(String object, String defaultObject, String expected) {
        Obscure<String> obscure = new Obscure<>(object);

        String actual = obscure.orElse(defaultObject);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsOrElseThrowNotNull() {
        return Stream.of(
                Arguments.of("One", "One"),
                Arguments.of("Two", "Two")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsOrElseThrowNotNull")
    void getOrElseThrowNotNull(String object, String expected) throws Exception {
        Obscure<String> obscure = new Obscure<>(object);

        String actual = obscure.orElseThrow(new Exception());

        assertEquals(expected, actual);
    }
    @Test
    public void testOrElseThrowNull() {
        Obscure<String> obscure = new Obscure<>(null);
        Assertions.assertThrows(Exception.class, () -> obscure.orElseThrow(new Exception()));
    }
}
