package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import com.rakovets.course.java.core.practice.oop_classes_and_objects.task_2.Point;
import com.rakovets.course.java.core.practice.oop_classes_and_objects.task_3.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task03 {
    private static Point topLeftPointOne;
    private static Point bottomRightPointOne;
    private static Rectangle rectangleFirst;
    private static Point topLeftPointTwo;
    private static Point bottomRightpointTwo;
    private static Rectangle rectangleSecond;

    @BeforeAll
    static void setUp() {
        topLeftPointOne = new Point(-40,-50);
        bottomRightPointOne = new Point(40,50);
        rectangleFirst = new Rectangle(topLeftPointOne, bottomRightPointOne);
        topLeftPointTwo = new Point(-100,-90);
        bottomRightpointTwo = new Point(70,100);
        rectangleSecond = new Rectangle(topLeftPointOne, bottomRightPointOne);
        rectangleSecond.setTopLeftPoint(topLeftPointOne);
        rectangleSecond.setBottomRightPoint(bottomRightPointOne);
    }
    @Test
    @DisplayName("testGetTopLeftPoint")
    void testGetTopLeftPoint() {
        Point actualPoint = rectangleFirst.getTopLeftPoint();

        Assertions.assertEquals(topLeftPointOne,actualPoint);
    }
    @Test
    @DisplayName("testGetTopRightPoint")
    void testGetTopRightPoint() {
        Point actual = rectangleFirst.getBottomRightPoint();

        Assertions.assertEquals(bottomRightPointOne,actual);
    }
    @Test
    @DisplayName("testGetPerimeter")
    void testGetPerimeter() {
        int actual = rectangleFirst.getPerimeter();

        Assertions.assertEquals(360,actual);
    }
    @Test
    @DisplayName("testGetArea")
    void testGetArea() {
        int actual = rectangleFirst.getArea();

        Assertions.assertEquals(8000,actual);
    }
    @Test
    @DisplayName("testSettedTopLeftPoint")
    void testSettedTopLeftPoint() {
        Point actual = rectangleSecond.getTopLeftPoint();

        Assertions.assertEquals(topLeftPointOne,actual);
    }
    @Test
    @DisplayName("testSettedTopLeftPoint")
    void testSettedBottomRightPoint() {
        Point actual = rectangleSecond.getBottomRightPoint();

        Assertions.assertEquals(bottomRightPointOne,actual);
    }
}
