package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    @Test
    void getArea() {
        assertEquals(24.0, new Cube(2.0).getArea());
    }

    @Test
    void getVolume() {
        assertEquals(8.0, new Cube(2.0).getVolume());
    }

    @Test
    void getEquals() {
        assertTrue(new Cube(2.0).getEquals());
    }

    @Test
    void testToString() {
        assertEquals("side 2.0, area 24.0", new Cube(2.0).toString());
    }
}
