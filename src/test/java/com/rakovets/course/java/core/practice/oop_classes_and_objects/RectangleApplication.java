package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
        Point a = new Point(0, 5);
        Point b = new Point(10, 0);
        Rectangle rectangle = new Rectangle(a, b);
        System.out.println(rectangle.getTopLeftPoint().getX());
        System.out.println(rectangle.getTopLeftPoint().getY());
        System.out.println(rectangle.getBottomRightPoint().getX());
        System.out.println(rectangle.getBottomRightPoint().getY());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        Point newPointA = new Point(-4, 0);
        Point newPointB = new Point(0, -15);
        rectangle.setTopLeftPoint(newPointA);
        rectangle.setBottomRightPoint(newPointB);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }
}
