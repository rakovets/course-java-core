package com.rakovets.course.java.core.practice.oop_principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void init() {
        rectangle = new Rectangle(3, 4);
    }

    @Test
    void areaTest() {
        double result;

        result = rectangle.area();

        Assertions.assertEquals(12, result);
    }

    @Test
    void perimeterTest() {
        double result;

        result = rectangle.perimeter();

        Assertions.assertEquals(14, result);
    }

    @Test
    void getDiagonalTest() {
        double result;

        result = rectangle.getDiagonal();

        Assertions.assertEquals(5, result);
    }

    @Test
    void getSideBTest() {
        double result;

        result = rectangle.getSideB();

        Assertions.assertEquals(4, result);
    }
}
