package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point(2, 3);
        Point secondPoint = new Point(5, 7);
        Point thirdPoint = new Point(11, 12);
        Rectangle rectangle = new Rectangle(firstPoint, secondPoint);
        System.out.printf("perimeter1 = %f\n", rectangle.getPerimeter());
        System.out.printf("area1 = %f\n", rectangle.getArea());
        rectangle.setSecondPoint(thirdPoint);
        System.out.printf("perimeter2 = %f\n", rectangle.getPerimeter());
        System.out.printf("area2 = %f\n", rectangle.getArea());
    }
}
