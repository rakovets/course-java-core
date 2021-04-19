package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MathTest<T> {
    static Stream<Arguments> maxValueTestProviderArguments() {
        return Stream.of(
                Arguments.of(5, 4, 5, 2),
                Arguments.of(9.9, -9.9, 9.9, 2.2),
                Arguments.of("C", "B", "A", "C")
        );
    }

    @ParameterizedTest
    @MethodSource("maxValueTestProviderArguments")
    <T extends Comparable<T>> void maxValueTest(T expectedResult, T a, T b, T c) {
        T actualResult = Math.maxValue(a, b, c);
        Assertions.assertEquals(expectedResult, actualResult);
    }


    static Stream<Arguments> minValueProviderArguments() {
        return Stream.of(
                Arguments.of(-2, 4, 5, 2, -2, 99),
                Arguments.of(-9.9, -9.9, 9.9, 2.2, -2.2, 0.0),
                Arguments.of("A", "B", "A", "C", "Z", "Y")
        );
    }

    @ParameterizedTest
    @MethodSource("minValueProviderArguments")
    <T extends Comparable<T>> void getMinNumber(T expectedResult, T x, T y, T z, T k, T j) {
        T actualResult = Math.minValue(x, y, z, k, j);
        Assertions.assertEquals(expectedResult, actualResult);
    }


    static Stream<Arguments> averageValueProviderArguments() {
        return Stream.of(
                Arguments.of(25.0, new Integer[]{0, 20, 30, 50}),
                Arguments.of(15.0, new Double[]{40.0, 20.0, 10.0, -10.0}),
                Arguments.of(15.0, new Long[]{10L, 20L})
        );
    }

    @ParameterizedTest
    @MethodSource("averageValueProviderArguments")
    <T extends Number> void averageValueTest(double expectedResult, T[] array) {
        double actualResult = Math.averageValue(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task4
    static Stream<Arguments> maxInArrayProviderArguments() {
        return Stream.of(
                Arguments.of(200, new Integer[]{0, 200, 35, -40, -200}),
                Arguments.of(55.5, new Double[]{0.0, 20.0, 55.5, -40.5}),
                Arguments.of(35L, new Long[]{-10L, 20L, 35L, -10L, -100L})
        );
    }

    @ParameterizedTest
    @MethodSource("maxInArrayProviderArguments")
    <T extends Number> void maxInArrayTest(T expectedResult, T[] array) {
        T actualResult = Math.maxInArray(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task5
    static Stream<Arguments> minInArrayProviderArguments() {
        return Stream.of(
                Arguments.of(200, new Integer[]{0, 200, 35, -40, -200}),
                Arguments.of(55.5, new Double[]{0.0, 20.0, 55.5, -40.5}),
                Arguments.of(35L, new Long[]{-10L, 20L, 35L, -10L, -100L})
        );
    }

    @ParameterizedTest
    @MethodSource("minInArrayProviderArguments")
    <T extends Number> void minInArrayTest(T expectedResult, T[] array) {
        T actualResult = Math.minInArray(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> bubbleSortProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{-100, 0, 1, 100}, new Integer[]{1, 0, -100, 100}),
                Arguments.of(new Double[]{-100.0, 0.0, 1.0, 100.0}, new Double[]{1.0, 0.0, -100.0, 100.0}),
                Arguments.of(new Long[]{-10L, 50L, 99L, 100L}, new Long[]{50L, -10L, 100L, 99L})
        );
    }

    @ParameterizedTest
    @MethodSource("bubbleSortProviderArguments")
    <T extends Comparable<T>> void bubbleSortTest(T[] expectedResult, T[] array) {
        T[] actualResult = Math.bubbleSort(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    //Task7
    static Stream<Arguments> binarySearchProviderArguments() {
        return Stream.of(
                Arguments.of(0, new Integer[]{-100, 10, 20, 35, 90}, -100),
                Arguments.of(4, new Integer[]{-100, 10, 20, 35, 90}, 90),
                Arguments.of(2, new Integer[]{-100, 10, 20, 35, 90, 100}, 20),
                Arguments.of(2, new Double[]{10.0, 20.5, 35.5}, 35.5),
                Arguments.of(0, new Long[]{-10L, 10L, 20L, 35L}, -10L),
                Arguments.of(3, new String[]{"A", "B", "C", "D"}, "D"),
                Arguments.of(1, new String[]{"A", "B", "C", "D"}, "B")
        );
    }

    @ParameterizedTest
    @MethodSource("binarySearchProviderArguments")
    <T extends Comparable<T>> void binarySearchTest(int expectedResult, T[] array, T elementToSearch) {
        int actualResult = Math.binarySearch(array, elementToSearch);
        Assertions.assertEquals(expectedResult, actualResult);

    }
}
