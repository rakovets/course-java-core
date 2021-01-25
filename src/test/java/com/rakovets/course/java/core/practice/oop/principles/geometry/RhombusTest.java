package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RhombusTest {

    @Test
    void getFirstDiagonal() {
        new Rhombus(1.0, 2.0);
        Assertions.assertEquals(1.0, Rhombus.getFirstDiagonal());
    }

    @Test
    void setFirstDiagonal() {
        Rhombus firstDiagonal = new Rhombus(1.0, 2.0);
        firstDiagonal.setFirstDiagonal(4.5);
        Assertions.assertEquals(4.5, Rhombus.getFirstDiagonal());
    }

    @Test
    void getSecondDiagonal() {
        new Rhombus(1.0, 2.0);
        Assertions.assertEquals(2.0, Rhombus.getSecondDiagonal());
    }

    @Test
    void setSecondDiagonal() {
        Rhombus secondDiagonal = new Rhombus(1.0, 3.8);
        secondDiagonal.setSecondDiagonal(3.8);
        Assertions.assertEquals(3.8, Rhombus.getSecondDiagonal());
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
