package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {
        Point p1 = new Point(-15, 35);
        Point p2 = new Point(-101, -29);
        Point p3 = new Point(54, 0);
        Point p4 = new Point(25, -73);

        Rectangle rect = new Rectangle(p1, p2);

        rect.setFirstPoint(p3);
        rect.setSecondPoint(p4);

        System.out.println(rect.getPerimeter(p3, p1));
        System.out.println(rect.getArea(p2, p4));
    }
}
