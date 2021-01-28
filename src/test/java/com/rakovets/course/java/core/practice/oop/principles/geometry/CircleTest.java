package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        assertEquals(2.0, new Circle(2.0).getRadius());
    }

    @Test
    void setRadius() {
        Circle radius = new Circle(5.5);
        radius.setRadius(5.5);
        assertEquals(5.5, radius.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(13.0, new Circle(2.0).getArea());
    }

    @Test
    void getEquals() {
        assertTrue(new Circle(2.0).getEquals());
    }

    @Test
    void testToString() {
        assertEquals("radius 2.0, area 13.0", new Circle(2.0).toString());
    }
}
