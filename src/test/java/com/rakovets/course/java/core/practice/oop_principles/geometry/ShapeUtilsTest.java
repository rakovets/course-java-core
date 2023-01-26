package com.rakovets.course.java.core.practice.oop_principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeUtilsTest {
    boolean result;
    Triangle triangle;
    Rectangle rectangle;

    @BeforeEach
    void init() {
        triangle = new Triangle(3, 4, 90);
        rectangle = new Rectangle(3, 4);
    }

    @DisplayName("Test of isTriangle(), for any Object that belongs to Triangle returns true")
    @Test
    void isTriangleTest1() {
        result = ShapeUtils.isTriangle(triangle);

        Assertions.assertTrue(result);
    }

    @DisplayName("Test of isTriangle(), for any Object that doesn't belongs to Triangle returns false")
    @Test
    void isTriangleTest2() {
        result = ShapeUtils.isTriangle(rectangle);

        Assertions.assertFalse(result);
    }

    @DisplayName("Test of isRectangle(), for any Object that doesn't belongs to Rectangle returns true")
    @Test
    void isRectangle1() {
        result = ShapeUtils.isRectangle(rectangle);

        Assertions.assertTrue(result);
    }

    @DisplayName("Test of isRectangle(), for any Object that doesn't belongs to Rectangle returns false")
    @Test
    void isRectangle2() {
        result = ShapeUtils.isRectangle(triangle);

        Assertions.assertFalse(result);
    }
}
