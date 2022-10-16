package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    Rectangle rectangle = new Rectangle(2, 6);

    @Test
    public void testGetTopLeftPoint() {
        // WHEN
        double actual1 = rectangle.getTopLeftPoint(2);
        double actual2 = rectangle.getBottomRightPoint(6);

        //THEN
        Assertions.assertEquals(2, actual1);
        Assertions.assertEquals(6, actual2);
    }

    @Test
    public void testGetPerimeter() {
        // GIVEN
        Point A = new Point(3, 5);
        Point B = new Point(15, 3);
        // WHEN
        double actual1 = rectangle.getPerimeter(A,B);

        //THEN
        Assertions.assertEquals(28, actual1);
    }

    @Test
    public void testGetArea() {
        // GIVEN
        Point A = new Point(3, 5);
        Point B = new Point(15, 3);
        // WHEN
        double actual1 = rectangle.getArea(A, B);
        //THEN
        Assertions.assertEquals(24, actual1);
    }
}
