package com.rakovets.course.java.core.practice.generic_types.project_obscure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ObscureTest<T> {

    //Task1
    static Stream<Arguments> getObjProviderArguments() {
        return Stream.of(
                Arguments.of("JAWA", "JAWA"),
                Arguments.of(2021, 2021),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getObjProviderArguments")
    void getObj(T expectedResult, T obj) {
        // GIVEN
        Obscure <T> obscure = new Obscure<>(obj);

        // WHEN
        T actualResult = obscure.getObj();

        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task2
    static Stream<Arguments> isPresentProviderArguments() {
        return Stream.of(
                Arguments.of(true, "JAWA"),
                Arguments.of(true, 2021),
                Arguments.of(false, null)
        );
    }

    @ParameterizedTest
    @MethodSource("isPresentProviderArguments")
    void isPresent(boolean expectedResult, T obj) {
        // GIVEN
        Obscure <T> obscure = new Obscure<>(obj);

        // WHEN
        boolean actualResult = obscure.isPresent();

        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task3
    static Stream<Arguments> isEmptyProviderArguments() {
        return Stream.of(
                Arguments.of(false, "JAWA"),
                Arguments.of(false, 2021),
                Arguments.of(true, null)
        );
    }

    @ParameterizedTest
    @MethodSource("isEmptyProviderArguments")
    void isEmpty(boolean expectedResult, T obj) {
        // GIVEN
        Obscure <T> obscure = new Obscure<>(obj);

        // WHEN
        boolean actualResult = obscure.isEmpty();

        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task4
    static Stream<Arguments> orElseProviderArguments() {
        return Stream.of(
                Arguments.of("JAWA", "JAWA"),
                Arguments.of(2021, 2021),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("orElseProviderArguments")
    void orElse(T expectedResult, T obj) {
        // GIVEN
        Obscure <T> obscure = new Obscure<>(null);

        // WHEN
        T actualResult = obscure.orElse(obj);

        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task5
    static Stream<Arguments> orElseThrowProviderArguments() {
        return Stream.of(
                Arguments.of("JAWA", "JAWA"),
                Arguments.of("NullPointerException", null)
        );
    }

    @ParameterizedTest
    @MethodSource("orElseThrowProviderArguments")
    void orElseThrow(String expectedResult, T obj) {
        // GIVEN
        Obscure <T> obscure = new Obscure<>(obj);

        // WHEN
        String actualResult;
        try {
            actualResult = (String) obscure.orElseThrow();
        } catch (NullPointerException ex) {
            actualResult = ex.getMessage();
        }
        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task6
    @Test
    void of() {
        //Given
        String actualResult = Obscure.of("JAWA").toString();
        //When
        String expectedResult = "Obscure{obj=JAWA}";
        //That
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task7
    @Test
    void empty() {
        //Given
        String actualResult = Obscure.empty().toString();
        //When
        String expectedResult = "Obscure{obj=null}";
        //That
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
