package com.rakovets.course.java.core.practice.oop_principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    Triangle triangle;
    double result;
    double expected;

    @BeforeEach
    void init() {
        triangle = new Triangle(3, 7, 45);
    }

    @DisplayName("area() test")
    @Test
    void areaTest() {
        result = triangle.area();
        expected = 7.424621202458749;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("getSideC() test")
    @Test
    void getSideCTest() {
        result = triangle.getSideC();
        expected = 5.3199168405309685;

        Assertions.assertEquals(expected, result);
    }
}
