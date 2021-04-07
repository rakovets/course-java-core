package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point(27, 48);
        Point secondPoint = new Point(15, 20);
        Rectangle rectangle = new Rectangle(firstPoint, secondPoint);
        System.out.printf("Rectangle perimeter1 = %f\n", rectangle.getPerimeter());
        System.out.printf("Rectangle area1 = %f\n", rectangle.getArea());
        firstPoint.setX(24);
        firstPoint.setY(28);
        secondPoint.setX(17);
        secondPoint.setY(21);
        System.out.printf("Rectangle perimeter2 = %f\n", rectangle.getPerimeter());
        System.out.printf("Rectangle area2 = %f\n", rectangle.getArea());
    }
}
