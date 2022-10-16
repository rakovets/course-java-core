package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ObscureTest<T> {
    static Stream<Arguments> provideArgumentsForConstructorAndGetMethod() {
        return Stream.of(
                Arguments.of("Object", "Object"),
                Arguments.of(110, 110),
                Arguments.of('o', 'o'),
                Arguments.of(null, null),
                Arguments.of(65.43, 65.43),
                Arguments.of(false, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForConstructorAndGetMethod")
    void testConstructorAndGetMethod(T object, T expected) {
        Obscure<T> obscure = new Obscure<T>(object);
        T actual = obscure.get();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsPresentMethod() {
        return Stream.of(
                Arguments.of("Object", true),
                Arguments.of(110, true),
                Arguments.of('o', true),
                Arguments.of(null, false),
                Arguments.of(65.43, true),
                Arguments.of(false, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPresentMethod")
    void testIsPresentMethod(T object, boolean expected) {
        Obscure<T> obscure = new Obscure<T>(object);
        boolean actual = obscure.isPresent();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsEmptyMethod() {
        return Stream.of(
                Arguments.of("Object", false),
                Arguments.of(110, false),
                Arguments.of('o', false),
                Arguments.of(null, true),
                Arguments.of(65.43, false),
                Arguments.of(false, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsEmptyMethod")
    void testIsEmptyMethod(T object, boolean expected) {
        Obscure<T> obscure = new Obscure<T>(object);
        boolean actual = obscure.isEmpty();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElseMethod() {
        return Stream.of(
                Arguments.of("Object", null, "Object"),
                Arguments.of(110, null, 110),
                Arguments.of('o', null, 'o'),
                Arguments.of(null, null, null),
                Arguments.of(65.43, null, 65.43),
                Arguments.of(false, null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOrElseMethod")
    void testOrElseMethod(T object, T defaultObject, T expected) {
        Obscure<T> obscure = new Obscure<T>(object);
        T actual = obscure.orElse(defaultObject);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElseThrowMethodWithoutNullObject() {
        return Stream.of(
                Arguments.of("Object", "Object"),
                Arguments.of(110, 110),
                Arguments.of('o', 'o'),
                Arguments.of(65.43, 65.43),
                Arguments.of(false, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOrElseThrowMethodWithoutNullObject")
    void testOrElseThrowMethodWithoutNullObject(T object, T expected) throws Exception {
        Obscure<T> obscure = new Obscure<T>(object);
        Exception ex = new Exception();
        T actual = obscure.orElseThrow(ex);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOrElseThrowMethodWithNullObject() {
        Obscure<T> obscure = new Obscure<T>(null);
        Assertions.assertThrows(Exception.class, () -> obscure.orElseThrow(new Exception()));
    }

    static Stream<Arguments> provideArgumentsForOfMethod() {
        return Stream.of(
                Arguments.of("Object", "Object"),
                Arguments.of(110, 110),
                Arguments.of('o', 'o'),
                Arguments.of(null, null),
                Arguments.of(65.43,  65.43),
                Arguments.of(false, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOfMethod")
    void testOf(T object, T expected) {
        Obscure<T> obscure = new Obscure<T>(object);
        T actual = obscure.of(object).get();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForEmptyMethod() {
        return Stream.of(
                Arguments.of("Object", null),
                Arguments.of(110, null),
                Arguments.of('o', null),
                Arguments.of(null, null),
                Arguments.of(65.43, null),
                Arguments.of(false, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForEmptyMethod")
    void testEmptyMethod(T object, T expected) {
        Obscure<T> obscure = new Obscure<T>(object);
        T actual = (T) obscure.empty().get();
        Assertions.assertEquals(expected, actual);
    }
}
