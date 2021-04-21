package com.rakovets.course.java.core.practice.generic_types.obscureTest;

import com.rakovets.course.java.core.practice.generic_types.Obscure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ObscureTest<T> {

    static Stream<Arguments> getObscureProviderArguments() {
        return Stream.of(
                Arguments.of("IT-academy", "IT-academy"),
                Arguments.of('S', 'S'),
                Arguments.of(75, 75),
                Arguments.of(true, true),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getObscureProviderArguments")
    void getObscureTest(T obscure, T expectedResult) {
        Obscure<T> obscure1 = new Obscure<>(obscure);
        T actualResult = obscure1.getObscure();
        Assertions.assertEquals(actualResult, expectedResult);
    }

    static Stream<Arguments> isPresentProviderArguments() {
        return Stream.of(
                Arguments.of("IT-academy", true),
                Arguments.of('S', true),
                Arguments.of(75, true),
                Arguments.of(true, true),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isPresentProviderArguments")
    void isPresentTest(T obscure, boolean expectedResult) {
        Obscure<T> obscure1 = new Obscure<>(obscure);
        boolean actualResult = obscure1.isPresent();
        Assertions.assertEquals(actualResult, expectedResult);
    }

    static Stream<Arguments> isEmptyProviderArguments() {
        return Stream.of(
                Arguments.of("IT-academy", false),
                Arguments.of('S', false),
                Arguments.of(75, false),
                Arguments.of(true, false),
                Arguments.of(null, true)
        );
    }

    @ParameterizedTest
    @MethodSource("isEmptyProviderArguments")
    void isEmptyTest(T obscure, boolean expectedResult) {
        Obscure<T> obscure1 = new Obscure<>(obscure);
        boolean actualResult = obscure1.isEmpty();
        Assertions.assertEquals(actualResult, expectedResult);
    }

    static Stream<Arguments> orElseProviderArguments() {
        return Stream.of(
                Arguments.of("IT-academy", "IT-academy"),
                Arguments.of('S', 'S'),
                Arguments.of(75, 75),
                Arguments.of(true, true),
                Arguments.of(null, "A new message")
        );
    }

    @ParameterizedTest
    @MethodSource("orElseProviderArguments")
    void orElseTest(T obscure, T expectedResult) {
        Obscure<T> obscure1 = new Obscure<>(obscure);
        T actualResult = obscure1.orElse((T) "A new message");
        Assertions.assertEquals(actualResult, expectedResult);
    }

    static Stream<Arguments> orElseThrowProviderArguments() {
        return Stream.of(
                Arguments.of("IT-academy", "IT-academy"),
                Arguments.of(null, "This is NullPointerException")
        );
    }

    @ParameterizedTest
    @MethodSource("orElseThrowProviderArguments")
    void orElseThrowTest(T obscure, String expectedResult) {
        Obscure<T> obscure1 = new Obscure<>(obscure);
        String actualResult;
        try {
            actualResult = (String) obscure1.orElseThrow(new Exception("This is NullPointerException"));
        } catch (Exception ex) {
            actualResult = ex.getMessage();
        }
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    void of() {
        Integer metodOfTest = 785;
        Obscure <Integer> actualResult = Obscure.of(metodOfTest);
        Assertions.assertEquals(actualResult.getObscure().getClass(), metodOfTest.getClass());
    }

    @Test
    void empty() {
        Obscure <T> actualResult = Obscure.empty();
        Assertions.assertNull(actualResult.getObscure());
    }

}
