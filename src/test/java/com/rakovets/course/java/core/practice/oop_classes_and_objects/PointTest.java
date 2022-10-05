package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    static Stream<Arguments> provideArgumentsGetDistance() {
        return Stream.of(
                Arguments.of(1, 1, 5, 5, 5.66),
                Arguments.of(-1, -1, -2, -2, 1.41)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetDistance")
    void testGetDistance(int x1, int y1, int x2, int y2, double expected) {
        Point point = new Point(x1, y1);
        Point pointTwo = new Point(x2, y2);

        double actual = point.getDistance(pointTwo);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetXY() {
        return Stream.of(
                Arguments.of(1, 2, 1, 2),
                Arguments.of(-3, -1, -3, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetXY")
    void testGetXY(int x, int y, int expectedX, int expectedY) {
        Point point = new Point(x, y);

        int actualX = point.getX();
        int actualY = point.getY();

        assertEquals(expectedX, actualX);
        assertEquals(expectedY, actualY);
    }
    static Stream<Arguments> provideArgumentsSetXY() {
        return Stream.of(
                Arguments.of(1, 2, 5, 6, 5, 6),
                Arguments.of(-3, -1, 3, -10, 3, -10)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSetXY")
    void testSetXY(int x, int y, int newX, int newY, int expectedX, int expectedY) {
        Point point = new Point(x, y);

        point.setX(newX);
        point.setY(newY);
        int actualX = point.getX();
        int actualY = point.getY();

        assertEquals(expectedX, actualX);
        assertEquals(expectedY, actualY);
    }
}
