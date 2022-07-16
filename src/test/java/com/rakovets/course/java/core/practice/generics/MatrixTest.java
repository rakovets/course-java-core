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
                Arguments.of(new Long[][]{{78L, 99L, 4L, -7L,}, {67L, 145L, -79L, -9L}}, 145),
                Arguments.of(new Short[][]{{-78, -89, -7}, {-6, 0, -7}}, 0),
                Arguments.of(new Byte[][]{{0, 0, 0}, {0, 0, 0}}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getMaximumNumberMatrixIntegerProviderArguments")
    void getMaximumNumberMatrixInteger(T[][] array, long expected) {
        long actual = Matrix.getMaximumNumberMatrixInteger(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getMaximumNumberMatrixFloatProviderArguments() {
        return Stream.of(
                Arguments.of(new Float[][]{{-78.5f, -79.5f, -98.5f}, {-45.5f, -98.7f, 1.5f}}, 1.5),
                Arguments.of(new Double[][]{{78.6, 0.5, 9.8}, {145.6, 79.6, 0.4}}, 145.6)
        );
    }

    @ParameterizedTest
    @MethodSource("getMaximumNumberMatrixFloatProviderArguments")
    void getMaximumNumberMatrixFloat(T[][] array, double expected) {
        double actual = Matrix.getMaximumNumberMatrixFloat(array);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getMinimumNumberMatrixIntegerProviderArguments() {
        return Stream.of(
                Arguments.of(new Integer[][]{{45, 78, 6}, {79, -99, -6}}, -99),
                Arguments.of(new Long[][]{{78L, 99L, 4L, -7L,}, {67L, 145L, -79L, -9L}}, -79),
                Arguments.of(new Short[][]{{-78, -89, -7}, {-6, 0, -7}}, -89),
                Arguments.of(new Byte[][]{{0, 0, 0}, {0, 0, 0}}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getMinimumNumberMatrixIntegerProviderArguments")
    void getMinimumNumberMatrixInteger(T[][] array, long expected) {
        long actual = Matrix.getMinimumNumberMatrixInteger(array);

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
    void getMinimumNumberMatrixFloat(T[][] array, double expected) {
        double actual = Matrix.getMinimumNumberMatrixFloat(array);

        Assertions.assertEquals(expected, actual);
    }
}
