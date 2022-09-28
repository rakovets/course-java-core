package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTests {
    @Test
    public void testGetX() {
        Point point = new Point(5.32, 0);
        Assertions.assertEquals(5.32, point.getX());
    }
    @Test
    public void testGetY() {
        Point point = new Point(5.32, 0);
        Assertions.assertEquals(0, point.getY());
    }
    @Test
    public void testSetX() {
        Point point = new Point(5.32, 0);
        point.setX(11.31);
        Assertions.assertEquals(11.31, point.getX());
    }
    @Test
    public void testSetY() {
        Point point = new Point(5.32, 0);
        point.setY(2.98);
        Assertions.assertEquals(2.98, point.getY());
    }
    @Test
    public void testGetDistance() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 2);
        Assertions.assertEquals(Math.pow(8, 0.5), point1.getDistance(point2));
    }
}
