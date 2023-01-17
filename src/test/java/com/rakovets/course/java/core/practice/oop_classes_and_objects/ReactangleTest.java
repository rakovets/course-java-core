package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReactangleTest {
    @Test
    void perimeterTest() {
        Point pointA = new Point(2, 7);
        Point pointB = new Point(4, 2);

        Rectangle rectangle = new Rectangle(pointA, pointB);

        Assertions.assertEquals(14, rectangle.getPerimeter());
    }

    @Test
    void areaTest() {
        Point pointA = new Point(2, 7);
        Point pointB = new Point(4, 2);

        Rectangle rectangle = new Rectangle(pointA, pointB);

        Assertions.assertEquals(10, rectangle.getArea());
    }

    @Test
    void setTest() {
        Point setTopLeftPoint = new Point(3, 8);
        Point setBottomRightPoint = new Point(5, 3);

        Rectangle rectangle = new Rectangle(setTopLeftPoint, setBottomRightPoint);

        Assertions.assertEquals(setTopLeftPoint, rectangle.getTopLeftPoint());
        Assertions.assertEquals(setBottomRightPoint, rectangle.getBottomRightPoint());
    }

    @Test
    void getTest() {
        Point getTopLeftPoint = new Point(3, 8);
        Point getBottomRightPoint = new Point(5, 3);

        Rectangle rectangle = new Rectangle(getTopLeftPoint, getBottomRightPoint);

        Assertions.assertEquals(getTopLeftPoint, rectangle.getTopLeftPoint());
        Assertions.assertEquals(getBottomRightPoint, rectangle.getBottomRightPoint());
    }
}
