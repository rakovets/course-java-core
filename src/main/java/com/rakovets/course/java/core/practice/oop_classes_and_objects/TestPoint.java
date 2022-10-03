package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPoint {
    @Test
    public void testSetPoint() {
        Point point = new Point(6.2, 6.1);
        point.setX(3.1);
        point.setY(4.3);
        Assertions.assertEquals(3.1, point.getX());
        Assertions.assertEquals(4.3, point.getY());
    }
    @Test
    public void testGetX() {
        Point point = new Point(1.5, 2.4);
        Assertions.assertEquals(1.5, point.getX());
        Assertions.assertEquals(2.4, point.getY());
    }
    @Test
    public void testgetDistance() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Assertions.assertEquals(Math.pow(8, 0.5), point1.getDistance(point2));
    }
}

