package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    public static void main(String[] args) {
        Point testLeftPoint = new Point(1,1);
        Point testBottomRightPoint = new Point(4,4);
        Rectangle testRectangle = new Rectangle(testLeftPoint, testBottomRightPoint);

        testLeftPoint.setX(2);
        testLeftPoint.setY(2);
        testBottomRightPoint.setX(5);
        testBottomRightPoint.setY(5);


        assertEquals(testLeftPoint, testRectangle.getTopLeftPoint());
        assertEquals(testBottomRightPoint, testRectangle.getBottomRightPoint());
        assertEquals(9, testRectangle.getArea());
        assertEquals(12, testRectangle.getPerimeter());
    }

}
