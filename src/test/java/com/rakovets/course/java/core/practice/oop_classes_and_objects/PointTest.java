package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    void distanceTest() {
        Point pointA = new Point(2, 3);
        Point pointB = new Point(6, 6);
        Assertions.assertEquals(5, pointA.getDistance(pointB));
    }

    @Test
    void valuesTest() {
        Point point = new Point(1, 3);
        point.setX(9);
        Assertions.assertEquals(9, point.getX());
        point.setY(9);
        Assertions.assertEquals(9, point.getY());
    }
}
