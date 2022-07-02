package com.rakovets.course.java.core.practice.oop_principles.GeometryTest;

import com.rakovets.course.java.core.practice.oop_principles.Geometry.Ellipse;
import com.rakovets.course.java.core.practice.oop_principles.Geometry.Figure;
import com.rakovets.course.java.core.practice.oop_principles.Geometry.Rectangle;
import com.rakovets.course.java.core.practice.oop_principles.Geometry.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EllipseTest {

    @Test
    public void testConstructor() {
        Ellipse ellipse = new Ellipse(10, 5);
        Assertions.assertEquals(10, ellipse.getRadiusA());
        Assertions.assertEquals(5, ellipse.getRadiusB());
    }

    @Test
    public void testGetPerimeter() {
        Figure ellipse = new Ellipse(5, 10);
        Assertions.assertEquals(43.22, ellipse.getPerimeter());
    }

    @Test
    public void testGetPerimeterNonInteger() {
        Figure ellipse = new Ellipse(10.5, 5.5);
        Assertions.assertEquals(46.61, ellipse.getPerimeter());
    }

    @Test
    public void testGetSquare() {
        Figure ellipse = new Ellipse(10, 5);
        Assertions.assertEquals(157.08, ellipse.getSquare());
    }

    @Test
    public void testGetSquareNotInteger() {
        Figure ellipse = new Ellipse(10.5, 5.5);
        Assertions.assertEquals(181.43, ellipse.getSquare());
    }

    @Test
    public void testIsSquareEquals() {
        Figure ellipse = new Ellipse(6, 5);
        Figure rectangle = new Rectangle(18.85, 5);
        Assertions.assertTrue(ellipse.isSquareEquals(rectangle));
    }

    @Test
    public void testIsSquareEqualsNotEqual() {
        Figure ellipse = new Ellipse(10.5, 5.5);
        Figure triangle = new Triangle(2, 3, 4);
        Assertions.assertFalse(ellipse.isSquareEquals(triangle));
    }

    @Test
    public void testToString() {
        Figure ellipse = new Ellipse(5, 5);
        Assertions.assertEquals("Ellipse{radiusA=5.0, radiusB=5.0}", ellipse.toString());
    }
}
