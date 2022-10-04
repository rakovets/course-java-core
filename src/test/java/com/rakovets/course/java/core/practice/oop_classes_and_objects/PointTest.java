package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

public class PointTest {
    @Test
    public void testGetPointValues() {
        Point sample01 = new Point(3, 4);

        Assertions.assertEquals(3, sample01.getX());
        Assertions.assertEquals(4, sample01.getY());
    }

    @Test
    public void testSetPointValues() {
        Point sample01 = new Point(3, 4);
        sample01.setX(6);
        sample01.setY(8);

        Assertions.assertEquals(6, sample01.getX());
        Assertions.assertEquals(8, sample01.getY());
    }

    @Test
    public void testGetDistanceBetweenPoints2D() {
        Point sample01 = new Point(3, 4);
        Point sample02 = new Point(7, 1);

        Point sample03 = new Point(0, 0);
        Point sample04 = new Point(0, 0);

        Assertions.assertEquals(0.0, Point2D.distance(sample03.getX(), sample03.getY(), sample04.getX(), sample04.getY()));
    }
}
