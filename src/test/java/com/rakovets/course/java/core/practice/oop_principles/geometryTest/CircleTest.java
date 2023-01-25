package com.rakovets.course.java.core.practice.oop_principles.geometryTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {
    private Circle circle;

    @BeforeEach
    void init() {
        circle = new Circle(3);
    }

    @Test
    void areaTest() {
        double result;

        result = circle.area();

        Assertions.assertEquals(28.274333882308139146163790449516, result);
    }

    @Test
    void lengthTest() {

    }
}
