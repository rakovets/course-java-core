package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestObscure {
    static Stream<Arguments> provideArgumentsForGetId() {
        return Stream.of(
                Arguments.of(new Obscure<String>("cat"), "cat"),
                Arguments.of(new Obscure<Integer>(123), 123),
                Arguments.of(new Obscure<Double>(12.5), 12.5)
        );
    }

    @ParameterizedTest(name = "GetId")
    @MethodSource("provideArgumentsForGetId")
    <T> void testGetId(Obscure<T> obscure, T expected) {
        T actual = obscure.getValue();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsPresent() {
        return Stream.of(
                Arguments.of(new Obscure<String>("cat"), true),
                Arguments.of(new Obscure<Integer>(123), true),
                Arguments.of(new Obscure<Double>(12.5), true),
                Arguments.of(new Obscure<String>(null), false),
                Arguments.of(new Obscure<Integer>(null), false),
                Arguments.of(new Obscure<Double>(null), false)
        );
    }

    @ParameterizedTest(name = "IsPresent")
    @MethodSource("provideArgumentsForIsPresent")
    <T> void testIsPresent(Obscure<T> obscure, Boolean expected) {
        Boolean actual = obscure.isPresent();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsEmpty() {
        return Stream.of(
                Arguments.of(new Obscure<String>("cat"), false),
                Arguments.of(new Obscure<Integer>(123), false),
                Arguments.of(new Obscure<Double>(12.5), false),
                Arguments.of(new Obscure<String>(null), true),
                Arguments.of(new Obscure<Integer>(null), true),
                Arguments.of(new Obscure<Double>(null), true)
        );
    }

    @ParameterizedTest(name = "IsEmpty")
    @MethodSource("provideArgumentsForIsEmpty")
    <T> void testIsEmpty(Obscure<T> obscure, Boolean expected) {
        Boolean actual = obscure.isEmpty();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElse() {
        return Stream.of(
                Arguments.of(new Obscure<String>("cat"), "dog", "cat"),
                Arguments.of(new Obscure<Integer>(123), 0, 123),
                Arguments.of(new Obscure<Double>(12.5), 1.0, 12.5),
                Arguments.of(new Obscure<String>(null), "dog", "dog"),
                Arguments.of(new Obscure<Integer>(null), 0, 0),
                Arguments.of(new Obscure<Double>(null), 1.0, 1.0)
        );
    }

    @ParameterizedTest(name = "OrElse")
    @MethodSource("provideArgumentsForOrElse")
    <T> void testOrElse(Obscure<T> obscure, T id, T expected) {
        T actual = obscure.orElse(id);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElseThrow() {
        return Stream.of(
                Arguments.of(new Obscure<String>("cat"), new Exception("my"), "cat"),
                Arguments.of(new Obscure<Integer>(123), new Exception("my"), 123),
                Arguments.of(new Obscure<Double>(12.5), new Exception("my"), 12.5)
        );
    }

    @ParameterizedTest(name = "OrElseThrow")
    @MethodSource("provideArgumentsForOrElseThrow")
    <T> void testOrElseThrow(Obscure<T> obscure, Exception e, T expected) throws Exception {
        T actual = obscure.orElseThrow(e);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOf() {
        return Stream.of(
                Arguments.of("cat", "cat"),
                Arguments.of(123,  123),
                Arguments.of(12.5,  12.5)
        );
    }

    @ParameterizedTest(name = "Of")
    @MethodSource("provideArgumentsForOf")
    <T> void testOf(T id, T expected) {
        T actual = Obscure.of(id).getValue();

        Assertions.assertEquals(expected, actual);
    }

   @Test
    <T> void testEmpty() {
        boolean actual = Obscure.empty().isEmpty();

        Assertions.assertEquals(true, actual);
    }
}
