package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

public class ObscureTest {
    static Stream<Arguments> provideArgumentsForIsPresent() {
        return Stream.of(
                Arguments.of(true, new Integer[]{1,2,3}),
                Arguments.of(false, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPresent")
    void isPresent (Boolean expectedBoolean, Integer[] n) {
        //GIVEN
        Obscure<Integer[]> obscure = new Obscure<>(n);

        //WHEN
        Boolean actualBoolean = obscure.isPresent();

        //THEN
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> provideArgumentsForIsEmpty() {
        return Stream.of(
                Arguments.of(true, null),
                Arguments.of(false,new Integer[]{1,2,3})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsEmpty")
    void isEmpty (boolean expectedBoolean, Integer[] n) {
        //GIVEN
        Obscure<Integer[]> obscure = new Obscure<>(n);

        //WHEN
        Boolean actualBoolean = obscure.isEmpty();

        //THEN
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> provideArgumentsForOrElse() {
        return Stream.of(
                Arguments.of(new Integer[]{1,2,3}, new Integer[]{1,2,3},new Integer[]{4,5,6}),
                Arguments.of(new Integer[]{4,4,4}, new Integer[]{4,4,4}, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOrElse")
    void orElse (Integer[] expectedObject, Integer[] n, Integer[] defaultObj) {
        //GIVEN
        Obscure<Integer[]> obscure = new Obscure<>(n);

        //WHEN
        Integer[] actualObject = obscure.orElse(defaultObj);

        //THEN
        assertArrayEquals(expectedObject, actualObject);

    }

    @Test
    void orElseThrow() {
        //GIVEN
        Integer test = 10;
        Obscure<Integer> obscure = new Obscure<>(test);
        String actualString = "";
        NullPointerException ex = new NullPointerException("Object doesn't exist");

        //WHEN
        try {
            actualString = obscure.orElseThrow(ex).toString();
        } catch (Exception exception) {
            actualString = exception.getMessage();
        }

        //THEN
        Assertions.assertEquals(test.toString(), actualString);
    }

    @Test
    void of() {
        //GIVEN
        Integer test = 10;

        //WHEN
        Obscure<Integer> actualObscure = Obscure.empty();

        //THEN
        Assertions.assertNull(actualObscure.getObject());
    }

}
