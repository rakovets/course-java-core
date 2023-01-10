package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    void testDistance() {
        Point pointA = new Point(1,1);
        Point pointB = new Point(1,10);

        Assertions.assertEquals(9, pointA.getDistance(pointB));
    }

    @Test
     void testValues() {
        Point point = new Point(1, 3);

        point.setX(2);
        Assertions.assertEquals(2, point.getX());
        point.setY(4);
        Assertions.assertEquals(4, point.getY());
     }
}
