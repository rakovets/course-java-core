package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ObscureTest {
    static Stream<Arguments> provideArgumentsForIsPresent() {
        return Stream.of(
                Arguments.of(true,  new Integer[]{1, 2, 3}),
                Arguments.of(false, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPresent")
    void isPresent (Boolean expectedBoolean, Integer[] n) {
        // GIVEN
        Obscure<Integer[]> obs = new Obscure<>(n);

        // WHEN
        Boolean actualBoolean = obs.isPresent();

        // THEN
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> provideArgumentsForIsEmpty() {
        return Stream.of(
                Arguments.of(false,  new Integer[]{1, 2, 3}),
                Arguments.of(true, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsEmpty")
    void isEmpty (Boolean expectedBoolean, Integer[] n) {
        // GIVEN
        Obscure<Integer[]> obs = new Obscure<>(n);

        // WHEN
        Boolean actualBoolean = obs.isEmpty();

        // THEN
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> provideArgumentsForOrElse() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3},  new Integer[]{1, 2, 3}),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOrElse")
    void orElse (Integer[] expectedObject, Integer[] n) {
        // GIVEN
        Obscure<Integer[]> obs = new Obscure<>(n);

        // WHEN
        Integer[] actualObject = obs.orElse();

        // THEN
        assertArrayEquals(expectedObject, actualObject);
    }

    @Test
    void orElseThrow_Exception() {
        // GIVEN
        Integer test = null;
        Obscure<Integer> obs = new Obscure<>(test);
        String actualString = "";

        // WHEN
       try {
           actualString = obs.orElseThrow().toString();
       } catch (NullPointerException exp) {
           actualString = exp.getMessage();
       }

        // THEN
        Assertions.assertEquals("Object doesn't exist", actualString);
    }

    @Test
    void orElseThrow() {
        // GIVEN
        Integer test = 42;
        Obscure<Integer> obs = new Obscure<>(test);
        String actualString = "";

        // WHEN
        try {
            actualString = obs.orElseThrow().toString();
        } catch (NullPointerException exp) {
            actualString = exp.getMessage();
        }

        // THEN
        Assertions.assertEquals(test.toString(), actualString);
    }

    @Test
    void of() {
        // GIVEN
        Integer test = 42;

        // WHEN
        Obscure <Integer> actualObscure = Obscure.of(test);

        // THEN
        Assertions.assertEquals(test.getClass(), actualObscure.getObject().getClass());
    }

    @Test
    void empty() {
        // GIVEN

        // WHEN
        Obscure <Integer> actualObscure = Obscure.empty();

        // THEN
        Assertions.assertNull(actualObscure.getObject());
    }
}
