package com.rakovets.course.java.core.practice.oop_principles.GeometryTest;

import com.rakovets.course.java.core.practice.oop_principles.Geometry.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeUtilsTest {

    @Test
    public void testIsRectangle() {
        Figure rectangle = new Rectangle(2, 3);
        Assertions.assertEquals(true, ShapeUtils.isRectangle(rectangle));
    }

    @Test
    public void testIsNotRectangle() {
        Figure triangle = new Triangle(2, 3, 4);
        Assertions.assertEquals(false, ShapeUtils.isRectangle(triangle));
    }

    @Test
    public void testIsRectangleFoursquare() {
        Figure foursquare = new Foursquare(2);
        Assertions.assertEquals(true, ShapeUtils.isRectangle(foursquare));
    }

    @Test
    public void testIsTriangle() {
        Figure triangle = new Triangle(2, 3, 4);
        Assertions.assertEquals(true, ShapeUtils.isTriangle(triangle));
    }

    @Test
    public void testIsNotTriangle() {
        Figure rectangle = new Rectangle(2, 3);
        Assertions.assertEquals(false, ShapeUtils.isTriangle(rectangle));
    }

    @Test
    public void testIsTriangleEquilateralTriangle() {
        Figure equilateralTriangle = new EquilateralTriangle(2);
        Assertions.assertEquals(true, ShapeUtils.isTriangle(equilateralTriangle));
    }
}
