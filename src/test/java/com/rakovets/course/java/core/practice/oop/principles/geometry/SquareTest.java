package com.rakovets.course.java.core.practice.oop.principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        new Square(5.0);
        Assertions.assertEquals(5.0, Square.getSide());
    }

    @Test
    void setSide() {
        Square side = new Square(7.7);
        side.setSide(7.7);
        Assertions.assertEquals(7.7, Square.getSide());
    }

    @Test
    void getArea() {
        assertEquals(25.0, new Square(5.0).getArea());
    }

    @Test
    void getEquals() {
        assertTrue(new Square(5.0).getEquals());
    }

    @Test
    void getDiagonal() {
        assertEquals(7.0, new Square(5.0).getDiagonal());
    }

    @Test
    void testToString() {
        assertEquals("square side: 5.0, area: 25.0", new Square(5.0).toString());
    }
}
