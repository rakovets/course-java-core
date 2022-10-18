package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ObscureTest {
    static Stream<Arguments> provideArgumentsForIsPresent() {
        return Stream.of(
                Arguments.of(null, false),
                Arguments.of("N01102022", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPresent")
    public void checkIsPresent(String obj, boolean expected) {
        Obscure<String> obscure = new Obscure<>(obj);

        boolean actual = obscure.isPresent();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsIsEmpty() {
        return Stream.of(
                Arguments.of(null, true),
                Arguments.of("N01102022", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsIsEmpty")
    public void checkIsEmpty(String obj, boolean expected) {
        Obscure<String> obscure = new Obscure<>(obj);

        boolean actual = obscure.isEmpty();

        Assertions.assertEquals(expected,actual);
    }

    static Stream<Arguments> provideArgumentsOrElse() {
        return Stream.of(
                Arguments.of("n2022","Nikita", "n2022"),
                Arguments.of(null, "n2022", "n2022")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsOrElse")
    public void checkOrElse(String obj, String defObj, String expected) {
        Obscure<String> obscure = new Obscure<>(obj);

        String actual = obscure.orElse(defObj);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElseThrow() {
        return Stream.of(
                Arguments.of(new Obscure<>(), new Exception(), null),
                Arguments.of(new Obscure<>("Nikita"), new Exception(), "Nikita")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOrElseThrow")
    void checkOrElseThrow(Obscure<String> obj, Exception e, String expected) {
        String actual = null;
        try {
            actual = obj.orElseThrow(e);
        } catch (Exception ex) {
            actual = ex.getMessage();
        }
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckOf() {
        Obscure<Integer> expected = Obscure.of(01102022);
        Obscure<Integer> actual = Obscure.of(01102022);

        Assertions.assertEquals(expected.get(), actual.get());
    }

    @Test
    public void CheckEmpty() {
        Obscure<String> expected = Obscure.empty();

        Assertions.assertNull(expected.get());
    }
}
