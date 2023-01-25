package com.rakovets.course.java.core.practice.oop_principles.geometryTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SquareTest {
    private Square square;

    @BeforeEach
    void init() {
        square = new Square(3);
    }

    @Test
    void areaTest() {
        double result;

        result = square.area();

        Assertions.assertEquals(9, result);
    }

    @Test
    void perimeterTest() {
        double result;

        result = square.perimeter();

        Assertions.assertEquals(12, result);
    }

    @Test
    void getDiagonalATest() {
        double result;

        result = square.getDiagonal();

        Assertions.assertEquals(4.242640687119286, result);
    }

    @Test
    void getSideATest() {
        double result;

        result = square.getSideA();

        Assertions.assertEquals(3, result);
    }
}
