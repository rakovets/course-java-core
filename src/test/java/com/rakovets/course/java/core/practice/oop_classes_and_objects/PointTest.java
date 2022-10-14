package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void testGetXY() {
        Point point = new Point(3.2, 5.7);
        Assertions.assertEquals(3.2, point.getX());
        Assertions.assertEquals(5.7, point.getY());
    }

    @Test
    public void testSetPoint() {
        Point point = new Point(7.9, 9.1);
        point.setX(2.4);
        point.setY(3.1);
        Assertions.assertEquals(2.4, point.getX());
        Assertions.assertEquals(3.1, point.getY());
    }

    @Test
    public void testGetDistance() {
        Point point = new Point(2,4);
        Point point1 = new Point (1,2);
        Assertions.assertEquals(2.23606797749979, point.getDistance(point1));
    }
}
