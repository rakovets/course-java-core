package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import com.rakovets.course.java.core.practice.strings.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void testSetPoint() {
        // GIVEN
        Point point = new Point(6.2, 6.1);
        // WHEN
        point.setX(3.1);
        point.setY(4.3);

        //THEN
        Assertions.assertEquals(3.1, point.getX());
        Assertions.assertEquals(4.3, point.getY());
    }
    @Test
    public void testGetX() {
        // GIVEN
        Point point = new Point(1.5, 2.4);

        //THEN
        Assertions.assertEquals(1.5, point.getX());
        Assertions.assertEquals(2.4, point.getY());
    }
    @Test
    public void testgetDistance() {
        // GIVEN
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);

        //THEN
        Assertions.assertEquals(Math.pow(8, 0.5), point1.getDistance(point2));
    }
}
