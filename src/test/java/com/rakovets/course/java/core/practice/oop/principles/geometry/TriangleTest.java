package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getBase() {
        assertEquals(5.0, new Triangle(5.0, 3.0).getBase());
    }

    @Test
    void setBase() {
        Triangle base = new Triangle(7.0, 3.0);
        base.setBase(7.0);
        assertEquals(7.0, base.getBase());
    }

    @Test
    void getHeight() {
        assertEquals(7.5, new Triangle(5.0, 7.5).getHeight());
    }

    @Test
    void setHeight() {
        Triangle height = new Triangle(7.0, 3.0);
        height.setHeight(11.0);
        assertEquals(11.0, height.getHeight());
    }

    @Test
    void getArea() {
        assertEquals(10.5, new Triangle(7.0, 3.0).getArea());
    }

    @Test
    void getEquals() {
        assertTrue(new Triangle(7.0, 3.0).getEquals());
    }

    @Test
    void testToString() {
        assertEquals("triangle area: 10.5", new Triangle(7.0, 3.0).toString());
    }
}
