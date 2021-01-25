package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        new Circle(2.0);
        Assertions.assertEquals(2.0, Circle.getRadius());
    }

    @Test
    void setRadius() {
        Circle radius = new Circle(5.5);
        radius.setRadius(5.5);
        Assertions.assertEquals(5.5, Circle.getRadius());
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
