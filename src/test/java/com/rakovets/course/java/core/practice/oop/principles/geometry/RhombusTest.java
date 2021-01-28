package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RhombusTest {

    @Test
    void getFirstDiagonal() {
        assertEquals(1.0,  new Rhombus(1.0, 2.0).getFirstDiagonal());
    }

    @Test
    void setFirstDiagonal() {
        Rhombus firstDiagonal = new Rhombus(1.0, 2.0);
        firstDiagonal.setFirstDiagonal(4.5);
        assertEquals(4.5, firstDiagonal.getFirstDiagonal());
    }

    @Test
    void getSecondDiagonal() {
        assertEquals(2.0,  new Rhombus(1.0, 2.0).getSecondDiagonal());
    }

    @Test
    void setSecondDiagonal() {
        Rhombus secondDiagonal = new Rhombus(1.0, 3.8);
        secondDiagonal.setSecondDiagonal(3.8);
        assertEquals(3.8, secondDiagonal.getSecondDiagonal());
    }

    @Test
    void getArea() {
        assertEquals(6.0, new Rhombus(4.0, 3.0).getArea());
    }

    @Test
    void getEquals() {
        assertTrue(new Rhombus(4.0, 3.0).getEquals());
    }

    @Test
    void testToString() {
        assertEquals("rhombus area: 6.0", new Rhombus(4.0, 3.0).toString());
    }
}
