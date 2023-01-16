package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void testPerimeter() {
        Point pointA = new Point(3,5);
        Point pointB = new Point(9,4);
        Rectangle rectangle  = new Rectangle(pointA, pointB);

        Assertions.assertEquals(14, rectangle.getPerimeter());
    }

    @Test
    void testArea() {
        Point pointA = new Point(3,5);
        Point pointB = new Point(9,4);
        Rectangle rectangle = new Rectangle(pointA, pointB);

        Assertions.assertEquals(6, rectangle.getArea());
    }

    @BeforeAll
    void testValues() {
        Point pointA = new Point(3, 5);
        Point pointB = new Point(9, 4);
        Rectangle rectangle = new Rectangle(pointA, pointB);

        rectangle.setTopLeftPoint(pointB);
        Assertions.assertEquals(pointB, rectangle.getTopLeftPoint());
        rectangle.setBottomRightPoint(pointA);
        Assertions.assertEquals(pointA, rectangle.getBottomRightPoint());
    }
}
