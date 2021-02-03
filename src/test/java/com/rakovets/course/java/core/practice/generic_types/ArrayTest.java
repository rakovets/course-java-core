package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayTest {
    @Test
    void toStringTest() {
        // GIVEN
        Array<Integer> test = new Array<>(new Integer[] {1, 2, 3});

        // WHEN
        String actualString = test.toString();


        // THEN
        Assertions.assertEquals("Array: 1 2 3 ", actualString);
    }

    static Stream<Arguments> provideArgumentsForGetMax() {
        return Stream.of(
                Arguments.of(4, new Integer[] {1, 2, 3, 4}),
                Arguments.of(7.0, new Double[] {3.5, 4.7, 7.0, 1.3}),
                Arguments.of(567L, new Long[] {78L, 6L, 567L})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMax")
    <N extends Number> void getMax(N expectedNumber, N[] array) {
        // GIVEN
        Array<N> test = new Array<>(array);

        // WHEN
        N actualNumber = test.getMax();

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    static Stream<Arguments> provideArgumentsForGetMin() {
        return Stream.of(
                Arguments.of(-2, new Integer[] {1, 2, 3, 4, -2}),
                Arguments.of(-9.8, new Double[] {3.5, 4.7, 7.0, 1.3, 10.0, -9.8}),
                Arguments.of(6L, new Long[] {78L, 6L, 567L})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMin")
    <N extends Number> void getMinFromArray(N expectedNumber, N[] array) {
        // GIVEN
        Array<N> test = new Array<>(array);

        // WHEN
        N actualNumber = test.getMin();

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    static Stream<Arguments> provideArgumentsForGetAverageNumber() {
        return Stream.of(
                Arguments.of(2.5, new Integer[] {1, 2, 3, 4}),
                Arguments.of(4.125, new Double[] {3.5, 4.7, 7.0, 1.3}),
                Arguments.of(217.0, new Long[] {78L, 6L, 567L})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAverageNumber")
    <N extends Number> void getAverage(double expectedDouble, N[] array) {
        // GIVEN
        Array<N> test = new Array<>(array);

        // WHEN
        double actualDouble = test.getAverageNumber();

        // THEN
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    static Stream<Arguments> provideArgumentsForSortAscending() {
        return Stream.of(
                Arguments.of(new Integer[] {-2, 1, 2, 3, 4}, new Integer[] {1, 2, 3, 4, -2}),
                Arguments.of(new Double[] {-9.8, 1.3, 3.5, 4.7, 7.0, 10.0}, new Double[] {3.5, 4.7, 7.0, 1.3, 10.0, -9.8}),
                Arguments.of(new Byte[] {0, 0, 3, 3, 7, 8}, new Byte[] {3, 7, 0, 3, 0, 8}),
                Arguments.of(new Long[] {6L, 78L, 567L}, new Long[] {78L, 6L, 567L})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSortAscending")
    <N extends Number> void sortAscending(N[] expectedArray, N[] array) {
        // GIVEN
        Array<N> test = new Array<>(array);

        // WHEN
        N[] actualArray = test.sortAscending();

        // THEN
        assertArrayEquals(expectedArray, actualArray);
    }

    static Stream<Arguments> provideArgumentsForSortDescending() {
        return Stream.of(
                Arguments.of(new Integer[] {4, 3, 2, 1, -2}, new Integer[] {1, 2, 3, 4, -2}),
                Arguments.of(new Double[] {10.0, 7.0, 4.7, 3.5, 1.3, -9.8}, new Double[] {3.5, 4.7, 7.0, 1.3, 10.0, -9.8}),
                Arguments.of(new Byte[] {8, 7, 3, 3, 0, 0}, new Byte[] {3, 7, 0, 3, 0, 8}),
                Arguments.of(new Long[] {567L, 78L, 6L}, new Long[] {78L, 6L, 567L})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSortDescending")
    <N extends Number> void sortDescending(N[] expectedArray, N[] array) {
        // GIVEN
        Array<N> test = new Array<>(array);

        // WHEN
        N[] actualArray = test.sortDescending();

        // THEN
        assertArrayEquals(expectedArray, actualArray);
    }

    static Stream<Arguments> provideArgumentsForSearchBinary() {
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
    @MethodSource("provideArgumentsForSearchBinary")
    <N extends Number> void searchBinary(int expectedNumber, N key, N[] array) {
        // GIVEN
        Array<N> test = new Array<>(array);

        // WHEN
        int actualNumber = test.searchBinary(key);

        // THEN
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    void replace() {
        // GIVEN
        Array<Integer> test = new Array<>(new Integer[] {1, 2, 3});

        // WHEN
        test.replace(2, 0);

        // THEN
        Assertions.assertEquals("Array: 1 2 0 ", test.toString());
    }
}
