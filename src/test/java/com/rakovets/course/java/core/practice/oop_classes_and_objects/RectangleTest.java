package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void testSetTopLeftPoint() {
        Point setTopLeftPoint = new Point(1,5);
        Point setBottomRightPoint = new Point(10,1);
        Rectangle rectangle = new Rectangle(setTopLeftPoint, setBottomRightPoint);
        Assertions.assertEquals(setTopLeftPoint, rectangle.getTopLeftPoint());
    }

    @Test
   public void testSetBottomRightPoint() {
        Point setTopLeftPoint = new Point(1,5);
        Point setBottomRightPoint = new Point(10,1);
        Rectangle rectangle = new Rectangle(setTopLeftPoint, setBottomRightPoint);
        Assertions.assertEquals(setBottomRightPoint, rectangle.getBottomRightPoint());
    }

    @Test
    public void testGetTopLeftPoint() {
        Point getTopLeftPoint = new Point(1,5);
        Point getBottomRightPoint = new Point(10,1);
        Rectangle rectangle = new Rectangle(getTopLeftPoint, getBottomRightPoint);
        Assertions.assertEquals(getTopLeftPoint, rectangle.getTopLeftPoint());
    }
    @Test
    public void testGetBottomRightPoint() {
        Point getTopLeftPoint = new Point(1,5);
        Point getBottomRightPoint = new Point(10,1);
        Rectangle rectangle = new Rectangle(getTopLeftPoint, getBottomRightPoint);
        Assertions.assertEquals(getBottomRightPoint, rectangle.getBottomRightPoint());
    }


    @Test
    public void testGetPerimeter() {
        Point A = new Point(3, 5);
        Point B = new Point(15, 3);
        Rectangle rectangle = new Rectangle(A, B);
        Assertions.assertEquals(28, rectangle.getPerimeter());
    }

    @Test
    public void testGetArea() {
        Point A = new Point(3, 5);
        Point B = new Point(15, 3);
        Rectangle rectangle = new Rectangle(A, B);
        Assertions.assertEquals(24, rectangle.getArea());
    }
}
