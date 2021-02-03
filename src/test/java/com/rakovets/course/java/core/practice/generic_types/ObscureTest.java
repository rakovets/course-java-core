package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ObscureTest {
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
                Arguments.of(100.0,  100.0),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForOrElse")
    void orElse (Double expected, Double num) {
        Obscure<Double> obs = new Obscure<>(num);

        Double actual = obs.orElse();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void orElseThrow_Exception() {
        Double num = null;
        Obscure<Double> obs = new Obscure<>(num);
        String actual = "";

        try {
            actual = obs.orElseThrow().toString();
        } catch (NullPointerException exp) {
            actual = exp.getMessage();
        }

        Assertions.assertEquals("No object", actual);
    }

    @Test
    void orElseThrow() {
        Double test = 100.0;
        Obscure<Double> obs = new Obscure<>(test);
        String actual = "";

        try {
            actual = obs.orElseThrow().toString();
        } catch (NullPointerException exp) {
            actual = exp.getMessage();
        }

        Assertions.assertEquals(test.toString(), actual);
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
