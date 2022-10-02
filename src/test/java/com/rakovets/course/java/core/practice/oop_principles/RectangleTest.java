package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_classes_and_objects.Point;
import com.rakovets.course.java.core.practice.oop_classes_and_objects.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void testPerimeter() {
        Point pointA = new Point(1,5);
        Point pointB = new Point(10,1);
        Rectangle rectangle = new Rectangle(pointA, pointB);

        Assertions.assertEquals(26, rectangle.getPerimeter());
    }

    @Test
    void testArea() {
        Point pointA = new Point(1,5);
        Point pointB = new Point(10,1);
        Rectangle rectangle = new Rectangle(pointA, pointB);

        Assertions.assertEquals(36, rectangle.getArea());
    }

    @Test
    void testSavedValues() {
        Point pointA = new Point(1,5);
        Point pointB = new Point(10,1);
        Point pointC = new Point(11, 12);
        Rectangle rectangle = new Rectangle(pointA, pointB);

        rectangle.setTopLeftPoint(pointC);
        Assertions.assertEquals(pointC, rectangle.getTopLeftPoint());
        rectangle.setBottomRightPoint(pointA);
        Assertions.assertEquals(pointA, rectangle.getBottomRightPoint());
    }
}
