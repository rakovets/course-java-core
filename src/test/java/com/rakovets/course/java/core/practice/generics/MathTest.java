package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathTest {
    static Stream<Arguments> provideArgumentsForGetMaxOfThree() {
        return Stream.of(
                Arguments.of(3, 30, 300, 300),
                Arguments.of(0, 0, 1, 1),
                Arguments.of(6, 6, 4, 6),
                Arguments.of(-1, -1, -1, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxOfThree")
    void testGetMaxOfThree(Integer obj1, Integer obj2, Integer obj3, Integer expected) {
        Integer actual = Math.getMaxOfThree(obj1, obj2, obj3);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMinOfFive() {
        return Stream.of(
                Arguments.of(3, 30, 300, 330, 333, 3),
                Arguments.of(0, 0, 1, 0, 2, 0),
                Arguments.of(6, 6, 4, 3, 6, 3),
                Arguments.of(-1, -1, -1, 0, -1, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinOfFive")
    void testGetMinOfFive(Integer obj1, Integer obj2, Integer obj3, Integer obj4, Integer obj5, Integer expected) {
        Integer actual = Math.getMinOfFive(obj1, obj2, obj3, obj4, obj5);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetAverage() {
        return Stream.of(
                Arguments.of(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, 3.0),
                Arguments.of(new Double[]{32.0, 10.0, 13.0, 6.0, 0.0}, 12.2),
                Arguments.of(new Double[]{1.1, 2.2, 3.3, 4.4}, 2.75)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAverage")
    void testGetAverage(Double[] arr, Double expected) {
        Double actual = Math.getAverage(arr);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMax() {
        return Stream.of(
                Arguments.of(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, 5.0),
                Arguments.of(new Double[]{32.0, 10.0, 13.0, 6.0, 0.0}, 32.0),
                Arguments.of(new Double[]{1.1, 2.2, 3.3, 4.4}, 4.4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMax")
    void testGetMax(Double[] arr, Double expected) {
        Double actual = Math.getMax(arr);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMin() {
        return Stream.of(
                Arguments.of(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, 1.0),
                Arguments.of(new Double[]{32.0, 10.0, 13.0, 6.0, 0.0}, 0.0),
                Arguments.of(new Double[]{1.1, -2.2, 3.3, 4.4}, -2.2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMin")
    void testGetMin(Double[] arr, Double expected) {
        Double actual = Math.getMin(arr);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSortArray() {
        return Stream.of(
                Arguments.of(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}),
                Arguments.of(new Double[]{32.0, 10.0, 13.0, 6.0, 0.0}, new Double[]{0.0, 6.0, 10.0, 13.0, 32.0}),
                Arguments.of(new Double[]{1.1, -2.2, 3.3, 4.4}, new Double[]{-2.2, 1.1, 3.3, 4.4})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSortArray")
    void testSortArray(Double[] arr, Double[] expected) {
        Double[] actual = Math.sortArray(arr);

        Assertions.assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSortBinaryArray() {
        return Stream.of(
                Arguments.of(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, 3.0, 2),
                Arguments.of(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, 1.0, 0),
                Arguments.of(new Double[]{1.1, -2.2, 3.3, 4.4}, 3.0, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSortBinaryArray")
    void testSortBinaryArray(Double[] arr, Double obj, int expected) {
        int actual = Math.sortBinaryArray(arr, obj);

        Assertions.assertEquals(expected, actual);
    }
}
