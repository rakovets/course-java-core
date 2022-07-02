package com.rakovets.course.java.core.practice.oop_principles.GeometryTest;

import com.rakovets.course.java.core.practice.oop_principles.Geometry.Circle;
import com.rakovets.course.java.core.practice.oop_principles.Geometry.Figure;
import com.rakovets.course.java.core.practice.oop_principles.Geometry.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testConstructor() {
        Circle circle = new Circle(10);
        Assertions.assertEquals(10, circle.getRadiusA());
    }

    @Test
    public void testGetPerimeter() {
        Figure circle = new Circle(10);
        Assertions.assertEquals(62.83, circle.getPerimeter());
    }

    @Test
    public void testGetPerimeterNonInteger() {
        Figure circle = new Circle(10.2);
        Assertions.assertEquals(64.09, circle.getPerimeter());
    }

    @Test
    public void testGetSquare() {
        Figure circle = new Circle(10);
        Assertions.assertEquals(314.16, circle.getSquare());
    }

    @Test
    public void testGetSquareNonInteger() {
        Figure circle = new Circle(10.2);
        Assertions.assertEquals(326.85, circle.getSquare());
    }

    @Test
    public void testIsSquareEquals() {
        Figure circle1 = new Circle(10);
        Figure circle2 = new Circle(10);
        Assertions.assertTrue(circle1.isSquareEquals(circle2));
    }

    @Test
    public void testIsSquareEqualsNotEqual() {
        Figure circle = new Circle(10);
        Figure triangle = new Triangle(2, 3, 4);
        Assertions.assertFalse(circle.isSquareEquals(triangle));
    }
}
