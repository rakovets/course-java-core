package com.rakovets.course.java.core.practice.oop_principles.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CircleTest {
    Circle circle;

    @BeforeEach
    void init() {
        circle = new Circle(3.0);
    }

    @DisplayName("Test isAreaEquals(), returns ture")
    @Test
    void isAreaEqualsTest1() {
        boolean result;
        Circle expCircle = new Circle(3.0);

        result = circle.isAreaEquals(expCircle);

        Assertions.assertTrue(result);
    }

    @DisplayName("Test isAreaEquals(), returns false")
    @Test
    void isAreaEqualsTest2() {
        boolean result;
        Circle expCircle = new Circle(4.0);

        result = circle.isAreaEquals(expCircle);

        Assertions.assertFalse(result);
    }

    @DisplayName("Test area(), result area of Circle with radius 3.0")
    @Test
    void areaTest() {
        double result;
        double expected;

        result = circle.area();
        expected = 28.274333882308138;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test length(), result length of Circle with radius 3.0")
    @Test
    void lengthTest() {
        double result;
        double expected;

        result = circle.length();
        expected = 18.84955592153876;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test toString(), result info about Circle with radius 3.0")
    @Test
    void toStringTest() {
        String result;
        String expected;

        result = circle.toString();
        expected = "This is Circle with next parameters:\nRadius: 3.0\nDiameter: 6.0\nLength: 18.84955592153876" +
                "\nArea: 28.274333882308138";

        Assertions.assertEquals(expected, result);
    }
}
