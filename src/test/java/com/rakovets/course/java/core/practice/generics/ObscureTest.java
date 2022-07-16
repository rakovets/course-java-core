package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ObscureTest<T> {

    static Stream<Arguments> isPresentProviderArguments() {
        return Stream.of(
                Arguments.of(null, false),
                Arguments.of("Java", true),
                Arguments.of(45, true),
                Arguments.of(true, true),
                Arguments.of(45.5, true),
                Arguments.of('a', true)
        );
    }

    @ParameterizedTest
    @MethodSource("isPresentProviderArguments")
    void isPresent(T object, boolean expected) {
        Obscure<T> obscure = new Obscure<>(object);

        boolean actual = obscure.isPresent();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> isEmptyProviderArguments() {
        return Stream.of(
                Arguments.of(null, true),
                Arguments.of("Java", false),
                Arguments.of(45, false),
                Arguments.of(true, false),
                Arguments.of(45.5, false),
                Arguments.of('a', false)
        );
    }

    @ParameterizedTest
    @MethodSource("isEmptyProviderArguments")
    void isEmpty(T object, boolean expected) {
        Obscure<T> obscure = new Obscure<>(object);

        boolean actual = obscure.isEmpty();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> orElseProviderArguments() {
        return Stream.of(
                Arguments.of(null, "Object"),
                Arguments.of("Java", "Java"),
                Arguments.of(45, 45),
                Arguments.of(true, true),
                Arguments.of(45.5, 45.5),
                Arguments.of('a', 'a')
        );
    }

    @ParameterizedTest
    @MethodSource("orElseProviderArguments")
    void orElse(T object, T expected) {
        Obscure<T> obscure = new Obscure<>(object);

        T actual = obscure.orElse((T) "Object");

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> orElseThrowNullProviderArguments() {
        return Stream.of(
                Arguments.of(null, "Null object")
        );
    }

    @ParameterizedTest
    @MethodSource("orElseThrowNullProviderArguments")
    void orElseThrowNull(T object) {
        Obscure<T> obscure = new Obscure<>(object);

        Assertions.assertThrows(Exception.class, () -> obscure.orElseThrow(new Exception("Null object")));
    }

    static Stream<Arguments> orElseThrowProviderArguments() {
        return Stream.of(
                Arguments.of("Java", "Java"),
                Arguments.of(45, 45),
                Arguments.of(true, true),
                Arguments.of(45.5, 45.5),
                Arguments.of('a', 'a')
        );
    }

    @ParameterizedTest
    @MethodSource("orElseThrowProviderArguments")
    void orElseThrow(T object, T expected) throws Exception {
        Obscure<T> obscure = new Obscure<>(object);

        T actual = obscure.orElseThrow(new Exception());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ofProviderArguments() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of("Java", "Java"),
                Arguments.of(45, 45),
                Arguments.of(true, true),
                Arguments.of(45.5, 45.5),
                Arguments.of('a', 'a')
        );
    }

    @ParameterizedTest
    @MethodSource("ofProviderArguments")
    void of(T object, T expected) {
        Obscure<T> actual = Obscure.of(object);

        Assertions.assertEquals(expected, actual.getObject());
    }

    @Test
    void empty() {
        Obscure<T> actual = Obscure.empty();

        Assertions.assertNull(actual.getObject());
    }
}
