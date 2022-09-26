package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    public static void main(String[] args) {
        Point test1 = new Point(2, 3);
        Point testTargetPoint = new Point(4, 5);

        assertEquals(2, test1.getX());
        assertEquals(3, test1.getY());
        assertEquals(2.83, test1.getDistance(testTargetPoint));

        Point test2 = new Point(1, 1);

        test2.setX(2);
        test2.setY(2);

        assertEquals(2, test2.getX());
        assertEquals(2, test2.getY());
    }
}
