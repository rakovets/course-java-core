package com.rakovets.course.java.core.practice.oop_principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    void init() {
        triangle = new Triangle(3.0,4.0, 90);
    }

    @DisplayName("Test area()")
    @Test
    void areaTest() {
        double result;
        double expected;

        result = triangle.area();
        expected = 6.0;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test perimeter()")
    @Test
    void perimeterTest() {
        double result;
        double expected;

        result = triangle.perimeter();
        expected = 12.0;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test height()")
    @Test
    void heightTest() {
        double result;
        double expected;

        result = triangle.height();
        expected = 4.0;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test isAreaEquals(), returns false")
    @Test
    void isAreaEqualsTest1() {
        boolean result;
        Circle expCircle = new Circle(3.0);

        result = triangle.isAreaEquals(expCircle);

        Assertions.assertFalse(result);
    }

    @DisplayName("Test isAreaEquals(), returns false")
    @Test
    void isAreaEqualsTest2() {
        boolean result;
        Triangle expTriangle = new Triangle(3,4, 90);

        result = triangle.isAreaEquals(expTriangle);

        Assertions.assertTrue(result);
    }

    @DisplayName("Test toString(), result info about Triangle")
    @Test
    void toStringTest() {
        String result;
        String expected;

        result = triangle.toString();
        expected = "This is Triangle with next parameters:\nSide A: 3.0\nSide B: 4.0\nSide C: 5.0Angle Alfa: 90" +
                "\nPerimeter: 12.0\nArea: 6.0\nHeight: 4.0";

        Assertions.assertEquals(expected, result);
    }
}
