package com.rakovets.course.java.core.practice.oop_principles.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void init() {
        rectangle = new Rectangle(3, 4);
    }

    @Test
    void areaTest() {
        double result;

        result = rectangle.area();

        Assertions.assertEquals(12, result);
    }
}
