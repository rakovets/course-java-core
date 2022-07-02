package com.rakovets.course.java.core.practice.oop_principles.GeometryTest;

import com.rakovets.course.java.core.practice.oop_principles.Geometry.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FoursquareTest {

    @Test
    public void testConstructor() {
        Foursquare foursquare = new Foursquare(10);
        Assertions.assertEquals(10, foursquare.getSideA());
    }

    @Test
    public void testGetPerimeter() {
        Figure foursquare = new Foursquare(10);
        Assertions.assertEquals(40, foursquare.getPerimeter());
    }

    @Test
    public void testGetPerimeterNonInteger() {
        Figure foursquare = new Foursquare(10.54);
        Assertions.assertEquals(42.16, foursquare.getPerimeter());
    }

    @Test
    public void testGetSquare() {
        Figure foursquare = new Foursquare(10);
        Assertions.assertEquals(100, foursquare.getSquare());
    }

    @Test
    public void testGetSquareNonInteger() {
        Figure foursquare = new Foursquare(10.55);
        Assertions.assertEquals(111.30, foursquare.getSquare());
    }

    @Test
    public void testGetDiagonal() {
        Diagonal foursquare = new Foursquare(10);
        Assertions.assertEquals(14.14, foursquare.getDiagonal());
    }

    @Test
    public void testGetDiagonalNonInteger() {
        Diagonal foursquare = new Foursquare(10.5);
        Assertions.assertEquals(14.85, foursquare.getDiagonal());
    }

    @Test
    public void testIsSquareEquals() {
        Figure foursquare = new Foursquare(10);
        Figure rectangle = new Rectangle(5, 20);
        Assertions.assertTrue(foursquare.isSquareEquals(rectangle));
    }

    @Test
    public void testIsSquareEqualsNotEqual() {
        Figure foursquare = new Foursquare(10);
        Figure circle = new Circle(10);
        Assertions.assertFalse(foursquare.isSquareEquals(circle));
    }

    @Test
    public void testToString() {
        Figure foursquare = new Foursquare(10);
        Assertions.assertEquals("Foursquare{side=10.0}", foursquare.toString());
    }
}

