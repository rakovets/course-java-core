package com.rakovets.course.java.core.practice.oop_principles.geometry_test;

import com.rakovets.course.java.core.practice.oop_principles.geometry.Diagonal;
import com.rakovets.course.java.core.practice.oop_principles.geometry.Figure;
import com.rakovets.course.java.core.practice.oop_principles.geometry.Foursquare;
import com.rakovets.course.java.core.practice.oop_principles.geometry.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testConstructor() {
        Rectangle rectangle = new Rectangle(10, 5);
        Assertions.assertEquals(10, rectangle.getSideA());
        Assertions.assertEquals(5, rectangle.getSideB());
    }

    @Test
    public void testGetPerimeter() {
        Figure rectangle = new Rectangle(10, 5);
        Assertions.assertEquals(30, rectangle.getPerimeter());
    }

    @Test
    public void testGetPerimeterNonInteger() {
        Figure rectangle = new Rectangle(10.2, 5.1);
        Assertions.assertEquals(30.6, rectangle.getPerimeter());
    }

    @Test
    public void testGetSquare() {
        Figure rectangle = new Rectangle(10, 5);
        Assertions.assertEquals(50, rectangle.getSquare());
    }

    @Test
    public void testGetSquareNonInteger() {
        Figure rectangle = new Rectangle(10.2, 5.2);
        Assertions.assertEquals(53.04, rectangle.getSquare());
    }

    @Test
    public void testGetDiagonal() {
        Diagonal rectangle = new Rectangle(10, 5);
        Assertions.assertEquals(11.18, rectangle.getDiagonal());
    }

    @Test
    public void testGetDiagonalNonInteger() {
        Diagonal rectangle = new Rectangle(10.2, 5.3);
        Assertions.assertEquals(11.49, rectangle.getDiagonal());
    }

    @Test
    public void testIsSquareEquals() {
        Figure rectangle = new Rectangle(4, 9);
        Figure foursquare = new Foursquare(6);
        Assertions.assertTrue(rectangle.isSquareEquals(foursquare));
    }

    @Test
    public void testIsSquareEqualsNotEqual() {
        Figure rectangle = new Rectangle(3, 9);
        Figure foursquare = new Foursquare(6);
        Assertions.assertFalse(rectangle.isSquareEquals(foursquare));
    }
}
