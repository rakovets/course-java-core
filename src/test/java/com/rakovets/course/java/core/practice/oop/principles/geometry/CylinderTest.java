package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getArea() {
        assertEquals(63.0, new Cylinder(2.0, 3.0).getArea());
    }

    @Test
    void getVolume() {
        assertEquals(38.0, new Cylinder(2.0, 3.0).getVolume());
    }

    @Test
    void getEquals() {
        assertTrue(new Cylinder(2.0, 3.0).getEquals());
    }

    @Test
    void testToString() {
        assertEquals("cylinder volume: 38.0, area: 63.0", new Cylinder(2.0, 3.0).toString());
    }
}
