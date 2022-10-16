package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObscureTest {
    static Stream<Arguments> provideArgumentsForIsPresent() {
        return Stream.of(
                Arguments.of(new Obscure<>(null), false),
                Arguments.of(new Obscure<>("Hello there"), true),
                Arguments.of(new Obscure<>(" "), true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPresent")
    void testIsPresent(Obscure<String> object, boolean expected) {
        boolean actual = object.isPresent();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsEmpty() {
        return Stream.of(
                Arguments.of(new Obscure<>(null), true),
                Arguments.of(new Obscure<>("Hello there"), false),
                Arguments.of(new Obscure<>(" "), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsEmpty")
    void testIsEmpty(Obscure<String> object, boolean expected) {
        boolean actual = object.isEmpty();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElse() {
        return Stream.of(
                Arguments.of(new Obscure<>(4), 10, 4),
                Arguments.of(new Obscure<>(), 10, 10),
                Arguments.of(new Obscure<>(0), 78, 0),
                Arguments.of(new Obscure<>(), -50, -50),
                Arguments.of(new Obscure<>(-7), 1, -7)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOrElse")
    void testOrElse(Obscure<Integer> object, Integer defaultObject, Integer expected) {
        Integer actual = object.orElse(defaultObject);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElseThrow() {
        return Stream.of(
                Arguments.of(new Obscure<>("mother"), new Exception(), "mother"),
                Arguments.of(new Obscure<>(), new Exception(), null),
                Arguments.of(new Obscure<>("father"), new Exception(), "father"),
                Arguments.of(new Obscure<>(), new Exception(), null),
                Arguments.of(new Obscure<>("sister"), new Exception(), "sister")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOrElseThrow")
    void testOrElseThrow(Obscure<String> object, Exception ex, String expected) throws Exception {
        String actual = null;
        try {
            actual = object.orElseThrow(ex);
        } catch (Exception e) {
            actual = ex.getMessage();
        }

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public <T> void TestMethodOf() {
        Obscure<String> expected = Obscure.of("Hello");
        Obscure<String> actual = Obscure.of("Hello");

        Assertions.assertEquals(expected.getObject(), actual.getObject());
    }

    @Test
    public <T> void TestMethodEmpty() {
        Obscure<String> expected = Obscure.empty();

        Assertions.assertNull(expected.getObject());
    }
}
