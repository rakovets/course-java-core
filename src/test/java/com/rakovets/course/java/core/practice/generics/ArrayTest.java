package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArrayTest<T extends Number> {
    static Stream<Arguments> printArrayProviderArguments() {
        return Stream.of(
                Arguments.of(new Long[]{45L, 78L, 46L}, "array [45, 78, 46]"),
                Arguments.of(new Integer[]{45, 78, 46}, "array [45, 78, 46]"),
                Arguments.of(new Short[]{78, 67, 78}, "array [78, 67, 78]"),
                Arguments.of(new Byte[]{78, 97, 45}, "array [78, 97, 45]"),
                Arguments.of(new Float[]{78.7f, 79.6f, 45.6f}, "array [78.7, 79.6, 45.6]"),
                Arguments.of(new Double[]{79.5, 45.6, 126.5, 0.4}, "array [79.5, 45.6, 126.5, 0.4]")
        );
    }

    @ParameterizedTest
    @MethodSource("printArrayProviderArguments")
    void printArray(T[] array, String expected) {
        String actual = Array.printArray(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getMaximumNumberProviderArguments() {
        return Stream.of(
                Arguments.of(new Long[]{45L, 78L, 46L}, 78L),
                Arguments.of(new Integer[]{45, 78, 46}, 78),
                Arguments.of(new Short[]{78, 67, 78}, (short) 78),
                Arguments.of(new Byte[]{78, 97, 45}, (byte) 97),
                Arguments.of(new Float[]{78.7f, 79.6f, 45.6f}, 79.6f),
                Arguments.of(new Double[]{79.5, 45.6, 126.5, 0.4}, 126.5)
        );
    }

    @ParameterizedTest
    @MethodSource("getMaximumNumberProviderArguments")
    void getMaximumNumber(T[] array, T expected) {
        T actual = Array.getMaximumNumber(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getMinimumNumberProviderArguments() {
        return Stream.of(
                Arguments.of(new Long[]{-45L, 78L, 46L}, -45L),
                Arguments.of(new Integer[]{45, 78, -46}, -46),
                Arguments.of(new Short[]{78, -67, 78}, (short) -67),
                Arguments.of(new Byte[]{78, -97, 45}, (byte) -97),
                Arguments.of(new Float[]{78.7f, -79.6f, 45.6f}, -79.6f),
                Arguments.of(new Double[]{79.5, 45.6, -126.5, 0.4}, -126.5)
        );
    }

    @ParameterizedTest
    @MethodSource("getMinimumNumberProviderArguments")
    void getMinimumNumber(T[] array, T expected) {
        T actual = Array.getMinimumNumber(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getAverageProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{10, 10, 10, 10}, 10),
                Arguments.of(new Integer[]{0, 0, 0, 0}, 0),
                Arguments.of(new Integer[]{450, 383, 14587, 7894}, 5828.5),
                Arguments.of(new Long[]{457L, 4564L, 4878L, 10L}, 2477.25),
                Arguments.of(new Byte[]{1, 2, 3, 4}, 2.5),
                Arguments.of(new Short[]{10, 25, 45, 78}, 39.5),
                Arguments.of(new Float[]{4578f, 457845f, 7845f, 5654f}, 118980.5),
                Arguments.of(new Double[]{45.0, 47.0, 48.0, 78.0, 45.0}, 52.6),
                Arguments.of(new Double[]{1.4, 78.5, 45.0, 6.5}, 32.85)
        );
    }

    @ParameterizedTest
    @MethodSource("getAverageProviderArguments")
    void getAverage(T[] array, double expected) {
        double actual = Array.getAverage(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> sortAscendingProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{-99, 500, 71, 1}, new Integer[]{-99, 1, 71, 500}),
                Arguments.of(new Byte[]{74, 56, -85, -127, 6}, new Byte[]{-127, -85, 6, 56, 74}),
                Arguments.of(new Short[]{45, -65, -45, -7, -5, 1, 26}, new Short[]{-65, -45, -7, -5, 1, 26, 45}),
                Arguments.of(new Long[]{78L, 45L, 0L, 85L, -5L}, new Long[]{-5L, 0L, 45L, 78L, 85L}),
                Arguments.of(new Float[]{0.4f, 78.1f, -5.4f, 45.5f}, new Float[]{-5.4f, 0.4f, 45.5f, 78.1f}),
                Arguments.of(new Double[]{0.4, 8.5, 7.9, -7.8, 105.5}, new Double[]{-7.8, 0.4, 7.9, 8.5, 105.5})
        );
    }

    @ParameterizedTest
    @MethodSource("sortAscendingProviderArguments")
    void sortAscending(T[] array, T[] expectedResult) {
        T[] actualResult = Array.sortAscending(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> descendingSortingProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{-99, 500, 71, 1}, new Integer[]{500, 71, 1, -99}),
                Arguments.of(new Byte[]{74, 56, -85, -127, 6}, new Byte[]{74, 56, 6, -85, -127}),
                Arguments.of(new Short[]{45, -65, -45, -7, -5, 1, 26}, new Short[]{45, 26, 1, -5, -7, -45, -65}),
                Arguments.of(new Long[]{78L, 45L, 0L, 85L, -5L}, new Long[]{85L, 78L, 45L, 0L, -5L}),
                Arguments.of(new Float[]{0.4f, 78.1f, -5.4f, 45.5f}, new Float[]{78.1f, 45.5f, 0.4f, -5.4f}),
                Arguments.of(new Double[]{0.4, 8.5, 7.9, -7.8, 105.5}, new Double[]{105.5, 8.5, 7.9, 0.4, -7.8})
        );
    }

    @ParameterizedTest
    @MethodSource("descendingSortingProviderArguments")
    void descendingSorting(T[] array, T[] expectedResult) {
        T[] actualResult = Array.descendingSorting(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> jumpSearchProviderArguments() {
        return Stream.of(
                Arguments.of(7, new Integer[]{4, 5, 9, 3, 7, 8, 5, 6}, 5),
                Arguments.of(7.0, new Double[]{-9.8, 1.3, 3.5, 4.7, 7.0, 10.0}, 4),
                Arguments.of((byte) 127, new Byte[]{4, 5, 7, 3, 14, 127, -45, -127}, 7),
                Arguments.of((short) 78, new Short[]{78, 45, 96, 7}, 2),
                Arguments.of(17L, new Long[]{45L, 78L, 17L, -17L, 0L}, 2),
                Arguments.of(-457.7f, new Float[]{0.4f, -457.5f, 78.6f, 98.5f, 457.7f, 896.6f}, -1),
                Arguments.of(-1, new Integer[]{-2, 1, 2, 3, 4}, -1),
                Arguments.of(8, new Integer[]{0, 0, 0, 0, 0, 0}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("jumpSearchProviderArguments")
    void jumpSearch(T value, T[] array, int expected) {
        int actual = Array.jumpSearch(array, value);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void replace() {
        Array<Integer> array = new Array<>(new Integer[]{1, 2, 3}, 3);

        array.replace(2, 0);

        Assertions.assertEquals("array [2, 2, 3]", array.toString());
    }
}
