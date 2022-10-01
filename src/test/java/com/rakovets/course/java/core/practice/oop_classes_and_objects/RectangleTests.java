package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {
    @Test
    public void testGetTopLeftPoint() {
        Point topLeftPoint = new Point(5, 10);
        Point bottomRightPoint = new Point(15, 1);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(topLeftPoint, rectangle.getTopLeftPoint());
        Assertions.assertEquals(5, rectangle.getTopLeftPoint().getX());
        Assertions.assertEquals(10, rectangle.getTopLeftPoint().getY());
    }
    @Test
    public void testGetBottomRightPoint() {
        Point topLeftPoint = new Point(5, 10);
        Point bottomRightPoint = new Point(15, 1);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(bottomRightPoint, rectangle.getBottomRightPoint());
        Assertions.assertEquals(15, rectangle.getBottomRightPoint().getX());
        Assertions.assertEquals(1, rectangle.getBottomRightPoint().getY());
    }
    @Test
    public void testSetTopLeftPoint() {
        Rectangle rectangle = new Rectangle(new Point(5, 10), new Point(15, 1));
        Assertions.assertEquals(5, rectangle.getTopLeftPoint().getX());
        Assertions.assertEquals(10, rectangle.getTopLeftPoint().getY());
        rectangle.setTopLeftPoint(new Point(1, 25));
        Assertions.assertEquals(1, rectangle.getTopLeftPoint().getX());
        Assertions.assertEquals(25, rectangle.getTopLeftPoint().getY());
    }
    @Test
    public void testSetBottomRightPoint() {
        Rectangle rectangle = new Rectangle(new Point(5, 10), new Point(15, 1));
        rectangle.setBottomRightPoint(new Point(35, 0));
        Assertions.assertEquals(35, rectangle.getBottomRightPoint().getX());
        Assertions.assertEquals(0, rectangle.getBottomRightPoint().getY());
    }
    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(new Point(0, 10), new Point(15, 0));
        Assertions.assertEquals(50, rectangle.getPerimeter());
    }
    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(new Point(0, 10), new Point(15, 0));
        Assertions.assertEquals(150, rectangle.getArea());
    }
}
