package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

public class MathTest {

    // Task 1.
    static Stream<Arguments> provideArgumentsForGetMax() {
        return Stream.of(
                Arguments.of(12, 12, 12, 5),
                Arguments.of(8.9, 8.9, 5.0, -9.6),
                Arguments.of(567L, 78L, 6L, 567L)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMax")
    <N extends Number> void getMax(N expectedNumber, N x, N y, N z) {
        // GIVEN

        // WHEN
        N actualNumber = Math.getMax(x, y, z);

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    // Task 2.
    static Stream<Arguments> provideArgumentsForGetMin() {
        return Stream.of(
                Arguments.of(-2, 10, 12, 5, 0, -2),
                Arguments.of(-9.6, 8.9, 5.0, -9.6, 0.0, -5.9),
                Arguments.of(-7L, 78L, 6L, 567L, -7L, 5678L)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMin")
    <N extends Number> void getMin(N expectedNumber, N x, N y, N z, N a, N c) {
        // GIVEN

        // WHEN
        N actualNumber = Math.getMin(x, y, z, a, c);

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    // Task 3.
    static Stream<Arguments> provideArgumentsForGetAverage() {
        return Stream.of(
                Arguments.of(2.5, new Integer[] {1, 2, 3, 4}),
                Arguments.of(4.125, new Double[] {3.5, 4.7, 7.0, 1.3}),
                Arguments.of(217.0, new Long[] {78L, 6L, 567L})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAverage")
    <N extends Number> void getAverage(double expectedDouble, N[] array) {
        // GIVEN

        // WHEN
        double actualDouble = Math.getAverage(array);

        // THEN
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    // Task 4.
    static Stream<Arguments> provideArgumentsForGetMaxFromArray() {
        return Stream.of(
                Arguments.of(4, new Integer[] {1, 2, 3, 4}),
                Arguments.of(7.0, new Double[] {3.5, 4.7, 7.0, 1.3}),
                Arguments.of(567L, new Long[] {78L, 6L, 567L})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxFromArray")
    <N extends Number> void getMaxFromArray(N expectedNumber, N[] array) {
        // GIVEN

        // WHEN
        N actualNumber = Math.getMaxFromArray(array);

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    // Task 5.
    static Stream<Arguments> provideArgumentsForGetMinFromArray() {
        return Stream.of(
                Arguments.of(-2, new Integer[] {1, 2, 3, 4, -2}),
                Arguments.of(-9.8, new Double[] {3.5, 4.7, 7.0, 1.3, 10.0, -9.8}),
                Arguments.of(6L, new Long[] {78L, 6L, 567L})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinFromArray")
    <N extends Number> void getMinFromArray(N expectedNumber, N[] array) {
        // GIVEN

        // WHEN
        N actualNumber = Math.getMinFromArray(array);

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    // Task 6.
    static Stream<Arguments> provideArgumentsForSortGenericArray() {
        return Stream.of(
                Arguments.of(new Integer[] {-2, 1, 2, 3, 4}, new Integer[] {1, 2, 3, 4, -2}),
                Arguments.of(new Double[] {-9.8, 1.3, 3.5, 4.7, 7.0, 10.0}, new Double[] {3.5, 4.7, 7.0, 1.3, 10.0, -9.8}),
                Arguments.of(new Byte[] {0, 0, 3, 3, 7, 8}, new Byte[] {3, 7, 0, 3, 0, 8}),
                Arguments.of(new Long[] {6L, 78L, 567L}, new Long[] {78L, 6L, 567L})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSortGenericArray")
    <N extends Number> void sortGenericArray(N[] expectedArray, N[] array) {
        // GIVEN

        // WHEN
        N[] actualArray = Math.sortGenericArray(array);

        // THEN
        assertArrayEquals(expectedArray, actualArray);
    }

    // Task 7.
    static Stream<Arguments> provideArgumentsForGetIndexBinarySearchArray() {
        return Stream.of(
                Arguments.of(4, 4, new Integer[] {-2, 1, 2, 3, 4}),
                Arguments.of(0, -9.8, new Double[] {-9.8, 1.3, 3.5, 4.7, 7.0, 10.0}),
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
    @MethodSource("provideArgumentsForGetIndexBinarySearchArray")
    <N extends Number> void getIndexBinarySearchArray(int expectedNumber, N key, N[] array) {
        // GIVEN

        // WHEN
        int actualNumber = Math.getIndexBinarySearchArray(array, key);

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}
