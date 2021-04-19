package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ObscureTest<T> {

    static Stream<Arguments> getObjProviderArguments() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of("Zhenya", "Zhenya"),
                Arguments.of(10, 10));
    }

    @ParameterizedTest
    @MethodSource("getObjProviderArguments")
    void getObjTest(T expectedResult, T obj) {

        Obscure<T> obscure = new Obscure<>(obj);
        T actualResult = obscure.getObT();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> isPresentProviderArguments() {
        return Stream.of(
                Arguments.of(true, 10),
                Arguments.of(true, "Zhenya"),
                Arguments.of(false, null));
    }

    @ParameterizedTest
    @MethodSource("isPresentProviderArguments")
    void isPresentTest(boolean expectedResult, T obj) {
        Obscure<T> obscure = new Obscure<>(obj);
        boolean actualResult = obscure.isPresent();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> isEmptyProviderArguments() {
        return Stream.of(
                Arguments.of(false, 10),
                Arguments.of(false, "Zhenya"),
                Arguments.of(true, null)
        );
    }

    @ParameterizedTest
    @MethodSource("isEmptyProviderArguments")
    void isEmptyTest(boolean expectedResult, T obj) {
        Obscure<T> obscure = new Obscure<>(obj);
        boolean actualResult = obscure.isEmpty();
        Assertions.assertEquals(expectedResult, actualResult);
    }


    static Stream<Arguments> orElseProviderArguments() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of("Zhenya", "Zhenya"),
                Arguments.of(10, 10));
    }

    @ParameterizedTest
    @MethodSource("orElseProviderArguments")
    void orElseTest(T expectedResult, T obj) {
        Obscure<T> obscure = new Obscure<>(null);
        T actualResult = obscure.orElse(obj);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task5
    static Stream<Arguments> orElseThrowProviderArguments() {
        return Stream.of(
                Arguments.of("Zhenya", "Zhenya"),
                Arguments.of("NullPointerException", null)
        );
    }

    @ParameterizedTest
    @MethodSource("orElseThrowProviderArguments")
    void orElseThrowTest(String expectedResult, T obj) throws Exception {
        Obscure<T> obscure = new Obscure<>(obj);
        String actualResult = "";
        try {
            actualResult = (String) obscure.orElseThrow(new NullPointerException());
        } catch (Exception e) {
            actualResult = "NullPointerException";
        } finally {
            Assertions.assertEquals(expectedResult, actualResult);
        }

    }

    static Stream<Arguments> ofProviderArguments() {
        return Stream.of(
                Arguments.of("Zhenya", "Zhenya"),
                Arguments.of(10, 10));
    }

    @ParameterizedTest
    @MethodSource("ofProviderArguments")
    void ofTest(T expectedResult, T obj) {
        Obscure<T> obscure = (Obscure<T>) new Obscure<>(20);
        Obscure actualResult = obscure.of(obj);
        Assertions.assertEquals(expectedResult, actualResult.getObT());
    }

    static Stream<Arguments> emptyProviderArguments() {
        return Stream.of(
                Arguments.of(true, null),
                Arguments.of(false, 10));
    }

    @ParameterizedTest
    @MethodSource("emptyProviderArguments")
    void emptyTest(T expectedResult, T obj) {
        Obscure<T> obscure = (Obscure<T>) new Obscure<>(20);
        Obscure actualResult = obscure.empty();
        Assertions.assertEquals(expectedResult, actualResult.getObT() == obj);
    }


}
