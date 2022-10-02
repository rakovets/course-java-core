package com.rakovets.course.java.core.practice.oop_principles;
import com.rakovets.course.java.core.practice.oop_classes_and_objects.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    void testDistance() {
        Point pointA = new Point(1,1);
        Point pointB = new Point(1,6);

        Assertions.assertEquals(5, pointA.getDistance(pointB));
    }

    @Test
    void testSavedValues() {
        Point points = new Point(1,3);

        points.setX(2);
        Assertions.assertEquals(2, points.getX());
        points.setY(4);
        Assertions.assertEquals(4, points.getY());
    }
}
