package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestRectangle {
    static Stream<Arguments> provideArgumentsForPerimeter() {
        return Stream.of(
                Arguments.of(new Point(0, 3), new Point(6, 0), 18),
                Arguments.of(new Point(0, 0), new Point(0, 0), 0),
                Arguments.of(new Point(5, 1), new Point(10, 0), 12)
        );
    }

    static Stream<Arguments> provideArgumentsForArea() {
        return Stream.of(
                Arguments.of(new Point(0, 3), new Point(6, 0), 18),
                Arguments.of(new Point(0, 0), new Point(0, 0), 0),
                Arguments.of(new Point(5, 2), new Point(8, 0), 6)
        );
    }

    @ParameterizedTest(name = "Rectangle perimeter: {0}.")
    @MethodSource("provideArgumentsForPerimeter")
    void testPerimeter(Point topLeftPoint, Point bottomRightPoint, double expected) {

        Rectangle testRec = new Rectangle(topLeftPoint, bottomRightPoint);

        double actual = testRec.getPerimeter();

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Rectangle area: {0}.")
    @MethodSource("provideArgumentsForArea")
    void testArea(Point topLeftPoint, Point bottomRightPoint, double expected) {
        Rectangle testRec = new Rectangle(topLeftPoint, bottomRightPoint);

        double actual = testRec.getArea();

        assertEquals(expected, actual);
    }
}
