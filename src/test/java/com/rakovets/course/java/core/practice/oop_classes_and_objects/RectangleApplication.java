package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
        Point topLeftPoint = new Point(10,22);
        Point bottomRightPoint = new Point(11,27);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);

        System.out.println("Top left point: x = " + rectangle.getTopLeftPoint().getX() + ", y = " + rectangle.getTopLeftPoint().getY());
        System.out.println("Bottom right point: x = " + rectangle.getBottomRightPoint().getX() + ", y = " + rectangle.getBottomRightPoint().getY());

        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}
