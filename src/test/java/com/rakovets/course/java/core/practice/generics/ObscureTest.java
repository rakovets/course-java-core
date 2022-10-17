package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ObscureTest {
    static Stream<Arguments> provideArgumentsIsPresent() {
        return Stream.of(
                Arguments.of("Hanna", true),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsIsPresent")
    void testIsPresent(String str, Boolean expected) {
        Obscure<String> obscure = new Obscure<>(str);
        Boolean actual = obscure.isPresent();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsIsEmpty() {
        return Stream.of(
                Arguments.of("Hanna", false),
                Arguments.of(null, true)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsIsEmpty")
    void testIsEmpty(String str, Boolean expected) {
        Obscure<String> obscure = new Obscure<>(str);
        Boolean actual = obscure.isEmpty();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsOrElse() {
        return Stream.of(
                Arguments.of("Hanna", "Kavaliova", "Hanna"),
                Arguments.of("Hanna", null, "Hanna"),
                Arguments.of(null, "Hanna", "Hanna"),
                Arguments.of(null, null, null)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsOrElse")
    void testOrElse(String str1, String str2, String expected) {
        Obscure<String> obscure = new Obscure<>(str1);
        String actual = obscure.orElse(str2);
        Assertions.assertEquals(expected, actual);
    }
}
