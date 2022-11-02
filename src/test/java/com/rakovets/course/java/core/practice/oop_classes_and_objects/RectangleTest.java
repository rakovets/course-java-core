package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    static Stream<Arguments> provideArgumentsGetPerimeter() {
        return Stream.of(
                Arguments.of(1, 1, 5, 5, 16),
                Arguments.of(-1, -1, -2, -2, 4),
                Arguments.of(0, 0, 0, 0, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetPerimeter")
    void testGetPerimeter(int x1, int y1, int x2, int y2, int expected) {
        Point topLeftPoint = new Point(x1, y1);
        Point bottomRightPoint = new Point(x2, y2);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        int actual = rectangle.getPerimeter(topLeftPoint, bottomRightPoint);
        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetArea() {
        return Stream.of(
                Arguments.of(1, 1, 5, 5, 16),
                Arguments.of(-1, -1, -2, -2, 1),
                Arguments.of(0, 0, 0, 0, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetArea")
    void testGetArea(int x1, int y1, int x2, int y2, int expected) {
        Point topLeftPoint = new Point(x1, y1);
        Point bottomRightPoint = new Point(x2, y2);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        int actual = rectangle.getArea(topLeftPoint, bottomRightPoint);
        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetAllPoint() {
        return Stream.of(
                Arguments.of(1, 0, 3, 4, 1, 0, 3, 4),
                Arguments.of(3, -1, -5, 6, 3, -1, -5, 6)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetAllPoint")
    void testGetAllPoint(int x1, int y1, int x2, int y2, int expectedTopX, int expectedTopY,
                         int expectedBottomX, int expectedBottomY) {
        Point topLeftPoint = new Point(x1, y1);
        Point bottomRightPoint = new Point(x2, y2);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        int actualTopX = rectangle.getTopLeftPoint().getX();
        int actualTopY = rectangle.getTopLeftPoint().getY();
        int actualBottomX = rectangle.getBottomRightPoint().getX();
        int actualBottomY = rectangle.getBottomRightPoint().getY();
        assertEquals(expectedTopX, actualTopX);
        assertEquals(expectedTopY, actualTopY);
        assertEquals(expectedBottomX, actualBottomX);
        assertEquals(expectedBottomY, actualBottomY);
    }
    static Stream<Arguments> provideArgumentsSetTopLeftPoint() {
        return Stream.of(
                Arguments.of(1, 1, 2, 3, 2, 3),
                Arguments.of(0, -1, -5, -7, -5, -7)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSetTopLeftPoint")
    void testSetTopLeftPoint(int x1, int y1, int x2, int y2, int expectedTopX, int expectedTopY) {
        Point topLeftPoint = new Point(x1, y1);
        Point bottomRightPoint = new Point(1, 2);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        rectangle.setTopLeftPoint(new Point(x2, y2));
        int actualTopX = rectangle.getTopLeftPoint().getX();
        int actualTopY = rectangle.getTopLeftPoint().getY();
        assertEquals(expectedTopX, actualTopX);
        assertEquals(expectedTopY, actualTopY);
    }
    static Stream<Arguments> provideArgumentsSetBottomRightPoint() {
        return Stream.of(
                Arguments.of(5, 6, 7, 9, 7, 9),
                Arguments.of(-1, -1, -5, -9, -5, -9)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsSetBottomRightPoint")
    void testSetBottomRightPoint(int x1, int y1, int x2, int y2, int expectedBottomX, int expectedBottomY) {
        Point topLeftPoint = new Point(1, 2);
        Point bottomRightPoint = new Point(x1, y1);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        rectangle.setBottomRightPoint(new Point(x2, y2));
        int actualBottomX = rectangle.getBottomRightPoint().getX();
        int actualBottomY = rectangle.getBottomRightPoint().getY();
        assertEquals(expectedBottomX, actualBottomX);
        assertEquals(expectedBottomY, actualBottomY);
    }
}
