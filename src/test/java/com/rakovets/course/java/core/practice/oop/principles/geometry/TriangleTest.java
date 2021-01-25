package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getBase() {
        new Triangle(5.0, 3.0);
        Assertions.assertEquals(5.0, Triangle.getBase());
    }

    @Test
    void setBase() {
        Triangle base = new Triangle(7.0, 3.0);
        base.setBase(7.0);
        Assertions.assertEquals(7.0, Triangle.getBase());
    }

    @Test
    void getHeight() {
        new Triangle(5.0, 7.5);
        Assertions.assertEquals(7.5, Triangle.getHeight());
    }

    @Test
    void setHeight() {
        Triangle height = new Triangle(7.0, 3.0);
        height.setHeight(11.0);
        Assertions.assertEquals(11.0, Triangle.getHeight());
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
