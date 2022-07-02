package com.rakovets.course.java.core.practice.oop_principles.GeometryTest;

import com.rakovets.course.java.core.practice.oop_principles.Geometry.EquilateralTriangle;
import com.rakovets.course.java.core.practice.oop_principles.Geometry.Figure;
import com.rakovets.course.java.core.practice.oop_principles.Geometry.Height;
import com.rakovets.course.java.core.practice.oop_principles.Geometry.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void testConstructor() {
        Triangle triangle = new Triangle(2, 3, 4);
        Assertions.assertEquals(2, triangle.getSideA());
        Assertions.assertEquals(3, triangle.getSideB());
        Assertions.assertEquals(4, triangle.getSideC());
    }

    @Test
    public void testConstructorImpossible() {
        Assertions.assertThrows(RuntimeException.class, () -> new Triangle(2, 3, 5));
    }

    @Test
    public void testGetPerimeter() {
        Figure triangle = new Triangle(2, 3, 4);
        Assertions.assertEquals(9, triangle.getPerimeter());
    }

    @Test
    public void testGetPerimeterNonInteger() {
        Figure triangle = new Triangle(2.5, 3.5, 4.5);
        Assertions.assertEquals(10.5, triangle.getPerimeter());
    }

    @Test
    public void testGetSquare() {
        Figure triangle = new Triangle(2, 3, 4);
        Assertions.assertEquals(2.9, triangle.getSquare());
    }

    @Test
    public void testGetSquareNonInteger() {
        Figure triangle = new Triangle(2.5, 3.5, 4.5);
        Assertions.assertEquals(4.34, triangle.getSquare());
    }

    @Test
    public void testGetHeight() {
        Height triangle = new Triangle(2, 3, 4);
        Assertions.assertEquals(1.45, triangle.getHeight());
    }

    @Test
    public void testGetHeightNonInteger() {
        Height triangle = new Triangle(2.5, 3.5, 4.5);
        Assertions.assertEquals(1.93, triangle.getHeight());
    }

    @Test
    public void testIsSquareEquals() {
        Figure triangle1 = new Triangle(2, 3, 4);
        Figure triangle2 = new Triangle(3, 2, 4);
        Assertions.assertTrue(triangle1.isSquareEquals(triangle2));
    }

    @Test
    public void testIsSquareEqualsNotEqual() {
        Figure triangle = new Triangle(2, 3, 4);
        Figure equilateralTriangle = new EquilateralTriangle(3);
        Assertions.assertFalse(triangle.isSquareEquals(equilateralTriangle));
    }

    @Test
    public void testToString() {
        Figure triangle = new Triangle(2, 3, 4);
        Assertions.assertEquals("Triangle{sideA=2.0, sideB=3.0, sideC=4.0}", triangle.toString());
    }
}
