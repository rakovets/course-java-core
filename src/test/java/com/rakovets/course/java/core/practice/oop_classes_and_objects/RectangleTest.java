package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    public static void main(String[] args) {
        Point testLeftPoint = new Point(1,1);
        Point testBottomRightPoint = new Point(2,2);
        Point newTestLeftPoint = new Point(2,2);
        Point newTestBottomRightPoint = new Point(5,5);
        Rectangle testRectangle = new Rectangle(testLeftPoint, testBottomRightPoint);

        testRectangle.setTopLeftPoint(newTestLeftPoint);
        testRectangle.setBottomRightPoint(newTestBottomRightPoint);

        assertEquals(newTestLeftPoint, testRectangle.getTopLeftPoint());
        assertEquals(newTestBottomRightPoint, testRectangle.getBottomRightPoint());
        assertEquals(9, testRectangle.getArea());
        assertEquals(12, testRectangle.getPerimeter());
    }

}
