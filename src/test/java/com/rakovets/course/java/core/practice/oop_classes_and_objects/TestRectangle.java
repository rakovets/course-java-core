package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestRectangle {
    static Stream<Arguments> provideArgumentsForGetPerimeter() {
        return Stream.of(
                Arguments.of(new Point(1, 5), new Point(8, 2), 20),
                Arguments.of(new Point(0, 0), new Point(0, 0), 0),
                Arguments.of(new Point(-4, 3), new Point(-1, -3), 18)
        );
    }
    static Stream<Arguments> provideArgumentsForGetArea() {
        return Stream.of(
                Arguments.of(new Point(1, 5), new Point(8, 2), 21),
                Arguments.of(new Point(0, 0), new Point(0, 0), 0),
                Arguments.of(new Point(-4, 3), new Point(-1, -3), 18)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetPerimeter")
    void testGetPerimeter(Point topLeftPoint, Point bottomRightPoint, double expected) {
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        double actual = rectangle.getPerimeter(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetArea")
    void testGetArea(Point topLeftPoint, Point bottomRightPoint, double expected) {
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        double actual = rectangle.getArea(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(expected, actual);
    }
}
