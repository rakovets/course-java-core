package com.rakovets.course.java.core.practice.generic_types.project_math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MathTest <T extends Number>{
    //Task1
    static Stream<Arguments> getMaxNumberProviderArguments() {
        return Stream.of(
                Arguments.of(10, 3, 10, 6),
                Arguments.of(10.7, -3.7, 10.7, 6.9),
                Arguments.of(10L, 3L, 10L, 6L)
        );
    }

    @ParameterizedTest
    @MethodSource("getMaxNumberProviderArguments")
    void getMaxNumber(T expectedResult, T x, T y, T z) {
        // GIVEN

        // WHEN
        T actualResult = Math.getMaxNumber(x, y, z);

        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task2
    static Stream<Arguments> getMinNumberProviderArguments() {
        return Stream.of(
                Arguments.of(1, 3, 10, 6, 3, 1),
                Arguments.of(-3.7, -3.7, 10.7, 6.9, 6.5, 23.5),
                Arguments.of(-10L, 3L, -10L, 6L,245L, 14L)
        );
    }

    @ParameterizedTest
    @MethodSource("getMinNumberProviderArguments")
    void getMinNumber(T expectedResult, T x, T y, T z, T k, T j) {
        // GIVEN

        // WHEN
        T actualResult = Math.getMinNumber(x, y, z, k, j);

        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task3
    static Stream<Arguments> getAverageArrayProviderArguments() {
        return Stream.of(
                Arguments.of(15.25, new Integer[]{10, 20, 35,-4}),
                Arguments.of(14.075, new Double[]{10.6,20.9,35.3,-10.5}),
                Arguments.of(13.75, new Long[]{10L,20L,35L,-10L})
        );
    }

    @ParameterizedTest
    @MethodSource("getAverageArrayProviderArguments")
    void getAverageArray(T expectedResult, T[] array) {
        // GIVEN

        // WHEN
        double actualResult = Math.getAverageArray(array);

        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task4
    static Stream<Arguments> getMaxInArrayProviderArguments() {
        return Stream.of(
                Arguments.of(35, new Integer[]{10, 20, 35,-4}),
                Arguments.of(35.3, new Double[]{10.6,20.9,35.3,-10.5}),
                Arguments.of(35L, new Long[]{10L,20L,35L,-10L})
        );
    }

    @ParameterizedTest
    @MethodSource("getMaxInArrayProviderArguments")
    void getMaxInArray(T expectedResult, T[] array) {
        // GIVEN

        // WHEN
        T actualResult = Math.getMaxInArray(array);

        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task5
    static Stream<Arguments> getMinInArrayProviderArguments() {
        return Stream.of(
                Arguments.of(-4, new Integer[]{10, 20, 35,-4}),
                Arguments.of(-10.5, new Double[]{10.6,20.9,35.3,-10.5}),
                Arguments.of(-10L, new Long[]{10L,20L,35L,-10L})
        );
    }

    @ParameterizedTest
    @MethodSource("getMinInArrayProviderArguments")
    void getMinInArray(T expectedResult, T[] array) {
        // GIVEN

        // WHEN
        T actualResult = Math.getMinInArray(array);

        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //Task6
    static Stream<Arguments> sortArrayProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{-4, 10, 20, 35}, new Integer[]{10, 20, 35,-4}),
                Arguments.of(new Double[]{-10.5, 10.6, 20.9, 35.3}, new Double[]{10.6,20.9,35.3,-10.5}),
                Arguments.of(new Long[]{-10L, 10L, 20L, 35L}, new Long[]{10L,20L,35L,-10L})
        );
    }

    @ParameterizedTest
    @MethodSource("sortArrayProviderArguments")
    void sortArray(T[] expectedResult, T[] array) {
        // GIVEN

        // WHEN
        T[] actualResult = Math.sortArray(array);

        // THAT
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    //Task7
    static Stream<Arguments> findElementInArrayBinaryProviderArguments() {
        return Stream.of(
                Arguments.of(0, new Integer[]{10, 20, 35,-4}, -4),
                Arguments.of(3, new Double[]{10.6,20.9,35.3,-10.5}, 35.3),
                Arguments.of(2, new Long[]{10L,20L,35L,-10L}, 20L)
        );
    }

    @ParameterizedTest
    @MethodSource("findElementInArrayBinaryProviderArguments")
    void findElementInArrayBinary(int expectedResult, T[] array, T elementToSearch) {
        // GIVEN

        // WHEN
        int actualResult = Math.findElementInArrayBinary(array,elementToSearch);

        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
