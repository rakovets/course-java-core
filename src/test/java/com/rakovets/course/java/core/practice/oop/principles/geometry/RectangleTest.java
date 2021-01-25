package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getFirstSide() {
        new Rectangle(2.0, 3.0);
        Assertions.assertEquals(2.0, Rectangle.getFirstSide());
    }

    @Test
    void setFirstSide() {
        Rectangle side = new Rectangle(5.5, 7.8);
        side.setFirstSide(5.5);
        Assertions.assertEquals(5.5, Rectangle.getFirstSide());
    }

    @Test
    void getSecondSide() {
        new Rectangle(2.0, 3.0);
        Assertions.assertEquals(3.0, Rectangle.getSecondSide());
    }

    @Test
    void setSecondSide() {
        Rectangle side = new Rectangle(5.5, 7.8);
        side.setSecondSide(7.8);
        Assertions.assertEquals(7.8, Rectangle.getSecondSide());
    }

    @Test
    void getArea() {
        assertEquals(6.0, new Rectangle(2.0, 3.0).getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(10.0, new Rectangle(2.0, 3.0).getPerimeter());
    }

    @Test
    void getEquals() {
        assertTrue(new Rectangle(2.0, 3.0).getEquals());
    }

    @Test
    void testToString() {
        assertEquals("rectangle area: 6.0, rectangle perimeter: 10.0", new Rectangle(2.0, 3.0).toString());
    }
}
