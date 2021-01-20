package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {
        Point a1 = new Point(2,2);
        Point b1 = new Point(5,4);
        Rectangle rectangle = new Rectangle(a1,b1);
        System.out.println(rectangle.getPerimetr(a1,b1));
        System.out.println(rectangle.getArea(a1,b1));
    }
}
