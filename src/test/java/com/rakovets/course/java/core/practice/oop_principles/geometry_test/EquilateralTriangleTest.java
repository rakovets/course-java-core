package com.rakovets.course.java.core.practice.oop_principles.geometry_test;

import com.rakovets.course.java.core.practice.oop_principles.geometry.EquilateralTriangle;
import com.rakovets.course.java.core.practice.oop_principles.geometry.Figure;
import com.rakovets.course.java.core.practice.oop_principles.geometry.Height;
import com.rakovets.course.java.core.practice.oop_principles.geometry.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquilateralTriangleTest {

    @Test
    public void testConstructor() {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        Assertions.assertEquals(5, equilateralTriangle.getSideA());
        Assertions.assertEquals(5, equilateralTriangle.getSideB());
        Assertions.assertEquals(5, equilateralTriangle.getSideC());
    }

    @Test
    public void testGetPerimeter() {
        Figure equilateralTriangle = new EquilateralTriangle(5);
        Assertions.assertEquals(15, equilateralTriangle.getPerimeter());
    }

    @Test
    public void testGetPerimeterNonInteger() {
        Figure equilateralTriangle = new EquilateralTriangle(5.5);
        Assertions.assertEquals(16.5, equilateralTriangle.getPerimeter());
    }

    @Test
    public void testGetSquare() {
        Figure equilateralTriangle = new EquilateralTriangle(5);
        Assertions.assertEquals(10.83, equilateralTriangle.getSquare());
    }

    @Test
    public void testGetSquareNonInteger() {
        Figure equilateralTriangle = new EquilateralTriangle(5.5);
        Assertions.assertEquals(13.1, equilateralTriangle.getSquare());
    }

    @Test
    public void testGetHeight() {
        Height equilateralTriangle = new EquilateralTriangle(5);
        Assertions.assertEquals(4.33, equilateralTriangle.getHeight());
    }

    @Test
    public void testGetHeightNonInteger() {
        Height equilateralTriangle = new EquilateralTriangle(5.5);
        Assertions.assertEquals(4.76, equilateralTriangle.getHeight());
    }

    @Test
    public void testIsSquareEquals() {
        Figure equilateralTriangle = new EquilateralTriangle(3);
        Figure rectangle = new Rectangle(1, 3.9);
        Assertions.assertTrue(equilateralTriangle.isSquareEquals(rectangle));
    }

    @Test
    public void testIsSquareEqualsNotEqual() {
        Figure equilateralTriangle = new EquilateralTriangle(5);
        Figure rectangle = new Rectangle(5, 5);
        Assertions.assertFalse(equilateralTriangle.isSquareEquals(rectangle));
    }
}
