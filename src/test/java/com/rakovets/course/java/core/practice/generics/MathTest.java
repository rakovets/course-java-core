package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathTest<T extends Number> {
    static Stream<Arguments> getMaximumNumberProviderArguments() {
        return Stream.of(
                Arguments.of(0, 0, 1, 1),
                Arguments.of(0, 1, 0, 1),
                Arguments.of(1, 0, 0, 1),
                Arguments.of(-4, -3, 0, 0),
                Arguments.of(-4, 0, -3, 0),
                Arguments.of(0, -4, -3, 0),
                Arguments.of(45L, 43L, 44L, 45L),
                Arguments.of(45.5f, 45.4f, 45.3f, 45.5f),
                Arguments.of(0, 0, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getMaximumNumberProviderArguments")
    void getMaximumNumber(T firstNumber, T secondNumber, T thirdNumber, T expected) {
        T actual = Math.getMaximumNumber(firstNumber, secondNumber, thirdNumber);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getMinimumNumberProviderArguments() {
        return Stream.of(
                Arguments.of(0, 0, 0, 0, 1, 0),
                Arguments.of(0, 0, 0, 1, 0, 0),
                Arguments.of(0, 0, 1, 0, 0, 0),
                Arguments.of(0, 1, 0, 0, 0, 0),
                Arguments.of(1, 0, 0, 0, 0, 0),
                Arguments.of(1, 2, 3, 4, 5, 1),
                Arguments.of(-5, -4, -3, -2, -1, -5),
                Arguments.of(0, 0, 0, 0, 0, 0),
                Arguments.of(45.1f, 45.2f, 45.3f, 45.4f, 45.5f, 45.1f),
                Arguments.of(1L, 2L, 3L, 4L, 5L, 1L)
        );
    }

    @ParameterizedTest
    @MethodSource("getMinimumNumberProviderArguments")
    void getMinimumNumber(T firstNumber, T secondNumber, T thirdNumber,
                          T fourthNumber, T fifthNumber, T expected) {
        T actual = Math.getMinimumNumber(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);

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
    void getAverage(T[] numbers, double expected) {
        double actual = Math.getAverage(numbers);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getMaximumNumberInArrayProviderArguments() {
        return Stream.of(
                Arguments.of(new Byte[]{127, 0, -125, 4}, (byte) 127),
                Arguments.of(new Integer[]{1, 2, 3, 5, 78, -785}, 78),
                Arguments.of(new Double[]{78.5, 78.8, 0.4, -78.5}, 78.8),
                Arguments.of(new Long[]{35L, 78L, 4L, -78L}, 78L),
                Arguments.of(new Short[]{45, 78, 345, 7855}, (short) 7855),
                Arguments.of(new Integer[]{0, 0, 0, 0, 0}, 0),
                Arguments.of(new Float[]{45.5f, 78.0f, 5.7f, 0.0f, 789.8f}, 789.8f)
        );
    }

    @ParameterizedTest
    @MethodSource("getMaximumNumberInArrayProviderArguments")
    void getMaximumNumberInArray(T[] numbers, T expectedResult) {
        T actualResult = Math.getMaximumNumberInArray(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> getMinimumNumberInArrayProviderArguments() {
        return Stream.of(
                Arguments.of(new Byte[]{127, 0, -125, 4}, (byte) -125),
                Arguments.of(new Integer[]{1, 2, 3, 5, 78, -785}, -785),
                Arguments.of(new Double[]{78.5, 78.8, 0.4, -78.5}, -78.5),
                Arguments.of(new Long[]{35L, 78L, 4L, -78L}, -78L),
                Arguments.of(new Short[]{45, 78, 345, 7855}, (short) 45),
                Arguments.of(new Integer[]{0, 0, 0, 0, 0}, 0),
                Arguments.of(new Float[]{45.5f, 78.0f, 5.7f, 0.0f, 789.8f}, 0.0f)
        );
    }

    @ParameterizedTest
    @MethodSource("getMinimumNumberInArrayProviderArguments")
    void getMinimumNumberInArray(T[] numbers, T expectedResult) {
        T actualResult = Math.getMinimumNumberInArray(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> selectionSortProviderArguments() {
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
    @MethodSource("selectionSortProviderArguments")
    void selectionSort(T[] array, T[] expectedResult) {
        T[] actualResult = Math.selectionSort(array);

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
        int actual = Math.jumpSearch(array, value);

        Assertions.assertEquals(expected, actual);
    }
}
