package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(6,10), new Point(12, 15));
        System.out.println("top left point: " + rectangle.getTopLeftPoint());
        System.out.println("bottom right point: " + rectangle.getBottomRightPoint());
        System.out.println("perimeter: " + rectangle.getPerimeter());
        System.out.println("area: " + rectangle.getArea());
    }
}
