package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ObscureTest {
    static Stream<Arguments> provideArgumentsForIsPresent() {
        return Stream.of(
                Arguments.of(true,  100.0),
                Arguments.of(false, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsPresent")
    void isPresent (Boolean expected, Double num) {
        Obscure<Double> obs = new Obscure<>(num);

        Boolean actual = obs.isPresent();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsEmpty() {
        return Stream.of(
                Arguments.of(false,  100.0),
                Arguments.of(true, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsEmpty")
    void isEmpty (Boolean expected, Double num) {
        Obscure<Double> obs = new Obscure<>(num);

        Boolean actual = obs.isEmpty();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElse() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 1, 1},  new Integer[]{1, 1, 1}, new Integer[]{2, 2, 2}),
                Arguments.of(new Integer[]{2, 2, 2},  null, new Integer[]{2, 2, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOrElse")
    void orElse (Integer[] expectedObject, Integer[] n, Integer[] defaultObj) {
        Obscure<Integer[]> obscure = new Obscure<>(n);

        Integer[] actualObject = obscure.orElse(defaultObj);

        assertArrayEquals(expectedObject, actualObject);
    }

    @Test
    void orElseThrow_Exception() {
        Integer test = null;
        Obscure<Integer> obs = new Obscure<>(test);
        String actualString = "";
        NullPointerException ex = new NullPointerException("Object doesn't exist");

        try {
            actualString = obs.orElseThrow(ex).toString();
        } catch (Exception actual) {
            actualString = actual.getMessage();
        }

        Assertions.assertEquals("Object doesn't exist", actualString);
    }


    @Test
    void orElseThrow() {
        Integer test = 10;
        Obscure<Integer> obscure = new Obscure<>(test);
        String actualString = "";
        NullPointerException ex = new NullPointerException("Object doesn't exist");

        try {
            actualString = obscure.orElseThrow(ex).toString();
        } catch (Exception exp) {
            actualString = exp.getMessage();
        }

        Assertions.assertEquals(test.toString(), actualString);
    }

    @Test
    void of() {
        Double num = 100.0;

        Obscure <Double> actual = Obscure.of(num);

        Assertions.assertEquals(num.getClass(), actual.getObject().getClass());
    }

    @Test
    void empty() {

        Obscure <Double> actual = Obscure.empty();

        Assertions.assertNull(actual.getObject());
    }
}
