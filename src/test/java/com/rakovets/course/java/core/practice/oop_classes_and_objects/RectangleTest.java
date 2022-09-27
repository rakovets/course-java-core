package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testGetValues() {
        Rectangle rectangle = new Rectangle(2, 3);

        Assertions.assertEquals(2, rectangle.getTopLeftPoint());
        Assertions.assertEquals(3, rectangle.getBottomRightPoint());
    }

    @Test
    public void testSetValues() {
        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.setTopLeftPoint(5);
        rectangle.setBottomRightPoint(7);

        Assertions.assertEquals(5, rectangle.getTopLeftPoint());
        Assertions.assertEquals(7, rectangle.getBottomRightPoint());
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(0, 0);

        Assertions.assertEquals(10, rectangle.getPerimeter());
        Assertions.assertEquals(0, rectangle2.getPerimeter());
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(0, 0);

        Assertions.assertEquals(6, rectangle.getArea());
        Assertions.assertEquals(0, rectangle2.getArea());
    }
}
