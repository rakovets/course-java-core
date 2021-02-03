package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathTest {

    @Test
    void getMaxOfThree() {
        double x = 12.0;
        double y = 9.0;
        double z = 8.0;

        double actualNumber = Math.getMaxOfThree(x, y, z);

        Assertions.assertEquals(12, actualNumber);
    }

    static Stream<Arguments> getMinOfFiveProvideArguments() {
        return Stream.of(
                Arguments.of(1, 1, 2, 3, 4, 5),
                Arguments.of(1.0, 1.0, 2.0, 3.0, 4.0, 5.0),
                Arguments.of(1L, 1L, 2L, 3L, 4L, 5L)
        );
    }

    @ParameterizedTest
    @MethodSource("getMinOfFiveProvideArguments")
    <T extends  Number>  void getMinOfFive(T expectedNumber, T x, T y, T z, T c, T n) {

        T actualNumber = Math.getMinOfFive(x, y, z, c, n);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    static Stream<Arguments> getAverageSumOfArrayProvideArguments() {
        return Stream.of(
                Arguments.of(1, new Integer[] {1, 1, 1, 1}),
                Arguments.of(1.0, new Double[] {1.0, 1.0, 1.0, 1.0}),
                Arguments.of(1.5, new Long[] {1L, 2L, 1L, 2L})
        );
    }

    @ParameterizedTest
    @MethodSource("getAverageSumOfArrayProvideArguments")
    <T extends  Number>  void getAverageSumOfArray(double expectedDouble, T[] array) {

        double actualDouble = Math.getAverageSumOfArray(array);

        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    static Stream<Arguments> getMaxOfArrayProvideArguments() {
        return Stream.of(
                Arguments.of(4, new Integer[] {1, 2, 3, 4}),
                Arguments.of(10.0, new Double[] {10.0, 7.0, 4.0, 1.0}),
                Arguments.of(9L, new Long[] {1L, 9L, 6L, 6L})
        );
    }

    @ParameterizedTest
    @MethodSource("getMaxOfArrayProvideArguments")
    <T extends  Number>  void getMaxOfArray(T expectedDouble, T[] array) {

        T actualDouble = Math.getMaxOfArray(array);

        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    static Stream<Arguments> getMinOfArrayProvideArguments() {
        return Stream.of(
                Arguments.of(1, new Integer[] {1, 2, 3, 4}),
                Arguments.of(-7.0, new Double[] {10.0, -7.0, 4.0, 1.0}),
                Arguments.of(0L, new Long[] {1L, 0L, 6L, 6L})
        );
    }

    @ParameterizedTest
    @MethodSource("getMinOfArrayProvideArguments")
    <T extends  Number>  void getMinOfArray(T expectedNumber, T[] array) {

        T actualNumber = Math.getMinOfArray(array);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    static Stream<Arguments> getSortOfArrayProvideArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 4}, new Integer[] {3, 1, 2, 4}),
                Arguments.of(new Double[] {-7.0, 1.0, 4.0, 10.0}, new Double[] {10.0, -7.0, 4.0, 1.0}),
                Arguments.of(new Long[] {0L, 1L, 6L, 6L}, new Long[] {1L, 0L, 6L, 6L}),
                Arguments.of(new Byte[] {0, 1, 6, 6}, new Byte[] {1, 0, 6, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("getSortOfArrayProvideArguments")
    <T extends  Number>  void getBinarySearch(T[] expectedNumber, T[] array) {

        T[] actualNumber = Math.getSortOfArray(array);

        Assertions.assertArrayEquals(expectedNumber, actualNumber);
    }

    static Stream<Arguments> getBinarySearch() {
        return Stream.of(
                Arguments.of(-1, null, new Integer[] {-2, 1, 2, 3, 4}),
                Arguments.of(1, 1, new Integer[] {-2, 1, 2, 3, 4}),
                Arguments.of(1, 1.3, new Double[] {-9.8, 1.3, 3.5, 4.7, 7.0, 10.0}),
                Arguments.of(2, 3, new Byte[] {0, 0, 3, 4, 7, 8}),
                Arguments.of(2, 78L, new Long[] {-9L, 6L, 78L, 567L, 79587L, }),
                Arguments.of(-1, 0.0, new Double[] {-9.8, 1.3, 3.5, 4.7, 7.0, 10.0}),
                Arguments.of(-1, -5, new Integer[] {-2, 1, 2, 3, 4}),
                Arguments.of(-1, 987L, new Long[] {6L, 78L, 567L}),
                Arguments.of(-1, null, new Integer[] {-2, 1, 2, 3, 4}),
                Arguments.of(-1, 5, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getBinarySearch")
    <N extends Number> void getBinarySearch(int expectedNumber, N point, N[] arrayForBin) {
        // GIVEN

        // WHEN
        int actualNumber = Math.getBinarySearch(point, arrayForBin);

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}
