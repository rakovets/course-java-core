package com.rakovets.course.java.core.practice.oop_principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void init() {
        rectangle = new Rectangle(3, 4);
    }

    @DisplayName("Test isAreaEquals(), returns ture")
    @Test
    void isAreaEqualsTest1() {
        boolean result;
        Rectangle expRectangle = new Rectangle(3, 4);

        result = rectangle.isAreaEquals(expRectangle);

        Assertions.assertTrue(result);
    }

    @DisplayName("Test isAreaEquals(), returns false")
    @Test
    void isAreaEqualsTest2() {
        boolean result;
        Rectangle expRectangle = new Rectangle(3, 6);

        result = rectangle.isAreaEquals(expRectangle);

        Assertions.assertFalse(result);
    }

    @DisplayName("Test area(), result area of Rectangle with sides 3.0 & 4.0")
    @Test
    void areaTest() {
        double result;
        double expected;

        result = rectangle.area();
        expected = 12.0;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test diagonal(), result diagonal of Rectangle with sides 3.0 & 4.0")
    @Test
    void diagonalTest() {
        double result;
        double expected;

        result = rectangle.diagonal();
        expected = 5.0;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test toString(), result info about Circle with radius 3.0")
    @Test
    void toStringTest() {
        String result;
        String expected;

        result = rectangle.toString();
        expected = "This is Rectangle with next parameters:\nSide A: 3.0\nSide B: 4.0\nPerimeter: 14.0\nArea: 12.0" +
                "\nDiagonal: 5.0";

        Assertions.assertEquals(expected, result);
    }
}
