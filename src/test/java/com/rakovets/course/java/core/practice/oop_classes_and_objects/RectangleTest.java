package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    public static void main(String[] args) {
        Point topLeftPoint = new Point(1,1);
        Point bottomRightPoint = new Point(4,4);
        Rectangle testRectangle = new Rectangle(topLeftPoint, bottomRightPoint);

        topLeftPoint.setX(2);
        topLeftPoint.setY(2);
        bottomRightPoint.setX(5);
        bottomRightPoint.setY(5);


        assertEquals(topLeftPoint, testRectangle.getTopLeftPoint());
        assertEquals(bottomRightPoint, testRectangle.getBottomRightPoint());
        assertEquals(9, testRectangle.getArea());
        assertEquals(12, testRectangle.getPerimeter());
    }

}
