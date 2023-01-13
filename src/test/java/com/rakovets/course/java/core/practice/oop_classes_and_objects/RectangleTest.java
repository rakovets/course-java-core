package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void getPerimeterAndAreaTest1() {
        Point topLeftPoint = new Point(-5,6);
        Point bottomRightPoint = new Point(1, 1);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(22, rectangle.getPerimeter());
        Assertions.assertEquals(30, rectangle.getArea());
    }
    @Test
    void getPerimeterAndAreaTest2() {
        Point topLeftPoint = new Point(-5,3);
        Point bottomRightPoint = new Point(-1, 1);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(12, rectangle.getPerimeter());
        Assertions.assertEquals(8, rectangle.getArea());
    }
    @Test
    void getPerimeterAndAreaTest3() {
        Point topLeftPoint = new Point(-6,-1);
        Point bottomRightPoint = new Point(-1, -4);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(16, rectangle.getPerimeter());
        Assertions.assertEquals(15, rectangle.getArea());
    }
    @Test
    void getPerimeterAndAreaTest4() {
        Point topLeftPoint = new Point(-2,-1);
        Point bottomRightPoint = new Point(2, -3);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(12, rectangle.getPerimeter());
        Assertions.assertEquals(8, rectangle.getArea());
    }
    @Test
    void getPerimeterAndAreaTest5() {
        Point topLeftPoint = new Point(1,-1);
        Point bottomRightPoint = new Point(5, -3);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(12, rectangle.getPerimeter());
        Assertions.assertEquals(8, rectangle.getArea());
    }
    @Test
    void getPerimeterAndAreaTest6() {
        Point topLeftPoint = new Point(0,2);
        Point bottomRightPoint = new Point(4, 0);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(12, rectangle.getPerimeter());
        Assertions.assertEquals(8, rectangle.getArea());
    }
    @Test
    void getPerimeterAndAreaTest7() {
        Point topLeftPoint = new Point(-4,3);
        Point bottomRightPoint = new Point(0, 1);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(12, rectangle.getPerimeter());
        Assertions.assertEquals(8, rectangle.getArea());
    }
    @Test
    void getPerimeterAndAreaTest8() {
        Point topLeftPoint = new Point(-4,0);
        Point bottomRightPoint = new Point(0, -2);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);
        Assertions.assertEquals(12, rectangle.getPerimeter());
        Assertions.assertEquals(8, rectangle.getArea());
    }
}
