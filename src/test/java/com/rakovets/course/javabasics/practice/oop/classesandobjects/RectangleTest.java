package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {
        Point firstPoint = new Point(10,20);
        Point secondPoint = new Point(30,30);
        Rectangle rectangle = new Rectangle(firstPoint, secondPoint);
        System.out.printf("First Point: X = %f, Y = %f\nSecond Point: X = %f, Y = %f\n",
                firstPoint.x,
                firstPoint.y,
                secondPoint.x,
                secondPoint.y);
        System.out.printf("Perimeter: %f\n", rectangle.getPerimeter());
        System.out.printf("Area: %f", rectangle.getArea());
    }
}