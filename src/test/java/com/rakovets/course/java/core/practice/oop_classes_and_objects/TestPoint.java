package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestPoint {

    @Test
    public void testGetAndSet() {
        Point point = new Point();
        point.setX(3);
        point.setY(5);
        Assertions.assertEquals(3, point.getX());
        Assertions.assertEquals(5, point.getY());
    }

    @Test
    public void testGet() {
        Point point = new Point(2, -1);
        Assertions.assertEquals(2, point.getX());
        Assertions.assertEquals(-1, point.getY());
    }


    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new Point(2, 4), new Point(4, 2), 2.83),
                Arguments.of(new Point(3, 5), new Point(4, 1), 4.12)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testGetDistance(Point point1, Point point2, double expected) {
        double actual = point1.getDistance(point2);
        Assertions.assertEquals(expected, actual);
    }
}
