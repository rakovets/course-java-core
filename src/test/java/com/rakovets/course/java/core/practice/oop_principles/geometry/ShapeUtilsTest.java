package com.rakovets.course.java.core.practice.oop_principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeUtilsTest {
    boolean result;

    @DisplayName("Test of isTriangle(), for any Object that belongs to Triangle returns true")
    @Test
    void isTriangleTest1() {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(3);

        result = ShapeUtils.isTriangle(equilateralTriangle);

        Assertions.assertTrue(result);
    }

    @DisplayName("Test of isTriangle(), for any Object that belongs to Triangle returns true")
    @Test
    void isTriangleTest2() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(3, 2);

        result = ShapeUtils.isTriangle(isoscelesTriangle);

        Assertions.assertTrue(result);
    }

    @DisplayName("Test of isTriangle(), for any Object that doesn't belongs to Triangle returns false")
    @Test
    void isTriangleTest3() {
        Circle circle = new Circle(3);

        result = ShapeUtils.isTriangle(circle);

        Assertions.assertFalse(result);
    }

    @DisplayName("Test of isRectangle(), for any Object that belongs to Rectangle returns true")
    @Test
    void isRectangle1() {
        Square square = new Square(3);

        result = ShapeUtils.isRectangle(square);

        Assertions.assertTrue(result);
    }

    @DisplayName("Test of isRectangle(), for any Object that belongs to Rectangle returns true")
    @Test
    void isRectangle2() {
        Rectangle rectangle = new Rectangle(3, 2);

        result = ShapeUtils.isRectangle(rectangle);

        Assertions.assertTrue(result);
    }

    @DisplayName("Test of isRectangle(), for any Object that doesn't belongs to Rectangle returns false")
    @Test
    void isRectangle3() {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(3);

        result = ShapeUtils.isRectangle(equilateralTriangle);

        Assertions.assertFalse(result);
    }
}
