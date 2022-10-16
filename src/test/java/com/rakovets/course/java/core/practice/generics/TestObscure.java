package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestObscure {
    static Stream<Arguments> provideArgumentsIsPresent() {
        return Stream.of(
                Arguments.of(new Obscure<>("Sveta"), true),
                Arguments.of(new Obscure<>(false), true),
                Arguments.of(new Obscure<>(null), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsIsPresent")
    public <T> void TestIsPresent(Obscure<T> container, boolean expected) {
        Assertions.assertEquals(expected, container.isPresent());
    }

    static Stream<Arguments> provideArgumentsIsEmpty() {
        return Stream.of(
                Arguments.of(new Obscure<>("Sveta"), false),
                Arguments.of(new Obscure<>(""), true),
                Arguments.of(new Obscure<>(new Integer[]{}), true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsIsEmpty")
    public <T> void TestIsEmpty(Obscure<T> container, boolean expected) {
        Assertions.assertEquals(expected, container.isEmpty());
    }

    static Stream<Arguments> provideArgumentsOrElse() {
        return Stream.of(
                Arguments.of(new Obscure<>(null), "Sveta", "Sveta"),
                Arguments.of(new Obscure<>("134"), "Piven", "134"),
                Arguments.of(new Obscure<>("qwert"), null, "qwert")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsOrElse")
    public <T> void TestOrElse(Obscure<T> container, T defaultObject, T expected) {
        Assertions.assertEquals(expected, container.orElse(defaultObject));
    }

    @Test
    public void TestOrElseThrow() throws Exception {
        Obscure<String> object = new Obscure<>("qoqo");

        Assertions.assertEquals("qoqo", object.orElseThrow(new Exception()));
    }

    @Test
    public void TestOrElseThrow2() {
        Obscure<String> object = new Obscure<>(null);

        Assertions.assertThrows(NullPointerException.class, () -> object.orElseThrow(new NullPointerException()));
    }

    @Test
    public <T> void TestIsOf() {
        Obscure<String> expected = Obscure.of("qwe");
        Obscure<String> actual = Obscure.of("qwe");

        Assertions.assertEquals(expected.get(), actual.get());
    }

    @Test
    public <T> void TestEmpty() {
        Obscure<String> expected = Obscure.empty();

        Assertions.assertFalse(expected.isPresent());
    }
}
