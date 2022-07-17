package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MatrixTest<T extends Number> {
    static Stream<Arguments> getMaximumNumberMatrixIntegerProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[][]{{45, 78, 6}, {79, -99, -6}}, 79),
                Arguments.of(new Long[][]{{78L, 99L, 4L, -7L,}, {67L, 145L, -79L, -9L}}, 145L),
                Arguments.of(new Short[][]{{-78, -89, -7}, {-6, 4, -7}}, (short) 4),
                Arguments.of(new Byte[][]{{0, 0, 0}, {0, 0, 0}}, (byte) 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getMaximumNumberMatrixIntegerProviderArguments")
    void getMaximumNumberMatrixInteger(T[][] array, T expected) {
        Matrix<T> matrix = new Matrix<>(array);

        T actual = matrix.getMaximumNumberMatrixInteger();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getMaximumNumberMatrixFloatProviderArguments() {
        return Stream.of(
                Arguments.of(new Float[][]{{-78.5f, -79.5f, -98.5f}, {-45.5f, -98.7f, 1.5f}}, 1.5f),
                Arguments.of(new Double[][]{{78.6, 0.5, 9.8}, {145.6, 79.6, 0.4}}, 145.6)
        );
    }

    @ParameterizedTest
    @MethodSource("getMaximumNumberMatrixFloatProviderArguments")
    void getMaximumNumberMatrixFloat(T[][] array, T expected) {
        Matrix<T> matrix = new Matrix<>(array);

        T actual = matrix.getMaximumNumberMatrixFloat();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getMinimumNumberMatrixIntegerProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[][]{{45, 78, 6}, {79, -99, -6}}, -99),
                Arguments.of(new Long[][]{{78L, 99L, 4L, -7L,}, {67L, 145L, -79L, -9L}}, (long) -79),
                Arguments.of(new Short[][]{{-78, -89, -7}, {-6, 0, -7}}, (short) -89),
                Arguments.of(new Byte[][]{{0, 0, 0}, {0, 0, 0}}, (byte) 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getMinimumNumberMatrixIntegerProviderArguments")
    void getMinimumNumberMatrixInteger(T[][] array, T expected) {
        Matrix<T> matrix = new Matrix<>(array);

        T actual = matrix.getMinimumNumberMatrixInteger();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getMinimumNumberMatrixFloatProviderArguments() {
        return Stream.of(
                Arguments.of(new Float[][]{{-7.3f, -7.4f, -0.0f}, {-4.1f, -4.7f, 1.1f}}, -7.4f),
                Arguments.of(new Double[][]{{78.6, 0.5, 9.8}, {145.6, 79.6, 0.4}}, 0.4)
        );
    }

    @ParameterizedTest
    @MethodSource("getMinimumNumberMatrixFloatProviderArguments")
    void getMinimumNumberMatrixFloat(T[][] array, T expected) {
        Matrix<T> matrix = new Matrix<>(array);

        T actual = matrix.getMinimumNumberMatrixFloat();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getAverageMatrixProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[][]{{10, 10}, {10, 10}}, 10),
                Arguments.of(new Integer[][]{{0, 0}, {0, 0}}, 0),
                Arguments.of(new Integer[][]{{450, 383}, {14587, 7894}}, 5828.5),
                Arguments.of(new Long[][]{{457L, 4564L}, {4878L, 10L}}, 2477.25),
                Arguments.of(new Byte[][]{{1, 2}, {3, 4}}, 2.5),
                Arguments.of(new Short[][]{{10, 25}, {45, 78}}, 39.5),
                Arguments.of(new Float[][]{{4578f, 457845f}, {7845f, 5654f}}, 118980.5),
                Arguments.of(new Double[][]{{45.0, 47.0, 48.0}, {78.0, 45.0, 78.5}}, 56.916666666666664),
                Arguments.of(new Double[][]{{1.4, 78.5}, {45.0, 6.5}}, 32.85)
        );
    }

    @ParameterizedTest
    @MethodSource("getAverageMatrixProviderArguments")
    void getAverageMatrix(T[][] array, double expected) {
        Matrix<T> matrix = new Matrix<>(array);

        double actual = matrix.getAverageMatrix();

        Assertions.assertEquals(expected, actual);
    }
}
