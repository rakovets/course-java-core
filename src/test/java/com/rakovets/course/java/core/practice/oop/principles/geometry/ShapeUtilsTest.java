package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ShapeUtilsTest {

    // RECTANGLE
    static Stream<Arguments> isRectangleProviderArguments() {
        return Stream.of(
                Arguments.of("true", "1", "1", "2", "2"),
                Arguments.of("false", "3", "1", "2", "2"),
                Arguments.of("false", "3", "1", "3", "2"),
                Arguments.of("true", "1", "2", "2", "1")
        );
    }

    @ParameterizedTest
    @MethodSource("isRectangleProviderArguments")
    void isRectangle(boolean expectedBoolean, int firstSide, int secondSide, int thirdSide, int fourthSide) {
        boolean actualBoolean = ShapeUtils.isRectangle(firstSide, secondSide, thirdSide, fourthSide);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    // TRIANGLE
    static Stream<Arguments> isTriangleProviderArguments() {
        return Stream.of(
                Arguments.of("true", "1", "2", "3"),
                Arguments.of("true", "1", "5", "1"),
                Arguments.of("false", "11", "11", "1")
        );
    }

    @ParameterizedTest
    @MethodSource("isTriangleProviderArguments")
    void isTriangle(boolean expectedBoolean, int firstSide, int secondSide, int thirdSide) {
        boolean actualBoolean = ShapeUtils.isTriangle(firstSide, secondSide, thirdSide);
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }
}
