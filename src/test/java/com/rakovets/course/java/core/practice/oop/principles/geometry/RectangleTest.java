package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getFirstSide() {
        new Rectangle(2.0, 3.0);
        assertEquals(2.0, new Rectangle(2.0, 3.0).getFirstSide());
    }

    @Test
    void setFirstSide() {
        Rectangle side = new Rectangle(5.5, 7.8);
        side.setFirstSide(5.5);
        assertEquals(5.5, side.getFirstSide());
    }

    @Test
    void getSecondSide() {
        new Rectangle(2.0, 3.0);
        assertEquals(3.0, new Rectangle(2.0, 3.0).getSecondSide());
    }

    @Test
    void setSecondSide() {
        Rectangle side = new Rectangle(5.5, 7.8);
        side.setSecondSide(7.8);
        assertEquals(7.8, side.getSecondSide());
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
