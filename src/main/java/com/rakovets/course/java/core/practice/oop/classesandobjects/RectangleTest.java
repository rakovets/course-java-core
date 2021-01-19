package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {

        Point firstPoint = new Point(-1, -4);
        Point secondPoint = new Point(-2, 5);
        Rectangle buildRectangle = new Rectangle(firstPoint, secondPoint);
        System.out.println(buildRectangle.getPerimeter());
        System.out.println(buildRectangle.getArea());

        firstPoint.setX(5);
        firstPoint.setY(10);
        secondPoint.setX(8);
        secondPoint.setY(11);
        System.out.println(buildRectangle.getPerimeter());
        System.out.println(buildRectangle.getArea());
    }
}

