package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

class ArrayTest {

    static Stream<Arguments> FillArray() {
        return Stream.of(
                Arguments.of("[3, 4, 5]", new Number[]{3, 4, 5}),
                Arguments.of("[8.0, 9.0, 10.0]", new Number[]{8.0, 9.0, 10.0})
        );
    }

    @ParameterizedTest
    @MethodSource("FillArray")
    void testFillArray(String expected, Number[] arrayValue) {
        Array array = new Array();
        array.setArray(arrayValue);
        Assertions.assertEquals(expected, Arrays.toString(array.getArray()));
    }

    static Stream<Arguments> MaxArray() {
        return Stream.of(
                Arguments.of(5, new Number[]{3, 4, 5}),
                Arguments.of(10.0, new Number[]{8.0, 9.0, 10.0})
        );
    }

    @ParameterizedTest
    @MethodSource("MaxArray")
    void maxArray(Number expected, Number[] arrayValue) {
        Array array = new Array();
        array.setArray(arrayValue);
        Assertions.assertEquals(expected, array.getMaxArray());
    }

    static Stream<Arguments> MinArray() {
        return Stream.of(
                Arguments.of(3, new Number[]{3, 4, 5}),
                Arguments.of(8.0, new Number[]{8.0, 9.0, 10.0})
        );
    }

    @ParameterizedTest
    @MethodSource("MinArray")
    void minArray(Number expected, Number[] arrayValue) {
        Array array = new Array();
        array.setArray(arrayValue);
        Assertions.assertEquals(expected, array.getMinArray());
    }

    static Stream<Arguments> ArithmeticMean() {
        return Stream.of(
                Arguments.of(4.0, new Number[]{3, 4, 5}),
                Arguments.of(9.0, new Number[]{8.0, 9.0, 10.0})
        );
    }

    @ParameterizedTest
    @MethodSource("ArithmeticMean")
    void getArithmeticMean(Number expected, Number[] arrayValue) {
        Array array = new Array();
        array.setArray(arrayValue);
        Assertions.assertEquals(expected, array.getArithmeticMean());
    }

    static Stream<Arguments> SortAscending() {
        return Stream.of(
                Arguments.of("[3, 4, 5]", new Number[]{5, 3, 4}),
                Arguments.of("[8.0, 9.0, 10.0]", new Number[]{9.0, 8.0, 10.0})
        );
    }

    @ParameterizedTest
    @MethodSource("SortAscending")
    void sortAscending(String expected, Number[] arrayValue) {
        Array array = new Array();
        array.setArray(arrayValue);
        array.sortAscending();
        Assertions.assertEquals(expected, Arrays.toString(array.getArray()));
    }

    static Stream<Arguments> SortDescending() {
        return Stream.of(
                Arguments.of("[5, 4, 3]", new Number[]{5, 3, 4}),
                Arguments.of("[10.0, 9.0, 8.0]", new Number[]{9.0, 8.0, 10.0})
        );
    }

    @ParameterizedTest
    @MethodSource("SortDescending")
    void sortDescending(String expected, Number[] arrayValue) {
        Array array = new Array();
        array.setArray(arrayValue);
        array.sortDescending();
        Assertions.assertEquals(expected, Arrays.toString(array.getArray()));
    }

    static Stream<Arguments> NewValue() {
        return Stream.of(
                Arguments.of("[7, 3, 4]", new Number[]{5, 3, 4}, 0, 7),
                Arguments.of("[9.0, 8.0, 15.0]", new Number[]{9.0, 8.0, 10.0}, 2, 15.0)
        );
    }

    @ParameterizedTest
    @MethodSource("NewValue")
    void setNewValue(String expected, Number[] arrayValue, int index, Number newValue) {
        Array array = new Array();
        array.setArray(arrayValue);
        array.setNewValue(index, newValue);
        Assertions.assertEquals(expected, Arrays.toString(array.getArray()));
    }

    static Stream<Arguments> SearchBinary() {
        return Stream.of(
                Arguments.of(2, new Number[]{3, 4, 5}, 5),
                Arguments.of(1, new Number[]{9.0, 8.0, 10.0}, 8.0)
        );
    }

    @ParameterizedTest
    @MethodSource("SearchBinary")
    void searchBinary(int expected, Number[] arrayValue, Number value) {
        Array array = new Array();
        array.setArray(arrayValue);
        Assertions.assertEquals(expected, array.searchBinary(value));
    }
}
