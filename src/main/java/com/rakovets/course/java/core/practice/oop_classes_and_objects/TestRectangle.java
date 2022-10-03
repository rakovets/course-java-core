package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestRectangle {
    @Test
    public void testGetTopLeftPoint() {
        Point topLeftPoint = new Point(2, 4);
        Point bottomRightPoint = new Point(5, 6);
        Assertions.assertEquals(topLeftPoint, rectangle.getTopLeftPoint());
        Assertions.assertEquals(2, rectangle.getTopLeftPoint());
        Assertions.assertEquals(5, rectangle.getTopLeftPoint());
    }
    @Test
    public void testGetBottomRightPoint() {
        Point topLeftPoint = new Point(4, 9);
        Point bottomRightPoint = new Point(11, 3);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(bottomRightPoint, rectangle.getBottomRightPoint());
        Assertions.assertEquals(11, rectangle.getBottomRightPoint());
        Assertions.assertEquals(3, rectangle.getBottomRightPoint());
    }
    @Test
    public void testSetTopLeftPoint() {
        Rectangle rectangle = new Rectangle(new Point(3, 9), new Point(20, 1));
        Assertions.assertEquals(3, rectangle.getTopLeftPoint());
        Assertions.assertEquals(9, rectangle.getTopLeftPoint());
        rectangle.setTopLeftPoint(new Point(1, 20));
        Assertions.assertEquals(1, rectangle.getTopLeftPoint());
        Assertions.assertEquals(20, rectangle.getTopLeftPoint());
    }
    @Test
    public void testSetBottomRightPoint() {
        Rectangle rectangle = new Rectangle(new Point(5, 10), new Point(15, 1));
        rectangle.setBottomRightPoint(new Point(35, 0));
        Assertions.assertEquals(35, rectangle.getBottomRightPoint());
        Assertions.assertEquals(0, rectangle.getBottomRightPoint());
    }
    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(new Point(0, 8), new Point(12, 0));
        Assertions.assertEquals(40, rectangle.getPerimeter());
    }
    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(new Point(0, 6), new Point(12, 0));
        Assertions.assertEquals(96, rectangle.getArea());
    }
}
