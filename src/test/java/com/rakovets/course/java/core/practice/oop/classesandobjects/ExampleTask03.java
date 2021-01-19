package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class ExampleTask03 {
    public static void main(String[] args) {
        Point firstPoint = new Point(-3.0, -3.2);
        Point secondPoint = new Point(1.0, -1.0);
        Rectangle myRectangle = new Rectangle(firstPoint, secondPoint);
        System.out.printf("Perimeter of a rectangle is: %f\nArea of a rectangle is: %f",myRectangle.getPerimeter(), myRectangle.getArea());
    }
}
