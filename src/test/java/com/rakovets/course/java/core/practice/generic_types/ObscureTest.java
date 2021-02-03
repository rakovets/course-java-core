package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ObscureTest {

    static Stream<Arguments> isEmptyProvideArguments() {
        return Stream.of(
                Arguments.of(true, null),
                Arguments.of(false, "Hey!")
        );
    }

    @ParameterizedTest
    @MethodSource("isEmptyProvideArguments")
    <T extends  String>  void isEmpty(Boolean expectedBoolean, T obj) {
        Obscure<String> obj1 = new Obscure<>(obj);

        Boolean actualBoolean = obj1.isEmpty();

        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> isPresentProvideArguments() {
        return Stream.of(
                Arguments.of(false, null),
                Arguments.of(true, "Hey!")
        );
    }

    @ParameterizedTest
    @MethodSource("isPresentProvideArguments")
    <T extends  String>  void isPresent(Boolean expectedBoolean, T obj) {
        Obscure<String> obj1 = new Obscure<>(obj);

        Boolean actualBoolean = obj1.isPresent();

        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    static Stream<Arguments> orElseProvideArguments() {
        return Stream.of(
                Arguments.of("Hey!", "Hey!"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("orElseProvideArguments")
    <T extends  String>  void orElse(String expectedString, T obj) {
        Obscure<String> obj1 = new Obscure<>(obj);

        String actualString = obj1.orElse();

        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> orElseThrowProvideArguments() {
        return Stream.of(
                Arguments.of("Hey!", "Hey!"),
                Arguments.of("Object is not exist", null)
        );
    }

    @ParameterizedTest
    @MethodSource("orElseThrowProvideArguments")
    <T extends  String>  void orElseThrow(String expectedString, T obj) {
        Obscure<String> obj1 = new Obscure<>(obj);
        String actualString = "";

        try {
            actualString = obj1.orElseThrow();
        } catch (NullPointerException nu) {
            actualString = nu.getMessage();
        }

        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    void of() {
        String test = "test";

        Obscure<String> str = new Obscure<>(test);

        Assertions.assertEquals(test.getClass(), str.getObj().getClass());
    }

    @Test
    void empty() {
        Obscure <Character> actualResult = Obscure.empty();

        Assertions.assertNull(actualResult.getObj());
    }
}
